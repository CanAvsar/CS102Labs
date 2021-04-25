import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

/**
 * GameFrame
 * @author Can Avsar
 * @version 31 March 2020
 */

public class GameFrame extends JFrame
{  
      
      //variables
      
      JPanel buttonPanel;
      JLabel label;
      int secret;
      int noOfTries;
      boolean gameIsOver;
      
      //constants
      
      private static final int FRAME_WIDTH = 500;
      private static final int FRAME_HEIGHT = 500;
      private static final int LAYOUT_SIDE1 = 5;
      private static final int LAYOUT_SIDE2 = 5;
      private static final int BUTTON_COUNT = (LAYOUT_SIDE1 * LAYOUT_SIDE2) ;
     
      //constructors
      
      public GameFrame()
      {
            noOfTries = 0;
            secret = ((int) Math.floor(Math.random() * BUTTON_COUNT)) +1;
            gameIsOver = false;
            
            setSize(FRAME_WIDTH, FRAME_HEIGHT);
            
            JPanel gamePanel = new JPanel();
            gamePanel.setLayout(new BorderLayout());
            
            createButtonPanel();
            gamePanel.add(buttonPanel, BorderLayout.CENTER);
            
            label = new JLabel( "WELCOME TO LUCKY POT!" );
            gamePanel.add(label, BorderLayout.NORTH);
            
            add(gamePanel);
      }
      
      //methods
      
      /**
       * This method creates a button panel with "button count" buttons.
       */
      public void createButtonPanel()
      {
            
            buttonPanel = new JPanel();
            buttonPanel.setLayout(new GridLayout(LAYOUT_SIDE1, LAYOUT_SIDE2));
            
            for ( int i = 1; i <= BUTTON_COUNT ; i++)
            {
                  JButton b = new JButton( String.valueOf(i));
                  buttonPanel.add(b);
                  ActionListener listener = new ButtonListener(i);
                  b.addActionListener(listener);
            }
      }
      
      //inner classes
      
      /**
       * ButtonListener
       * @author Can Avsar
       */
      class ButtonListener implements ActionListener
      {
            private int digit;
            
            public ButtonListener(int digit)
            {
                  this.digit = digit;
            }
            
            public void actionPerformed(ActionEvent event)
            {  
                  JButton button = (JButton) event.getSource();
                  
                  noOfTries++;
                  
                  if(!gameIsOver)
                  {
                        if( digit == secret)
                        {
                              
                              button.setText("FOUND!");
                              button.setBackground(Color.GREEN);
                              button.setOpaque(true);
                              label.setText("GAME OVER, YOU GOT IT " + noOfTries + " ATTEMPTS!");
                              gameIsOver = true;
                        }
                        else
                        {
                              button.setText("NOT HERE.");
                              button.setForeground(Color.RED);
                        }
                  } 
                  
            }
            
      }   
      
      
}

