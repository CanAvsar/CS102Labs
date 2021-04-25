/* 
 * Circle Class
 * @author Can Avsar
 * @version 10 March 2020
 **/

public class Circle extends Shape implements Selectable
{
      // properties
      
      int radius;
      boolean selected;
      
      // constructors
      
      public Circle(int radius)
      {
            this.radius = radius;
            
            selected = false;
            
            area = radius * radius * Math.PI;
      }
      
      // methods
      
      /*@Override
       public double getArea()
       {
       return area;
       }*/
      
      @Override
      public String toString()
      {
            if (selected)
                  return "A circle with a radius " + radius + " and an area " + area + " and it is selected.\n";
            else
                  return "A circle with a radius " + radius + " and an area " + area + " and it is not selected.\n";
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
            return null;
      }
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
} // end of Circle Class