import java.util.Scanner;
import java.io.IOException;
import java.io.File;
import java.io.PrintWriter;

public class Chapter6f
{
   public static void main(String [] args)throws IOException
   {
      // Making new output in 1 step
      PrintWriter outFile = new PrintWriter(new File("hellos.txt"));
      
      // Making new output in 2 steps
         //File out = new File("hellos.txt");
         //PrintWriter outFile2 = new PrintWriter(out);
         
         for(int i=0; i<25; i++)
         {
            outFile.println("Hello");
         }
         outFile.close();
         
         PrintWriter outFile2 = new PrintWriter(new File("hellos2.txt"));
         
         for(int i = 0; i < 25; i++)
         {
            outFile2.println((i+1)+": hello");
         }
         
         outFile2.close();
   }

}