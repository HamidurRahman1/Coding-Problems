

/*
    Problem: https://www.hackerrank.com/challenges/java-primality-test/problem
 */

package bigIntegerPrimality;

import java.math.BigInteger;
import java.util.Scanner;

public class BigIntegerPrimality
{
    public static void main(String[] args)
    {
        primalityByBigInteger();
    }
    
    public static void primalityByBigInteger()
    {
        Scanner scanner = new Scanner(System.in);
        
        String n = scanner.nextLine();
        
        BigInteger b = new BigInteger(n);
        if(b.isProbablePrime(new BigInteger(n).bitCount())) System.out.println("prime");
        else System.out.println("not prime");
        
        scanner.close();
    }
}
