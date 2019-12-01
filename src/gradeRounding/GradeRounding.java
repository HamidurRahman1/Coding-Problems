
/*
    Problem:
    Given a list of grade numbers, if the difference between the grade and the next multiple of 5 is less than 3,
    round grade up to the next multiple of 5.If the value of grade is less than 38, no rounding occurs as the result
    will still be a failing grade.
    
    This problem is taken from hackerrank.com
*/


package gradeRounding;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class GradeRounding
{
    public static void main(String[] args)
    {
        System.out.println(gradingStudents(Arrays.asList(73, 67, 38, 33)));
    }
    
    public static List <Integer> gradingStudents(List<Integer> grades)
    {
        List<Integer> graded = new LinkedList <>();
        for(Integer i : grades)
        {
            if(i >= 38)
            {
                int m5 = next5Mult(i);
                if(m5-i < 3) graded.add(m5);
                else graded.add(i);
            }
            else graded.add(i);
        }
        return graded;
    }
    
    public static int next5Mult(int num)
    {
        return (num + 4) / 5 * 5;
    }
    
}
