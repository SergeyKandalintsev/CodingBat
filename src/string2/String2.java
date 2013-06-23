package string2;

public class String2
{
    /**
     * Given a string, return a string where for every char in the original, there are two chars.
     * <ul>
     * <li>doubleChar("The") → "TThhee"</li>
     * <li>doubleChar("AAbb") → "AAAAbbbb"</li>
     * <li>doubleChar("Hi-There") → "HHii--TThheerree"</li>
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
     * <li>countHi("abc hi ho") → 1</li>
     * <li>countHi("ABChi hi") → 2</li>
     * <li>countHi("hihi") → 2</li>
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
     * <li>catDog("catdog") → true</li>
     * <li>catDog("catcat") → false</li>
     * <li>catDog("1cat1cadodog") → true</li>
     * </ul>
     * @param str not null string
     * @return <code>true</code> if the string "cat" and "dog" appear the same number of times in the given string,
     *         <code>false</code> otherwise
     */
    public static boolean catDog( String str )
    {
        int catCount = 0;
        int dogCount = 0;

        for ( int i = 0; i < str.length() - 2; i++)
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
}
