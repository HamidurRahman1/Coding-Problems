
/*
    Problem:
    Given a sorted array and a target value, return the index if the target is found. If not, return the
    index where it would be if it were inserted in order.
    
    You may assume no duplicates in the array.
    
    This problem is taken from leetcode.com
 */


package searchIndexPosition;

public class SearchIndexPosition
{
    public static void main(String[] args)
    {
        System.out.println(searchInsert(new int[]{0,1,2,3,4}, 9));
    }
    
    public static int searchInsert(int[] nums, int target)
    {
        for(int i = 0; i < nums.length; i++)
        {
            if(target <= nums[i])
                return i;
        }
        
        return nums.length;
    }
}
