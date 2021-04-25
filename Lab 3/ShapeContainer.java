import java.util.ArrayList;

/* 
 * ShapeContainer Class
 * @author Can Avsar
 * @version 10 March 2020
 **/

public class ShapeContainer
{
      // properties
      
      ArrayList<Shape> shapes;
      double area;
      
      // constructors
      
      public ShapeContainer()
      {
            shapes = new ArrayList<Shape>();
      }
      
      
      // methods
      
      /*
       * Adds a shape to the shape container.
       */
      public void add(Shape s)
      {
            shapes.add(s);
      }
      
      public void removeSelectedShapes()
      {
            Shape s ;
            
            for(int i = 0; i < shapes.size(); i++)
            {
                  s = shapes.get(i);
                  
                  if(s.getClass().getName().equals("Circle"))
                  {
                        if(((Circle) s).getSelected())
                              shapes.remove(i);
                  }
                  
                  else if(s.getClass().getName().equals("Rectangle"))
                  {
                        if(((Rectangle)s).getSelected())
                              shapes.remove(i);
                  }
                  
                  else if(s.getClass().getName().equals("Square"))
                  {
                        if(((Square)s).getSelected())
                              shapes.remove(i);
                  }
            }
      }
      
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
            String contents = "";
            double totalArea = 0;
            
            contents = contents + "\nThere are " + shapes.size() + " shapes in the container.\n";
            
            for(int i = 0; i < shapes.size(); i++)
            {
                  totalArea = totalArea + shapes.get(i).getArea();
                  contents = contents + shapes.get(i).toString();
            }
            contents = contents + "\nand total area of shapes is " + totalArea + "\n";
            return contents;
      }
      
      
      public Shape contains(int x, int y)
      {
            for(int i = 0; i < shapes.size(); i++)
            {
                  if(shapes.get(i).getX() == x && shapes.get(i).getY() == y)
                        return shapes.get(i);
            }
            return null;
      }
      
      public void toggle(Shape s)
      {
            if(s.getClass().getName().equals("Circle"))
            {
                  if(((Circle) s).getSelected())
                        ((Circle)s).setSelected(false);
                  else
                        ((Circle)s).setSelected(true);
            }
            
            else if(s.getClass().getName().equals("Rectangle"))
            {
                  if(((Square) s).getSelected())
                        ((Square)s).setSelected(false);
                  else
                        ((Square)s).setSelected(true);
            }
            
            else if(s.getClass().getName().equals("Square"))
            {
                  if(((Rectangle) s).getSelected())
                        ((Rectangle)s).setSelected(false);
                  else
                        ((Rectangle)s).setSelected(true);
            }
      }
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
} // end of ShapeContainer Class