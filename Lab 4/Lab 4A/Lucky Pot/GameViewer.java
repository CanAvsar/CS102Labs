import javax.swing.JFrame;

/**
 * GameViewer
 * @author Can Avsar
 * @version 31 March 2020
 */

public class GameViewer
{  
      public static void main(String[] args)
      {  
            // variables
            
            JFrame frame;
            
            //initialisation
            
            frame = new GameFrame();
            
            //program code
            
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            
            frame.setTitle("Game");
            
            frame.setVisible(true);
      }
      
}