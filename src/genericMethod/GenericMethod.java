

/*

    Problem: https://www.hackerrank.com/challenges/java-generics/problem

 */

package genericMethod;

public class GenericMethod
{
    public static void main(String[] args)
    {
        Integer[] integers = new Integer[]{1, 2, 3};
        String[] strings = new String[]{"a", "b", "c", "d"};
        
        printArray(integers);
        printArray(strings);
    }
    
    public static void printArray(Object[] arr)
    {
        if(arr instanceof String[] || arr instanceof Integer[])
        {
            for(int i = 0; i < arr.length; i++)
            {
                System.out.println(arr[i]);
            }
        }
    }
}
