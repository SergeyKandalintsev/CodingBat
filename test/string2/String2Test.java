package string2;

import org.junit.Test;

import static org.junit.Assert.*;

public class String2Test
{
    @Test
    public void testDoubleChar() throws Exception
    {
        assertEquals( "", String2.doubleChar( "" ) );
        assertEquals( "112233", String2.doubleChar( "123" ) );
        assertEquals( "00", String2.doubleChar( "0" ) );
        assertEquals( "TThhee SSttrriinngg -- 112233", String2.doubleChar( "The String - 123" ) );
    }

    @Test
    public void testCountHi() throws Exception
    {
        assertEquals( 0, String2.countHi( "" ) );
        assertEquals( 0, String2.countHi( "h" ) );
        assertEquals( 1, String2.countHi( "hi" ) );
        assertEquals( 1, String2.countHi( "hi, all!" ) );
        assertEquals( 3, String2.countHi( "wdwdhi hi,ggg hi" ) );
        assertEquals( 3, String2.countHi( "hihihi" ) );
        assertEquals( 0, String2.countHi( "Hi is no HI on ahI" ) );
        assertEquals( 2, String2.countHi( "hiho not HOHIhi" ) );
    }

    @Test
    public void testCatDog() throws Exception
    {
        assertTrue( String2.catDog( "" ) );
        assertTrue( String2.catDog( "c" ) );
        assertTrue( String2.catDog( "ca" ) );
        assertTrue( String2.catDog( "dogogcat" ) );
        assertTrue( String2.catDog( "catxdogxdogxcat" ) );
        assertTrue( String2.catDog( "catdog" ) );
        assertFalse( String2.catDog( "cat" ) );
        assertFalse( String2.catDog( "dog" ) );
        assertFalse( String2.catDog( "catcat" ) );
        assertFalse( String2.catDog( "dogdogcat" ) );
    }

    @Test
    public void testCountCode() throws Exception
    {
        assertEquals( 1, String2.countCode( "aaacodebbb" ) );
        assertEquals( 3, String2.countCode( "AAcodeBBcoleCCccoreDD" ) );
        assertEquals( 0, String2.countCode( "" ) );
        assertEquals( 0, String2.countCode( "c" ) );
        assertEquals( 1, String2.countCode( "code" ) );
        assertEquals( 2, String2.countCode( "AAcodeBBcoleCCccorfDD" ) );
    }

    @Test
    public void testEndOther() throws Exception
    {
        assertTrue( String2.endOther( "", "" ) );
        assertTrue( String2.endOther( "", "1" ) );
        assertTrue( String2.endOther( "1", "1" ) );
        assertTrue( String2.endOther( "01", "1" ) );
        assertTrue( String2.endOther( "012345", "345" ) );
        assertFalse( String2.endOther( "012345", "3456" ) );
    }

    @Test
    public void testXyzThere() throws Exception
    {
        assertTrue( String2.xyzThere( "abcxyz" ) );
        assertTrue( String2.xyzThere( "xyz.abc" ) );
        assertTrue( String2.xyzThere( "xyz" ) );
        assertTrue( String2.xyzThere( "abc.xyzxyz" ) );
        assertFalse( String2.xyzThere( "abc.xyz" ) );
        assertFalse( String2.xyzThere( "abcxy" ) );
        assertFalse( String2.xyzThere( "xy" ) );
        assertFalse( String2.xyzThere( "" ) );
        assertFalse( String2.xyzThere( ".xyz" ) );
        assertFalse( String2.xyzThere( "1.xyz.xyz2.xyz" ) );
    }

    @Test
    public void testBobThere() throws Exception
    {
        assertTrue( String2.bobThere( "bob" ) );
        assertTrue( String2.bobThere( "bxb" ) );
        assertTrue( String2.bobThere( "123bob" ) );
        assertTrue( String2.bobThere( "bob123" ) );
        assertTrue( String2.bobThere( "123bob123" ) );
        assertTrue( String2.bobThere( "123byb123" ) );
        assertFalse( String2.bobThere( "" ) );
        assertFalse( String2.bobThere( "b" ) );
        assertFalse( String2.bobThere( "bo" ) );
        assertFalse( String2.bobThere( "box" ) );
        assertFalse( String2.bobThere( "xyzboxob" ) );
    }
}