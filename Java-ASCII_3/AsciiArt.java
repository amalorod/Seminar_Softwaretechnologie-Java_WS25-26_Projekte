
public class AsciiArt {
	
	static String emptyLine(int lineLength) {
		String r = "";
		// in this case, we can decrease the variable lineLength
		for (; lineLength > 0; lineLength--) {
			r = r + '.';
		}
		// It wasn't specified in the exercise, but we should add a line break at the
		// end
		return r + '\n';
	}

	static String singleDot(int lineLength, int dotPosition) {
		String r = "";

		// if we decrease lineLength, we count the dot position from the right, which is
		// counter intuitive
		// Therefore, we use a new variable i that goes from left to right.
		for (int i = 0; i < lineLength; i++) {
			if (i == dotPosition)
				System.out.print('#');
			else
				System.out.print('.');
		}
		return r + '\n';

	}

	
	
	/**
	 * Utility function to determine, whether an int-Array contains a specific
	 * int-value. The method returns true as soon as the value has been found.
	 * 
	 * @param arr  The array we want to search
	 * @param item The item we are looking for
	 * @return true if arr contains item, false otherwise
	 */
	static boolean contains(int[] arr, int item) {
		// for loop over the entire array
		for (int i = 0; i < arr.length; i++) {
			// each element is compared with the item we are looking for
			if (arr[i] == item)
				// if they are equal, we immediately return true
				return true;
		}
		// if we reach this line, we have not yet returned true, which means the item is
		// not contained in the array. Thus we return false.
		return false;
	}
	
	static String multipleDots(int lineLength, int[] positions) {
		String r = "";
		for (int i = 0; i < lineLength; i++) {
			// for each position, we check if it's in the array using our utility function
			if (contains(positions, i))
				r = r + "#";
			else
				r = r + ".";
		}
		return r + "\n";
	}
	
	static String imageWithDiagonalBar(int lineLength) {
		String r = "";
		for (int i = 0; i < lineLength; i++) {
			r = r + singleDot(lineLength, i);
		}
		return r;
	}
	
	static String imageWithCross(int lineLength) {
		String r = "";
		for (int i = 0; i < lineLength; i++) {
			r = r + multipleDots(lineLength, new int[] {i, lineLength-i-1});
		}
		return r;
	}
	
	static String invertImage(String image) {
		image = image.replace('.', 'x');
		image = image.replace('#', '.');
		image = image.replace('x', '#');
		return image;
	}
	


//Funktion aus der Aufgabenstellung flipHorizontally
		
	static String ImageSpiegeln(String image, char oldBlack, 
												 char newBlack, 
												 char oldWhite, 
												 char newWhite) {
		
		
		String[] lines = image.split("\n"); // Einzelne Zeilen speichern
		
		String result = "";
		
		
		for (int i = 0; i < lines.length; i++) {  //Die Schleife geht solange wie hoch der übergebene Wert aus dem Aufruf ist
			
	        String line = lines[i];   //Ein neuer String wird erstellt pro Zeile aus lines
	        String mirroredLine = ""; //neue gespiegelte Zeile
	        
		
	        for (int j = line.length()-1; j >= 0; j--) {
	        	
	        	char c = line.charAt(j);  //Zeichen am Index speichern
	        	
	        	if (c == oldBlack) {    //Invertierung von Zeichen nach der Logik alt => neu
	        		c = newBlack;
	        	} 
	        	if (c == oldWhite) {
	        		c = newWhite;
	        	}
	        	
	        	
	        	
	        	
	        	
	        	mirroredLine += c; //die erstellte gespiegelte Linie wird jetzt mit dem ergebnis addiert 
	        	
	        	
	        	
	        } result +=  mirroredLine + "\n";   //result wird mit mirrored zusammengesetzt (pro Zeile)
	        
	        
	        
	        
		
	}return result;
	
	}
	
	
	//Hilfsfunktion zum Vergleich des Ergebnisses
	static void printExample () {
		
		String img =
			    "...#\n" +
			    "..#.\n" +
			    ".#..\n" +
			    "#...\n";
		System.out.println(img);
	}
	
	
	
	
	
	
	public static void main(String[] args) {
		
		//Originales Kreuz
		System.out.println(invertImage(imageWithCross(25)));
		
		
		
	
		//Invertiertes Kreuz
		String imgCross = imageWithCross(25);
		System.out.println(ImageSpiegeln(imgCross, '.', '.', '.', '.'));
		
		
		//Beispiel aus der Aufgabenstellung
		printExample();
		String img =   
				
				"...#\n" +
			    "..#.\n" +
			    ".#..\n" +
			    "#...\n";
		
		
		System.out.println(ImageSpiegeln(img,'#', '#', '.', '.')); //Keine Invertierung nur Spiegelung
      
        
      
		
		
	}


}
