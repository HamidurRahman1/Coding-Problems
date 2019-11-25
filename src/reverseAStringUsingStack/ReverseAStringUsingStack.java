
/*
    Given a String, reverse it using Stack Data-Structure.
 */

package reverseAStringUsingStack;

import java.util.Stack;

public class ReverseAStringUsingStack
{
    public static void main(String[] args)
    {
        String string = "ABCDE";
        System.out.println(string + " : " + reverseString(string));
    }
    
    private static String reverseString(String string)
    {
        Stack<String> stack = new Stack <>();
        StringBuilder sb = new StringBuilder();
    
        for(int i = 0; i < string.length(); i++)
            stack.push(String.valueOf(string.charAt(i)));
        
        while(!stack.isEmpty())
            sb.append(stack.pop());
        
        return sb.toString();
    }
}
