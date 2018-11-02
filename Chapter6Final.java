import java.util.Scanner;
import java.io.IOException;
import java.io.File;
import java.io.PrintWriter;

public class PP6InputPW
{
   public static void main(String [] args)throws IOException
   {
      PrintWriter lowercaseOut = new PrintWriter(new File("Lower.txt"));
      
      for(int i = 0; i < 1000; i++)
      {
         int x = (int)(97+(25*Math.random()));
         lowercaseOut.println(x);
      }
      lowercaseOut.close();
      
      PrintWriter uppercaseOut = new PrintWriter(new File("Upper.txt"));
      
      for(int i = 0; i < 1000; i++)
      {
         int x = (int)(65+(25*Math.random()));
         uppercaseOut.println(x);
      }
      uppercaseOut.close();
      
      PrintWriter Mixed_Letters = new PrintWriter(new File("Mixed_letters.txt"));
      
      for(int i = 0; i < 1000; i++)
      {
         int x = (int)(65 + (25*Math.random())) || (int)(97+(25*Math.random()));
      }
   }
}