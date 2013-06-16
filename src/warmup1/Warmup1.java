package warmup1;

/**
 *   Solutions for Exercises from http://codingbat.com/
 */
public class Warmup1
{
    /**
     * Given an int n, return the absolute difference between n and 21, except return double the absolute difference
     * if n is over 21.
     * <br/>
     * <b/> diff21(19) --> 2
     * <br/> diff21(10) --> 11
     * <br/> diff21(21) --> 0
     */
    public static int diff21( int n )
    {
        return n > 21 ? 2 * (n - 21) : 21 - n;
    }

}
