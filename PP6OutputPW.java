import java.util.Scanner;
import java.io.IOException;
import java.io.File;
import java.io.PrintWriter;

public class PP6OutputPW
{
   public static void main(String [] args)throws IOException
   {
   
      int tokenL = 0, tokenU = 0, tokenM = 0;
      int countL = 0, countU = 0, countM = 0;
   
      //Step 1 - creating 3 int arrays size 1000
      int[] upperInts = new int[1000];
      int[] lowerInts = new int[1000];
      int[] mixedInts = new int[1000];
      
      //Step 2 - reading each inputfile and storing the contents appropriatly
      //Step 2a - Lowercase letters
      File lowerFile = new File("Lower.txt");
      Scanner inLFile = new Scanner(lowerFile);
            
      while (inLFile.hasNext()){
         tokenL = inLFile.nextInt();
         lowerInts[countL] = tokenL;
         countL++;
      }
      
      inLFile.close();
      
      //Step 2b - Uppercase letters
      File upperFile = new File("Upper.txt");
      Scanner inUFile = new Scanner(upperFile);
      
      while (inUFile.hasNext()){
         tokenU = inUFile.nextInt();
         upperInts[countU] = tokenU;
         countU++;
      }
      
      //Step 2c - Mixedcase letter
      File mixedFile = new File("Mixed_letters.txt");
      Scanner inMFile = new Scanner(mixedFile);
      
      while (inMFile.hasNext()){
         tokenM = inMFile.nextInt();
         mixedInts[countM] = tokenM;
         countM++;
      }
      
      //Step 3 - Creating three different char arrays, and
      //populating each with the char based on the values
      //of the int array
      
      char[] upperChar = new char[1000];
      char[] lowerChar = new char[1000];
      char[] mixedChar = new char[1000];
      
      //Step 3a - Populating the uppercase array
      for(int i = 0; i<upperChar.length;i++)
      {
         upperChar[i] = (char)upperInts[i];
      }
      
      //Step 3b - Populating the lowercase array
      for(int i = 0; i < lowerChar.length;i++)
      {
         lowerChar[i] = (char)lowerInts[i];
      }
      
      //Step 3c - Populating the mixedcase array
      for(int i = 0; i < mixedChar.length;i++)
      {
         mixedChar[i] = (char)mixedInts[i];
      }
      
      //Step 4 - Printing the menus for the user to select what set of password they want
      System.out.println("Which kind of password would you like to generate?");
      System.out.println("1) Lower case letters");
      System.out.println("2) Upper case letters");
      System.out.println("3) Mixed upper and lower case letters");
      Scanner input = new Scanner(System.in);
      int nextNum = input.nextInt();
      
      //Step 5 - generating the output file containing the passwords based on thier selection.
      PrintWriter upperPw = new PrintWriter(new File("Upperpw.txt"));
      PrintWriter lowerPw = new PrintWriter(new File("Lowerpw.txt"));
      PrintWriter mixedPw = new PrintWriter(new File("Mixedpw.txt"));
      int counter = 0,lineCount = 1;
      
      if (nextNum == 1){
         while (counter < upperChar.length)
         {
            lowerPw.print(lineCount + ": "+lowerChar[counter]);
            lowerPw.print(lowerChar[counter+1]);
            lowerPw.print(lowerChar[counter+2]);
            lowerPw.print(lowerChar[counter+3]);
            lowerPw.print(lowerChar[counter+4]);
            lowerPw.print(lowerChar[counter+5]);
            lowerPw.print(lowerChar[counter+6]);
            lowerPw.print(lowerChar[counter+7]);
            lowerPw.println("");
            counter = counter + 8;
            lineCount++;
         }
         lowerPw.close();   
      }
      else if(nextNum == 2){
         counter = 0;
         lineCount = 1;
         while (counter < upperChar.length)
         {
            upperPw.print(lineCount + ": "+upperChar[counter]);
            upperPw.print(upperChar[counter+1]);
            upperPw.print(upperChar[counter+2]);
            upperPw.print(upperChar[counter+3]);
            upperPw.print(upperChar[counter+4]);
            upperPw.print(upperChar[counter+5]);
            upperPw.print(upperChar[counter+6]);
            upperPw.print(upperChar[counter+7]);
            upperPw.println("");
            counter = counter + 8;
            lineCount++;
         } 
         upperPw.close();  
      }
      else if(nextNum == 3){
         counter = 0;
         lineCount = 1;
         while (counter < mixedChar.length)
         {
            mixedPw.print(lineCount + ": "+mixedChar[counter]);
            mixedPw.print(mixedChar[counter+1]);
            mixedPw.print(mixedChar[counter+2]);
            mixedPw.print(mixedChar[counter+3]);
            mixedPw.print(mixedChar[counter+4]);
            mixedPw.print(mixedChar[counter+5]);
            mixedPw.print(mixedChar[counter+6]);
            mixedPw.print(mixedChar[counter+7]);
            mixedPw.println("");
            counter = counter + 8;
            lineCount++;
         } 
         mixedPw.close();  
      }  
      
      else{
         System.out.println("What're you tryna do? Break me?");
      } 
   }
}