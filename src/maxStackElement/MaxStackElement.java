

/*
    Problem: https://www.hackerrank.com/challenges/maximum-element/problem
 */

package maxStackElement;

import java.util.Scanner;
import java.util.Stack;

public class MaxStackElement
{
    private static final Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) throws Exception
    {
        int cycle = Integer.parseInt(sc.nextLine());
        
        getInputs(cycle);
    }
    
    private static void getInputs(int cycle)
    {
        Stack <Integer> stack = new Stack <>();
        
        for(int i = 0; i < cycle; i++)
        {
            String input = sc.nextLine();
            
            String[] parts = input.split(" ");
            
            processInput(stack, parts);
        }
    }
    
    private static void processInput(Stack<Integer> stack, String[] parts)
    {
        if(Integer.parseInt(parts[0]) == 1)
        {
            stack.push(Integer.parseInt(parts[1]));
        }
        else if(Integer.parseInt(parts[0]) == 2)
        {
            if(!stack.isEmpty()) stack.pop();
        }
        else
        {
            printMax(stack);
        }
    }
    
    private static void printMax(Stack<Integer> stack)
    {
        int currentMax = 0;
        
        if(!stack.isEmpty()) currentMax = stack.pop();
        
        Stack<Integer> newStack = new Stack <>();
        newStack.push(currentMax);
        
        while(!stack.isEmpty())
        {
            int c = stack.pop();
            if(c > currentMax) currentMax = c;
            newStack.push(c);
        }
        
        while(!newStack.isEmpty())
        {
            stack.push(newStack.pop());
        }
        
        System.out.println(currentMax);
    }
}
