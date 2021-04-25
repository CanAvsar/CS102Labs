import shapes.*;
import javax.swing.*;
import java.awt.Graphics;
import java.awt.event.*;
import java.util.Iterator;
import java.util.ArrayList;

/**
 * Baloons Game Panel Class
 * @author Can Avsar
 * @version 7 April 2020
 */
public class BaloonsGamePanel extends JPanel
{
      public static final int SIZE = 500;
      public static final int SECONDS = 20;
      
      ShapeContainer baloons;
      JLabel countLabel;
      JLabel time;
      JOptionPane option;
      int count;
      int elapsedTime;
      Timer t;
      MouseListener listener;
      ActionListener tlistener;
      
      
      public BaloonsGamePanel()
      {
            countLabel = new JLabel("Points: " + count);
            time = new JLabel("Timer: "+ elapsedTime);
            add(countLabel);
            add(time);
            
            tlistener = new TimerListener();
            t = new Timer(250, tlistener);
            
            listener = new MousePressListener();
            
            newGame();
      }
      
      /**
       * Creates new game
       **/
      public void newGame()
      {
            baloons = new ShapeContainer();
            
            for(int i = 0; i < 25; i++)
            {
                  Baloon b = new Baloon(); 
                  b.setLocation((int)Math.floor(Math.random() * SIZE),(int)Math.floor(Math.random() * SIZE));
                  baloons.add(b);
            }
            
            t.start();   
            
            addMouseListener(listener);
            
            elapsedTime = 0;
      }
      
      @Override
      public void paintComponent(Graphics g)
      {
            Iterator<Shape> itr = baloons.iterator(); 
            while (itr.hasNext())
            {
                  (itr.next()).draw(g);      
            }
      }
      
      
      /**
       * A class about timer and growth of circles
       * @author Can Avsar
       * @version 7 April 2020
       **/
      class TimerListener implements ActionListener
      {
            public void actionPerformed(ActionEvent event)
            {
                  Baloon b;
                  
                  Iterator<Shape> itr = baloons.iterator(); 
                  while (itr.hasNext())
                  {
                        b = ((Baloon)(itr.next())); 
                        
                        if(b.getSelected())
                        {
                              b.setLocation((int)Math.floor(Math.random() * SIZE),(int)Math.floor(Math.random() * SIZE));
                              b.setSelected(false);
                        }
                        
                        b.grow();
                        
                        repaint();
                  }
                  
                  if(baloons.size() < 15)
                  {
                        b = new Baloon();
                        b.setLocation((int)Math.floor(Math.random() * SIZE),(int)Math.floor(Math.random() * SIZE));
                        baloons.add(b);
                  }
                  
                  elapsedTime++;
                  
                  time.setText("Timer: " + (SECONDS - elapsedTime / 4)); // because it refreshes 4 times in every second (every 250 miliseconds)
                  
                  if (elapsedTime >= SECONDS*4)
                  { 
                        t.stop(); 
                        
                        removeMouseListener(listener); 
                        
                        int playAgain = JOptionPane.showConfirmDialog(null, "Play again? ", "GAME OVER", JOptionPane.YES_NO_OPTION);
                        
                        if (playAgain == 0)  
                        { 
                              newGame();
                        } 
                        else
                        {
                              System.exit(0);
                        }
                  }
            }
      }
      
      /**
       * A class about mouse
       * @author Can Avsar
       * @version 7 April 2020
       **/
      public class MousePressListener implements MouseListener
      { 
            public void mousePressed(MouseEvent event)
            { 
                  int x = event.getX();
                  int y = event.getY();
                  int selectedCount = baloons.selectAllAt(x,y);
                  baloons.removeSelectedShapes();
                  
                  if(selectedCount > 1)
                  {
                        count = count + selectedCount;
                        countLabel.setText("Points: " + count);
                  }
            }
            
            public void mouseReleased(MouseEvent event) {}
            public void mouseClicked(MouseEvent event) {}
            public void mouseEntered(MouseEvent event) {}
            public void mouseExited(MouseEvent event) {}
      }
}