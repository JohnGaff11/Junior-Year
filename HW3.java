// John Gaffney
import java.util.*;
public class HW3
{
   public static void main (String [] args)
   {
      
      
      Scanner in = new Scanner(System.in);
      System.out.println("How many people in your party?");
      int p = in.nextInt();
      
      double [] people = new double[p];//define the array
      
      
      for(int i =0; i<p; i++)//displaying the menu
      {
         Scanner input=new Scanner(System.in);
         System.out.println("Please select a number :\n 1.Cream of Tomato ------$5.00\n 2.Chicken Tortilla ---------$6.50\n 3.Seafood Bisque ---------$9.50\n 4.Ahi Tuna ------------------$10.50\n 5.House ---------------------$6.00\n 6.Caesar ---------------------$8.00\n Finger Foods\n 7.Soft Pretzel Sticks -------$5.00\n 8.Spicy Tuna Egg Rolls ----$7.50\n 9.Guacamole ----------------$5.00\nBurgers\n 10.Main Street ----------------$12.00\n 11.Southwest ------------------$14.00\n 12.Sunny ------------------------$11.00\n 13.Steakhouse -----------------$18.0\n");
         
         do{
            int x = input.nextInt();
            if (x==1||x==7||x==9)
               people[i]+=5;
            else if (x==2)
               people[i]+=6.50;
            else if(x==3)
               people[i]+=9.50;
            else if (x==4)
               people[i]+=10.50;
            else if (x==5)
               people[i]+=6;
            else if (x==6)
               people[i]+=8;
            else if (x==8)
               people[i]+=7.50;
            else if (x==10)
               people[i]+=12;
            else if (x==11)
               people[i]+=14;
            else if (x==12)
               people[i]+=11;
            else if (x==13)
               people[i]+=18;
            else
               break;
            System.out.println("Is there anything else? type 0 to end");
            }while(true);
      }
     
      for (int c=0; c<p; c++)//displays the price for each person with tax

      {
         
         System.out.print(" Total price for Person number "+(c+1)+" is $"+(people[c]+.06*people[c]));
         
      }
   
   }
}