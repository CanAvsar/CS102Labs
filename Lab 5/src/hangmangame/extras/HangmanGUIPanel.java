package hangmangame.extras;

import cs102.hangman.HangmanModel;
import java.awt.BorderLayout;
import java.awt.*;
import java.awt.Dimension;
import javax.swing.JPanel;

/**
 * Collection of UI components to form a complete Hangman game. 
 * View components implement IHangmanView, so they can automatically update
 * whenever the hangmanModel associated with changes, changes.
 * Other components are hangman controllers that update the model.
 * @author Can Avsar
 * @version 14 April 2020
 */

public class HangmanGUIPanel extends JPanel 
{

   NewGameButtonControl button;
   TextFieldControlPanel tfcPanel;
   LabelsHangmanView lhView;
   GallowsHangmanView ghView;
   NewGameButtonControl bView;
   LetterButtonControls letters;
   HangmanLetterButtonControls bcView;
   
   public HangmanGUIPanel( HangmanModel hm)
   {
      setPreferredSize( new Dimension( 500, 350) );
      setLayout( new BorderLayout() );
      //setBackground(Color.CYAN);
      
      lhView = new LabelsHangmanView(); 
      hm.addView( lhView );
      add(lhView, BorderLayout.WEST);
      
      ghView = new GallowsHangmanView(hm); 
      //ghView.setPreferredSize(new Dimension(100,100));
      hm.addView( ghView );
      add(ghView, BorderLayout.CENTER);

      
      tfcPanel = new TextFieldControlPanel(hm);
      add(tfcPanel, BorderLayout.NORTH);
      
      //button = new NewGameButtonControl(hm);
      //add(button, BorderLayout.SOUTH);
      
//      letters = new LetterButtonControls(hm.getAllLetters(), hm);
//      add(letters, BorderLayout.EAST);
      
      bView = new NewGameButtonControl(hm );
      hm.addView( bView);
      add(bView, BorderLayout.SOUTH);
      
      bcView = new HangmanLetterButtonControls(hm.getAllLetters(), hm); 
      hm.addView( bcView );
      add(bcView,BorderLayout.EAST);
      
     
      

      // add controls and views here...
      
   }
   
}
