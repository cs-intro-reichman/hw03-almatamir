/** 
 * Prints the calendars of all the years in the 20th century.
 */
public class Calendar1 {	
    // Starting the calendar on 1/1/1900
	static int dayOfMonth = 1;   
	static int month = 1;
	static int year = 1900;
	static int dayOfWeek = 2;     // 1.1.1900 was a Monday
	static int nDaysInMonth = 31; // Number of days in January
	
	/** 
	 * Prints the calendars of all the years in the 20th century. Also prints the  
	 * number of Sundays that occured on the first day of the month during this period.
	 */
	public static void main(String args[]) {
		// Advances the date and the day-of-the-week from 1/1/1900 till 31/12/1999, inclusive.
	    // Prints each date dd/mm/yyyy in a separate line. If the day is a Sunday, prints "Sunday".
	    // The following variable, used for debugging purposes, counts how many days were advanced so far.
	    int debugDaysCounter = 3; 
		advance();
	    //// Write the necessary initialization code, and replace the condition
	    //// of the while loop with the necessary condition 
	 	while (debugDaysCounter<3) {
	 		//// Write the body of the while 		
	 		// advance();
	 		debugDaysCounter++;
	 		//// If you want to stop the loop after n days, replace the condition of the
	 		//// if statement with the condition (debugDaysCounter == n)
	 		
	 		
        }
	 	//// Write the necessary ending code here
	 }
	
	 // Advances the date (day, month, year) and the day-of-the-week.
	 // If the month changes, sets the number of days in this month.
	 // Side effects: changes the static variables dayOfMonth, month, year, dayOfWeek, nDaysInMonth.
	 private static void advance() {
		int year=1900;
		int sundaycounter=1;
		int totalof1sun = 0;
		boolean stop=true;
		while (stop)
		{
			for(int i=1;i<13;i++)
		    {
			for(int j=1;j<=nDaysInMonth(i,year);j++)
			{
				if(sundaycounter%7==0)
				{
					System.out.println(j+"/"+i+"/"+year+ " Sunday");
					if (j == 1 )
					totalof1sun++;
				}
				else{
					System.out.println(j+"/"+i+"/"+year);
				} 
				sundaycounter++;
				if (i == 12 && j == nDaysInMonth(i,year))
				{
					year++;
					if (year == 2000)
					{
						stop=false;
						System.out.println("During the 20th century, "+ (totalof1sun) + " Sundays fell on the first day of the month ");
					}
					
					else 
					{
						i = 1;
					    j = 0;
					}
					
				}

			}
			
		}
		


		

	}
		
	 } 
		 
	private static boolean isLeapYear(int year) {
		if(year % 4 == 0 ) 
		{
           if (year % 100 == 0)
		   {
			if (year % 400 == 0)
			{
				return true;
			}
			else return false;
		   } 
		   else return true;
		}
		else return false;
	}
	 
	
	private static int nDaysInMonth(int month, int year) {
		if (month == 4 || month == 6 || month == 9 || month == 11)
		{
          return 30;
		}
		else if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12)
		{
			return 31;
		}
		else if (isLeapYear(year))
		{
			if (month == 2)
			return 29;
		}
		return 28;
	}
}
