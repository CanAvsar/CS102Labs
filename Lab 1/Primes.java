/*
 * Primes Program
 * @version 17 February 2020
 * @author Can Avsar
 */

public class Primes
{
      public static void main( String[] args )
      {
            //variables
            
            IntBag primes;
            int number;
            boolean ifPrime;
            
            
            //initialising
            
            primes = new IntBag();
            primes.add(2);
            number = 3;
            
            
            //program code
            
            while( primes.size() < 100)
            {
                  ifPrime = true;
                  
                  for( int k = 0; k < primes.size(); k++ )
                  {
                        if( number % primes.get(k) == 0)
                              ifPrime = false;
                  }
                  
                  if (ifPrime)
                        primes.add(number);
                  
                  number = number + 2;
            }
            
            System.out.println(primes.toString());
      }
}