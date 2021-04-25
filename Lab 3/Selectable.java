/* 
 * Selectable Interface
 * @author Can Avsar
 * @version 10 March 2020
 **/

interface Selectable
{
      // methods
      
      public boolean getSelected();
      
      public void setSelected(boolean selected);
      
      public Shape contains(int x, int y);
      
}