package nLeftRotation;

public class NLeftRotation
{
    public static void main(String[] args) throws Exception
    {
        int n = 4;
        int[] a = new int[]{1, 2, 3, 4, 5};
        
        doLeftRotation(n, a);
        
        print(a);
    }
    
    private static void doLeftRotation(int n, int[] a)
    {
        int i = 0;
        while(i < n)
        {
            for(int j = 0; j < a.length-1; j++)
            {
                int t = a[j];
                a[j] = a[j+1];
                a[j+1] = t;
            }
            i++;
        }
    }
    
    private static void print(int[] a)
    {
        for(int i : a)
        {
            System.out.print(i + " ");
        }
    }
}
