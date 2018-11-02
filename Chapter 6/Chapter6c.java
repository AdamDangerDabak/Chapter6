import java.util.Scanner;
import java.io.IOException;
import java.io.File;

public class Chapter6c
{
   public static void main(String[]args) throws IOException
   {
      Die[] ex= {new Die(), new Die(20), new Die()};
      
      File filename = new File("data.txt");
      Scanner inFile = new Scanner(filename);
      String token ="";
      
      while(inFile.hasNext())
      {
         token=inFile.next();
         System.out.println(token);
         
         
      }
   }
}