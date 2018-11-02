public class Chapter6{
   public static void main(String[]args){
      Die d1 = new Die();
      Die d2 = new Die();
      Die d3 = new Die();
      Die d4 = new Die();
      Die d5 = new Die();
      Die d6 = new Die(10);
      Die d7 = new Die(20);
      Die d8 = new Die(30);
      Die d9 = new Die(40);
      Die d10 = new Die(50);
      
      Die[] array1 = {d1,d2,d3,d4,d5,d6,d7,d8,d9,d10};
      
      for(int i = 0; i < array1.length; i++)
      {
      System.out.println(array1[i]);
      }
      
      //call avgFaces method
      double ans=d1.avgFaces(array1);
      System.out.println("Average number of faces in array1 = " + ans);
   }
}