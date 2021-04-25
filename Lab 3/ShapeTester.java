import java.util.Scanner;

/* 
 * ShapeTester Class
 * @author Can Avsar
 * @version 10 March 2020
 **/

public class ShapeTester
{
      public static void main(String[] args)
      {
            Scanner scan = new Scanner(System.in);
            
            // variables
            
            ShapeContainer shapes;
            int selection;
            int radius;
            int width;
            int height;
            int side;
            
            // initialization
            
            shapes = new ShapeContainer();
            
            // program code
            
            System.out.print("\nPlease choose a shape from the menu. (0 to quit.)"
                                         + "\n1 Circle"
                                         + "\n2 Rectangle"
                                         + "\n3 Square"
                                         + "\n4 Print all content"
                                         + "\n5 Find the shape and toggle its selected status"
                                         + "\n6 Remove all selected shapes\n");
            
            selection = scan.nextInt();
            
            while(selection!=0)
            {
                  if(selection == 1)
                  {
                        System.out.print("Enter its radius."); // enter x, y and setLocation -----------------------------------------------------------------
                        radius = scan.nextInt();
                        
                        if(radius < 0)
                        {
                              System.err.print("Please enter a valid radius.\n"); 
                        }
                        else
                        {
                              Circle circle = new Circle(radius);// setLocation after creation
                              shapes.add(circle);
                              System.out.print("The shape is added to the collection.");
                        }
                  }
                  
                  if(selection == 2)
                  {
                        System.out.print("Enter its width.");
                        width = scan.nextInt();
                        
                        System.out.print("Enter its height.");
                        height = scan.nextInt();
                        
                        if(width < 0 || height < 0)
                        {
                              System.err.print("Please enter valid values.\n");
                        }
                        else
                        {
                              Rectangle rectangle = new Rectangle(width, height);
                              shapes.add(rectangle);
                              System.out.print("The shape is added to the collection.");
                        }
                  }
                  
                  if(selection == 3)
                  {
                        System.out.print("Enter its side length.");
                        side = scan.nextInt();
                        
                        if(side < 0)
                        {
                              System.err.print("Please enter valid values.\n");
                        }
                        else
                        {
                              Square square = new Square(side);
                              shapes.add(square);
                              System.out.print("The shape is added to the collection.");
                        }
                  }
                  
                  if(selection == 4)
                  {
                        System.out.print("\n" + shapes.toString());
                  }
                  
                  if(selection == 5)
                  {
                        System.out.print("Enter x coordinate.");
                        int xCoor = scan.nextInt();
                        
                        System.out.print("Enter y coordinate.");
                        int yCoor = scan.nextInt();
                        
                        System.out.print("The shape containing these cordinates is " + shapes.contains(xCoor ,yCoor));
                        
                        shapes.toggle(shapes.contains(xCoor ,yCoor));
 
                        
                  }
                  
                  if(selection == 6)
                  {
                        shapes.removeSelectedShapes();
                        System.out.print("All of the selected shapes are removed.");  
                  }
                  
                  
                  if(selection > 6 || selection < 0)
                  {
                        System.err.print("Please enter a valid selection.\n");
                  }
                  
                  System.out.print("\nPlease choose a shape from the menu. (0 to quit.)"
                                         + "\n1 Circle"
                                         + "\n2 Rectangle"
                                         + "\n3 Square"
                                         + "\n4 Print all content"
                                         + "\n5 Find the shape and toggle its selected status"
                                         + "\n6 Remove all selected shapes\n");
                                         selection = scan.nextInt();
                                   }
            
            System.out.print("Goodbye!");
            
            }
      
      
      
} // end of ShapeTester Class