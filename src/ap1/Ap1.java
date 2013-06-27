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
}
