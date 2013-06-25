package warmup2;

/**
 * Medium warmup string/array loops
 */
public class Warmup2
{
    /**
     * Given a string and a non-negative int n, return a larger string that is n copies of the original string.
     * <ul>
     * <li>stringTimes("Hi", 2) --> "HiHi"</li>
     * <li>stringTimes("Hi", 3) --> "HiHiHi"</li>
     * <li>stringTimes("Hi", 1) --> "Hi"</li>
     * </ul>
     *
     * @param str string
     * @param n   non-negative number
     *
     * @return string that is n copies of the original string
     */
    public static String stringTimes( String str, int n )
    {
        String s = "";

        for ( int i = 0; i < n; i++ )
        {
            s = s + str;
        }
        return s;
    }

    /**
     * Given a string and a non-negative int n, we'll say that the front of the string is the first 3 chars, or
     * whatever is there if the string is less than length 3. Return n copies of the front;
     * <ul>
     * <li>frontTimes("Chocolate", 2) --> "ChoCho"</li>
     * <li>frontTimes("Chocolate", 3) --> "ChoChoCho"</li>
     * <li>frontTimes("Abc", 3) --> "AbcAbcAbc"</li>
     * </ul>
     *
     * @param str given string
     * @param n   non-negative number
     *
     * @return String value according to exercise conditions
     */
    public static String frontTimes( String str, int n )
    {
        String result = "";
        String front = str.length() < 3 ? str : str.substring( 0, 3 );

        for ( int i = 0; i < n; i++ )
        {
            result += front;
        }

        return result;
    }

    /**
     * Count the number of "xx" in the given string. We'll say that overlapping is allowed, so "xxx" contains 2 "xx".
     * <ul>
     * <li>countXX("abcxx") → 1</li>
     * <li>countXX("xxx") → 2</li>
     * <li>countXX("xxxx") → 3</li>
     * </ul>
     * @param str given string
     * @return number of "xx" in the given string
     */
    public static int countXX( String str )
    {
        int count = 0;

        for ( int i = str.indexOf( "xx" ); i != -1; i = str.indexOf( "xx", i + 1 ) )
        {
            count++;
        }

        return count;
    }
}
