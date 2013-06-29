package string1;

/**
 * Basic string problems -- no loops. Use + to combine Strings, str.length() is the number of chars in a String,
 * str.substring(i, j) extracts the substring starting at index i and running up to but not including index j.
 * <p/>
 * Date: 29.06.13
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
     * @param name given string
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
     * @param a given string
     * @param b given string
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
     * @param tag  given tag string
     * @param word given word string
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
     * <li> makeOutWord("[[]]", "word") --> "[[word]]"</li>
     * </ul>
     * @param out "out" string length 4
     * @param word a word
     * @return string where the word is in the middle of the out string
     */
    public static String makeOutWord( String out, String word )
    {
        return out.substring( 0, 2 ) + word + out.substring( 2, 4 );
    }
}
