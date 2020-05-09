import java.util.regex.Pattern;
import java.util.regex.Matcher;
class sai37
{
   public static void main(String aa[])
   {

	   String text="abc@gmail.com";
	   String verify="...@gmail.com";
	   Pattern pt=Pattern.compile(verify);
	   Matcher mc=pt.Matcher(text);
       p.ptr(mc.matches());


   }

}
