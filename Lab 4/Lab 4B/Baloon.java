import shapes.*;

/**
 * Baloon Class
 * @author Can Avsar
 * @version 7 April 2020
 */
public class Baloon extends Circle implements Drawable
{
      int maxRadius = 100;
      
      public Baloon() 
      {
            super(25);
      }
      
      
      @Override
      public void grow()
      {
            //super.setSelected(false);
            
            super.radius = super.radius + 1;
            
            if(super.radius >= maxRadius)
            {
                  super.radius = 0;
                  super.setSelected(true);
            } 
      }
      
} 