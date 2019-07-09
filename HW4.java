// John Gaffney
// 4/3/18
// HW4


// Get walk through

import java.util.*;
import java.io.*;
public class HW4
{
   public static void main(String args []) throws IOException
   {
      ArrayList num = new ArrayList();
      int o[] = new int[101];
      File f = new File("number.txt");
      Scanner n = new Scanner(f); 
      
      if(!f.exists())
         System.exit(0);
         

      while(n.hasNext())
      {
         boolean b = false;
         int z = n.nextInt();
         for(int x=1;x<=100;x++)
         {
            if(x==z)
            {
               o[x]++;
               if(o[x]>1)
               {
                  b = true;
               }
               break;
            }  
         }
         if(!b)
            num.add(z);
         
      }
      System.out.println("Number\tNumber of times");
      for (int u = 1; u<=100;u++)
      {
         System.out.println(u+"\t\t\t"+o[u]);
      }
      
   
  }
}

      
      
      
      
   


