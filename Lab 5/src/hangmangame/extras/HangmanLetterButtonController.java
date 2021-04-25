package hangmangame.extras;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import javax.swing.border.*;
import cs102.hangman.*;

/**
 * HangmanLetterButtonController Class
 * @author Can Avsar
 * @version 14 April 2020
 */

public class HangmanLetterButtonController implements ActionListener
{
      HangmanModel hm;
      char buttonLetter;
      
      public HangmanLetterButtonController(HangmanModel hm)
      {
            this.hm = hm;
      }
      
      
      /**
       * Action listener's event
       * @param event the event occured
       */
      public void actionPerformed(ActionEvent event)
      { 
            buttonLetter = ((JButton)event.getSource()).getText().charAt(0);
            System.out.println(buttonLetter);
            hm.tryThis(buttonLetter);
            ((JButton)event.getSource()).setEnabled(false);
            
            
            
            
            
      }
      
      
}
