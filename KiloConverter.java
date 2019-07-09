// John Gaffney

import javax.swing.*;
import java.awt.event.*;

public class FlowWindow extends JFrame
{
   private int width = 500;
   private int height = 600;
   
   public FlowWindow()
   {  
      setTitle("Flow Layout");
      setSize(width,height);
      
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setLayout(new FlowLayout());
      
      JButton button1 = new JButton("1");
      JButton button2 = new JButton("2");
      JButton button3 = new JButton("3");
      
      add(button1);
      add(button2);
      add(button3);
      
      setVisible(true);
      
    }
    
    public static void main (String [] args)
    {
       new FlowWindow();
    }
    
 }

   