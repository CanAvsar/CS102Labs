import cs1.SimpleURLReader;
import java.util.ArrayList;


/*
 * 
 * 
 **/

public class XHTMLFilteredReader extends HTMLFilteredReader
{
      
      //properties
      
      ArrayList<String> links;
      
      
      
      
      //constructors
      
      public XHTMLFilteredReader(String theURL)
      {
            super(theURL);
            
            this.URL = theURL;
      }
      
      //methods
      
      public double getPercentage()
      {
            return ((double)getUnfilteredPageContents().length() / (double)getPageContents().length())*100;
      }
      
      
      public ArrayList<String> getLinks()
      {
            int start;
            int end;
            String substr;
            String contents;
            
            links = new ArrayList<String>();
            
            
            contents = getUnfilteredPageContents();
            
            start = contents.indexOf( "href" );
            
            while (start >= 0 )
            {
                  
                  substr = contents.substring( start + 6 );
                  
                  end = substr.indexOf( "\"" );
                  
                  
                  
                  links.add(substr.substring( 0 , end-1 ));

                  
                  contents = contents.substring ( end );
                  
                  start = contents.indexOf( "href" );
   
            }
            
            return links;
            
            
            
            
            
            
            
            
            
            
            
            
            
            
      }
      
      
      
      
      
}