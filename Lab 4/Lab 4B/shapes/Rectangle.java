package shapes;

/* 
 * Rectangle Class
 * @author Can Avsar
 * @version 10 March 2020
 **/

public class Rectangle extends Shape implements Selectable
{
      // properties
      
      int width;
      int height;
      boolean selected;
      
      // constructors
      
      public Rectangle(int width, int height)
      {
            this.width = width;
            this.height = height;
            
            selected = false;
            
            area = width * height;
      }
      
      // methods
      
      @Override
      public double getArea()
      {
            double area = super.getArea();
            return area;
      }
      
      @Override
      public String toString()
      {
            if (selected)
                  return "A rectangle with a height " + height + ", a width " + width + " and an area " + area + " and it is selected.\n";
            else
                  return "A rectangle with a height " + height + ", a width " + width + " and an area " + area + " and it is not selected.\n"; 
      }
      
      public boolean getSelected()
      {
            return selected;
      }
      
      public void setSelected(boolean selected)
      {
            this.selected = selected;
      }
      
 public Shape contains(int x, int y)
      {
            if((this.getX() + width >= x && getX() <= x) && (this.getY() + height >= y && getY() <= y))
                  return this;
            else
                  return null;
      } 
       
} // end of Rectangle Class