import java.awt.*;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPanel;

public class MyPanel extends JPanel
{
   
   public MyPanel()
   {
      JButton b;
      JButton c;
      
      setLayout( new FlowLayout() );
      
      add( new JLabel( "Welcome to ONLINE Java") );   
      b = new JButton( "Hello");
      add( b);
      
      c = new JButton( "NEW");
      add( c);
      
     
      add( new JTextField( 25) );
   }
}
