
public class Exercise07 {

	static boolean isLeapYear(int year) {
		if (year % 400 == 0) {
			return true;
		} else if (year % 100 == 0) {
			return false;
		} else if (year % 4 == 0) {
			return true;
		} else {
			return false;
		}
	}

	static int daysOfMonth(int year, int month) {  //statt y,m => year, month
		switch (month) {
		case 2:
			if (isLeapYear(year))
				return 29;
			else
				return 28;
		case 4:
		case 6:
		case 9:
		case 11:
			return 30;
		default:
			return 31;
		
	}}

	 static String monthName(int x) {
		String[] monthNames = new String[] { "January", "February", "March", "April", "May", "June", "July", "August",
				"September", "October", "November", "December" };
		
		
		return monthNames[x - 1];
		
	 }

	static int printCalendar (int year, short dayOfWeekOfJanuaryFirst) {
		System.out.println("####### " + year + " #######");
		System.out.println();

		int currentWeekDay = dayOfWeekOfJanuaryFirst;
		
		for (int m = 1; m < 13; m++) {
			System.out.println(monthName(m));
			System.out.println(" Mo Di Mi Do Fr Sa So");

			for (int i = 1; i < currentWeekDay; i++) {
				System.out.print("   ");
				
				
			}

			int currentDayInMonth = 1;
			while (currentDayInMonth <= daysOfMonth(year, m)) {
				System.out.printf("%2d", currentDayInMonth);
				System.out.print(" ");
				
				currentDayInMonth++;
				currentWeekDay++;
				
				
				if (currentWeekDay == 8) {
					currentWeekDay = 1;
					System.out.println();
					
			}
			}
					
		            if (currentWeekDay != 1) { 
		                System.out.println(); 
		            }
		            System.out.println(); 
		        }
		        
		        
		        return currentWeekDay;
		    
	}
	
	public static void main(String[] args) {
		printCalendar(2024, (short) 1);
	}

}