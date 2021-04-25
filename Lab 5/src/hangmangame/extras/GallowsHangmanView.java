package hangmangame.extras;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import javax.swing.border.*;
import cs102.hangman.*;
import java.util.*;

/**
 * GallowsHangmanView Class
 * @author Can Avsar
 * @version 14 April 2020
 */

public class GallowsHangmanView extends JPanel implements IHangmanView
{
      HangmanModel hangman;
      JButton change;
      BListener listener;
      int i=0;
      
      Color[] colors = {Color.RED,Color.ORANGE, Color.YELLOW,Color.GREEN, Color.CYAN, Color.BLUE, Color.MAGENTA, Color.PINK  };

      public GallowsHangmanView(HangmanModel hangman)
      {
            this.hangman = hangman;
            
            this.setBackground(Color.CYAN);
            
            change = new JButton();
            change.setText("Change Color");
            add(change);
            listener = new BListener();
            change.addActionListener(listener);
      }
      
      
      @Override
      public void paintComponent(Graphics g)
      {
            int i = hangman.getNumOfIncorrectTries();
            //setBackground(Color.CYAN);
            g.fillRect(30, 50 , 15, 150); // bottom horizontal
            g.fillRect(5, 200 , 150, 20); // left
            g.fillRect(30, 50 , 75, 15); // top horizantal
            g.fillRect(105, 50 , 5, 30); // mini
            
            if(i > 0)
            g.drawOval(90,80,35,35); // head
           
            if(i > 1)
            g.drawLine(108,115,108,160); // body
           
            if(i > 2)
            g.drawLine(108,125,95,150); // left arm
           
            if(i > 3)
            g.drawLine(108,125,120,150); // right arm
           
            if(i > 4)
            g.drawLine(108,160,95,185); // left leg
           
            if(i > 5)
            g.drawLine(108,160,120,185); // right leg
            
      }
      
      @Override
      public void updateView(Hangman hm)
      {
           //setBackground(Color.CYAN);
            repaint();
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
                 // int i = (int)Math.floor(Math.random() * colors.length); 

                  setBackground(colors[i]);
                  
                  i++;
                  
                  if(i == colors.length)
                        i = i - colors.length;
                  
                  
            }
      }
      
      
}