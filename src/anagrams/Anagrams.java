

/*
    Problem: Two strings, a and b, are called anagrams if they contain all the same characters in the same frequencies.
    For example, the anagrams of CAT are CAT, ACT, TAC, TCA, ATC, and CTA.
    Input strings are case sensitive.
    
    This problem is taken from hackerrank.com
 */

package anagrams;

public class Anagrams
{
    public static void main(String[] args)
    {
        System.out.println(anagrams("anagram", "margana"));
    }
    
    public static boolean anagrams(String a, String b)
    {
        if(a.length() != b.length())
        {
            return false;
        }
        
        a = sortedString(a.toLowerCase());
        b = sortedString(b.toLowerCase());
        
        for(int i = 0; i < a.length(); i++)
        {
            if(a.charAt(i) != b.charAt(i))
                return false;
        }
        
        return true;
    }
    
    public static String sortedString(String input)
    {
        char[] charArray = input.toCharArray();
        int length = charArray.length;
        
        for(int i=0;i<length;i++)
        {
            for(int j=i+1;j<length;j++)
            {
                if (charArray[j] < charArray[i])
                {
                    char temp = charArray[i];
                    charArray[i]=charArray[j];
                    charArray[j]=temp;
                }
            }
        }
        
        return new String(charArray);
    }
}
