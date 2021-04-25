import java.util.*;

/**
 * Recursion Exercises - Some recursive exercises from Bits and Pieces page.
 * @author Can Avsar
 * @version 28 April 2020
 **/

public class RecursionExercises
{
      public static void main( String[] args)
      {
            Scanner scan = new Scanner( System.in);
            
            // constants
            
            final int STRING_SIZE = 5;
            final int COUNT = 0;
            final String[] STRING = {"a","b","c","d","e","f","f","e","d","c","b","a"};
            
            // variables
            
            int[] numbers;
            
            // program code
            numbers = new int[STRING_SIZE];
            numbers[0] = 1;
            numbers[1] = 2;
            numbers[2] = 3;
            numbers[3] = 4;
            numbers[4] = 5;
            
            System.out.println("RECURSIVE EXERCISES\n");
            
            System.out.println("Printing normally from COUNT.");
            printForward(numbers, 0);
            System.out.print("\n\n");
            
            System.out.println("Printing reverse from 4.");
            printReverse(4, numbers);
            System.out.print("\n\n");
            
            System.out.println("Printing value of 5 to the power 4.");
            System.out.print(power(5, 4));
            System.out.print("\n\n");
            
            System.out.println("Printing found index of maximum.");
            System.out.print(max(numbers, 3));
            System.out.print("\n\n");
            
            System.out.println("Printing from 2 to 8.");
            printValues(2, 8);  
            System.out.print("\n\n");
            
            System.out.println("ArrayList defining and printing from 2 to 8.");
            
            ArrayList values = new ArrayList();
            ArrayList list = valuesList(2, 8, values);
            
            for(int i = 0; i < list.size();i++)
            {
                  System.out.print( list.get(i) );
            }
            System.out.print("\n\n");
            
            System.out.println("Finding how many a's the array has.");
            System.out.print("Array has " + findOccurence(STRING,"a",COUNT));
            System.out.print("\n\n");
            
            System.out.println("Finding first c.");
            System.out.print("In the location " + findFirst(STRING,"c",COUNT));
            System.out.print("\n\n");
            
            System.out.println("Finding last d.");
            System.out.print("In the location " + findLast(STRING,"d",STRING.length));
            System.out.print("\n\n"); 
      }
      
      /**
       * Prints values of array in reverse order
       * @param n is the value which array going to be written
       * @param numbers is the array going to be used
       */
      public static void printReverse( int n, int[] numbers )
      {   
            if( n > 0 )
            {
                  System.out.print( numbers[n-1] );
                  printReverse( n - 1, numbers );   
            }        
      }
      
      /**
       * Prints elements of array in a normal order
       * @param numbers is the array going to be used
       * @param index is the number to start to print
       */
      public static void printForward( int[] numbers, int index )
      {
            if( index < numbers.length )
            {
                  System.out.print( numbers[index] );
                  printForward( numbers, index + 1 );
            }
      }
      
       /**
       * Finds maximum value in first n elements
       * @param array is the array going to be used
       * @param n is the first n elements
       * @return int is the maximum value of array
       */
      public static int max( int[] array, int n )
      {
            if( n == 1 )
                  return array[0]; 
                     
            return Math.max( array[n-1], max( array, n-1 ) ); 
      }
      
      /**
       * Takes given power of a number
       * @param x first number
       * @param y second number -- power
       * @return double x to the power y
       */
      public static double power( double x, int y )
      {
            double result = 1;
            if(y > 0)
                  result = result*x*power(x, y - 1);
            
            return result;
      }
      
      /**
       * Prints integers from a start to an end
       * @param start is the first number
       * @param end is the last number
       */
      public static void printValues( int start, int end )
      {
            if(start <= end)
            {
                  System.out.print( start );
                  printValues( start + 1, end );
            }
      }
      
      /**
       * Values method's ArrayList version
       * @param start is the first number
       * @param end is the last number
       * @return ArrayList is the numbers
       */
      public static ArrayList valuesList( int start, int end, ArrayList x )
      {
            if( start <= end )
            {
                  x.add( start );
                  valuesList( start + 1, end, x );
            }
            return x;
      }
      
       /**
       * Finds amount of an element
       * @param array is the array going to be used
       * @param destination is the desired last element
       * @param index is the start
       * @return int is the amount of an element
       */
      public static int findOccurence(String[] array, String destination, int index)
      {
            int result = 0;
            
            if( index < array.length )
            {
                  if( array[index].equals( destination ) )
                        result = result + 1 + findOccurence( array, destination, index+1 );
                  else
                        result = result + findOccurence( array, destination, index+1 );
            }
            return result;
      }
      
      /**
       * Finds index of first occurence of a desired element
       * @param array is the array going to be used
       * @param destination is the desired last element
       * @param index is the start
       * @return int is the index of first occurence of an element
       */
      public static int findFirst(String[] array, String destination, int index)
      {
            int result = 0;
            if( index < array.length )
            {
                  if( array[index].equals( destination ) )
                        return index;
                  
                  else
                        result = findFirst( array, destination, index + 1 );
            }
            return result;
      }
      
      /**
       * Finds the last occurence of an element
       * @param array is the array going to be used
       * @param destination is the desired last element
       * @param index is the start
       * @return int is the index of last occurence of an element
       */
      public static int findLast(String[] array, String destination, int index)
      {
            int result = 0;
            
            if( 0 < index - 1 )
            {
                  if( array[index-1].equals( destination) )
                        return index-1;
                  
                  else
                        result = findLast( array, destination, index-1 );
            }
            return result;
      }
}