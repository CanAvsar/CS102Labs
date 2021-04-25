import cs1.SimpleURLReader;


/*
 * 
 * 
 **/

public class MySimpleURLReader extends SimpleURLReader
{
      
      //properties
      
      String URL;
      String URLName;
     
      
      //constructors
      
      public MySimpleURLReader(String theURL)
      {
            super(theURL);
            
            this.URL = theURL;
      }
      
      //methods
      
      public String getURL()
      {
            return URL;
      }
      
      public String getName()
      {
            int index = -1;
            
            for ( int i = 0; i < URL.length(); i++)
            {
                  if (URL.charAt(i) == '/' )
                  {
                       index = i; // holds the last index that includes '/'
                  }
            }
            
            return URL.substring(index + 1);
            
//          Without Substring Method
//          String URLName = "";
//          for( int i = index + 1; i < URL.length(); i++)
//          {
//                URLName = URLName + URL.charAt(i);
//          }
//          return URLName;
      }
      
      
      @Override
      public String getPageContents()
      {
            String contents = super.getPageContents();
            
            return contents.substring(6);
            
//          Without Substring Method
//          String edited = "";
//          for ( int i = 4; i < contents.length(); i++)
//          {
//                edited = edited + contents.charAt(i);
//          }
//          return edited;
      }
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
}