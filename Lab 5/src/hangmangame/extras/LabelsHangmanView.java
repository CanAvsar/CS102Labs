package hangmangame.extras;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import javax.swing.border.*;
import cs102.hangman.*;

/**
 * LabelsHangmanView Class
 * @author Can Avsar
 * @version 14 April 2020
 */

public class LabelsHangmanView extends JPanel implements IHangmanView
{
      JLabel incorrect;
      JLabel known;
      JLabel used;
      JLabel lost;
      
      public LabelsHangmanView()
      {
            setPreferredSize( new Dimension( 150, 100) );
            setLayout( new BorderLayout() );
            setBackground(Color.GREEN);
            
            known = new JLabel("");
            known.setFont(new Font("Helvetica", Font.PLAIN, 15));
            lost = new JLabel("");
            lost.setFont(new Font("Helvetica", Font.PLAIN, 30));
            
            add(known,BorderLayout.CENTER);
            add(lost, BorderLayout.SOUTH);
      }
      
      @Override
      public void updateView(Hangman hangman)
      {
            known.setText(hangman.getKnownSoFar());
            if(hangman.isGameOver() && hangman.hasLost())
            {
                  lost.setText("You Lost");
                  //setBackground(Color.RED);
                  
            }
            else if (hangman.isGameOver() && (!hangman.hasLost()))
                  lost.setText("You Won");
                  
            
      }
      
      
}