
/*

    Problem: Given a square matrix, calculate the absolute difference between the sums of its diagonals.
    
    This problem was taken from hackerrank.com

 */

package diagonalDifference;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class DiagonalDifference
{
    public static void main(String[] args)
    {
        List<List <Integer>> lists = new LinkedList <>();
        
        lists.add(Arrays.asList(1, 2, 3));
        lists.add(Arrays.asList(4, 5, 6));
        lists.add(Arrays.asList(9, 8, 9));
        
        System.out.println(diagonalDiff(lists));
    }
    
    public static Integer diagonalDiff(List<List<Integer>> lists)
    {
        int topLeftDiagonal = 0;
        for(int i = 0; i < lists.get(0).size(); i++)
        {
            topLeftDiagonal += lists.get(i).get(i);
        }
        
        int topRightDiagonal = 0;
        for(int i = 0; i < lists.get(0).size(); i++)
        {
            int k = lists.get(0).size();
            topRightDiagonal += lists.get(i).get(k-i-1);
        }
        
        return Math.abs(Math.subtractExact(Math.abs(topLeftDiagonal), Math.abs(topRightDiagonal)));
    }
}
