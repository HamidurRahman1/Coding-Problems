package appleOrange;

public class AppleOrange
{
    public static void main(String[] args)
    {
        countApplesAndOranges(7, 10, 4, 12, new int[]{2, 3, -4}, new int[]{3, -2, -4, -2});
    }
    
    public static void countApplesAndOranges(int s, int t, int a, int b, int[] apples, int[] oranges)
    {
        int totalApples = 0;
        int totalOranges = 0;
        
        for(int i = 0; i < apples.length; i++)
        {
            apples[i] = apples[i] + a;
            if(apples[i] >= s && apples[i] <= t) totalApples++;
        }
        
        for(int i = 0; i < oranges.length; i++)
        {
            oranges[i] = oranges[i] + b;
            if(oranges[i] >= s && oranges[i] <= t) totalOranges++;
        }
        
        System.out.println(totalApples);
        System.out.println(totalOranges);
    }
}
