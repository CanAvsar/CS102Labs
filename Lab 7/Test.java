import junit.framework.TestCase;

/**
 * Test Class - A JUnit test case class.
 * Every method starting with the word "test" will be called when running the test with JUnit.
 * @author Can Avsar
 * @version 12 May 2020
 */
public class Test extends TestCase {
      
      /**
       * A test method.
       * It tests if the contains method works properly.
       */
      public void testContain() 
      {
            List list = new List();
            
            boolean expected1 = false; // change this to true, it will give the error
            boolean actual1 = list.contains("CAN");
            assertEquals("Is it exist?", expected1, actual1);
            
            list.addToHead("Bilkent");
            
            boolean expected = true;
            boolean actual =  list.contains("Bilkent");
            assertEquals("Is it exist?", expected, actual);
      }
      
      /**
       * A test method.
       * It tests if the isOrdered method works properly.
       */
      public void testOrdered() 
      {
            List list = new List();
            list.addToHead("Can");
            list.addToHead("Lab");
            
            boolean expected1 = true; 
            boolean actual1 = list.isOrdered();
            assertEquals("Is it ordered?", expected1, actual1);
            
            list.addToHead("Bilkent");
            
            boolean expected = false; // change this to true, it will give the error
            boolean actual =  list.isOrdered();
            assertEquals("Is it ordered?", expected, actual);
      }
}