package logic1;

/**
 * Date: 17.06.13
 *
 * @author Sergey Kandalintsev
 */
public class Logic1
{
    /**
     * When squirrels get together for a party, they like to have cigars. A squirrel party is successful when the
     * number of cigars is between 40 and 60, inclusive. Unless it is the weekend, in which case there is no upper
     * bound on the number of cigars. Return true if the party with the given values is successful, or false otherwise.
     * <ul>
     * <li>cigarParty(30, false) --> false</li>
     * <li>cigarParty(50, false) --> true</li>
     * <li>cigarParty(70, true) --> true</li>
     * </ul>
     *
     * @param cigars    number of cigars
     * @param isWeekend <code>true</code> if it is the weekend, <code>false</code> otherwise
     *
     * @return <code>true</code> if the squirrel party is successful, <code>false</code> otherwise
     */
    public static boolean cigarParty( int cigars, boolean isWeekend )
    {
        return isWeekend ? ( cigars >= 40 ) : ( 40 <= cigars && cigars <= 60 );
    }

    /**
     * You and your date are trying to get a table at a restaurant. The parameter "you" is the stylishness of your
     * clothes, in the range 0..10, and "date" is the stylishness of your date's clothes. The result getting the
     * table is encoded as an int value with 0=no, 1=maybe, 2=yes. If either of you is very stylish, 8 or more, then
     * the result is 2 (yes). With the exception that if either of you has style of 2 or less, then the result
     * is 0 (no). Otherwise the result is 1 (maybe).
     * <ul>
     * <li>dateFashion(5, 10) --> 2</li>
     * <li>dateFashion(5, 2) --> 0</li>
     * <li>dateFashion(5, 5) --> 1</li>
     * </ul>
     *
     * @param you  the stylishness of your clothes in the range 0..10
     * @param date the stylishness of your date's clothes
     *
     * @return the result getting the table (0 = no, 1 = maybe, 2 = yes)
     */
    public static int dateFashion( int you, int date )
    {
        if ( you <= 2 || date <= 2 )
        {
            return 0;
        }
        if ( you >= 8 || date >= 8 )
        {
            return 2;
        }
        return 1;
    }

    /**
     * The squirrels in Palo Alto spend most of the day playing. In particular, they play if the temperature is
     * between 60 and 90 (inclusive). Unless it is summer, then the upper limit is 100 instead of 90. Given an int
     * temperature and a boolean isSummer, return true if the squirrels play and false otherwise.
     * <ul>
     * <li>squirrelPlay(70, false) --> true</li>
     * <li>squirrelPlay(95, false) --> false</li>
     * <li>squirrelPlay(95, true) --> true</li>
     * </ul>
     *
     * @param temp     temperature
     * @param isSummer <code>true</code> if it is summer, <code>false</code> otherwise
     *
     * @return <code>true</code> if the squirrels play, <code>false</code> otherwise
     */
    public static boolean squirrelPlay( int temp, boolean isSummer )
    {
        return isSummer ? ( 60 <= temp && temp <= 100 ) : ( 60 <= temp && temp <= 90 );
    }

    /**
     * You are driving a little too fast, and a police officer stops you. Write code to compute the result, encoded as
     * an int value: 0=no ticket, 1=small ticket, 2=big ticket. If speed is 60 or less, the result is 0. If speed is
     * between 61 and 80 inclusive, the result is 1. If speed is 81 or more, the result is 2. Unless it is your
     * birthday -- on that day, your speed can be 5 higher in all cases.
     * <ul>
     * <li>caughtSpeeding(60, false) → 0</li>
     * <li>caughtSpeeding(65, false) → 1</li>
     * <li>caughtSpeeding(65, true) → 0true</li>
     * </ul>
     *
     * @param speed
     * @param isBirthday
     *
     * @return ticket size (0=no ticket, 1=small ticket, 2=big ticket)
     */
    public static int caughtSpeeding( int speed, boolean isBirthday )
    {
        int correction = isBirthday ? 5 : 0;
        int correctedSpeed = speed - correction;

        if ( correctedSpeed <= 60 )
        {
            return 0;
        }
        if ( 61 <= correctedSpeed && correctedSpeed <= 80 )
        {
            return 1;
        }

        return 2;
    }

    /**
     * Given 2 ints, a and b, return their sum. However, sums in the range 10..19 inclusive, are forbidden, so in
     * that case just return 20.
     * <ul>
     * <li>sortaSum(3, 4) → 7</li>
     * <li>sortaSum(9, 4) → 20</li>
     * <li>sortaSum(10, 11) → 21</li>
     * </ul>
     *
     * @param a number
     * @param b number
     *
     * @return sum of <code>a</code> and <code>b</code> ( if sum in the range 10..19 returns 20)
     */
    public static int sortaSum( int a, int b )
    {
        int sum = a + b;

        return ( 10 <= sum && sum <= 19 ) ? 20 : sum;
    }

    /**
     * Given a day of the week encoded as 0=Sun, 1=Mon, 2=Tue, ...6=Sat, and a boolean indicating if we are on
     * vacation, return a string of the form "7:00" indicating when the alarm clock should ring. Weekdays, the
     * alarm should be "7:00" and on the weekend it should be "10:00". Unless we are on vacation -- then on weekdays
     * it should be "10:00" and weekends it shoul
    public static String alarmClock( int day, boolean vacation )
    {
        if ( vacation )
        {
            return ( 1 <= day && day <= 5 ) ? "10:00" : "off";
        }

        return ( 1 <= day && day <= 5 ) ? "7:00" : "10:00";
    }

    /**
     * The number 6 is a truly great number. Given two int values, a and b, return true if either one is 6. Or if
     * their sum or difference is 6. Note: the function Math.abs(num) computes the absolute value of a number.
     * <ul>
     * <li>love6(6, 4) → true</li>
     * <li>love6(4, 5) → false</li>
     * <li>love6(1, 5) → true</li>
     * </ul>
     *
     * @param a number
     * @param b number
     *
     * @return <code>true</code> if either <code>a</code> or <code>b</code> is 6, or if their sum or difference is 6.
     *         Otherwise returns <code>false</code>.
     */
    public static boolean love6( int a, int b )
    {
        return ( a == 6 ) || ( b == 6 ) || ( a + b == 6 ) || ( Math.abs( a - b ) == 6 );
    }

    /**
     * Given a number n, return true if n is in the range 1..10, inclusive. Unless "outsideMode" is true, in which case
     * return true if the number is less or equal to 1, or greater or equal to 10.
     * <ul>
     * <li>in1To10(5, false) → true</li>
     * <li>in1To10(11, false) → false</li>
     * <li>in1To10(11, true) → true</li>
     * </ul>
     *
     * @param n           number
     * @param outsideMode if <code>false</code> then outside mode is [1..10],  otherwise outside mode is ]1..10[
     *
     * @return <code>true</code> if n is in the range [1..10] and <code>outsideMode</code> is <code>false</code>.<br>
     *         <code>true</code> if n is in the range ]1..10[ and <code>outsideMode</code> is <code>true</code>.<br>
     *         Otherwise returns <code>false</code>.
     */
    public static boolean in1To10( int n, boolean outsideMode )
    {
        return outsideMode ? ( n <= 1 || 10 <= n ) : ( 1 <= n && n <= 10 );
    }
}
