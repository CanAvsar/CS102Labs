package hangmangame.extras;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import cs102.hangman.*;

/**
 * TextFieldControlPanel Class
 * @author Can Avsar
 * @version 14 April 2020
 */

public class TextFieldControlPanel extends JPanel 
{
      
      HangmanModel hangman;
      JTextField tField;
      TFListener listener;
      
      public TextFieldControlPanel(HangmanModel hangman)
      {
            this.hangman = hangman;
            
            tField = new JTextField();
            listener = new TFListener();
            tField.addActionListener(listener);
            tField.setPreferredSize(new Dimension(100,20));
            this.add(tField);
            
      }
      
      /**
       * TFListener Class
       * @author Can Avsar
       * @version 14 April 2020
       */
      class TFListener implements ActionListener
      {
            public void actionPerformed(ActionEvent event)
            {
                  String text = tField.getText();
                  
                  for(int i=0; i < text.length(); i++)
                  {
                        char ch = tField.getText().charAt(i);
                        
                        hangman.tryThis(ch);
                  }
                  
                  tField.setText("");
                  
            }
            
      }
      
      
      
}