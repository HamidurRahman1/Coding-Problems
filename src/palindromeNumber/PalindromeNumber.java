package palindromeNumber;

/*
    Problem: https://leetcode.com/problems/palindrome-number/

    Determine whether an integer is a palindrome. An integer is a palindrome when it reads the same backward as forward.
 */

public class PalindromeNumber
{
    public static void main(String[] args)
    {
        System.out.println(isPalindrome(-121));
    }

    public static boolean isPalindrome(int x) {
        if(x < 0) return false;

        String s = String.valueOf(x);

        for(int i = 0, j = s.length()-1; i < s.length()/2; i++, j--)
        {
            if(s.charAt(i) != s.charAt(j))
            {
                return false;
            }
        }
        return true;
    }

}
