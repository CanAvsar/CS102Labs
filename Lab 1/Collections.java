import java.util.Scanner;

/*
 * Collections Program
 * @version 17 February 2020
 * @author Can Avsar
 */

public class Collections
{
      public static void main( String[] args )
      {
            Scanner scan = new Scanner ( System.in );
            
            // variables
            
            IntBag collection;
            int input;
            int max;
            int number;
            int number2;
            int number3;
            int count;
            int index;
            int index2;
            int index3;
            String found;
            boolean created; //goneStep1
            boolean goneStep7;
            
            
            //initialising
            
            collection = new IntBag();
            count = 0;
            max = 0;
            index = 0;
            index2 = 0;
            index3 = 0;
            number = 0;
            number2= 0;
            number3 = 0;
            found = "";
            created = false;
            goneStep7 = false;
            
            
            //program code
            
            do 
            { 
                  System.out.print("1 - Create a new empty collection with a specified maximum capacity. \n"
                                         +  "2 - Read a set of positive values into the collection. \n"
                                         +  "3 - Print the collection of values. \n"
                                         +  "4 - Add a value at a specified location \n"
                                         +  "5 - Remove the value at a specified location. \n"
                                         +  "6 - Read a single test value. \n"
                                         +  "7 - Compute the set of locations of the test value. \n"
                                         +  "8 - Print the set of locations. \n"
                                         +  "9 - Quit the program. \n");
                  
                  input = scan.nextInt();
                  
                  if ( input == 1 ) 
                  { 
                        System.out.println("Enter the specified maximum capacity.");
                        max = scan.nextInt();
                        
                        collection = new IntBag(max);
                        created = true;
                        
                  } 
                  
                  else if ( input == 2 )  
                  {  
                        if(!created)
                              System.err.print("You must go to step 1 and create a collection.");
                        else
                        {
                              System.out.println("Enter a positive number to add, negative number to stop.");
                              number = scan.nextInt();
                              
                              while(number > -1)
                              {
                                    if( count < max )
                                    {
                                          collection.add(number);
                                          count++;
                                          number = scan.nextInt();
                                    }
                                    else
                                    {
                                          System.out.print("ERROR");
                                          number = -2;
                                    }
                              }
                        }
                  } 
                  
                  else if ( input == 3 )  
                  {  
                        if(!created)
                              System.err.print("You must go to step 1 and create a collection.");
                        else
                        {
                              if(collection.size() == 0 )
                                    System.err.print("You must go to step 2 or 4 and add some values in it.");
                              else
                              {
                                    System.out.println(collection.toString());
                              }
                        }
                  }
                  
                  else if ( input == 4 )  
                  {  
                        if(!created)
                              System.err.print("You must go to step 1 and create a collection.");
                        else
                        {
                              
                              while(number2 > -1)
                              {
                                    if( count < max )
                                    {
                                          System.out.println("Add a specific index.");
                                          index = scan.nextInt();
                                          
                                          System.out.println("Add a number.");
                                          number2 = scan.nextInt();
                                          
                                          collection.add(number2, index);
                                          
                                          count++;
                                          
                                    }
                                    
                                    else
                                    {
                                          System.out.print("ERROR");
                                          number2 = -2;
                                    }
                              }
                        }
                  } 
                  
                  else if ( input == 5 )  
                  {  
                        if(!created)
                              System.err.print("You must go to step 1 and create a collection.");
                        else
                        {
                              System.out.println("Add a specific index.");
                              index2 = scan.nextInt();
                              
                              if(index2 >= collection.size() )
                                    System.err.print("You can't remove this item because it is null.");
                              else
                              {
                                    
                                    collection.remove(index2);
                              }
                              
                        }
                  }
                  
                  else if ( input == 6 )  
                  {  
                        if(!created)
                              System.err.print("You must go to step 1 and create a collection.");
                        else
                        {
                              System.out.println("Add a specific index.");
                              index3 = scan.nextInt();
                              
                              System.out.println(collection.get(index3));
                        }
                  } 
                  
                  else if ( input == 7 )  
                  {  
                        if(!created)
                              System.err.print("You must go to step 1 and create a collection.");
                        else
                        {
                              System.out.println("Add a number to find its locations.");
                              number3 = scan.nextInt();
                              
                              found = collection.findAll(number3);
                              
                              goneStep7 = true;
                        }
                  } 
                  
                  else if ( input == 8 )  
                  {  
                        if(!created)
                              System.err.print("You must go to step 1 and create a collection.");
                        else
                        {
                              if(!goneStep7)
                                    System.err.print("You must go to step 7 and find locations.");
                              else
                              {
                                    System.out.println( found ); 
                              }
                        } 
                  }
            }
            while ( input != 9 );
            
            System.out.println( "Goodbye!" ); 
            
      }
}