/**
 * Utility class for generating and manipulating ASCII art images.
 * <p>
 * This class provides methods to create simple geometric patterns using dots
 * (.) for background and hash symbols (#) for foreground elements. It also
 * includes transformation methods for inverting, flipping, and recoding ASCII
 * art strings.
 * </p>
 */
public class AsciiArt {

  /**
   * Creates a line filled with dots.
   *
   * @param lineLength the number of characters in the line
   * @return a string containing {@code lineLength} dots followed by a newline
   */
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

  /**
   * Creates a line with a single hash symbol at a specified position.
   * <p>
   * The line is filled with dots except at the specified position where a hash
   * symbol (#) is placed. Position indexing is zero-based from left to right.
   * </p>
   *
   * @param lineLength  the total length of the line
   * @param dotPosition the zero-based index where the hash symbol should appear
   * @return a string with '#' at {@code dotPosition} and '.' everywhere else,
   *         followed by a newline
   */
  static String singleDot(int lineLength, int dotPosition) {
    String r = "";

    // if we decrease lineLength, we count the dot position from the right, which is
    // counter intuitive
    // Therefore, we use a new variable i that goes from left to right.
    for (int i = 0; i < lineLength; i++) {
      if (i == dotPosition)
        r = r + '#';
      else
        r = r + '.';
    }
    return r + '\n';

  }

  /**
   * Utility function to determine whether an int-array contains a specific
   * int-value. The method returns true as soon as the value has been found.
   *
   * @param arr  the array we want to search
   * @param item the item we are looking for
   * @return {@code true} if {@code arr} contains {@code item}, {@code false}
   *         otherwise
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

  /**
   * Creates a line with hash symbols at multiple specified positions.
   * <p>
   * The line is filled with dots except at positions specified in the array where
   * hash symbols (#) are placed.
   * </p>
   *
   * @param lineLength the total length of the line
   * @param positions  an array of zero-based indices where hash symbols should
   *                   appear
   * @return a string with '#' at each position in the array and '.' everywhere
   *         else, followed by a newline
   */
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

  /**
   * Generates a square ASCII art image with a diagonal line from top-left to
   * bottom-right.
   * <p>
   * Creates an image where hash symbols form a diagonal line and dots fill the
   * remaining space.
   * </p>
   *
   * @param lineLength the width and height of the square image
   * @return a string representing a square image with a diagonal line of hash
   *         symbols
   */
  static String imageWithDiagonalBar(int lineLength) {
    String r = "";
    for (int i = 0; i < lineLength; i++) {
      r = r + singleDot(lineLength, i);
    }
    return r;
  }

  /**
   * Generates a square ASCII art image with an X-shaped cross (two diagonal
   * lines).
   * <p>
   * Creates an image where hash symbols form two diagonal lines crossing in the
   * center, creating an X pattern.
   * </p>
   *
   * @param lineLength the width and height of the square image
   * @return a string representing a square image with two diagonal lines forming
   *         an X
   */
  static String imageWithCross(int lineLength) {
    String r = "";
    for (int i = 0; i < lineLength; i++) {
      r = r + multipleDots(lineLength, new int[] { i, lineLength - i - 1 });
    }
    return r;
  }

  /**
   * Inverts an ASCII art image by swapping foreground and background characters.
   * <p>
   * All dots (.) become hash symbols (#) and all hash symbols become dots,
   * effectively creating a negative image.
   * </p>
   *
   * @param image the ASCII art string to invert
   * @return a new string with '.' and '#' characters swapped
   */
  static String invertImage(String image) {
    image = image.replace('.', 'x');
    image = image.replace('#', '.');
    image = image.replace('x', '#');
    return image;
  }

  /**
   * Converts an ASCII art image from one character encoding to another.
   * <p>
   * Replaces the old foreground and background characters with new ones. If the
   * new characters would conflict (same character for both or new black matches
   * old white), the original image is returned unchanged.
   * </p>
   *
   * @param image    the ASCII art string to recode
   * @param oldBlack the current foreground character
   * @param oldWhite the current background character
   * @param newBlack the new foreground character
   * @param newWhite the new background character
   * @return the recoded image, or the original image if the new characters would
   *         conflict
   */
  static String recode(String image, char oldBlack, char oldWhite, char newBlack, char newWhite) {
    if (newWhite != newBlack && newBlack != oldWhite)
      return image.replace(oldBlack, newBlack).replace(oldWhite, newWhite);
    else
      return image;
  }

  /**
   * Reverses a single line of text character by character.
   *
   * @param line the string to reverse
   * @return the line with characters in reverse order
   */
  static String revertLine(String line) {
    String r = "";
    for (int i = 0; i < line.length(); i++) {
      r = r + line.charAt(line.length() - i - 1);
    }
    return r;
  }

  /**
   * Horizontally flips an ASCII art image (mirrors it left-to-right).
   * <p>
   * Each line of the image is reversed independently, creating a mirror image
   * effect along the vertical axis.
   * </p>
   *
   * @param image the ASCII art string to flip
   * @return a new string with each line reversed
   */
  static String flip(String image) {
    String r = "";
    String[] lines = image.split("\n");
    for (int i = 0; i < lines.length; i++) {
      r = r + revertLine(lines[i]) + "\n";
    }
    return r;
  }

  /**
   * Main method demonstrating the ASCII art generation capabilities.
   * <p>
   * Creates a 25x25 cross pattern and inverts it, printing the result to the
   * console.
   * </p>
   *
   * @param args command line arguments (not used)
   */
  
  
  
//Die neue Zeile ist die alte Spalte.
//Die neue Spalte ist n minus 1 minus die alte Zeile.
// (z,s)→(newZ,newS)=(s,n−1−z)
    
	
  
  
  
   
	  
	  
	  static String rotatePic(String image) {
		
		    String[] lines = image.split("\n");
		    int n = lines.length;
		    
		    

		    String[] resultLines = new String[n];
		    
		    
		    for (int i = 0; i < n; i++) {
		        resultLines[i] = "";
		    }

		    
		    
		    
		    for (int newZ = 0; newZ < n; newZ++) {
		        
		        
		        
		        for (int oldZ = n - 1; oldZ >= 0; oldZ--) {
		            int oldS = newZ; 
		          
		            if (oldS < lines[oldZ].length()) {
		                char c = lines[oldZ].charAt(oldS);
		                resultLines[newZ] += c;
		            } else {
		                resultLines[newZ] += '.'; 
		            }
		        }
		    }

		   
		    String result = "";
		    for (int i = 0; i < n; i++) {
		        result += resultLines[i] + "\n";
		    }
		    return result;
		}
	  
	  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  public static void main(String[] args) {
	  
	  
    System.out.println(invertImage(imageWithCross(25)));
    System.out.println(rotatePic(invertImage(imageWithCross(25))));
    
    // Test mit Diagonal Bar
    System.out.println(imageWithDiagonalBar(10));
    System.out.println(rotatePic(imageWithDiagonalBar(10)));
   
   
    
    // Bsp mit Buchstaben weil Diagonal Line und imageWithCross nur gespiegelt aussieht
    
    
    String testImage =
            "ABC\n" +
            "DEF\n" +
            "GHI";

    System.out.println(testImage);
    System.out.println();
    System.out.println(rotatePic(testImage));
   
    
    
   

    
  }}





