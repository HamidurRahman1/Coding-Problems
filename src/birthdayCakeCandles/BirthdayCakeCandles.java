

/*
    Problem:
  
    "You are in charge of the cake for your niece's birthday and have decided the cake will have one candle for each
    year of her total age. When she blows out the candles, she’ll only be able to blow out the tallest ones.
    Your task is to find out how many candles she can successfully blow out.

    For example, if your niece is turning 4 years old, and the cake will have 4 candles of height 4, 4, 1 , 3, she will
    be able to blow out  candles successfully, since the tallest candles are of height  and there are  such candles."
    
    
    This problem is taken from hackerrank.com
 */


package birthdayCakeCandles;

import java.util.Arrays;
import java.util.Collections;
import java.util.stream.IntStream;

public class BirthdayCakeCandles
{
    public static void main(String[] args)
    {
        System.out.println(birthdayCakeCandles(new int[]{3, 2, 1, 3, 5, 5, 5, 6, 6}));
    }
    
    public static int birthdayCakeCandles(int[] ar)
    {
        Integer[] integers = IntStream.of(ar).boxed().toArray(Integer[]::new);
        
        Arrays.sort(integers, Collections.reverseOrder());
        
        int last = integers[0];
        int candles = 1;
        
        for(int i = 1; i < integers.length; i++)
        {
            if(integers[i] == last) candles++;
            else break;
        }
        return candles;
    }
}

