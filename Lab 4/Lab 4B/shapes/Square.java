package shapes;

/* 
 * Square Class
 * @author Can Avsar
 * @version 10 March 2020
 **/

public class Square extends Rectangle implements Selectable
{
      // properties
      
      int side;
      boolean selected;
      
      // constructors
      
      public Square(int side)
      {
            super(side, side);
            
            selected = false;
            
            this.side = side;
      }
      
      // methods
      
      @Override
      public double getArea()
      {
            return area;
      }
      
      @Override
      public String toString()
      {
            if (selected)
                  return "A square with a side length " + side + " and an area " + area + " and it is selected.\n";
            else
                  return "A square with a side length " + side + " and an area " + area + " and it is not selected.\n";
            
      }
      
      public boolean getSelected()
      {
            return selected;
      }
      
      public void setSelected(boolean selected)
      {
            this.selected = selected;
      }
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
} // end of Square Class