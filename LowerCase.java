/** String processing exercise 1. */
public class LowerCase {
    public static void main(String[] args) {  
        String str = args[0];
        System.out.println(lowerCase(str));
    }

   /**
    * Returns a string which is identical to the original string, 
    * except that all the upper-case letters are converted to lower-case letters.
    * Non-letter characters are left as is.
    */
    public static String lowerCase(String s) {
        String news = "";
        char ch = ' ';
        for (int i = 0; i < s.length(); i++)
        {
           ch = s.charAt(i);
           if ((s.charAt(i) >= 'A') && (s.charAt(i) <= 'Z')) // check if the letter if the letter is capital char 
            {
              char lowercaseChar = (char) (ch + ('a' - 'A')); // c = 'B'+32; then c stores 'b'
              news += lowercaseChar;
            }
            else news += ch;
            
        }
        return news;
    }
}
