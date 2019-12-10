
/*
    Problem: https://www.hackerrank.com/challenges/breaking-best-and-worst-records/problem
 */

package countBreakingRecords;

public class BreakingRecordCounter
{
    public static void main(String[] args)
    {
        int[] records = breakingRecords(new int[]{3, 4, 21, 36, 10, 28, 35, 5, 24, 1, 42});
    
        System.out.println(records[0]);
        System.out.println(records[1]);
    }
    
    public static int[] breakingRecords(int[] scores)
    {
    
        int start = scores[0];
        int best = start;
        int low = start;
        int inc = 0;
        int dec = 0;
    
        for(int i = 1; i < scores.length; i++)
        {
            if(scores[i] > best)
            {
                inc++;
                best = scores[i];
            }
            if(scores[i] < low)
            {
                dec++;
                low = scores[i];
            }
        }
    
        return new int[]{inc, dec};
    }
}
