package twoSum;

/*
    Problem: https://leetcode.com/problems/two-sum/

    Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
    You may assume that each input would have exactly one solution, and you may not use the same element twice.
    You can return the answer in any order.
 */

public class TwoSum
{
    public static void main(String[] args)
    {
        System.out.println(twoSum1(new int[]{2,7,11,15}, 9));
    }

    public static int[] twoSum1(int[] nums, int target)
    {
        int[] answers = new int[2];

        for(int i = 0; i < nums.length; i++)
        {
            for(int j = 1; j < nums.length; j++)
            {
                if(nums[i] + nums[j] == target && i != j)
                {
                    answers[0] = i;
                    answers[1] = j;
                    return answers;
                }
            }
        }
        return answers;
    }
}

