
/*
    Problem: https://www.hackerrank.com/challenges/java-stack/problem?h_r=profile
 */

package parenthesisMatcher;

import java.util.Scanner;
import java.util.Stack;

public class ParenthesisMatcher
{
    public static void main(String[] args)
    {
        parenthesisMatcher();
    }
    
    public static void parenthesisMatcher()
    {
        Scanner sc = new Scanner(System.in);
        
        while (sc.hasNext())
        {
            String input = sc.next();
    
            System.out.println(processString(input));;
        }
    }
    
    private static Boolean processString(String input)
    {
        Stack <Character> stack = new Stack<>();
        Character prev = input.charAt(0);
        stack.push(prev);
        
        for(int i = 1; i < input.length(); i++)
        {
            if(prev == input.charAt(i))
            {
                stack.push(prev);
            }
            else
            {
                char c = input.charAt(i);
                char fs = ' ';
                
                if(!stack.isEmpty())
                    fs = stack.pop();
                else
                {
                    stack.push(c);
                    continue;
                }
                
                if(!((c == '}' && fs == '{') || (c == ']' && fs == '[') || (c == ')' && fs == '(')))
                {
                    stack.push(fs);
                    stack.push(c);
                }
            }
        }
        
        return stack.isEmpty();
    }
}
