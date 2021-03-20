
public class Permutation
{
    public static void main(String[] args)
    {
        String str = "AABC";
        int n = str.length();
        Permutation permutation = new Permutation();
        permutation.permute(str, 0, n-1);
    }

    /**
     * permutation function
     * @param input string to calculate permutation for
     * @param startIndex starting index
     * @param endIndex end index
     */
    private void permute(String input, int startIndex, int endIndex)
    {
        if (startIndex == endIndex)
            System.out.println(input);
        else
        {
            for (int i = startIndex; i <= endIndex; i++)
            {
                input = swap(input,startIndex,i);
                permute(input, startIndex+1, endIndex);
                input = swap(input,startIndex,i);
            }
        }
    }

    /**
     * Swap Characters at position
     * @param a string value
     * @param i position 1
     * @param j position 2
     * @return swapped string
     */
    public String swap(String a, int i, int j)
    {
        char temp;
        char[] charArray = a.toCharArray();
        temp = charArray[i] ;
        charArray[i] = charArray[j];
        charArray[j] = temp;
        return String.valueOf(charArray);
    }

}