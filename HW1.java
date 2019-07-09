// John Gaffney
// 2/2/18
// Homework 1


import java.util.*;
import java.io.*;
public class HW1
{
   public static void main (String[] args) throws IOException
   {
      //initialization
      double count = 0;
      double total = 0;
      double evenCount = 0;
      double even = 0;
      double oddCount = 0;
      double odd = 0;
      //needed to count
      double accumulator;
      //checking for the existence of a file
      File file = new File ("numbers.txt");
      if(!file.exists())
      {
         System.out.println("Error! The file cannot be found.");
         System.exit(0);
      }
      
      Scanner keyboard = new Scanner(file);
      
      
      while(keyboard.hasNext())
      {
         count++;
         accumulator = Double.parseDouble(keyboard.nextLine());
         total += accumulator;
     
      
         if ((accumulator %2) == 0)
         {
            evenCount++;
            even += accumulator;
         
         }
         else
         {
            oddCount++;
            odd += accumulator;
         }
      
      }
      
      double totalAvg, evenAvg, oddAvg;
      // math
      totalAvg = total/count;
      evenAvg = even/evenCount;
      oddAvg = odd/oddCount;
      
      // output on screen
      System.out.println("Students name: John Gaffney");
      System.out.println("Student email: jg898744@wcupa.edu");
      System.out.println("There are: " +count+ " total numbers.");
      System.out.println("There are: " +evenCount+ " even numbers.");
      System.out.println("There are: " +oddCount+ " odd numbers.");
      System.out.println("The total average of all numbers is: " +totalAvg);
      System.out.println("The even number average is: " +evenAvg);  
      System.out.println("The odd number average is: " +oddAvg); 
      
      
   }
}
   