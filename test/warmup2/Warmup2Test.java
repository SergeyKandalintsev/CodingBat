package warmup2;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Date: 25.06.13
 * @author Sergey Kandalintsev
 */
public class Warmup2Test
{
    @Test
    public void testStringTimes() throws Exception
    {
        assertEquals( "HiHi", Warmup2.stringTimes( "Hi", 2 ) );
        assertEquals( "HiHiHi", Warmup2.stringTimes( "Hi", 3 ) );
        assertEquals( "H", Warmup2.stringTimes( "H", 1 ) );
        assertEquals( "", Warmup2.stringTimes( "H", 0 ) );
        assertEquals( "", Warmup2.stringTimes( "", 5 ) );
    }

    @Test
    public void testFrontTimes() throws Exception
    {
        assertEquals( "ChoCho", Warmup2.frontTimes( "Chocolate", 2 ) );
        assertEquals( "ChoChoCho", Warmup2.frontTimes( "Chocolate", 3 ) );
        assertEquals( "AbcAbcAbc", Warmup2.frontTimes( "Abc", 3 ) );
        assertEquals( "AbAbAbAb", Warmup2.frontTimes( "Ab", 4 ) );
        assertEquals( "AAAA", Warmup2.frontTimes( "A", 4 ) );
        assertEquals( "", Warmup2.frontTimes( "", 4 ) );
        assertEquals( "", Warmup2.frontTimes( "Abc", 0 ) );
    }

    @Test
    public void testCountXX() throws Exception
    {
        assertEquals( 0, Warmup2.countXX( "" ) );
        assertEquals( 0, Warmup2.countXX( "0" ) );
        assertEquals( 0, Warmup2.countXX( "01" ) );
        assertEquals( 0, Warmup2.countXX( "012" ) );
        assertEquals( 0, Warmup2.countXX( "x" ) );
        assertEquals( 1, Warmup2.countXX( "xx" ) );
        assertEquals( 2, Warmup2.countXX( "xxx" ) );
        assertEquals( 4, Warmup2.countXX( "0xx1xx2xxx" ) );
    }

    @Test
    public void testDoubleX() throws Exception
    {
        assertFalse( Warmup2.doubleX( "" ) );
        assertFalse( Warmup2.doubleX( "x" ) );
        assertFalse( Warmup2.doubleX( "xa" ) );
        assertFalse( Warmup2.doubleX( "0123x" ) );
        assertFalse( Warmup2.doubleX( "01x2x" ) );
        assertFalse( Warmup2.doubleX( "0x1xx23" ) );
        assertTrue( Warmup2.doubleX( "xx" ) );
        assertTrue( Warmup2.doubleX( "012xx" ) );
        assertTrue( Warmup2.doubleX( "xx123" ) );
    }

    @Test
    public void testStringBits() throws Exception
    {
        assertEquals( "Hlo", Warmup2.stringBits( "Hello" ) );
        assertEquals( "H", Warmup2.stringBits( "Hi" ) );
        assertEquals( "Hello", Warmup2.stringBits( "Heeololeo" ) );
        assertEquals( "HHH", Warmup2.stringBits( "HiHiHi" ) );
        assertEquals( "", Warmup2.stringBits( "" ) );
    }

    @Test
    public void testStringSplosion() throws Exception
    {
        assertEquals( "0", Warmup2.stringSplosion( "0" ) );
        assertEquals( "001", Warmup2.stringSplosion( "01" ) );
        assertEquals( "001012", Warmup2.stringSplosion( "012" ) );
    }

    @Test
    public void testLast2() throws Exception
    {
        assertEquals( 1, Warmup2.last2( "hixxhi" ) );
        assertEquals( 1, Warmup2.last2( "xaxxaxaxx" ) );
        assertEquals( 2, Warmup2.last2( "axxxaaxx" ) );
        assertEquals( 3, Warmup2.last2( "xxaxxaxxaxx" ) );
        assertEquals( 0, Warmup2.last2( "xaxaxaxx" ) );
        assertEquals( 2, Warmup2.last2( "xxxx" ) );
        assertEquals( 0, Warmup2.last2( "hi" ) );
        assertEquals( 0, Warmup2.last2( "h" ) );
        assertEquals( 0, Warmup2.last2( "" ) );
    }

    @Test
    public void testArrayCount9() throws Exception
    {
        assertEquals( 0, Warmup2.arrayCount9( new int[]{ } ) );
        assertEquals( 0, Warmup2.arrayCount9( new int[]{ 1 } ) );
        assertEquals( 1, Warmup2.arrayCount9( new int[]{ 9 } ) );
        assertEquals( 3, Warmup2.arrayCount9( new int[]{ 9, 9, 9 } ) );
        assertEquals( 2, Warmup2.arrayCount9( new int[]{ 9, 0, -9, 9, 2 } ) );
    }

    @Test
    public void testArrayFront9() throws Exception
    {
        assertFalse( Warmup2.arrayFront9( new int[]{ } ) );
        assertFalse( Warmup2.arrayFront9( new int[]{ 0 } ) );
        assertFalse( Warmup2.arrayFront9( new int[]{ 8, 11 } ) );
        assertFalse( Warmup2.arrayFront9( new int[]{ 2, 18, 32, 36, 251 } ) );
        assertTrue( Warmup2.arrayFront9( new int[]{ 9 } ) );
        assertTrue( Warmup2.arrayFront9( new int[]{ 9, 9 } ) );
        assertTrue( Warmup2.arrayFront9( new int[]{ 8, 2, 9 } ) );
        assertTrue( Warmup2.arrayFront9( new int[]{ 9, 8, 9, 0 } ) );
        assertTrue( Warmup2.arrayFront9( new int[]{ 9, 2, 1, 8, 4, 654, 45 } ) );
    }

    @Test
    public void testArray123() throws Exception
    {
        assertFalse( Warmup2.array123( new int[]{ } ) );
        assertFalse( Warmup2.array123( new int[]{ 1 } ) );
        assertFalse( Warmup2.array123( new int[]{ 1, 2 } ) );
        assertFalse( Warmup2.array123( new int[]{ 1, 2, 2 } ) );
        assertFalse( Warmup2.array123( new int[]{ 1, 4, 2, 3 } ) );
        assertTrue( Warmup2.array123( new int[]{ 1, 2, 3 } ) );
        assertTrue( Warmup2.array123( new int[]{ 9, 8, 1, 2, 3, 4, 5, 6 } ) );
        assertTrue( Warmup2.array123( new int[]{ 6, 7, 1, 2, 3 } ) );
    }
}
