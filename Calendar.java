public class Calendar {
    public static void main(String args[]) {
        int year = Integer.parseInt(args[0]);
        advance(year);
}
    private static void advance(int stopyear) {
		int year=1900;
		int sundaycounter=1;
        boolean stop= true; 
		while (stop)
		{
			for(int i=1;i<13;i++)
		    {
			for(int j=1;j<=nDaysInMonth(i,year);j++)
			{
                sundaycounter++;
			    if (i == 12 && j == nDaysInMonth(i,year))
				{
					year++;
					if (year == stopyear)
					{
						for (int k=1; k< 13; k++)
                        {
                            for (int m=1; m <= nDaysInMonth(k, stopyear); m++)
                            { 
                                if (sundaycounter % 7 == 0 )
                                {
                                    System.out.println(m+"/"+k+"/"+stopyear+ " Sunday");
                                }
                                else System.out.println(m+"/"+k+"/"+stopyear);
                                sundaycounter++;
                            }
                            
                        }
						
					} 
                    else if (year == stopyear + 1)
                         stop= false;
					
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
    

