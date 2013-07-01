package string1;

/**
 * Basic string problems -- no loops. Use + to combine Strings, str.length() is the number of chars in a String,
 * str.substring(i, j) extracts the substring starting at index i and running up to but not including index j.
 * <p/>
 * Date: 29.06.13
 *
 * @author Sergey Kandalintsev
 */
public class String1
{
    /**
     * Given a string name, e.g. "Bob", return a greeting of the form "Hello Bob!".
     * <ul>
     * <li>helloName("Bob") --> "Hello Bob!"</li>
     * <li>helloName("Alice") --> "Hello Alice!"</li>
     * <li>helloName("X") --> "Hello X!"</li>
     * </ul>
     *
     * @param name given string
     *
     * @return a greeting of the form "name Bob!"
     */
    public static String helloName( String name )
    {
        return "Hello " + name + "!";
    }

    /**
     * Given two strings, a and b, return the result of putting them together in the order abba, e.g. "Hi" and "Bye"
     * returns "HiByeByeHi".
     * <ul>
     * <li>makeAbba("Hi", "Bye") --> "HiByeByeHi"</li>
     * <li>makeAbba("Yo", "Alice") --> "YoAliceAliceYo"</li>
     * <li>makeAbba("What", "Up") --> "WhatUpUpWhat"</li>
     * </ul>
     *
     * @param a given string
     * @param b given string
     *
     * @return the result of putting strings together in the order abba
     */
    public static String makeAbba( String a, String b )
    {
        return a + b + b + a;
    }

    /**
     * The web is built with HTML strings like "<i>Yay</i>" which draws Yay as italic text. In this example,
     * the "i" tag makes <i> and </i> which surround the word "Yay". Given tag and word strings, create the HTML
     * string with tags around the word, e.g. "<i>Yay</i>".
     * <ul>
     * <li>makeTags("i", "Yay") --> "<i>Yay</i>"</li>
     * <li>makeTags("i", "Hello") --> "<i>Hello</i>"</li>
     * <li>makeTags("cite", "Yay") --> "<cite>Yay</cite>"</li>
     * </ul>
     *
     * @param tag  given tag string
     * @param word given word string
     *
     * @return the HTML string with tags around the word
     */
    public static String makeTags( String tag, String word )
    {
        return "<" + tag + ">" + word + "</" + tag + ">";
    }

    /**
     * Given an "out" string length 4, such as "<<>>", and a word, return a new string where the word is in the middle
     * of the out string, e.g. "<<word>>". Note: use str.substring(i, j) to extract the String starting at index i
     * and going up to but not including index j.
     * <ul>
     * <li>makeOutWord("<<>>", "Yay") --> "<<Yay>>"</li>
     * <li>makeOutWord("<<>>", "WooHoo") --> "<<WooHoo>>"</li>
     * <li>makeOutWord("[[]]", "word") --> "[[word]]"</li>
     * </ul>
     *
     * @param out  "out" string length 4
     * @param word a word
     *
     * @return string where the word is in the middle of the out string
     */
    public static String makeOutWord( String out, String word )
    {
        return out.substring( 0, 2 ) + word + out.substring( 2, 4 );
    }

    /**
     * Given a string, return a new string made of 3 copies of the last 2 chars of the original string. The string
     * length will be at least 2.
     * <ul>
     * <li>extraEnd("Hello") --> "lololo"</li>
     * <li>extraEnd("ab") --> "ababab"</li>
     * <li>extraEnd("Hi") --> "HiHiHi"</li>
     * </ul>
     *
     * @param str given string, length at least 2.
     *
     * @return a new string made of 3 copies of the last 2 chars of the original string
     */
    public static String extraEnd( String str )
    {
        String result = str.substring( str.length() - 2 );

        return result + result + result;
    }

    /**
     * Given a string, return the string made of its first two chars, so the String "Hello" yields "He". If the string
     * is shorter than length 2, return whatever there is, so "X" yields "X", and the empty string "" yields the
     * empty string "". Note that str.length() returns the length of a string.
     * <ul>
     * <li>firstTwo("Hello") --> "He"</li>
     * <li>firstTwo("abcdefg") --> "ab"</li>
     * <li>firstTwo("ab") --> "ab"</li>
     * </ul>
     *
     * @param str given string
     *
     * @return String value according to exercise conditions
     */
    public static String firstTwo( String str )
    {
        return str.length() > 2 ? str.substring( 0, 2 ) : str;
    }

    /**
     * Given a string of even length, return the first half. So the string "WooHoo" yields "Woo".
     * <ul>
     * <li>firstTwo("Hello") --> "He"</li>
     * <li>firstTwo("abcdefg") --> "ab"</li>
     * <li>firstTwo("ab") --> "ab"</li>
     * </ul>
     *
     * @param str given string of even length
     *
     * @return first half of the string
     */
    public static String firstHalf( String str )
    {
        return str.substring( 0, str.length() / 2 );
    }
}
