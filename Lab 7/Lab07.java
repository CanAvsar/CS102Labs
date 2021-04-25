/**
 * Lab07 Class - Testing
 * @author Can Avsar
 * @version 12 May 2020
 */

public class Lab07
{
      // Main Method
      
      public static void main( String[] args )
      {
            // Properties
            
            List list = new List();
            final int INDEX = 2;
            
            // Testing
            
            // Adding Nodes
            list.addToHead("ABC");
            list.addToHead("Can");
            list.addToHead("Lab");
            list.addToHead("David");
            list.addToTail("Bilkent");
            System.out.println("They are added to the list, the list is " + list);
            
            // Removing Nodes
            list.removeFromHead();
            System.out.println("The first node is removed, the list is " + list);
            
            // Get Node From Index
            System.out.println("The node in the index " + INDEX + " is " + list.getData(INDEX));
            
            // Printing the List
            list.print();
            System.out.println();
            
            // Reverse Printing the List
            list.printReverse();
            System.out.println();
            
            // Check Whether an Item is In the List
            System.out.println("Does the list contain CAN? " + list.contains("CAN"));
            System.out.println("Does the list contain Bilkent? " + list.contains("Bilkent"));
            
            // Check Whether the List is Ordered
            System.out.println("Is the list ordered? " + list.isOrdered());
            
            // Creating a List From an Array of Strings
            String strings[] = new String[3];
            strings[0] = "Can";
            strings[1] = "Lab";
            strings[2] = "Merhaba";
            System.out.println(createFrom(strings));
            
            // Creating a List From a String
            String string = "CanAndLab";
            System.out.println(createFrom(string));
            
            // Creating Two Lists and Merging Them
            
            List a = new List();
            List b = new List();
            
            a.addToTail("A");
            a.addToTail("D");
            a.addToTail("C");
            
            b.addToTail("K");
            b.addToTail("B");
            b.addToTail("A");
            b.addToTail("C");
            b.addToTail("R");
            
            System.out.println("The first list is " + a);
            System.out.println("The second list is " + b);
            System.out.println("The merged list is " + merger(a, b));
      }
      
      // Other Methods
       
      /**
       * This method create list from given strings.
       * @param strings is the given strings (string array)
       * @return List is the list created
       */ 
      public static List createFrom(String[] strings) 
      {
            List list = new List();
            
            for (int i = 0; i < strings.length; i++)
            {
                  list.addToHead(strings[i]);
            }
            return list;
      }
      
      /**
       * This method create list from given string.
       * @param str is the given string (one string)
       * @return List is the list created
       */ 
      public static List createFrom(String str) 
      {
            List list = new List();
            
            for (int i = 0; i < str.length(); i++) 
            {
                  list.addToHead(str.substring(i, i+1));
            }
            return list;
      }
      
      /**
       * This method create list by merging given lists.
       * @param a is the first list given
       * @param b is the second list given
       * @return List is the list merged
       */ 
      public static List merger(List a, List b)
      {
            List list = new List();
            
            for(int i = 0; a.getData(i) != null; i++)
            {
                  if(!b.contains(a.getData(i)))
                  {
                        list.addToTail(a.getData(i));
                  }
            }
            
            for (int k = 0; b.getData(k) != null; k++)
            {
                  if (!a.contains(b.getData(k)))
                  {
                        list.addToTail(b.getData(k));
                  }
            }
            return list;
      }
}