
/*
    Problem: https://www.hackerrank.com/challenges/time-conversion/problem
 */

package timeConversion;

public class TimeConversion
{
    public static void main(String[] args)
    {
        System.out.println(timeConversion("01:03:45PM"));
    }
    
    public static String timeConversion(String timeIn12Hours)
    {
        int f = Integer.parseInt(timeIn12Hours.substring(0, 2));
        
        if(timeIn12Hours.endsWith("PM"))
        {
            if(f == 12)
            {
                return timeIn12Hours.substring(0, 8);
            }
            return (12+f)+timeIn12Hours.substring(2, timeIn12Hours.length()-2);
        }
        else
        {
            if(f == 12)
            {
                return "00"+timeIn12Hours.substring(2, timeIn12Hours.length()-2);
            }
            return timeIn12Hours.substring(0, timeIn12Hours.length()-2);
        }
    }
}
