public class Operators {
	public static void main(String[] args) {
		
		int i;
		int j;
		boolean b;
		i = 5;
		
		j = 5 + 5; // 10
		
		j = 5 * 5 - 5 / 2; // 10
		
		j = i * 10 / i % 10; // -35
		
		b = i + 1 > i - 1; // true
		
		System.out.println("i=" + i + ", j=" + j + ", b=" + b); 
		System.out.println("");
		System.out.println("Ich habe hin und her probiert aber die Variable j kommt einfach nicht auf -35. ");
		System.out.println("Vielleicht könnte man diese Rechung verwenden: j = i*10-i*10-35 = -35");
	}
}
