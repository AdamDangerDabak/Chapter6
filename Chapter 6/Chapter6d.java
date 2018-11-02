import java.util.Scanner;
import java.io.IOException;
import java.io.File;

public class Chapter6d{
   
   public static void main(String[]args) throws IOException
   {
      File filename = new File("lyric.txt");
      Scanner inFile = new Scanner(filename);
      String token = ""; 
      int count = 0;
      
      while(inFile.hasNext())
      {
         token=inFile.next();
        // System.out.println(token);
         count++;
      }
      // System.out.println("count = "+ count);
       
      String[] array1= new String[count];
     
      Scanner inFile2 = new Scanner(filename);
      count = 0;
      while(inFile2.hasNext())
      {
         token=inFile2.next();
          
         array1[count] = token;
         count++;
      }
       
      for(int i = array1.length; i > 0; i--){
         System.out.println(array1[i-1]);
      }
   }
}