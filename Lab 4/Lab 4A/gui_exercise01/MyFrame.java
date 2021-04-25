import java.awt.*;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JFrame;

/**
 *  
 * @author 
 * @version 
 */ 
public class MyFrame extends JFrame
{
   // properties

   // constructors
   public MyFrame()
   {
      JButton b;
      MyDrawingPanel  p;
      
      setSize( 450, 300);
      setLayout( new FlowLayout() );
      
      //add( new MyPanel() );
      //add( new MyPanel() );
      add( new MyDrawingPanel() );

      p = new MyDrawingPanel();
      //p.setLayout( new FlowLayout() );
      
      //p.add( new Label( "Welcome to ONLINE Java") );
//      
//      b = new Button( "Hello");
//      p.add( b);
//      add(  new Button( "Time for a break!" ) );
//      
//      p.add( new TextField( 25) );
      
//      add(p);
      
      pack();
      setVisible( true);      
   }

   // methods
     
}