package shapes;
import java.awt.Graphics;

/* 
 * Shape Class
 * @author Can Avsar
 * @version 10 March 2020
 */

public class Shape implements Locatable, Drawable
{
      // properties
      
      double area;
      int x;
      int y;
      
      // constructors
      
      public Shape()
      {
      }
      
      // methods
      
      
      /*
       * Calculates and returns the area of the shape.
       * @return area of the shape
       */
      public double getArea()
      {
            return area;
      }
      
      /*
       * Writes all content in this class.
       * @return all content
       */
      public String toString()
      { 
            return "";
      }
      
      public int getX()
      { 
            return x;
      }
      
      public int getY()
      {
            return y;
      }
      
      public void setLocation(int x, int y)
      {
            this.x = x;
            this.y = y;
      }
      
      public void draw(Graphics g)
      {
      }
      
      public void grow()
      {
      }
      
      
      
      
      
} // end of Shape Class