package hangmangame.extras;

import cs102.hangman.*;
import java.awt.BorderLayout;
import java.awt.*;
import java.awt.Dimension;
import javax.swing.JPanel;

/**
 * HangmanLetterButtonControls Class
 * @author Can Avsar
 * @version 14 April 2020
 */

public class HangmanLetterButtonControls extends LetterButtonControls implements IHangmanView
{
      public HangmanLetterButtonControls(String letters, HangmanModel hm)
      {
         super(letters ,hm);
      }
      
       public HangmanLetterButtonControls(String letters,  int rows, int cols)
      {
         super(letters ,rows, cols);
      }
      
      @Override
      public void updateView(Hangman hangman)
      {
            this.setEnabledAll(true);
            this.setDisabled(hangman.getUsedLetters());
            
//            if(hangman.getNumOfIncorrectTries() > 5)
//            {
//                  this.setDisabled(hangman.getAllLetters());
//            }
                  
      }
 
                  
      
      
}