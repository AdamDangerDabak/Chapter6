import java.util.Scanner;
import java.io.IOException;
import java.io.File;
import java.io.PrintWriter;
public class Chapter6g
{
   public static void main(String[] args)throws IOException
   {
      PrintWriter outFile = new PrintWriter(new File("Kids.txt"));
      
      for (int i = 0; i < 100; i++)
      {
         int x = (int)(4*Math.random());
         
         if(x == 0)
         {
            outFile.println((i+1) + ": BG");
         }
         else if(x == 1)
         {
            outFile.println((i+1) + ": GB");
         }
         else if(x == 2)
         {
            outFile.println((i+1) + ": BB");
         }
         else
         {
            outFile.println((i+1) + ": GG");
         }
         
      }
      
      outFile.close();
   }
}