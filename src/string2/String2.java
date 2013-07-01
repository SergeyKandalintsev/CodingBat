package string2;

public class String2
{
    /**
     * Given a string, return a string where for every char in the original, there are two chars.
     * <ul>
     * <li>doubleChar("The") --> "TThhee"</li>
     * <li>doubleChar("AAbb") --> "AAAAbbbb"</li>
     * <li>doubleChar("Hi-There") --> "HHii--TThheerree"</li>
     * </ul>
     * @param str not null string
     * @return string with double chars
     */
    public static String doubleChar( String str )
    {
        String result = "";

        for ( int i = 0; i < str.length(); i++ )
        {
            result = result + str.charAt( i ) + str.charAt( i );
        }

        return result;
    }

    /**
     * Return the number of times that the string "hi" appears anywhere in the given string.
     * <ul>
     * <li>countHi("abc hi ho") --> 1</li>
     * <li>countHi("ABChi hi") --> 2</li>
     * <li>countHi("hihi") --> 2</li>
     * </ul>
     * @param str not null string
     * @return number of times that the string "hi" appears in the given string
     */
    public static int countHi( String str )
    {
        int hiCount = 0;

        for ( int i = str.indexOf( "hi" ); i != -1; i = str.indexOf( "hi", i + 1 ) )
        {
            hiCount++;
        }

        return hiCount;
    }

    /**
     * Return true if the string "cat" and "dog" appear the same number of times in the given string.
     * <ul>
     * <li>catDog("catdog") --> true</li>
     * <li>catDog("catcat") --> false</li>
     * <li>catDog("1cat1cadodog") --> true</li>
     * </ul>
     * @param str not null string
     * @return <code>true</code> if the string "cat" and "dog" appear the same number of times in the given string,
     *         <code>false</code> otherwise
     */
    public static boolean catDog( String str )
    {
        int catCount = 0;
        int dogCount = 0;

        for ( int i = 0; i < str.length() - 2; i++ )
        {
            if ( "cat".equals( str.substring( i, i + 3 ) ) )
            {
                catCount++;
            }
            if ( "dog".equals( str.substring( i, i + 3 ) ) )
            {
                dogCount++;
            }
        }

        return catCount == dogCount;
    }

    /**
     * Return the number of times that the string "code" appears anywhere in the given string, except we'll accept
     * any letter for the 'd', so "cope" and "cooe" count.
     * <ul>
     * <li>countCode("aaacodebbb") --> 1</li>
     * <li>countCode("codexxcode") --> 2</li>
     * <li>countCode("cozexxcope") --> 2</li>
     * </ul>
     * @param str not null string
     * @return number of times that the string "coXe" (where X means any character) appears anywhere in
     *         the given string
     */
    public static int countCode( String str )
    {
        int count = 0;

        for ( int i = 0; i < str.length() - 3; i++ )
        {
            if ( "co".equals( str.substring( i, i + 2 ) ) )
            {
                if ( str.charAt( i + 3 ) == 'e' )
                {
                    count++;
                }
            }
        }

        return count;
    }

    /**
     * Given two strings, return true if either of the strings appears at the very end of the other string,
     * ignoring upper/lower case differences (in other words, the computation should not be "case sensitive").
     * Note: str.toLowerCase() returns the lowercase version of a string.
     * <ul>
     * <li>endOther("Hiabc", "abc") --> true</li>
     * <li>endOther("AbC", "HiaBc") --> true</li>
     * <li>endOther("abc", "abXabc") --> true</li>
     * </ul>
     * @param a string
     * @param b string
     * @return <code>true</code> if either of the strings appears at the very end of the other string (ignoring case
     *         difference), <code>false</code> otherwise
     */
    public static boolean endOther( String a, String b )
    {
        a = a.toLowerCase();
        b = b.toLowerCase();

        return a.endsWith( b ) || b.endsWith( a );
    }

    /**
     * Return true if the given string contains an appearance of "xyz" where the xyz is not directly preceeded by a
     * period (.). So "xxyz" counts but "x.xyz" does not.
     * <ul>
     * <li>xyzThere("abcxyz") --> true</li>
     * <li>xyzThere("abc.xyz") --> false</li>
     * <li>xyzThere("xyz.abc") --> true</li>
     * </ul>
     * @param str string
     * @return <code>true</code> if the given string contains "xyz" not directly preceeded by a '.' symbol,
     *         <code>false</code> otherwise
     */
    public static boolean xyzThere( String str )
    {
        boolean result = false;

        for ( int i = 0; i < str.length() - 2; i++ )
        {
            if ( "xyz".equals( str.substring( i, i + 3 ) ) )
            {
                if ( i == 0 || str.charAt( i - 1 ) != '.' )
                {
                    return true;
                }
            }
        }

        return result;
    }

    /**
     * Return true if the given string contains a "bob" string, but where the middle 'o' char can be any char.
     * <ul>
     * <li>bobThere("abcbob") --> true</li>
     * <li>bobThere("b9b") --> true</li>
     * <li>bobThere("bac") --> false</li>
     * </ul>
     * @param str given string
     * @return <code>true</code> if the given string contains "bob", but where the middle 'o' char can be any char,
     *         <code>false</code> otherwise
     */
    public static boolean bobThere( String str )
    {
        for ( int i = 0; i < str.length() - 2; i++ )
        {
            if ( str.charAt( i ) == 'b' && str.charAt( i + 2 ) == 'b' )
            {
                return true;
            }
        }

        return false;
    }
}