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
     * @param str string
     * @param n   non-negative number
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
     * @param str given string
     * @param n   non-negative number
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
     * <li>countXX("abcxx") --> 1</li>
     * <li>countXX("xxx") --> 2</li>
     * <li>countXX("xxxx") --> 3</li>
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

    /**
     * Given a string, return true if the first instance of "x" in the string is immediately followed by another "x".
     * <ul>
     * <li>doubleX("axxbb") --> true</li>
     * <li>doubleX("axaxax") --> false</li>
     * <li>doubleX("xxxxx") --> true</li>
     * </ul>
     * @param str given string
     * @return <code>true</code> if the first instance of "x" in the string is immediately followed by another "x",
     *         <code>false</code> otherwise
     */
    public static boolean doubleX( String str )
    {
        int i = str.indexOf( 'x' );

        if ( i == -1 || i == str.length() - 1 )
        {
            return false;
        }

        return str.substring( i, i + 2 ).equals( "xx" );
    }

    /**
     * Given a string, return a new string made of every other char starting with the first, so "Hello" yields "Hlo".
     * <ul>
     * <li>stringBits("Hello") --> "Hlo"</li>
     * <li>stringBits("Hi") --> "H"</li>
     * <li>stringBits("Heeololeo") --> "Hello"</li>
     * </ul>
     * @param str string
     * @return String value according to exercise conditions
     */
    public static String stringBits( String str )
    {
        String result = "";

        for ( int i = 0; i < str.length(); i += 2 )
        {
            result = result + str.charAt( i );
        }

        return result;
    }

    /**
     * Given a non-empty string like "Code" return a string like "CCoCodCode".
     * <ul>
     * <li>stringSplosion("Code") --> "CCoCodCode"</li>
     * <li>stringSplosion("abc") --> "aababc"</li>
     * <li>stringSplosion("ab") --> "aab"</li>
     * </ul>
     * @param str non-empty string
     * @return String value according to exercise conditions
     */
    public static String stringSplosion( String str )
    {
        String result = "";

        for ( int i = 0; i < str.length(); i++ )
        {
            result += str.substring( 0, i + 1 );
        }
        return result;
    }

    /**
     * Given a string, return the count of the number of times that a substring length 2 appears in the string and
     * also as the last 2 chars of the string, so "hixxxhi" yields 1 (we won't count the end substring).
     * <ul>
     * <li>last2("hixxhi") --> 1</li>
     * <li>last2("xaxxaxaxx") --> 1</li>
     * <li>last2("axxxaaxx") --> 2</li>
     * </ul>
     * @param str given string
     * @return String value according to exercise conditions
     */
    public static int last2( String str )
    {
        if ( str.length() < 2 )
        {
            return 0;
        }

        String end = str.substring( str.length() - 2 );
        int count = 0;

        for ( int i = 0; i < str.length() - 2; i++ )
        {
            String sub = str.substring( i, i + 2 );

            if ( sub.equals( end ) )
            {
                count++;
            }
        }

        return count;
    }

    /**
     * Given an array of ints, return the number of 9's in the array.
     * <ul>
     * <li>arrayCount9({1, 2, 9}) --> 1</li>
     * <li>arrayCount9({1, 9, 9}) --> 2</li>
     * <li>arrayCount9({1, 9, 9, 3, 9}) --> 3</li>
     * </ul>
     * @param nums array of ints
     * @return number of 9's in the array
     */
    public static int arrayCount9( int[] nums )
    {
        int count = 0;

        for ( int num : nums )
        {
            if ( num == 9 )
            {
                count++;
            }
        }

        return count;
    }

    /**
     * Given an array of ints, return true if one of the first 4 elements in the array is a 9. The array length may be
     * less than 4.
     * <ul>
     * <li>arrayFront9({1, 2, 9, 3, 4}) --> true</li>
     * <li>arrayFront9({1, 2, 3, 4, 9}) --> false</li>
     * <li>arrayFront9({1, 2, 3, 4, 5}) --> false</li>
     * </ul>
     * @param nums array of ints
     * @return <code>true</code> if one of the first 4 elements in the array is a 9, <code>false</code> otherwise
     */
    public static boolean arrayFront9( int[] nums )
    {
        int len = nums.length > 4 ? 4 : nums.length;

        for ( int i = 0; i < len; i++ )
        {
            if ( nums[i] == 9 )
            {
                return true;
            }
        }

        return false;
    }

    /**
     * Given an array of ints, return true if .. 1, 2, 3, .. appears in the array somewhere.
     * <ul>
     * <li>array123({1, 1, 2, 3, 1}) --> true</li>
     * <li>array123({1, 1, 2, 4, 1}) --> false</li>
     * <li>array123({1, 1, 2, 1, 2, 3}) --> true</li>
     * </ul>
     * @param nums array of ints
     * @return <code>true</code> if .. 1, 2, 3, .. appears in the array somewhere, <code>false</code> otherwise
     */
    public static boolean array123( int[] nums )
    {
        for ( int i = 0; i < ( nums.length - 2 ); i++ )
        {
            if ( ( nums[i] == 1 ) && ( nums[i + 1] == 2 ) && ( nums[i + 2] == 3 ) )
            {
                return true;
            }
        }
        return false;
    }

    /**
     * Given 2 strings, a and b, return the number of the positions where they contain the same length 2 substring.
     * So "xxcaazz" and "xxbaaz" yields 3, since the "xx", "aa", and "az" substrings appear in the same place in both
     * strings.
     * <ul>
     * <li>stringMatch("xxcaazz", "xxbaaz") --> 3</li>
     * <li>stringMatch("abc", "abc") --> 2</li>
     * <li>stringMatch("abc", "axc") --> 0</li>
     * </ul>
     * @param a given string
     * @param b given string
     * @return number of the positions of the given strings where they contain the same length 2 substring
     */
    public static int stringMatch( String a, String b )
    {
        int len = Math.min( a.length(), b.length() );
        int count = 0;

        for ( int i = 0; i < len - 1; i++ )
        {
            if ( a.charAt( i ) == b.charAt( i ) && a.charAt( i + 1 ) == b.charAt( i + 1 ) )
            {
                count++;
            }
        }

        return count;
    }

    /**
     * Given a string, return a version where all the "x" have been removed. Except an "x" at the very start or end
     * should not be removed.
     * <ul>
     * <li>stringX("xxHxix") --> "xHix"</li>
     * <li>stringX("abxxxcd") --> "abcd"</li>
     * <li>stringX("xabxxxcdx") --> "xabcdx"</li>
     * </ul>
     * @param str given string
     * @return string where all the "x" have been removed, except an "x" at the very start or end
     *         should not be removed
     */
    public static String stringX( String str )
    {
        int len = str.length();

        if ( len < 3 )
        {
            return str;
        }
        String subStr = str.substring( 1, len - 1 );
        subStr = subStr.replace( "x", "" );

        return str.charAt( 0 ) + subStr + str.charAt( len - 1 );
    }

    /**
     * Given a string, return a string made of the chars at indexes 0,1, 4,5, 8,9 ... so "kittens" yields "kien".
     * <ul>
     * <li>altPairs("kitten") --> "kien"</li>
     * <li>altPairs("Chocolate") --> "Chole"</li>
     * <li>altPairs("CodingHorror") --> "Congrr"</li>
     * </ul>
     * @param str given string
     * @return the string made of the chars at indexes 0,1, 4,5, 8,9 ...
     */
    public static String altPairs( String str )
    {
        String result = "";

        for ( int i = 0; i < str.length(); i += 4 )
        {
            result += str.charAt( i );
            if ( i + 1 < str.length() )
            {
                result += str.charAt( i + 1 );
            }
        }

        return result;
    }

    /**
     * Suppose the string "yak" is unlucky. Given a string, return a version where all the "yak" are removed, but the
     * "a" can be any char. The "yak" strings will not overlap.
     * <ul>
     * <li>stringYak("yakpak") --> "pak"</li>
     * <li>stringYak("pakyak") --> "pak"</li>
     * <li>stringYak("yak123ya") --> "123ya"</li>
     * </ul>
     * @param str given string
     * @return String value according to exercise conditions
     */
    public static String stringYak( String str )
    {
        String result = "";

        for ( int i = 0; i < str.length(); i++ )
        {
            if ( i + 2 < str.length() && str.charAt( i ) == 'y' && str.charAt( i + 2 ) == 'k' )
            {
                i += 2;
            }
            else
            {
                result += str.charAt( i );
            }
        }

        return result;
    }

    /**
     * Given an array of ints, return the number of times that two 6's are next to each other in the array.
     * Also count instances where the second "6" is actually a 7.
     * <ul>
     * <li>array667({6, 6, 2}) --> 1</li>
     * <li>array667({6, 6, 2, 6}) --> 1</li>
     * <li>array667({6, 7, 2, 6}) --> 1</li>
     * </ul>
     * @param nums an array of ints
     * @return int value according to exercise conditions
     */
    public static int array667( int[] nums )
    {
        int count = 0;

        for ( int i = 0; i < nums.length - 1; i++ )
        {
            if ( nums[i] == 6 && ( nums[i + 1] == 6 || nums[i + 1] == 7 ) )
            {
                count++;
            }
        }

        return count;
    }

    /**
     * Given an array of ints, we'll say that a triple is a value appearing 3 times in a row in the array. Return
     * true if the array does not contain any triples.
     * <ul>
     * <li>noTriples({1, 1, 2, 2, 1}) --> true</li>
     * <li>noTriples({1, 1, 2, 2, 2, 1}) --> false</li>
     * <li>noTriples({1, 1, 1, 2, 2, 2, 1}) --> false</li>
     * </ul>
     * @param nums given array of ints
     * @return <code>true</code> if the array does not contain any triples, <code>false</code> otherwise
     */
    public static boolean noTriples( int[] nums )
    {
        for ( int i = 0; i < nums.length - 2; i++ )
        {
            if ( nums[i] == nums[i + 1] && nums[i] == nums[i + 2] )
            {
                return false;
            }
        }

        return true;
    }

    /**
     * Given an array of ints, return true if it contains a 2, 7, 1 pattern -- a value, followed by the value plus 5,
     * followed by the value minus 1. Additionally the 271 counts even if the "1" differs by 2 or less from the
     * correct value.
     * <ul>
     * <li>has271({1, 2, 7, 1}) --> true</li>
     * <li>has271({1, 2, 8, 1}) --> false</li>
     * <li>has271({2, 7, 1}) --> true</li>
     * </ul>
     * @param nums given array of ints
     * @return boolean value according to exercise conditions
     */
    public static boolean has271( int[] nums )
    {
        for ( int i = 0; i < nums.length - 2; i++ )
        {
            if ( ( nums[i] + 5 == nums[i + 1] ) && Math.abs( nums[i + 2] - ( nums[i] - 1 ) ) <= 2 )
            {
                return true;
            }
        }

        return false;
    }
}
