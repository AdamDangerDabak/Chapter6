import java.util.Scanner;
import java.io.IOException;
import java.io.File;
import java.io.PrintWriter;

public class Chapter6ff
{
   public static void main(String [] args)throws IOException
   {
      // Making new output in 1 step
      PrintWriter outFile = new PrintWriter(new File("hellos.txt"));
      
      // Making new output in 2 steps
         //File out = new File("hellos.txt");
         //PrintWriter outFile2 = new PrintWriter(out);
         
         for(int i=0; i<10; i++)
         {
            outFile.println("GoodBye");
         }
         outFile.close();
   }

}