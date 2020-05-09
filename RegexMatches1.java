import java.util.regex.*;

import java.io.*;
public class RegexMatches1 {

   public static void main( String args[] ) throws Exception
   {
	   BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
	   String s=br.readLine();
        System.out.println(Pattern.matches("[MH]{2}",s));
   }
}
