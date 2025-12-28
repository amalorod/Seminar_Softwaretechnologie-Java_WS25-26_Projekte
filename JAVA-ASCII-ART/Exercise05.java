
public class Exercise05 {

  public static void main(String[] args) {
    func1(4, 'a');
   func2(); 
   printEmptyLine(7);
   printSingleDot(15,3);
   printSlash();
   
    
  }

  static int func1(int x, char c) {
    boolean b = false;
    for (int i = 0; i < 5; i++) {
      x = x - i;
      if (x > 2) {
        c = (char)(c-1);
      } else {
        System.out.println(c);
      }
      
      if (b) {
        x = x * 434;
      }
    }
    return x;
  }
  
  
  /*
   
   Tabelle func1:
   
   Zeile 	x |	c  |  b	  |	i
	8	 	4  'a'	 ""	   ""
	9	 	4  'a'	FALSE  ""
	10	 	4  'a'	FALSE  ""
	11	 	4  'a'	FALSE	0
	12	 	4  'a'	FALSE	0
	13	 	4  'a'	FALSE	0
	14	 	4  'a'	FALSE	0
	11	 	4   ''	FALSE	1
	12		3	''	FALSE	1
	13		3	''	FALSE	2
	14		1	''	FALSE	2
	15		1	''	FALSE	2
	16		1	''	FALSE	2
	17		-2	''	FALSE	3
	18		-2	''	FALSE	3
	19		-2	''	FALSE	3
	20		-6	''	FALSE	4
	21		-6	''	FALSE	4
	22		-6	''	FALSE	4
	23		-6	''	FALSE	5
   
   
   
   
 */
  
  
  
  
  
  public static void func2 () {
	  
	  for (int x = 0; x <= 100; x++) {        	//iteriert bis 100 und printet x aus
		  
		 if ( x % 2 == 1) {
			 System.out.print(x);
		 } 
		   
	  } System.out.println(" ");           // Abstandszeile
	  	System.out.println("_________");   // Console-Deko :D
	  
	  
  } 
  
  
  
  public static void printEmptyLine(int x) {
	  
	  for (int t = 0; t < x; t++) {     //iteriert genauso lange wie groß der übergene Wert ist
		  
		  System.out.print(".");       //gibt einen Punkt für jede Iteration aus
		  
		  
	  } System.out.println(" ");      //Abstandshalter 
	  System.out.println("_________"); // Console-Deko
	  
	  
	  
	   
  }
  
  
  
  
  public static void printSingleDot (int laenge, int position) {
	  
	  
	  for (int i = 0; i < laenge; i++) {      //Iteriert bis zum Wert des Übergabeparameters laenge
		  
	  
		   if (i == position) {				// Ist der Index der Schleife gleich dem Wert des Übergabeparamters position, wird ein # geprintet
			   								// ansonsten ein .
			   System.out.print("#");
		} else System.out.print("."); 								
			     
	  
	  } System.out.println(" ");     // nach jeddem durchlaufen des for loops und anschließendem printen von . & # wird eine Leerzeile erstellt
	  								// oder besser gesagt nach dem der Index der Schleife gleich der vorgegeben länge war
	  
	  
	  								
  }
  															
  
  
  
 
  
  public static void printSlash() {
	  
	 int length = 10; // deklaration der Variable length
	 
	 for (int i = 0; i < length; i++) { //Iteration bis zum Wert von length
		
		 int position = i;    //Deklaration der Variable position und Zuweisung des Werts des Schleifenindexes
		 
		 printSingleDot(length, position);  //Aufruf der Funktion printSingleDot() mit den Werten 1. length (festgelegt) 2. position (durch den Loop zugewiesen)
		
		 
	 }
	  
	    
		  
	  
	 
  }
  
  
  
  
  
  
  
  
}
