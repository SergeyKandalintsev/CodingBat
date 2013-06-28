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
     * <li>sleepIn(false, false) --> true</li>
     * <li>sleepIn(true, false) --> false</li>
     * <li>sleepIn(false, true) --> true</li>
     * </ul>
     *
     * @param weekday  <code>true</code> if it is a weekday, <code>false</code> otherwise
     * @param vacation <code>true</code> if we are on vacation, <code>false</code> otherwise
     *
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
     * <li>monkeyTrouble(true, true) --> true</li>
     * <li>monkeyTrouble(false, false) --> true</li>
     * <li>monkeyTrouble(true, false) --> false</li>
     * </ul>
     *
     * @param aSmile <code>true</code> if the monkey a is smiling, <code>false</code> otherwise
     * @param bSmile <code>true</code> if the monkey b is smiling, <code>false</code> otherwise
     *
     * @return <code>true</code> if we are in trouble, <code>false</code> otherwise
     */
    public static boolean monkeyTrouble( boolean aSmile, boolean bSmile )
    {
        return !( aSmile || bSmile ) || ( aSmile && bSmile );
    }

    /**
     * Given two int values, return their sum. Unless the two values are the same, then return double their sum.
     * <ul>
     * <li>sumDouble(1, 2) --> 3</li>
     * <li>sumDouble(3, 2) --> 5</li>
     * <li>sumDouble(2, 2) --> 8</li>
     * </ul>
     *
     * @param a number
     * @param b number
     *
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
     *
     * @param n number
     *
     * @return absolute difference between n and 21, or double the absolute difference if n is over 21.
     */
    public static int diff21( int n )
    {
        return n > 21 ? 2 * ( n - 21 ) : 21 - n;
    }

    /**
     * We have a loud talking parrot. The "hour" parameter is the current hour time in the range 0..23. We are in
     * trouble if the parrot is talking and the hour is before 7 or after 20. Return true if we are in trouble.
     * <ul>
     * <li>parrotTrouble(true, 6) --> true</li>
     * <li>parrotTrouble(true, 7) --> false</li>
     * <li>parrotTrouble(false, 6) --> false</li>
     * </ul>
     *
     * @param talking <code>true</code> if the parrot is talking, <code>false</code> otherwise
     * @param hour    current hour time in the range 0..23
     *
     * @return <code>true</code> if we are in trouble, <code>false</code> otherwise
     */
    public static boolean parrotTrouble( boolean talking, int hour )
    {
        return talking && ( hour > 20 || hour < 7 );
    }

    /**
     * Given 2 ints, a and b, return true if one if them is 10 or if their sum is 10.
     * <ul>
     * <li>makes10(9, 10) --> true</li>
     * <li>makes10(9, 9) --> false</li>
     * <li>makes10(1, 9) --> true</li>
     * </ul>
     *
     * @param a number
     * @param b number
     *
     * @return <code>true</code> if one of the number is 10 or if their sum is 10, <code>false</code> otherwise
     */
    public static boolean makes10( int a, int b )
    {
        return a == 10 || b == 10 || ( a + b ) == 10;
    }

    /**
     * Given an int n, return true if it is within 10 of 100 or 200. Note: Math.abs(num) computes the absolute
     * value of a number.
     * <ul>
     * <li>nearHundred(93) --> true</li>
     * <li>nearHundred(90) --> true</li>
     * <li>nearHundred(89) --> false</li>
     * </ul>
     *
     * @param n number
     *
     * @return <code>true</code>if the number is within 10 of 100 or 200, <code>false</code> otherwise
     */
    public static boolean nearHundred( int n )
    {
        return Math.abs( n - 100 ) <= 10 || Math.abs( n - 200 ) <= 10;
    }

    /**
     * Given 2 int values, return true if one is negative and one is positive. Except if the parameter "negative" is
     * true, then return true only if both are negative.
     * <ul>
     * <li>posNeg(1, -1, false) --> true</li>
     * <li>posNeg(-1, 1, false) --> true</li>
     * <li>posNeg(-4, -5, true) --> true</li>
     * </ul>
     *
     * @param a        number
     * @param b        number
     * @param negative boolean parameter
     *
     * @return boolean value according to exercise conditions
     */
    public static boolean posNeg( int a, int b, boolean negative )
    {
        if ( negative )
        {
            return ( a < 0 ) && ( b < 0 );
        }
        else
        {
            return ( a < 0 ) && ( b > 0 ) || ( a > 0 ) && ( b < 0 );
        }
    }

    /**
     * Given a string, return a new string where "not " has been added to the front. However, if the string already
     * begins with "not", return the string unchanged. Note: use .equals() to compare 2 strings.
     * <ul>
     * <li>notString("candy") --> "not candy"</li>
     * <li>notString("x") --> "not x"</li>
     * <li>notString("not bad") --> "not bad"</li>
     * </ul>
     *
     * @param str given string
     *
     * @return String value according to exercise conditions
     */
    public static String notString( String str )
    {
        if ( str.length() >= 3 && str.substring( 0, 3 ).equals( "not" ) )
        {
            return str;
        }

        return "not " + str;
    }

    /**
     * Given a non-empty string and an int n, return a new string where the char at index n has been removed.
     * The value of n will be a valid index of a char in the original string (i.e. n will be in the
     * range 0..str.length()-1 inclusive).
     * <ul>
     * <li>missingChar("kitten", 1) --> "ktten"</li>
     * <li>missingChar("kitten", 0) --> "itten"</li>
     * <li>missingChar("kitten", 4) --> "kittn"</li>
     * </ul>
     *
     * @param str non-empty string
     * @param n   a valid index in the range [0..str.length()-1]
     *
     * @return the string where the char at index n has been removed.
     */
    public static String missingChar( String str, int n )
    {
        return str.substring( 0, n ) + str.substring( n + 1, str.length() );
    }

    /**
     * Given a string, return a new string where the first and last chars have been exchanged.
     * <ul>
     * <li>frontBack("code") --> "eodc"</li>
     * <li>frontBack("a") --> "a"</li>
     * <li>frontBack("ab") --> "ba"</li>
     * </ul>
     *
     * @param str given string
     *
     * @return a string where the first and last chars have been exchanged
     */
    public static String frontBack( String str )
    {
        String s = str;
        int len = str.length();

        if ( len > 1 )
        {
            s = str.substring( len - 1, len ) + str.substring( 1, len - 1 ) + str.substring( 0, 1 );
        }

        return s;
    }

    /**
     * Given a string, we'll say that the front is the first 3 chars of the string. If the string length is less than 3,
     * the front is whatever is there. Return a new string which is 3 copies of the front.
     * <ul>
     * <li>front3("Java") --> "JavJavJav"</li>
     * <li>front3("Chocolate") --> "ChoChoCho"</li>
     * <li>front3("abc") --> "abcabcabc"</li>
     * </ul>
     *
     * @param str given string
     *
     * @return String value according to exercise conditions
     */
    public static String front3( String str )
    {
        String front = ( str.length() <= 3 ) ? str : str.substring( 0, 3 );

        return front + front + front;
    }

    /**
     * Given a string, take the last char and return a new string with the last char added at the front and back, so
     * "cat" yields "tcatt". The original string will be length 1 or more.
     * <ul>
     * <li>backAround("cat") --> "tcatt"</li>
     * <li>backAround("Hello") --> "oHelloo"</li>
     * <li>backAround("a") --> "aaa"</li>
     * </ul>
     *
     * @param str given string (length 1 or more)
     *
     * @return string with the last char added at the front and back
     */
    public static String backAround( String str )
    {
        return str.charAt( str.length() - 1 ) + str + str.charAt( str.length() - 1 );
    }

    /**
     * Return true if the given non-negative number is a multiple of 3 or a multiple of 5. Use the % "mod" operator.
     * <ul>
     * <li>or35(3) --> true</li>
     * <li>or35(10) --> true</li>
     * <li>or35(8) --> false</li>
     * </ul>
     *
     * @param n non-negative number
     *
     * @return <code>true</code> if the given number is a multiple of 3 or a multiple of 5,
     *         <code>false</code> otherwise
     */
    public static boolean or35( int n )
    {
        return n % 3 == 0 || n % 5 == 0;
    }

    /**
     * Given a string, take the first 2 chars and return the string with the 2 chars added at both the front and back,
     * so "kitten" yields"kikittenki". If the string length is less than 2, use whatever chars are there.
     * <ul>
     * <li>front22("kitten") --> "kikittenki"</li>
     * <li>front22("Ha") --> "HaHaHa"</li>
     * <li>front22("abc") --> "ababcab"</li>
     * </ul>
     *
     * @param str given string
     *
     * @return String value according to exercise conditions
     */
    public static String front22( String str )
    {
        String front = ( str.length() < 2 ) ? str : str.substring( 0, 2 );

        return front + str + front;
    }

    /**
     * Given a string, return true if the string starts with "hi" and false otherwise.
     * <ul>
     * <li>startHi("hi there") --> true</li>
     * <li>startHi("hi") --> true</li>
     * <li>startHi("hello hi") --> false</li>
     * </ul>
     *
     * @param str given string
     *
     * @return <code>true</code> if the string starts with "hi", <code>false</code> otherwise
     */
    public static boolean startHi( String str )
    {
        return str.startsWith( "hi" );
    }

    /**
     * Given two temperatures, return true if one is less than 0 and the other is greater than 100.
     * <ul>
     * <li>icyHot(120, -1) --> true</li>
     * <li>icyHot(-1, 120) --> true</li>
     * <li>icyHot(2, 120) --> false</li>
     * </ul>
     *
     * @param temp1 temperature
     * @param temp2 temperature
     *
     * @return <code>true</code>if one of the temperature is less than 0 and the other is greater than 100,
     *         <code>false</code> otherwise
     */
    public static boolean icyHot( int temp1, int temp2 )
    {
        return ( temp1 < 0 && temp2 > 100 ) || ( temp1 > 100 && temp2 < 0 );
    }
}