package shapes;
import java.util.ArrayList;
import java.util.Iterator; 


/* 
 * ShapeContainer Class
 * @author Can Avsar
 * @version 10 March 2020
 **/

public class ShapeContainer implements Iterable<Shape>
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
            
            for(int i = 0; i < shapes.size(); i++)
            {
                  if (((Selectable)shapes.get(i)).getSelected())
                  {
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
            
            contents = contents + "There are " + shapes.size() + " shapes in the container.\n";
            
            for(int i = 0; i < shapes.size(); i++)
            {
                  totalArea = totalArea + shapes.get(i).getArea();
                  contents = contents + shapes.get(i).toString();
            }
            contents = contents + "and total area of shapes is " + totalArea + "\n";
            return contents;
      }
      
       /**
       * Returns all shapes contains that coordinates
       * @param x is the x coordinate
       * @param y is the y coordinate
       * @return Shape is the founded shape
       **/
      public Shape contains(int x, int y)
      { 
            Iterator itr1 = this.shapes.iterator(); 
            
            Shape s; 
            do 
            { 
                  if (!itr1.hasNext()) 
                  { 
                        return null; 
                  } 
                  
                  Shape shape = (Shape)itr1.next(); 
                  s = ((Selectable)shape).contains(x, y); 
            } 
            while(s == null); 
            
            return s; 
      }
      
      /**
       * Gets the size of the arraylist
       * @return int is number of items in the list
       **/
      public int size()
      {
            return shapes.size();
      }
      
      /**
       * Selects all shapes contains that coordinates
       * @param x is the x coordinate
       * @param y is the y coordinate
       * @return int is the count of selected shapes
       **/
      public int selectAllAt(int x, int y)
      { 
            int count = 0; 
            Iterator itr2 = this.shapes.iterator(); 
            
            while(itr2.hasNext()) 
            { 
                  Shape shape = (Shape)itr2.next(); 
                  Shape s = ((Selectable)shape).contains(x, y); 
                  if (s != null) 
                  { 
                        ((Selectable)s).setSelected(true); 
                        count++; 
                  } 
            } 
            return count;
      }
      
      
      @Override
      public Iterator<Shape> iterator() 
      {
            return this.shapes.iterator();
      }  
      
} // end of ShapeContainer Class