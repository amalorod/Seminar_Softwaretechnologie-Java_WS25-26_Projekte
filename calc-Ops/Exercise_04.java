
public class Exercise_04 {


	
	
	//func1
	public static int func1 (double a, double b) {
		
		double x =  (a * b) / 7.0;
		return (int) x;  //nach int casten und zurückgeben
	}
	
	
	//dayOfYear
	public static float dayOfYear (int m, int d) {
		
		float AnteilTage = (float) ((m-1) * 30 + d); //abgeschlossene Monate (1-11) + 30 tage + zugewiesener int
		float AnteilDesJahres = (AnteilTage / 360f); // Ergebnis von oben durch 360
		return (float) AnteilDesJahres;  //Rückgabe des Ergebnisses in float
	}
	
	//isOdd
	public static boolean isOdd (int x) {
		
	/*	if (x%2 != 0) {
		 
			return true;
		} else return false; */  
		
		 return x%2==0; //wenn x/2 gerade ist wird true ausgegeben 
		 				//Kurze Variante
		
	} 
	
	
	
		
	
	
	
	
	
public static void main (String[] args) {
		
		System.out.println(isOdd(2));
		System.out.println(dayOfYear(12,30));
		System.out.println(func1(59.9,30.1));
	} 

	
	}
	