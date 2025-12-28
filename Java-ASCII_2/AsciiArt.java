

public class AsciiArt {

	

	static void printEmptyLine(int lineLength) {
		// for loop goes from left to right until end of line is reached
		for (int i = 0; i < lineLength; i++) {
			System.out.print('.');
		}
		// It wasn't specified in the exercise, but we should add a line break at the
		// end
		System.out.println();

	}
	static void printSingleDot(int lineLength, int dotPosition) {
		// if we decrease lineLength, we count the dot position from the right, which is
		// counter intuitive
		// Therefore, we use a new variable i that goes from left to right.
		for (int i = 0; i < lineLength; i++) {
			if (i == dotPosition)
				System.out.print('#');
			else
				System.out.print('.');
		}
		System.out.println();
	}

	static void printDiagonal(int lineLength) {
		for (int i = 0; i < lineLength; i++) {
			printSingleDot(lineLength, i);
		}
	}
	
	
	
	
	
	
	
	
	//Aufgabe 3:
	static void printMultipleDots(int x, int[]a) {
		
		
		
		for (int i = 0; i < x; i++) {
			
			if (checkTrue(i, a)) {
				
				System.out.print("#");
			} else { System.out.print(".");
			
			} 
			
		} System.out.println();
		
		
	}
	
	
	
	static boolean checkTrue(int x, int[]a) {
		
		
		for (int i = 0; i < a.length; i++) {
			
			if (x == a[i]) {
				return true;
			}
			
			
			
		}  return false;
		 
	}
	
	
	
	
	
	
	
	public static void main(String[] args) {
	    
	    int x = 6;
	    
	    
	    int[] a1 = {0, 5};
	    int[] a2 = {1, 4};
	    int[] a3 = {2, 3};
	    
	    
	    printMultipleDots(x, a1);
	    printMultipleDots(x, a2);
	    printMultipleDots(x, a3);
	    printMultipleDots(x, a2); 
	    printMultipleDots(x, a1); 
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
   
}
