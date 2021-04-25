import javax.swing.*;
import java.awt.*;
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JComponent;


public class MyDrawingPanel extends JPanel
{
      
      private int width;
      private int height;
      private Color color;
      JButton b;
      
      
      public MyDrawingPanel()
      {
            setPreferredSize(new Dimension(300,250));             
            
            setBackground(Color.YELLOW); 
            
            setLayout( new FlowLayout() );
      }
      
      public MyDrawingPanel(int width, int height)
      {
            setPreferredSize(new Dimension(width,height));
            
            setBackground(Color.BLUE);
            
            setLayout( new FlowLayout() );
      }
      
      public void changeColor(String color)
      {
            if(color.toLowerCase().equals("red"))
                  setBackground(Color.RED);
            
            if(color.toLowerCase().equals("orange"))
                  setBackground(Color.ORANGE);
            
            if(color.toLowerCase().equals("yellow"))
                  setBackground(Color.YELLOW);
            
            if(color.toLowerCase().equals("green"))
                  setBackground(Color.GREEN);
            
            if(color.toLowerCase().equals("blue"))
                  setBackground(Color.BLUE);
            
            if(color.toLowerCase().equals("black"))
                  setBackground(Color.BLACK);
            
            if(color.toLowerCase().equals("white"))
                  setBackground(Color.WHITE);
      }
      
      public void paintComponent(Graphics g)
      {
            super.paintComponent(g);
            
            g.setColor(Color.BLACK);
            
            g.fillRect(0, 0, 200, 200);
            
            g.setColor(Color.CYAN);
            
            g.fillOval(getWidth()/4, getHeight()/4, getWidth()/2, getHeight()/2);
            
            g.setColor(Color.BLUE);
           
            g.fillRect(300,300,250,200);
            g.drawLine(15,15,400,400);
            
            g.setColor(Color.RED);
            g.drawString("Hello",50,70);
      }
      

      
}