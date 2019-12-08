
/*
    Problem: https://www.hackerrank.com/challenges/angry-professor/problem?h_r=profile
 */


package angryProfessor;

public class AngryProfessor
{
    public static void main(String[] args)
    {
        System.out.println(angryProfessor(5, new int[]{-1, 4, 6, 3, -2, 0, -3, 6, 3, 2}));
    }
    
    public static String angryProfessor(int k, int a[])
    {
        int c = 0;
        
        for(int i = 0; i < a.length; i++)
        {
            if(a[i] <= 0)
                c++;
        }
    
        if(k > c) return "YES";
        else return "NO";
    }
}
