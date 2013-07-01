package ap1;

/**
 * Date: 21.06.13
 * @author Sergey Kandalintsev
 */
public class Ap1
{
    /**
     * Given an array of scores, return true if each score is equal or greater than the one before. The array will be
     * length 2 or more.
     * <ul>
     * <li>scoresIncreasing({1, 3, 4}) --> true</li>
     * <li>scoresIncreasing({1, 3, 2}) --> false</li>
     * <li>scoresIncreasing({1, 1, 4}) --> true</li>
     * </ul>
     * @param scores array of scores
     * @return <code>true</code> if each score is equal or greater than the one before. Otherwise returns
     *         <code>false</code>
     */
    public static boolean scoresIncreasing( int[] scores )
    {
        for ( int i = 0; i < scores.length - 1; i++ )
        {
            if ( scores[i + 1] < scores[i] )
            {
                return false;
            }
        }

        return true;
    }

    /**
     * Given an array of scores, return true if there are scores of 100 next to each other in the array. The array
     * length will be at least 2.
     * <ul>
     * <li>scores100({1, 100, 100}) --> true</li>
     * <li>scores100({1, 100, 99, 100}) --> false</li>
     * <li>scores100({100, 1, 100, 100}) --> truetrue</li>
     * </ul>
     * @param scores array of scores, array length at least 2
     * @return <code>true</code> if there are scores of 100 next to each other in the array. Otherwise returns
     *         <code>false</code>
     */
    public static boolean scores100( int[] scores )
    {
        for ( int i = 0; i < scores.length - 1; i++ )
        {
            if ( scores[i] == 100 && scores[i + 1] == 100 )
            {
                return true;
            }
        }

        return false;
    }

    /**
     * Given an array of scores sorted in increasing order, return true if the array contains 3 adjacent scores that
     * differ from each other by at most 2, such as with {3, 4, 5} or {3, 5, 5}.
     * <ul>
     * <li>scoresClump({3, 4, 5}) --> true</li>
     * <li>scoresClump({3, 4, 6}) --> false</li>
     * <li>scoresClump({1, 3, 5, 5}) --> true</li>
     * </ul>
     * @param scores an array of scores sorted in increasing order
     * @return <code>true</code> if the array contains 3 adjacent scores that differ from each other by at most 2.
     *         Otherwise returns <code>false</code>
     */
    public static boolean scoresClump( int[] scores )
    {
        for ( int i = 0; i < scores.length - 2; i++ )
        {
            if ( scores[i + 2] - scores[i] <= 2 )
            {
                return true;
            }
        }

        return false;
    }

    /**
     * Given an array of scores, compute the int average of the first half and the second half, and return whichever
     * is larger. We'll say that the second half begins at index length/2. The array length will be at least 2.
     * To practice decomposition, write a separate helper method
     * <code>int average(int[] scores, int start, int end){}</code> which computes the average of the elements between
     * indexes start..end. Call your helper method twice to implement scoresAverage(). Write your helper method after
     * your scoresAverage() method in the JavaBat text area. Normally you would compute averages with doubles, but
     * here we use ints so the expected results are exact.
     * <ul>
     * <li>scoresAverage({2, 2, 4, 4}) --> 4</li>
     * <li>scoresAverage({4, 4, 4, 2, 2, 2}) --> 4</li>
     * <li>scoresAverage({3, 4, 5, 1, 2, 3}) --> 4</li>
     * </ul>
     * @param scores array of scores (length at least 2)
     * @return int value according to exercise conditions
     */
    public static int scoresAverage( int[] scores )
    {
        return Math.max( average( scores, 0, scores.length / 2 - 1 ),
                average( scores, scores.length / 2, scores.length - 1 ) );
    }

    private static int average( int[] scores, int start, int end )
    {
        int sum = 0;

        for ( int i = start; i <= end; i++ )
        {
            sum += scores[i];
        }

        return sum / ( end - start + 1 );
    }

    /**
     * Given an array of strings, return the count of the number of strings with the given length.
     * <ul>
     * <li>wordsCount({"a", "bb", "b", "ccc"}, 1) --> 2</li>
     * <li>wordsCount({"a", "bb", "b", "ccc"}, 3) --> 1</li>
     * <li>wordsCount({"a", "bb", "b", "ccc"}, 4) --> 0</li>
     * </ul>
     * @param words array of strings
     * @param len   given length
     * @return count of the number of strings with the given length
     */
    public static int wordsCount( String[] words, int len )
    {
        int count = 0;

        for ( String s : words )
        {
            if ( s.length() == len )
            {
                count++;
            }
        }

        return count;
    }

    /**
     * Given an array of strings, return a new array containing the first N strings. N will be in the range 1..length.
     * <ul>
     * <li>wordsFront({"a", "b", "c", "d"}, 1) --> {"a"}</li>
     * <li>wordsFront({"a", "b", "c", "d"}, 2) --> {"a", "b"}</li>
     * <li>wordsFront({"a", "b", "c", "d"}, 3) --> {"a", "b", "c"}</li>
     * </ul>
     * @param words array of strings
     * @param n     number
     * @return array containing the first N strings
     */
    public static String[] wordsFront( String[] words, int n )
    {
        String[] result = new String[n];

        for ( int i = 0; i < n; i++ )
        {
            result[i] = words[i];
        }

        return result;
    }
}
