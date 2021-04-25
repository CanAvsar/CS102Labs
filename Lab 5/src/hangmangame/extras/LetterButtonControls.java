package hangmangame.extras;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import javax.swing.border.*;
import cs102.hangman.*;

/**
 * LetterButtonControls - keyboard for MVC demo of Hangman, but general purpose.
 * @author Can Avsar
 * @version 14 April 2020
 */
public class LetterButtonControls extends JPanel {
      
      HangmanLetterButtonController listener;
      HangmanModel hm;
      
      public LetterButtonControls(String letters, HangmanModel hm)
      {
            
            this(letters, 13, 2);
            this.hm = hm;
            listener = new HangmanLetterButtonController(hm);
            addActionListener(listener);

      }
      
      public LetterButtonControls(String letters, int rows, int cols) {
            setBorder(new TitledBorder("Choose a letter..."));
            setLayout(new GridLayout(rows, cols));
            
            for (int i = 0; i < letters.length(); i++) {
                  JButton b = new JButton("" + letters.charAt(i));
                  b.setMargin(new Insets(1, 2, 1, 2));
                  add(b);
            }
            
            
      }
      
      /**
       * Adds action listener
       * @param l is the listener is going to be added
       */
      public void addActionListener(ActionListener l) {
            Component[] buttons = getComponents();
            for (Component b : buttons) {
                  ((JButton) b).addActionListener(l);
            }
      }
      
       /**
       * Sets all letters enabled/disabled
       * @param state is the state that letters shifted
       */
      public void setEnabledAll(boolean state) {
            for (Component c : getComponents()) {
                  ((JButton) c).setEnabled(state);
            }
      }
      
      /**
       * Sets disabled selected letters 
       * @param letters is the selected letters
       */
      public void setDisabled(String letters) {
            letters = letters.toUpperCase();    // bug fix! ?think about this!
            for (Component c : getComponents()) {
                  char ch = ((JButton) c).getText().charAt(0);
                  ch = Character.toUpperCase(ch);  // bug fix!
                  if (letters.indexOf(ch) >= 0) {
                        ((JButton) c).setEnabled(false);
                  }
            }
      }
}
