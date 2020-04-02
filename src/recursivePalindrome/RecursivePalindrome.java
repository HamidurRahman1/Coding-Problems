
/*
*   Given a string check if it is a palindrome using recursion.
*
* */

package recursivePalindrome;

public class RecursivePalindrome
{
    public static void main(String[] args)
    {
        System.out.println(palindrome("acadaca"));
    }
    
    public static boolean palindrome(String s)
    {
        if(s.length() == 0 || s.length() == 1)
            return true;
        if(s.charAt(0) == s.charAt(s.length()-1))
            return palindrome(s.substring(1, s.length()-1));
        return false;
    }
}
