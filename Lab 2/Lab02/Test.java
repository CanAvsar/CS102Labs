import java.util.Scanner;
import cs1.SimpleURLReader;

/**
 * @author Can Avşar
 * @version 3 March 2020
 */ 
public class Test
{
    public static void main( String[] args)
    {
        Scanner scan = new Scanner( System.in);
        
        // constants
        
        // variables
        
        SimpleURLReader URL;
        URL = new SimpleURLReader("http://www.cs.bilkent.edu.tr/%7Edavid/housman.htm");  
        
        MySimpleURLReader myURL;
        myURL = new MySimpleURLReader("http://www.cs.bilkent.edu.tr/%7Edavid/housman.htm");  
        
        HTMLFilteredReader filteredURL;
        filteredURL = new HTMLFilteredReader("http://www.cs.bilkent.edu.tr/%7Edavid/housman.htm");  
        
        XHTMLFilteredReader xfilteredURL;
        xfilteredURL = new XHTMLFilteredReader("http://www.cs.bilkent.edu.tr/%7Edavid/index.html");  
        
        String contents;
        String URLString;
        String URLName;
        int lineCount;
        
        
        // program code
        
        contents = xfilteredURL.getUnfilteredPageContents();
        lineCount = URL.getLineCount();
        URLString = myURL.getURL();
        URLName = myURL.getName();
        
        //System.out.println("Line count is " + lineCount + "\n");
        
        System.out.println("Contents of URL are \n\n" + contents);
        
        //System.out.println("URL is " + URL);
        
        //System.out.println("URL name is " + URLName);
        
        System.out.println("The percentage increase is " + ((int)xfilteredURL.getPercentage()-100));
        
        System.out.println(xfilteredURL.getLinks());
        
        
        
        
        
        
        
        

    }
    
}