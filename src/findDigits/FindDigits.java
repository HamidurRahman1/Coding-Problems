

/*

    Problem:
    
    An integer d is a divisor of an integer n if the remainder of n / d = 0.
    Given an integer, for each digit that makes up the integer determine whether it is a divisor.
    Count the number of divisors occurring within the integer.
    
    Note: Each digit is considered to be unique, so each occurrence of the same digit should be counted (e.g.
    for n = 111, 1 is a divisor of 111 each time it occurs so the answer is 3).
    
    This problem was taken from hackerrank.com

 */


package findDigits;

public class FindDigits
{
    public static void main(String[] args)
    {
        System.out.println(findDigits(1012));
    }
    
    public static int findDigits(int n)
    {
        String strNum = String.valueOf(n);
        int digits = 0;
    
        for(int i = 0; i < strNum.length(); i++)
        {
            int v = Integer.parseInt(String.valueOf(strNum.charAt(i)));
            if(v == 0)
            {
                continue;
            }
            if(n % v == 0)
            {
                digits++;
            }
        }
        return digits;
    }
}
