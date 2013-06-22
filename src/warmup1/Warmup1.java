package warmup1;

/**
 * Solutions for Exercises from http://codingbat.com/
 */
public class Warmup1
{
    /**
     * The parameter weekday is true if it is a weekday, and the parameter vacation is true if we are on vacation.
     * We sleep in if it is not a weekday or we're on vacation. Return true if we sleep in.
     * <ul>
     * <li>sleepIn(false, false) → true</li>
     * <li>sleepIn(true, false) → false</li>
     * <li>sleepIn(false, true) → true</li>
     * </ul>
     * @param weekday  <code>true</code> if it is a weekday, <code>false</code> otherwise
     * @param vacation <code>true</code> if we are on vacation, <code>false</code> otherwise
     * @return <code>true</code> if we sleep in, <code>false</code> otherwise
     */
    public static boolean sleepIn( boolean weekday, boolean vacation )
    {
        return !weekday || vacation;
    }

    /**
     * We have two monkeys, a and b, and the parameters aSmile and bSmile indicate if each is smiling. We are in
     * trouble if they are both smiling or if neither of them is smiling. Return true if we are in trouble.
     * <ul>
     * <li>monkeyTrouble(true, true) → true</li>
     * <li>monkeyTrouble(false, false) → true</li>
     * <li>monkeyTrouble(true, false) → false</li>
     * </ul>
     * @param aSmile <code>true</code> if the monkey a is smiling, <code>false</code> otherwise
     * @param bSmile <code>true</code> if the monkey b is smiling, <code>false</code> otherwise
     * @return <code>true</code> if we are in trouble, <code>false</code> otherwise
     */
    public static boolean monkeyTrouble( boolean aSmile, boolean bSmile )
    {
        return !( aSmile || bSmile ) || ( aSmile && bSmile );
    }

    /**
     * Given two int values, return their sum. Unless the two values are the same, then return double their sum.
     * <ul>
     * <li>sumDouble(1, 2) → 3</li>
     * <li>sumDouble(3, 2) → 5</li>
     * <li>sumDouble(2, 2) → 8</li>
     * </ul>
     * @param a number
     * @param b number
     * @return Sum of the numbers, or double sum if the numbers are the same
     */
    public static int sumDouble( int a, int b )
    {
        int sum = a + b;

        return a == b ? 2 * sum : sum;
    }

    /**
     * Given an int n, return the absolute difference between n and 21, except return double the absolute difference
     * if n is over 21.
     * <ul>
     * <li>diff21(19) --> 23</li>
     * <li>diff21(10) --> 11</li>
     * <li>diff21(21) --> 0</li>
     * </ul>
     * @param n number
     * @return absolute difference between n and 21, or double the absolute difference if n is over 21.
     */
    public static int diff21( int n )
    {
        return n > 21 ? 2 * ( n - 21 ) : 21 - n;
    }
}
