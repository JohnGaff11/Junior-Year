// John Gaffney

import javax.swing.*;

public class KiloConverter extends JFrame
{

   private JPanel panel;
   private JLabel messageLable;
   private JTextField kiloTextField;
   private JButton calcButton;
   private int width = 310;
   private int height = 100;
   
   
   public KiloConverter()
   {
      setTitle("Kilo converter");
      setSize(width, height);
      setDefaultCloseOpteration(JFrame.EXIT_ON_CLOSE);
      
      buildPanel();
      
      add(panel);
      
      setVisable(true);
      
    }
    
    private void buildPanel()
    {
      messageLabel = new JLabel ("Enter a distance in Kilometers:");
      
      kiloTextField = new JTextField(10);
      
      calcButton = new JButton("Calculate");
      
      panel = new JPanel();
      
      panel.add(messageLable);
      panel.add(kiloTextField);
      panel.add(calcButton);
      
    }
    
    public static void main (String [] args)
    {
       new kiloConverter();
    }
    
}
       