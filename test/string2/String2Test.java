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


    }

    @Test
    public void testXyzThere() throws Exception
    {

    }
}