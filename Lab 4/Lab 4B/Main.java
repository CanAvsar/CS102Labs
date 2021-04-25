import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 * Main Class
 * @author Can Avsar
 * @version 7 April 2020
 */

public class Main 
{  
      public static void main(String[] args)
      {
            JFrame baloonsFrame = new JFrame();
            
            BaloonsGamePanel baloons = new BaloonsGamePanel();
            
            baloonsFrame.setBackground(Color.white);
            
            baloonsFrame.add(baloons);
            
            baloonsFrame.setSize(500, 500);
            
            baloonsFrame.setVisible(true);
            
            baloonsFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            
      }
      
}