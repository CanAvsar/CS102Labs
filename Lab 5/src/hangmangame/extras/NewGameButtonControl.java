package hangmangame.extras;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import cs102.hangman.*;

/**
 * NewGameButtonControl Class
 * @author Can Avsar
 * @version 14 April 2020
 */

public class NewGameButtonControl extends JButton implements IHangmanView
{
      HangmanModel hangman;
      BListener listener;
      
      public NewGameButtonControl(HangmanModel hangman)
      {
            this.hangman = hangman;
            
            setVisible(false);
            setText("New Game");
            listener = new BListener();
            addActionListener(listener);
            
      }
      
      /**
       * Action Listener Class
       * @author Can Avsar
       * @version 14 April 2020
       */
      class BListener implements ActionListener
      {
            public void actionPerformed(ActionEvent event)
            {
                  
                  hangman.initNewGame();
                  
                  
            }
      }
      
      @Override
      public void updateView(Hangman hangman)
      {
            if(hangman.isGameOver())
                  setVisible(true);
            else
                  setVisible(false);
            
      }
      
}
