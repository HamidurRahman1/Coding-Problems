

/*
    Problem: Given an N by N matrix, rotate it by 90 degrees clockwise.

    For example, given the following matrix:

    [[1, 2, 3],
    [4, 5, 6],
    [7, 8, 9]]
    you should return:

    [[7, 4, 1],
    [8, 5, 2],
    [9, 6, 3]]
    
    This problem was asked in here: https://www.dailycodingproblem.com/ by Facebook
 */

package rotateMatrix90Deg;

public class RotateNbyNMatrix90Deg
{
    public static void main(String[] args)
    {
        int[][] ints = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        
        display(ints);
        
        System.out.println();
        
        display(rotate90Degree(ints));
    }
    
    public static int[][] rotate90Degree(int[][] array2d)
    {
        int[][] rotated = new int[array2d.length][array2d.length];
        
        for(int i = 0; i < array2d.length; i++)
        {
            int k = array2d[i].length-i-1;
            
            for(int j = 0; j < array2d[i].length; j++)
            {
                rotated[j][k] = array2d[i][j];
            }
        }
        return rotated;
    }
    
    public static void display(int[][] array2d)
    {
        for(int[]row : array2d)
        {
            for(int i : row)
            {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}

