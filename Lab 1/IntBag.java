/*
 * IntBag Class
 * @version 17 February 2020
 * @author Can Avsar
 */

public class IntBag
{
      //properties
      
      int[] bag;
      int valid;
      
      
      //constructors
      
      /**
       * Creates an empty collection with room for up to 100 elements.
       */
      public IntBag()
      {
            bag = new int[100];
            valid = 0;
      }
      
      /**
       * Creates an empty collection with taking the desired maximum number of elements as a parameter.
       * @param desiredMaxNum the number which represents given limit to the array 
       */
      public IntBag( int desiredMaxNum )
      {
            bag = new int[desiredMaxNum];
            valid = 0;
      }
      
      
      //methods
      
      /**
       * Adds a value to the end of the collection.
       * @param value the value that is going to be added
       */
      public void add( int value )
      {
            bag[valid] = value;
            valid++;
      }
      
      /**
       * Adds a value at a particular index location i with moving other values up to make room and checking i is within bounds.
       * @param value the value that is going to be added
       * @param i the number which represents a particular index location
       */
      public void add( int value, int i )
      {
            if( i >= 0 && i < valid )
            {
                  for(int k = valid; k > i; k-- ) // It is "length - 2" because the "length - 1" is the last element and can't be moved.
                  {    
                        bag[k] = bag[k - 1];
                  }
                  
                  bag[i] = value;
                  valid++;
            }
            else
                  System.out.println("ERROR");
      }
      
      /**
       * Removes the value at a given index wtih moving other values back down the array.
       * @param i the number which represents given index location
       */
      public void remove(int i)
      {
            if( i >= 0 && i < valid )
            {
                  for( int k = i; k < valid; k++ )
                  {    
                        bag[k - 1] = bag[k];
                  }
                  valid--;
            }
            else
                  System.out.println("ERROR");
      }
      
      /**
       *  Tests whether the collection contains a given value or not.
       * @param value the value that is going to be checked for if it is in the array
       * @return the boolean gives true when the given value is in the array
       */
      public boolean contains( int value )
      {
            for( int i = 0; i < valid; i++ )
            {
                  if( bag[i] == value )
                  {
                        return true;
                  }
            }
            return false;  
      }
      
      /**
       * Returns a String representation of the collection.
       * @return the string which has all elements of the array
       */
      public String toString()
      {
            String arrayString;
            arrayString = "";
            
            for ( int i = 0; i < valid - 1; i++ )
            {
                  arrayString =  arrayString + bag[i] + ",";
            }
            
            arrayString = arrayString + bag[valid-1];
            
            return arrayString;
      }
      
      /**
       * Returns the number of values currently in the collection.
       * @return int which is the number of valid elements in the array in that time
       */
      public int size()
      {
            return valid;
      }
      
      /**
       * Gets the value at location i within the collection.
       * @param i the value which is given location
       * @return int which is the element that is got from given location
       */
      public int get( int i )
      {
            return bag[i];
      }
      
      /**
       *  Returns the locations of all instances of a given value in the collection.
       * @param value the value which is going to found
       * @return the string which displays all indices with an array toString method
       */
      public String findAll( int value )
      {
            IntBag indices;
            indices = new IntBag(valid);
            
            for( int i = 0; i < valid ; i++ )
            {
                  if( bag[i] == value )
                  {
                        indices.add(i);
                  }    
            }
            return indices.toString();
      } 
}