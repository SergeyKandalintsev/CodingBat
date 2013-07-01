package string1;

import org.junit.Test;

import static org.junit.Assert.*;

public class String1Test
{
    @Test
    public void testHelloName() throws Exception
    {
        assertEquals( "Hello World!", String1.helloName( "World" ) );
        assertEquals( "Hello X!", String1.helloName( "X" ) );
        assertEquals( "Hello !", String1.helloName( "" ) );
    }

    @Test
    public void testMakeAbba() throws Exception
    {
        assertEquals( "", String1.makeAbba( "", "" ) );
        assertEquals( "012012", String1.makeAbba( "012", "" ) );
        assertEquals( "012012", String1.makeAbba( "", "012" ) );
        assertEquals( "012345345012", String1.makeAbba( "012", "345" ) );
    }

    @Test
    public void testMakeTags() throws Exception
    {
        assertEquals( "<i>Hello</i>", String1.makeTags( "i", "Hello" ) );
        assertEquals( "<body>Heart</body>", String1.makeTags( "body", "Heart" ) );
        assertEquals( "<i></i>", String1.makeTags( "i", "" ) );
    }

    @Test
    public void testMakeOutWord() throws Exception
    {
        assertEquals( "<<Yay>>", String1.makeOutWord( "<<>>", "Yay" ) );
        assertEquals( "[[word]]", String1.makeOutWord( "[[]]", "word" ) );
    }

    @Test
    public void testExtraEnd() throws Exception
    {
        assertEquals( "010101", String1.extraEnd( "01" ) );
        assertEquals( "232323", String1.extraEnd( "0123" ) );
    }

    @Test
    public void testFirstTwo() throws Exception
    {
        assertEquals( "", String1.firstTwo( "" ) );
        assertEquals( "0", String1.firstTwo( "0" ) );
        assertEquals( "01", String1.firstTwo( "01" ) );
        assertEquals( "01", String1.firstTwo( "012" ) );
    }

    @Test
    public void testFirstHalf() throws Exception
    {
        assertEquals( "", String1.firstHalf( "" ) );
        assertEquals( "0", String1.firstHalf( "01" ) );
        assertEquals( "01", String1.firstHalf( "0123" ) );
    }
}
