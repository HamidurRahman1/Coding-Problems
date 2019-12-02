

/*
    Problem: Given an input for staircase size n, where the base and the height of the stair is also n.
            Print the stairs in #. The staircase is right-aligned, composed of # symbols and spaces.
            
            input: 6
            output:
                 #
                ##
               ###
              ####
             #####
            ######
    
    This problem is taken from hackerrank.com
 */


package staircase;

import java.util.Random;

public class Staircase
{
    public static void main(String[] args)
    {
        printStairs(new Random().nextInt(13));
    }
    
    private static void printStairs(int n)
    {
        int p = n;
        while(n != 0)
        {
            int k = n-1;
            int l = k;
            while(k != 0)
            {
                System.out.print(" ");
                k--;
            }
            int j = p-l;
            while(j != 0)
            {
                System.out.print("#");
                j--;
            }
            System.out.println();
            n--;
        }
    }
}
