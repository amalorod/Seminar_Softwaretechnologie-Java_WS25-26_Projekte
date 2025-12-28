import java.util.Arrays;
public class Exercise06 {
	
	
	
	
	//Aufgabe 1
	public static void main(String[] args) {

		int [] myArray = new int [7];
		
		for (int i = 0; i< myArray.length; i++) {
			
			myArray[i] = i;
			
			
		}
		System.out.println(Arrays.toString(myArray));
		System.out.println(Arrays.toString(func1(4))); //Arrays toString um eine richtige Ausgabe zu erzeugen
	}
	
	
	
	
	
	
	//Aufgabe 2
	public static boolean[] func1 (int x ) {
		
		boolean[] checkTrue = new boolean[x];
		
		
		for (int i = 0; i < x; i++) {
			
			if (i%2 ==0) {
				
				checkTrue[i] = true;
			} else checkTrue[i] = false;
			
			
			
		}
	
		
		return checkTrue;
		
		
		
	
}
	










}
	
	
	

 