/** String processing exercise 2. */
public class UniqueChars {
    public static void main(String[] args) {  
        String str = args[0];
        System.out.println(uniqueChars(str));
    }

    /**
     * Returns a string which is identical to the original string, 
     * except that all the duplicate characters are removed,
     * unless they are space characters.
     */
    public static String uniqueChars(String s) {
        String  news = "";
        news+= s.charAt(0);
        boolean sameletter = true;
        for(int i=0;i <s.length();i++)
        {
            char ch = s.charAt(i);
            if (ch== ' ')
            news+=' ';
            else for (int j=0; j<news.length();j++)
            {
                if(news.charAt(j)==ch)
                sameletter= false;
            }
            if(sameletter==true)
            {
                news+=ch; 
            }
            else sameletter=true;
            

        }
        return news;
    }
}


