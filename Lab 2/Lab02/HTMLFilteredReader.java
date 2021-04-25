import cs1.SimpleURLReader;


/*
 * 
 * 
 **/

public class HTMLFilteredReader extends MySimpleURLReader
{
      
      //properties
      
      
      
      //constructors
      
      public HTMLFilteredReader(String theURL)
      {
            super(theURL);
            
            this.URL = theURL;
      }
      
      //methods
      
      public String getPageContents()
      {
            String page = super.getPageContents();
            
            String contents = "";
            boolean add = true;
            
            for( int i = 0; i < page.length(); i++ )
            {
                  
                  if (page.charAt(i) == '<')
                        add = false;
                  else if (page.charAt(i) ==  '>')
                        add = true;
                  else if( add )
                        contents = contents + page.charAt(i);
                  
            }
            return contents;
      }
      
      public String getUnfilteredPageContents()
      {
            String contents = super.getPageContents();
            
            return contents;
      }
  
}
