
/*
    Given an input string, write a function that returns the Run Length Encoded string for the input string.
    For example, if the input string is “"AABBBCCDEEF"”, then the function should return “2A3B2C1D2E1F”.
    
    This problem was asked in here: https://www.dailycodingproblem.com/ etc
 */

package runLengthEncodingDecoding;

public class RunLengthEncodingDecoding
{
    public static void main(String[] args) throws Exception
    {
        String string = "AABBBCCDEEF";

        System.out.println(string);                                                //AABBBCCDEEF
        System.out.println(runLengthEncoder(string));                              //2A3B2C1D2E1F
        System.out.println(runLengthDecoder(runLengthEncoder(string)));            //AABBBCCDEEF
    }

    private static String runLengthDecoder(String string) throws Exception
    {
        if(string.isEmpty()) throw new Exception("Empty string");

        StringBuilder decodedString = new StringBuilder();

        for(int i = 0; i < string.length(); i+=2)
        {
            int numberToRepeat = Integer.parseInt(String.valueOf(string.charAt(i)));
            char character = string.charAt(i+1);

            for(int j = 0; j < numberToRepeat; j++) decodedString.append(character);
        }
        return decodedString.toString();
    }

    private static String runLengthEncoder(String string) throws Exception
    {
        if(string.isEmpty()) throw new Exception("Empty string");

        StringBuilder encodedString = new StringBuilder();
        char character = string.charAt(0);
        int count = 0;

        for(int i = 0; i < string.length(); i++)
        {
            if(string.charAt(i) == character) count++;
            else
            {
                encodedString.append(count).append(character);
                count = 1;
                character = string.charAt(i);
            }
        }

        return encodedString.append(count).append(character).toString();
    }
}
