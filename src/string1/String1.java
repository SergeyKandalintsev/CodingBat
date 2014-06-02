package string1;

/**
 * Basic string problems -- no loops. Use + to combine Strings, str.length() is the number of chars in a String,
 * str.substring(i, j) extracts the substring starting at index i and running up to but not including index j.
 * <p/>
 * Date: 29.06.13
 *
 * @author Sergey Kandalintsev
 */
public class String1 {
    /**
     * Given a string name, e.g. "Bob", return a greeting of the form "Hello Bob!".
     * <ul>
     * <li>helloName("Bob") --> "Hello Bob!"</li>
     * <li>helloName("Alice") --> "Hello Alice!"</li>
     * <li>helloName("X") --> "Hello X!"</li>
     * </ul>
     *
     * @param name
     *         given string
     *
     * @return a greeting of the form "name Bob!"
     */
    public static String helloName(String name) {
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
     * @param a
     *         given string
     * @param b
     *         given string
     *
     * @return the result of putting strings together in the order abba
     */
    public static String makeAbba(String a, String b) {
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
     * @param tag
     *         given tag string
     * @param word
     *         given word string
     *
     * @return the HTML string with tags around the word
     */
    public static String makeTags(String tag, String word) {
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
     * @param out
     *         "out" string length 4
     * @param word
     *         a word
     *
     * @return string where the word is in the middle of the out string
     */
    public static String makeOutWord(String out, String word) {
        return out.substring(0, 2) + word + out.substring(2, 4);
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
     * @param str
     *         given string, length at least 2.
     *
     * @return a new string made of 3 copies of the last 2 chars of the original string
     */
    public static String extraEnd(String str) {
        String result = str.substring(str.length() - 2);

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
     * @param str
     *         given string
     *
     * @return String value according to exercise conditions
     */
    public static String firstTwo(String str) {
        return str.length() > 2 ? str.substring(0, 2) : str;
    }

    /**
     * Given a string of even length, return the first half. So the string "WooHoo" yields "Woo".
     * <ul>
     * <li>firstTwo("Hello") --> "He"</li>
     * <li>firstTwo("abcdefg") --> "ab"</li>
     * <li>firstTwo("ab") --> "ab"</li>
     * </ul>
     *
     * @param str
     *         given string of even length
     *
     * @return first half of the string
     */
    public static String firstHalf(String str) {
        return str.substring(0, str.length() / 2);
    }

    /**
     * Given a string, return a version without the first and last char, so "Hello" yields "ell". The string length
     * will be at least 2.
     * <ul>
     * <li>withoutEnd("Hello") --> "ell"</li>
     * <li>withoutEnd("java") --> "av"</li>
     * <li>withoutEnd("coding") --> "odin"</li>
     * </ul>
     *
     * @param str
     *         given string (at least 2 char length)
     *
     * @return string without the first and last char
     */
    public static String withoutEnd(String str) {
        return str.substring(1, str.length() - 1);
    }

    /**
     * Given 2 strings, a and b, return a string of the form short+long+short, with the shorter string on the outside
     * and the longer string on the inside. The strings will not be the same length, but they may be empty (length 0).
     * <ul>
     * <li>comboString("Hello", "hi") → "hiHellohi"</li>
     * <li>comboString("hi", "Hello") → "hiHellohi"</li>
     * <li>comboString("aaa", "b") → "baaab"</li>
     * </ul>
     *
     * @param a
     *         string
     * @param b
     *         string
     *
     * @return string of the form short+long+short
     */
    public static String comboString(String a, String b) {
        return (a.length() < b.length()) ? (a + b + a) : (b + a + b);
    }

    /**
     * Given 2 strings, return their concatenation, except omit the first char of each. The strings will be at least
     * length 1.
     * * <ul>
     * <li>nonStart("Hello", "There") → "ellohere"</li>
     * <li>nonStart("java", "code") → "avaode"</li>
     * <li>nonStart("shotl", "java") → "hotlava"</li>
     * </ul>
     *
     * @param a
     *         string (at least 1 char length)
     * @param b
     *         string (at least 1 char length)
     *
     * @return concatenation of strings <code>a</code> and <code>b</code>, except omit the first char of each
     */
    public static String nonStart(String a, String b) {
        return a.substring(1) + b.substring(1);
    }

    /**
     * Given a string, return a "rotated left 2" version where the first 2 chars are moved to the end. The string
     * length will be at least 2.
     * <ul>
     * <li>left2("Hello") → "lloHe"</li>
     * <li>left2("java") → "vaja"</li>
     * <li>left2("Hi") → "Hi"</li>
     * </ul>
     *
     * @param str
     *         given string (at least 2 char length)
     *
     * @return "rotated left 2" version of given string
     */
    public static String left2(String str) {
        return str.substring(2) + str.substring(0, 2);
    }

    /**
     * Given a string, return a "rotated right 2" version where the last 2 chars are moved to the start. The string
     * length will be at least 2.
     * <ul>
     * <li> right2("Hello") → "loHel"</li>
     * <li>right2("java") → "vaja"</li>
     * <li>right2("Hi") → "Hi"</li>
     * </ul>
     *
     * @param str
     *         given string (at least 2 char length)
     *
     * @return "rotated right 2" version of given string
     */
    public static String right2(String str) {
        return str.substring(str.length() - 2) + str.substring(0, str.length() - 2);
    }

    /**
     * Given a string, return a string length 1 from its front, unless front is false, in which case return a string
     * length 1 from its back. The string will be non-empty.
     * <ul>
     * <li>theEnd("Hello", true) → "H"</li>
     * <li>theEnd("Hello", false) → "o"</li>
     * <li>theEnd("oh", true) → "o"</li>
     * </ul>
     *
     * @param str
     *         given string
     * @param front
     *         boolean
     *
     * @return a string length 1 from the front of given string if front is <code>true</code>. Otherwise returns
     * a string length 1 from the back of given string.
     */
    public static String theEnd(String str, boolean front) {
        return front ? str.substring(0, 1) : str.substring(str.length() - 1, str.length());
    }

    /**
     * Given a string, return a version without both the first and last char of the string. The string may be any
     * length, including 0.
     * <ul>
     * <li>withouEnd2("Hello") → "ell"</li>
     * <li>withouEnd2("abc") → "b"</li>
     * <li>withouEnd2("ab") → ""</li>
     * </ul>
     *
     * @param str
     *         given string
     *
     * @return a string without both the first and last char of the string
     */
    public static String withouEnd2(String str) {
        return (str.length() <= 2) ? "" : str.substring(1, str.length() - 1);
    }

    /**
     * Given a string of even length, return a string made of the middle two chars, so the string "string" yields "ri".
     * The string length will be at least 2.
     * <ul>
     * <li>middleTwo("string") → "ri"</li>
     * <li>middleTwo("code") → "od"</li>
     * <li>middleTwo("Practice") → "ct"</li>
     * </ul>
     *
     * @param str
     *         string of even length
     *
     * @return a string made of the middle two chars
     */
    public static String middleTwo(String str) {
        int halfLen = str.length() >> 1;
        return str.substring(halfLen - 1, halfLen + 1);
    }


    // -----------------------------------------------------------------------------------------


    /**
     * Given a string, if the string begins with "red" or "blue" return that color string, otherwise return the empty
     * string.
     * <ul>
     * <li>seeColor("redxx") --> "red"</li>
     * <li>seeColor("xxred") --> ""</li>
     * <li>seeColor("blueTimes") --> "blue"</li>
     * </ul>
     *
     * @param str
     *         given string
     *
     * @return color ("red" or "blue") or empty string
     *
     * @throws NullPointerException
     *         If str is null
     */
    public static String seeColor(String str) {
        if (str.startsWith("red")) {
            return "red";
        } else if (str.startsWith("blue")) {
            return "blue";
        } else {
            return "";
        }
    }

    /**
     * Given a string, return true if the first 2 chars in the string also appear at the end of the string, such as
     * with "edited".
     * <ul>
     * <li>frontAgain("edited") --> true</li>
     * <li>frontAgain("edit") --> false</li>
     * <li>frontAgain("ed") --> true</li>
     * </ul>
     *
     * @param str
     *         given string
     *
     * @return <code>true</code> if the first 2 chars in the string also appear at the end of the string. Otherwise
     * returns <code>false</code>
     */
    public static boolean frontAgain(String str) {
        if (str == null || str.length() < 2) {
            return false;
        }

        String front = str.substring(0, 2);
        String end = str.substring(str.length() - 2);

        return front.equals(end);
    }

    public static String minCat(String a, String b) {
        int minLength = Math.min(a.length(), b.length());

        return a.substring(a.length() - minLength) + b.substring(b.length() - minLength);
    }

    public String extraFront(String str) {
        String front = str.length() >= 2 ? str.substring(0, 2) : str;

        return front + front + front;
    }

    /**
     * Given a string, if a length 2 substring appears at both its beginning and end, return a string without the
     * substring at the beginning, so "HelloHe" yields "lloHe". The substring may overlap with itself, so "Hi"
     * yields "". Otherwise, return the original string unchanged.
     * <ul>
     * <li>without2("HelloHe") → "lloHe"</li>
     * <li>without2("HelloHi") → "HelloHi"</li>
     * <li>without2("Hi") → ""</li>
     * </ul>
     *
     * @param str
     *         given string
     *
     * @return
     */
    public static String without2(String str) {
        if (str.length() < 2) {
            return str;
        }

        String frontSubstring = str.substring(0, 2);
        String backSubstring = str.substring(str.length() - 2);

        if (frontSubstring.equals(backSubstring)) {
            return str.substring(2);
        }

        return str;
    }

    /**
     * Given a string, return a version without the first 2 chars. Except keep the first char if it is 'a' and keep
     * the second char if it is 'b'. The string may be any length. Harder than it looks.
     * <ul>
     * <li>deFront("Hello") → "llo"</li>
     * <li>deFront("java") → "va"</li>
     * <li>deFront("away") → "aay"</li>
     * </ul>
     *
     * @param str
     *
     * @return
     */
    public static String deFront(String str) {
        int len = str.length();

        if (len == 0) {
            return str;
        }

        if (len == 1) {
            return str.charAt(0) == 'a' ? str : "";
        }

        if (str.charAt(0) == 'a') {
            if (str.charAt(1) == 'b') {
                return str;
            } else {
                return "a" + str.substring(2);
            }
        }

        if (str.charAt(1) == 'b') {
            return str.substring(1);
        }

        return str.substring(2);
    }

    /**
     * Given a string and a second "word" string, we'll say that the word matches the string if it appears at the front
     * of the string, except its first char does not need to match exactly. On a match, return the front of the string,
     * or otherwise return the empty string. So, so with the string "hippo" the word "hi" returns "hi" and "xip"
     * returns "hip". The word will be at least length 1.
     * <ul>
     * <li>startWord("hippo", "hi") → "hi"</li>
     * <li>startWord("hippo", "xip") → "hip"</li>
     * <li>startWord("hippo", "i") → "h"</li>
     * </ul>
     *
     * @param str
     * @param word
     *
     * @return
     */
    public static String startWord(String str, String word) {
        String match = word.substring(1);
        String front = str.substring(1, match.length());

        if (match.equals(front)) {
            return str.substring(0, word.length());
        }

        return "";
    }
}





































