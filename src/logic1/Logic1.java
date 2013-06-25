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
     * <li>caughtSpeeding(60, false) --> 0</li>
     * <li>caughtSpeeding(65, false) --> 1</li>
     * <li>caughtSpeeding(65, true) --> 0true</li>
     * </ul>
     *
     * @param speed      your speed
     * @param isBirthday <code>true</code> if it is your birthday today, <code>false</code> otherwise
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
     * <li>sortaSum(3, 4) --> 7</li>
     * <li>sortaSum(9, 4) --> 20</li>
     * <li>sortaSum(10, 11) --> 21</li>
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
     * it should be "10:00" and weekends it should be "off".
     *
     * @param day      day of the week (0=Sun, 1=Mon, 2=Tue, ...6=Sat)
     * @param vacation <code>true</code> if we are on vacation, <code>false</code> otherwise
     *
     * @return when the alarm clock should ring or "off"
     */
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
     * <li>love6(6, 4) --> true</li>
     * <li>love6(4, 5) --> false</li>
     * <li>love6(1, 5) --> true</li>
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
     * <li>in1To10(5, false) --> true</li>
     * <li>in1To10(11, false) --> false</li>
     * <li>in1To10(11, true) --> true</li>
     * </ul>
     *
     * @param n           number
     * @param outsideMode if <code>false</code> then outside mode is [1..10], otherwise outside mode is ]1..10[
     *
     * @return <code>true</code> if n is in the range [1..10] and <code>outsideMode</code> is <code>false</code>.<br>
     *         <code>true</code> if n is in the range ]1..10[ and <code>outsideMode</code> is <code>true</code>.<br>
     *         Otherwise returns <code>false</code>.
     */
    public static boolean in1To10( int n, boolean outsideMode )
    {
        return outsideMode ? ( n <= 1 || 10 <= n ) : ( 1 <= n && n <= 10 );
    }

    /**
     * We'll say a number is special if it is a multiple of 11 or if it is one more than a multiple of 11.
     * Return true if the given non-negative number is special. Use the % "mod" operator.
     * <ul>
     * <li>specialEleven(22) --> true</li>
     * <li>specialEleven(23) --> true</li>
     * <li>specialEleven(24) --> false</li>
     * </ul>
     *
     * @param n non-negative number
     *
     * @return <code>true</code> if the <code>number</code> is a multiple of 11 or if <code>number - 1</code> is a
     *         multiple of 11. Otherwise returns <code>false</code>
     */
    public static boolean specialEleven( int n )
    {
        return ( n % 11 == 0 ) || ( ( n - 1 ) % 11 == 0 );
    }

    /**
     * Return true if the given non-negative number is 1 or 2 more than a multiple of 20.
     * <ul>
     * <li>more20(20) --> false</li>
     * <li>more20(21) --> true</li>
     * <li>more20(22) --> true</li>
     * </ul>
     *
     * @param n non-negative number
     *
     * @return <code>true</code> if the <code>number</code> is 1 or 2 more than a multiple of 20. Otherwise returns
     *         <code>false</code>
     */
    public static boolean more20( int n )
    {
        return n != 0 && ( ( n - 1 ) % 20 == 0 || ( n - 2 ) % 20 == 0 );
    }

    /**
     * Return true if the given non-negative number is a multiple of 3 or 5, but not both.
     * <ul>
     * <li>old35(3) --> true</li>
     * <li>old35(10) --> true</li>
     * <li>old35(15) --> false</li>
     * </ul>
     *
     * @param n non-negative number
     *
     * @return <code>true</code> if the number is a multiple of 3 or 5, but not both. Otherwise returns
     *         <code>false</code>
     */
    public static boolean old35( int n )
    {
        return ( n % 3 == 0 && n % 5 != 0 ) || ( n % 3 != 0 && n % 5 == 0 );
    }

    /**
     * Return true if the given non-negative number is 1 or 2 less than a multiple of 20. So for example 38 and
     * 39 return true, but 40 returns false.
     * <ul>
     * <li>less20(18) --> true</li>
     * <li>less20(19) --> true</li>
     * <li>less20(20) --> false</li>
     * </ul>
     *
     * @param n non-negative number
     *
     * @return <code>true</code> if the number is 1 or 2 less than a multiple of 20. Otherwise returns
     *         <code>false</code>
     */
    public static boolean less20( int n )
    {
        return ( n + 1 ) % 20 == 0 || ( n + 2 ) % 20 == 0;
    }

    /**
     * Given a non-negative number "num", return true if num is within 2 of a multiple of 10. Note: (a % b) is the
     * remainder of dividing a by b, so (7 % 5) is 2.
     * <ul>
     * <li>nearTen(12) --> true</li>
     * <li>nearTen(17) --> false</li>
     * <li>nearTen(19) --> true</li>
     * </ul>
     *
     * @param num non-negative number
     *
     * @return <code>true</code> if the number is within 2 of a multiple of 10. Otherwise returns
     *         <code>false</code>
     */
    public static boolean nearTen( int num )
    {
        int remainder = num % 10;

        return remainder <= 2 || remainder >= 8;
    }

    /**
     * Given 2 ints, a and b, return their sum. However, "teen" values in the range 13..19 inclusive, are extra lucky.
     * So if either value is a teen, just return 19.
     * <ul>
     * <li>teenSum(3, 4) --> 7</li>
     * <li>teenSum(10, 13) --> 19</li>
     * <li>teenSum(13, 2) --> 19</li>
     * </ul>
     *
     * @param a number
     * @param b number
     *
     * @return if either of the numbers is teen returns 19, otherwise returns sum of the numbers
     */
    public static int teenSum( int a, int b )
    {
        return isTeen( a ) || isTeen( b ) ? 19 : a + b;
    }

    private static boolean isTeen( int n )
    {
        return 13 <= n && n <= 19;
    }

    /**
     * Your cell phone rings. Return true if you should answer it. Normally you answer, except in the morning you only
     * answer if it is your mom calling. In all cases, if you are asleep, you do not answer.
     * <ul>
     * <li>answerCell(false, false, false) --> true</li>
     * <li>answerCell(false, false, true) --> false</li>
     * <li>answerCell(true, false, false) --> false</li>
     * </ul>
     *
     * @param isMorning <code>true</code> if it is morning now, <code>false</code> otherwise
     * @param isMom     <code>true</code> if it is mom calling, <code>false</code> otherwise
     * @param isAsleep  <code>true</code> you are asleep, <code>false</code> otherwise
     *
     * @return <code>true</code> if you should answer, <code>false</code> otherwise
     */
    public static boolean answerCell( boolean isMorning, boolean isMom, boolean isAsleep )
    {
        return !isAsleep && ( !isMorning || isMom );
    }

    /**
     * We are having a party with amounts of tea and candy. Return the int outcome of the party encoded as 0=bad,
     * 1=good, or 2=great. A party is good (1) if both tea and candy are at least 5. However, if either tea or
     * candy is at least double the amount of the other one, the party is great (2). However, in all cases, if
     * either tea or candy is less than 5, the party is always bad (0).
     * <ul>
     * <li>teaParty(6, 8) --> 1</li>
     * <li>teaParty(3, 8) --> 0</li>
     * <li>teaParty(20, 6) --> 2</li>
     * </ul>
     *
     * @param tea   amount of tea
     * @param candy amount of candy
     *
     * @return tea party outcome (0=bad, 1=good, or 2=great)
     *         1=good, or 2=great.
     */
    public static int teaParty( int tea, int candy )
    {
        if ( tea < 5 || candy < 5 )
        {
            return 0;
        }
        int k = ( tea > candy ) ? ( tea / candy ) : ( candy / tea );

        return k >= 2 ? 2 : 1;
    }

    /**
     * Given a string str, if the string starts with "f" return "Fizz". If the string ends with "b" return "Buzz".
     * If both the "f" and "b" conditions are true, return "FizzBuzz". In all other cases, return the string unchanged.
     * <ul>
     * <li>fizzString("fig") --> "Fizz"</li>
     * <li>fizzString("dib") --> "Buzz"</li>
     * <li>fizzString("fib") --> "FizzBuzz"</li>
     * </ul>
     *
     * @param str source string
     *
     * @return "Fizz", "Buzz", "FizzBuzz" or the source string
     */
    public static String fizzString( String str )
    {
        boolean isFirstF = str.startsWith( "f" );
        boolean isLastB = str.endsWith( "b" );

        if ( isFirstF && isLastB )
        {
            return "FizzBuzz";
        }
        if ( isFirstF )
        {
            return "Fizz";
        }
        if ( isLastB )
        {
            return "Buzz";
        }

        return str;
    }

    /**
     * Given an int n, return the string form of the number followed by "!". So the int 6 yields "6!". Except if
     * the number is divisible by 3 use "Fizz" instead of the number, and if the number is divisible by 5 use "Buzz",
     * and if divisible by both 3 and 5, use "FizzBuzz".
     * <ul>
     * <li>fizzString2(1) --> "1!"</li>
     * <li>fizzString2(2) --> "2!"</li>
     * <li>fizzString2(3) --> "Fizz!"</li>
     * </ul>
     *
     * @param n number
     *
     * @return String value according to exercise conditions
     */
    public static String fizzString2( int n )
    {
        if ( n % 3 == 0 && n % 5 == 0 )
        {
            return "FizzBuzz!";
        }
        if ( n % 3 == 0 )
        {
            return "Fizz!";
        }
        if ( n % 5 == 0 )
        {
            return "Buzz!";
        }

        return n + "!";
    }

    /**
     * Given three ints, a b c, return true if it is possible to add two of the ints to get the third.
     * <ul>
     * <li>twoAsOne(1, 2, 3) --> true</li>
     * <li>twoAsOne(3, 1, 2) --> true</li>
     * <li>twoAsOne(3, 2, 2) --> false</li>
     * </ul>
     *
     * @param a number
     * @param b number
     * @param c number
     *
     * @return <code>true</code> if it is possible to add two of the numbers to get the third. Otherwise returns
     *         <code>false</code>
     */
    public static boolean twoAsOne( int a, int b, int c )
    {
        return ( a == b + c ) || ( b == a + c ) || ( c == a + b );
    }

    /**
     * Given three ints, a b c, return true if b is greater than a, and c is greater than b. However, with the
     * exception that if "bOk" is true, b does not need to be greater than a.
     * <ul>
     * <li>inOrder(1, 2, 4, false) --> true</li>
     * <li>inOrder(1, 2, 1, false) --> false</li>
     * <li>inOrder(1, 1, 2, true) --> true</li>
     * </ul>
     *
     * @param a   number
     * @param b   number
     * @param c   number
     * @param bOk <code>true</code> if b does not need to be greater than a, <code>false</code> otherwise
     *
     * @return boolean value according to exercise conditions
     */
    public static boolean inOrder( int a, int b, int c, boolean bOk )
    {
        return bOk ? ( b < c ) : ( a < b && b < c );
    }

    /**
     * Given three ints, a b c, return true if they are in strict increasing order, such as 2 5 11, or 5 6 7,
     * but not 6 5 7 or 5 5 7. However, with the exception that if "equalOk" is true, equality is allowed,
     * such as 5 5 7 or 5 5 5.
     * <ul>
     * <li>inOrderEqual(2, 5, 11, false) --> true</li>
     * <li>inOrderEqual(5, 7, 6, false) --> false</li>
     * <li>inOrderEqual(5, 5, 7, true) --> truetrue</li>
     * </ul>
     *
     * @param a       number
     * @param b       number
     * @param c       number
     * @param equalOk <code>true</code> if a, b and c does need to be in strict increasing order,
     *                <code>false</code> otherwise
     *
     * @return boolean value according to exercise conditions
     */
    public static boolean inOrderEqual( int a, int b, int c, boolean equalOk )
    {
        return equalOk ? ( a <= b && b <= c ) : ( a < b && b < c );
    }

    /**
     * Given three ints, a b c, return true if two or more of them have the same rightmost digit. The ints are
     * non-negative.
     * <ul>
     * <li>lastDigit(23, 19, 13) --> true</li>
     * <li>lastDigit(23, 19, 12) --> false</li>
     * <li>lastDigit(23, 19, 3) --> true</li>
     * </ul>
     *
     * @param a non-negative number
     * @param b non-negativenumber
     * @param c non-negativenumber
     *
     * @return <code>true</code> if two or more of the numbers have the same rightmost digit,
     *         <code>false</code> otherwise
     */
    public static boolean lastDigit( int a, int b, int c )
    {
        int aLastDigit = a % 10;
        int bLastDigit = b % 10;
        int cLastDigit = c % 10;

        return aLastDigit == bLastDigit || bLastDigit == cLastDigit || aLastDigit == cLastDigit;
    }

    /**
     * Given three ints, a b c, return true if one of them is 10 or more less than one of the others.
     * <ul>
     * <li>lessBy10(1, 7, 11) --> true</li>
     * <li>lessBy10(1, 7, 10) --> false</li>
     * <li>lessBy10(11, 1, 7) --> true</li>
     * </ul>
     *
     * @param a number
     * @param b number
     * @param c number
     *
     * @return <code>true</code> if one of the numbers is 10 or more less than one of the others,
     *         <code>false</code> otherwise
     */
    public static boolean lessBy10( int a, int b, int c )
    {
        return Math.abs( a - b ) >= 10 || Math.abs( a - c ) >= 10 || Math.abs( b - c ) >= 10;
    }

    /**
     * Return the sum of two 6-sided dice rolls, each in the range 1..6. However, if noDoubles is true, if the two
     * dice show the same value, increment one die to the next value, wrapping around to 1 if its value was 6.
     * <ul>
     * <li>withoutDoubles(2, 3, true) --> 5</li>
     * <li>withoutDoubles(3, 3, true) --> 7</li>
     * <li>withoutDoubles(3, 3, false) --> 6</li>
     * </ul>
     *
     * @param die1      score in the range 1..6
     * @param die2      score in the range 1..6
     * @param noDoubles the score of two 6-sided dice rolls
     *
     * @return int value according to exercise conditions
     */
    public static int withoutDoubles( int die1, int die2, boolean noDoubles )
    {
        if ( noDoubles )
        {
            if ( die1 == die2 )
            {
                die1 = ( die1 == 6 ? 1 : die1 + 1 );
            }
        }

        return die1 + die2;
    }

    /**
     * Given two int values, return whichever value is larger. However if the two values have the same remainder when
     * divided by 5, then the return the smaller value. However, in all cases, if the two values are the same,
     * return 0. Note: the % "mod" operator computes the remainder, e.g. 7 % 5 is 2.
     * <ul>
     * <li>maxMod5(2, 3) --> 3</li>
     * <li>maxMod5(6, 2) --> 6</li>
     * <li>maxMod5(3, 2) --> 3</li>
     * </ul>
     *
     * @param a value
     * @param b value
     *
     * @return int value according to exercise conditions
     */
    public static int maxMod5( int a, int b )
    {
        if ( a == b )
        {
            return 0;
        }
        if ( a % 5 == b % 5 )
        {
            return a < b ? a : b;
        }

        return a > b ? a : b;
    }

    /**
     * You have a red lottery ticket showing ints a, b, and c, each of which is 0, 1, or 2. If they are all the
     * value 2, the result is 10. Otherwise if they are all the same, the result is 5. Otherwise so long as both b
     * and c are different from a, the result is 1. Otherwise the result is 0.
     * <ul>
     * <li> redTicket(2, 2, 2) --> 10</li>
     * <li>redTicket(2, 2, 1) --> 0</li>
     * <li>redTicket(0, 0, 0) --> 5</li>
     * </ul>
     *
     * @param a number
     * @param b number
     * @param c number
     *
     * @return lottery ticket score (0 or 1 or 5 or 10)
     */
    public static int redTicket( int a, int b, int c )
    {
        if ( a == 2 && b == 2 && c == 2 )
        {
            return 10;
        }
        if ( a == b && b == c )
        {
            return 5;
        }
        if ( a != b && a != c )
        {
            return 1;
        }
        return 0;
    }

    /**
     * You have a green lottery ticket, with ints a, b, and c on it. If the numbers are all different from each other,
     * the result is 0. If all of the numbers are the same, the result is 20. If two of the numbers are the same,
     * the result is 10.
     * <ul>
     * <li>greenTicket(1, 2, 3) --> 0</li>
     * <li>greenTicket(2, 2, 2) --> 20</li>
     * <li>greenTicket(1, 1, 2) --> 10</li>
     * </ul>
     *
     * @param a number
     * @param b number
     * @param c number
     *
     * @return lottery ticket score (0 or 10 or 20)
     */
    public static int greenTicket( int a, int b, int c )
    {
        if ( a == b && b == c )
        {
            return 20;
        }
        if ( a == b || b == c || a == c )
        {
            return 10;
        }

        return 0;
    }

    /**
     * You have a blue lottery ticket, with ints a, b, and c on it. This makes three pairs, which we'll call ab, bc,
     * and ac. Consider the sum of the numbers in each pair. If any pair sums to exactly 10, the result is 10.
     * Otherwise if the ab sum is exactly 10 more than either bc or ac sums, the result is 5. Otherwise the
     * result is 0.
     * <ul>
     * <li>blueTicket(9, 1, 0) --> 10</li>
     * <li>blueTicket(9, 2, 0) --> 0</li>
     * <li>blueTicket(6, 1, 4) --> 10</li>
     * </ul>
     *
     * @param a number
     * @param b number
     * @param c number
     *
     * @return lottery ticket score (0 or 5 or 10)
     */
    public static int blueTicket( int a, int b, int c )
    {
        int ab = a + b;
        int bc = b + c;
        int ac = a + c;

        if ( ab == 10 || bc == 10 || ac == 10 )
        {
            return 10;
        }
        if ( ab - bc == 10 || ab - ac == 10 )
        {
            return 5;
        }

        return 0;
    }

    /**
     * Given two ints, each in the range 10..99, return true if there is a digit that appears in both numbers, such
     * as the 2 in 12 and 23. (Note: division, e.g. n/10, gives the left digit while the % "mod" n%10 gives the right
     * digit.)
     * <ul>
     * <li>shareDigit(12, 23) --> true</li>
     * <li>shareDigit(12, 43) --> false</li>
     * <li>shareDigit(12, 44) --> false</li>
     * </ul>
     *
     * @param a number in the range 10..99
     * @param b number in the range 10..99
     *
     * @return <code>true</code> if there is a digit that appears in both numbers, <code>false</code> otherwise
     */
    public static boolean shareDigit( int a, int b )
    {
        int aFirstDigit = a / 10;
        int aLastDigit = a % 10;
        int bFirstDigit = b / 10;
        int bLastDigit = b % 10;

        return aFirstDigit == bFirstDigit ||
                aFirstDigit == bLastDigit ||
                aLastDigit == bFirstDigit ||
                aLastDigit == bLastDigit;
    }

    /**
     * Given 2 non-negative ints, a and b, return their sum, so long as the sum has the same number of digits as a.
     * If the sum has more digits than a, just return a without b. (Note: one way to compute the number of digits
     * of a non-negative int n is to convert it to a string with String.valueOf(n) and then check the length of
     * the string.)
     * <ul>
     * <li>sumLimit(2, 3) --> 5</li>
     * <li>sumLimit(8, 3) --> 8</li>
     * <li>sumLimit(8, 1) --> 9</li>
     * </ul>
     *
     * @param a non-negative number
     * @param b non-negative number
     *
     * @return sum of a and b if the sum has the same number of digits as a or returns a if the sum has more digits
     *         than a.
     */
    public static int sumLimit( int a, int b )
    {
        int sum = a + b;
        String aStr = String.valueOf( a );
        String sumStr = String.valueOf( sum );

        return sumStr.length() > aStr.length() ? a : sum;
    }
}
