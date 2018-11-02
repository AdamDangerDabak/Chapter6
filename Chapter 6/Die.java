//********************************************************************
//  Die.java       Author: Lewis/Loftus/Cocking
//
//  Represents one die (singular of dice) with faces showing values
//  between 1 and the number of faces on the die.
//********************************************************************

import java.util.Random;
public class Die implements Other, Comparable
{
   private final int MIN_FACES = 4;
   private static int count = 0;

   private static Random generator = new Random();
   private int numFaces;   // number of sides on the die
   private int faceValue;  // current value showing on the die

   //-----------------------------------------------------------------
   //  Defaults to a six-sided die. Initial face value is 1.
   //-----------------------------------------------------------------
   public Die ()
   {
      numFaces = 6;
      faceValue = 1;
      count++;
   }

   //-----------------------------------------------------------------
   //  Explicitly sets the size of the die. Defaults to a size of
   //  six if the parameter is invalid.  Initial face value is 1. 
   //-----------------------------------------------------------------
   public Die (int faces)
   {
      if (faces < MIN_FACES)
         numFaces = 6;
      else
         numFaces = faces;
   
      faceValue = 1;
      count++;
   }

   //-----------------------------------------------------------------
   //  Rolls the die and returns the result.
   //-----------------------------------------------------------------
   public int roll ()
   {
      faceValue = generator.nextInt(numFaces) + 1;
      return faceValue;
   }

   //-----------------------------------------------------------------
   //  Returns the current die value.
   //-----------------------------------------------------------------
   public int getFaceValue ()
   {
      return faceValue;
   }
   
   public int getNumFaces ()
   {
      return numFaces;
   }
   
   public static int getCount(){
      return count;
   }
   
   public boolean equals(Object obj)
   {
      Die x= (Die)obj;
   
      int a = x.getNumFaces();
      int b = this.getNumFaces();
   
      if(a==b)
      {
         return true;
      }
      else
      {
         return false;
      }
   
   }
   
   public int double_roll()
   {
      return 2*roll();
   }
   
   public int add_side(int x)
   {
      return numFaces+=x;
   }
   
   

   public int compareTo(Object obj)
   {
      Die x = (Die)obj;
   
      int a=this.getNumFaces();
      int b = x.getNumFaces();
   
      if(this.equals(x))
      {
         return 0;
      }
      
      else if(a>b)
      {
         return 1;
      }
      else
      {
         return -1;
      }
   }
   
   public double avgFaces(Die[] a)
   {
      double avg = 0;
      double sum = 0;
      
      for(int j = 0; j<a.length;j++)
      {
         sum += a[j].getNumFaces();
      }
      
      //System.out.println("sum = "+sum);
      avg = sum/a.length;
      return avg;
   }
   public String toString()
   {
      return "NumFaces: " + numFaces + " Facevalue: " + faceValue;
   }

}
