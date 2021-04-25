import java.util.*;

/**
 * Recursion - Some recursive methods and their tests.
 * @author Can Avsar
 * @version 28 April 2020
 **/

public class Recursion
{ 
      // Variables
      
      static String binary = "";
      static int count = 0;
      static int number;
      static int power = 31;
      static int start = 0;
      static int k=0;
      //static int mod = 0;
      static boolean firstOne;
      static boolean result=true;
      static boolean checked=true;
      
      // Methods
      
      /**
       * Finds the number of e letter in the given string.
       * Method for 1st Task
       * @param s is the given string
       * @return int is the number of letter e
       **/
      public static int noOfE(String s)
      {
            if(s.length() > 0)
            {
                  if(s.charAt(0) == 'e')
                        count++;
                  
                  noOfE(s.substring(1));
            }
            
            return count;
      }
      
//      /**
//       * Converts a decimal value to a binary string.
//       * Method for 2nd Task
//       * @param value is the given decimal number
//       * @return String is the converted binary string
//       **/
//      public static String decimalToBinary(int value)
//      {
//            if( power >= 0 )
//            {
//                  int a = ( value / (int)Math.pow(2, power)); 
//                  
//                  if( a == 0 ) 
//                  {  
//                        if ( firstOne == true ) // first 1 digit changes the boolean 
//                              binary = binary + '0';
//                        
//                        power--;
//                        decimalToBinary(value);
//                  } 
//                  else 
//                  {   
//                        binary = binary + '1'; 
//                        firstOne = true; // after first 1 occurs other 0's will be printed in order to minimalise binary string 
//                        
//                        power--;
//                        decimalToBinary(value - (int)Math.pow(2, power+1));
//                  } 
//            }
//            return binary;
//      }
      
      /**
       * Converts a decimal value to a binary string.
       * Method for 2nd Task
       * @param value is the given decimal number
       * @return String is the converted binary string
       **/
      public static String decimalToBinary(int value)
      {
            int mod;
            
            if(value > 0)
            {
                  mod = value % 2;
                  return (decimalToBinary(value / 2) + "" + mod);
            }
            return "";
      }       
      
       /**
       * Checks if the given strings are in lexicographic order.
       * Method for 3rd Task
       * @param strings is the given strings as an ArrayList
       * @return boolean returns true if the strings in an order
       */
      public static boolean lexOrder(ArrayList<String> strings)
      {
            if(start < strings.size()-1)
            {
                  if((strings.get(start)).compareTo(strings.get(start + 1)) > 0)
                  {
                        result = false;
                  }
                  else
                  { 
                        start++;
                        lexOrder(strings);
                  }
            }
            return result;
      }
      
      
       /**
       * Checks a number has this condition: Decimals from left to right must be an order.
       * Method for 4th Task
       * @param number is the given number which is going to be checked
       * @return boolean returns true is number satisfies the condition
       **/
      public static boolean check(int number)
      { 
            if( k < (String.valueOf(number)).length() - 1 )
            {
                  if(String.valueOf(number).charAt(k) >= String.valueOf(number).charAt(k+1))
                  {
                        checked = false;
                  }
                  else
                  { 
                        k++;
                        check(number);
                  }
            }
            return checked;
      }
      
      /**
       * A recursive method for printing satisfying numbers.
       * Method for 4th Task
       * @param n is the given number of digits
       **/
      public static void enumerate(int n)
      {
            int no = (int)Math.pow(10, n - 1);
            int max = (int)Math.pow(10, n);

            print(no, max);
      }
      
      /**
       * A recursive method for printing satisfying numbers.
       * Method for 4th Task
       * @param no is the number that increases
       * @param max is the maximum number can be written
       **/
      public static void print(int no, int max)
      {
            if(no < max)
            {
                  k = 0;
                  checked = true;
                  
                  if(check(no))
                  {
                        System.out.println(no);
                  }
                  
                  //System.out.println(no + " " + max);
                  
                  no = no + 2;
                  print(no, max);
            }
      }
      
      //Main Method
      public static void main( String[] args) 
      { 
            Scanner scan = new Scanner( System.in);
            
            // Test of 1st Task
            
//            System.out.println("Enter the string you want to check.");
//            String input = scan.nextLine();
//            System.out.println(noOfE(input));
            
             // Test of 2nd Task
            
            System.out.println("Enter the decimal number you want to convert.");
            int number = scan.nextInt();
            System.out.println(decimalToBinary(number));
            
            // Test of 3rd Task
            
//            ArrayList<String> myList;
//            myList = new ArrayList<String>();
//            
//            myList.add("peach");
//            myList.add("apple");
//            myList.add("orange");
//            
//            
//            System.out.print(lexOrder(myList));
            
            // Test of 4th Task
            
//            System.out.println("Enter the decimal number you want numbers to have.");
//            int decimals = scan.nextInt();
//            enumerate(decimals);
      }
}