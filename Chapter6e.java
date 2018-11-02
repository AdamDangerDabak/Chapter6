import java.util.Scanner;
import java.io.IOException;
import java.io.File;
import java.io.PrintWriter;

public class Chapter6e{
   
   public static void main(String[]args) throws IOException
   {
      File filename = new File("Lyrics2.txt");
      Scanner inFile = new Scanner(filename);
      String token = ""; 
      int count = 0;
      
      while(inFile.hasNext())
      {
         token=inFile.nextLine();
        // System.out.println(token);
         count++;
      }
      
      inFile.close();
      // System.out.println("count = "+ count);
       
      String[] array1= new String[count];
     
      Scanner inFile2 = new Scanner(filename);
      count = 0;
      while(inFile2.hasNext())
      {
         token=inFile2.nextLine();
          
         array1[count] = token;
         count++;
      }
      inFile2.close();
      for(int i = 0; i < array1.length; i++){
         System.out.println(array1[i]);
      }
      
   }
}