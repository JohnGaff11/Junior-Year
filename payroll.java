//John Gaffney
// 2/15/18
// Chapter 6

import java.util.*;

public class payroll
{
   private String name;
   private int ID;
   private double rate;
   private int hour;
   private double grossPay;
   
   public payroll()
   {
      name = null;
      ID = 0;
      hour = 0;
      rate = 0;
   }
   public payroll(String n, int id, int h, double r)
   {
      name = n;
      ID = id;
      hour = h;
      rate = r;
   }
   public payroll(String n, int id)
   {
      name = n;
      ID = id;
      hour = 0;
      rate = 0; 
   }
   public void setName(String n)
   {
      name = n;
   }
   public void setID(String id)
   {
      ID = Integer.parseInt(id);
   }
   public void setRate (double r)
   {
      rate = r;
   }
   public void setRate(String r)
   {
      rate = Double.parseDouble(r);
   }
   public void setHour (int h)
   {
      hour = h;
   }   
   public void setHour (String h)
   {
      hour = Integer.parseInt(h);
   }
   public String getName()
   {
      return name;
   }
   public int getID()
   {
      return ID;
   }
   public double getRate()
   {
      return rate;
   }
   public double getHour()
   {
      return hour;
   }
   public double getGrossPay()
   {  
      int x = hour*rate;
      return x;
   }
}

   