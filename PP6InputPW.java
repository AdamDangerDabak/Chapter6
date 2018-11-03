import java.util.Scanner;
import java.io.IOException;
import java.io.File;
import java.io.PrintWriter;

public class PP6InputPW
{
   public static void main(String [] args)throws IOException
   {
      PrintWriter lowercaseOut = new PrintWriter(new File("Lower.txt"));
      
      //Creating 1000 ints to represent lowercase letters
      for(int i = 0; i < 1000; i++)
      {
         int x = (int)(97+(25*Math.random()));
         lowercaseOut.println(x);
      }
      lowercaseOut.close();
      
      //Creating 1000 ints to represent uppercase letters
      PrintWriter uppercaseOut = new PrintWriter(new File("Upper.txt"));
      
      for(int i = 0; i < 1000; i++)
      {
         int x = (int)(65+(25*Math.random()));
         uppercaseOut.println(x);
      }
      uppercaseOut.close();
      
      //Creating 1000 ints to represent both uppercase and lower case letters
      PrintWriter Mixed_Letters = new PrintWriter(new File("Mixed_letters.txt"));
      
      for(int i = 0; i < 500; i++)
      {
         int x = (int)(97+25*Math.random());
         int y = (int)(65+25*Math.random());
         
         if(x >= 97 && x <= 122)
         {
         Mixed_Letters.println(x);
         }
         if(y >= 65 && y <= 90)
         {
         Mixed_Letters.println(y);
         }
      }
      // for(int i = 0; i < 1000; i++)
//       {
//          int x = (int)(65 + (57*Math.random()));
//          
//          if ( (x >= 65 && x <= 90) || (x>=97 && x<=122) && i < 1000)
//          {
//             Mixed_Letters.println(x);
//          }
//          else 
//          {
//              x = (int)(65 + (57*Math.random()));
//              if ( (x > 65 && x < 90) || (x>97 && x<122))
//              {
//                 Mixed_Letters.println(x);
//              }
//              else if( x > 90 && x <97)
//              {
//                 Mixed_Letters.println(122 - x);
//              }
//          }
//          
//          System.out.println(i);
//       }
      
      Mixed_Letters.close();  
   }
}
