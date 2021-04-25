/**
 * List Class - Has the list's properties, methods & constructor
 * @author Can Avsar
 * @version 12 May 2020
 */

public class List 
{
      // Properties
      
      private Node head;
      
      // Constructors
      
      public List()
      {
            this.head = null;
      }
      
      // Methods
      
      /**
       * This iterative method adds an item to the start of the list.
       * @param item is the item going to be added
       */ 
      public void addToHead(String item)
      {
            Node nextNode = new Node(item, null);
            
            if(head == null)
                  head = nextNode;
            else
            {
                  nextNode.next = head;
                  head = nextNode;
            }         
      }
      
      /**
       * This iterative method adds an item to the end of the list.
       * @param item is the item going to be added
       */ 
      public void addToTail(String item) 
      {
            if(head == null)
            {
                  Node newNode = new Node(item, null);
                  head = newNode;
            }
            else
            {
                  Node indexNode = tail();
                  Node end = new Node(item, null);
                  indexNode.next = end;
            }
      }
      
      /**
       * This method removes an item from the top of the list.
       * @return String is the data of node
       */ 
      public String removeFromHead()
      {
            Node controlNode = head;
            
            if(controlNode == null)
                  return null;
            else
            {
                  head = head.next;
                  return controlNode.data;
            }
      }
      
      /**
       * This method checks if the list is empty.
       * @return boolean will be true if it is empty
       */ 
      public boolean isEmpty()
      {
            if(head == null)
                  return true;
            else
                  return false;
      }
      
      /**
       * This method gets the data in given index.
       * @param index is the number which is going to be used in searching
       * @return String is the data in given number
       */ 
      public String getData(int index)
      {
            int count = 0;
            Node getNode = head;
            
            while(getNode != null)
            {
                  if(count == index)
                        return getNode.data;
                  else
                        getNode = getNode.next;
                  count++;
            }
            return null;
      }
      
      /**
       * This method prints the list.
       */ 
      public void print()
      {
            Node printNode  = head;
            
            while(printNode != null)
            {
                  System.out.print(printNode.data);
                  printNode = printNode.next;
            }
      }
      
      /**
       * This method prints the list in reverse.
       */ 
      public void printReverse()
      {
            if(head == null)
                  System.err.print("Head is null.");
            else
                  printNode(head);
            
      }
      
      /**
       * This recursive method prints the node, it works with printReverse method.
       * @param node is the node which is going to be printed
       */ 
      public void printNode(Node node)
      {
            if(node == null)
                  return;
            else
            {
                  printNode(node.next);
                  System.out.print(""+ node.data);
            }        
      }
      
      /**
       * This method checks if the list contains a given data.
       * @param target is the data which is going to be checked
       * @return boolean will be true if the list contains the data
       */ 
      public boolean contains(String target)
      {
            Node currentNode = head;
            boolean contains = false; 
            
            while(!contains && currentNode != null)
            {
                  if((currentNode.data).equals(target))
                  {
                        contains = true;
                  }
                  currentNode = currentNode.next;
            }
            return contains;
      }
      
      /**
       * This method checks if the list is ordered.
       * @return boolean will be true if the list is ordered
       */
      public boolean isOrdered()
      {
            Node checkNode = head;
            
            if (head == null || head.next == null)
                  return true;
            else
            {
                  while ((checkNode != null) && (checkNode.next != null)) 
                  { 
                        if ((checkNode.data).compareTo((checkNode.next).data) < 0)
                        {
                              return false;
                        }
                        
                        checkNode = checkNode.next; 
                  }
                  
                  return true;
            }
      }
      
      /**
       * This method writes all the list with a String form.
       * @return String is the list
       */
      public String toString()
      {
            String list = "";
            Node theNode = head;
            
            while (theNode != null)
            {
                  list = list + theNode.data + " ";
                  theNode = theNode.next;
            }
            return list;
      }
      
      /**
       * This method goes to next node.
       * @param n is the current node
       * @return Node is the next node
       */
      private Node next(Node n)
      {
            if(n.next == null)
                  return null;
            else
                  return n.next;
      }
      
      /**
       * This method goes to previous node.
       * @param n is the current node
       * @return Node is the previous node
       */
      private Node previous(Node n)
      {
            Node theNode = head;
            
            if (isEmpty()) 
                  return null;
            
            while (theNode.next != null)
            {
                  if (((theNode.next).data).equals(n.data))
                        return theNode;
                  
                  theNode = theNode.next;
            }
            return null;
      }
      
      /**
       * This method gets the last node in a list.
       * @return Node is the last node
       */
      private Node tail()
      {
            Node endNode = head;
            
            while (endNode.next != null) 
            {
                  endNode = endNode.next;
            }
            return endNode;
      }
      
      // Inner Classes
      
      /**
       * Node Class
       * @author Can Avsar
       * @version 12 May 2020
       */
      private class Node 
      {
            String data; 
            Node next; 
            
            public Node(String data, Node next) 
            {
                  this.data = data; 
                  this.next = next; 
            } 
      }
}