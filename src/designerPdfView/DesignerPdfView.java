

/*

    Problem: https://www.hackerrank.com/challenges/designer-pdf-viewer/problem

 */


package designerPdfView;

public class DesignerPdfView
{
    public static void main(String[] args)
    {
        int[] heights = new int[]{1, 3, 1, 3, 1, 4, 1, 3, 2, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5};
    
        System.out.println(designerPdfView(heights, "randomstring"));
    }
    
    private static int designerPdfView(int[] h, String word)
    {
        int firstIndex = (int)word.charAt(0)-97;
        int max = h[firstIndex];
        
        for(int i = 1; i < word.length(); i++)
        {
            int j = (int)word.charAt(i)-97;
            if(h[j] > max)
            {
                max = h[j];
            }
        }
        
        return max*word.length();
    }
}
