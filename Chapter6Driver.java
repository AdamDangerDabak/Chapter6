import java.util.Scanner;
public class Chapter6Driver{
   public static void main(String[]args){
      int count = 1;
      Scanner input = new Scanner(System.in);
      //User input for how many dies to make
      System.out.println("How many Die objects would you like?");
      int dieNum = input.nextInt();
      
      //creating the die array
      Die[] array1;
      array1 = new Die[dieNum];
      
      Scanner input2 = new Scanner(System.in);
      //picking the number of sides for each die
      for (int i = 0; i<dieNum; i++){
         System.out.println("How many sides would you like on die number "+count+"? (Minimum is 6) ");
         int sideNum = input.nextInt();
         Die a = new Die(sideNum);
         array1[i] = a;
         count++;
      }
      System.out.println(" ");
      for(int i = 0; i < array1.length; i++)
      {
         System.out.println(array1[i]);
      }
   }
}