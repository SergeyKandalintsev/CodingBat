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

    @Test
    public void testStringMatch() throws Exception
    {
        assertEquals( 1, Warmup2.stringMatch( "01", "01" ) );
        assertEquals( 2, Warmup2.stringMatch( "012", "012" ) );
        assertEquals( 2, Warmup2.stringMatch( "000", "000" ) );
        assertEquals( 0, Warmup2.stringMatch( "01", "3201" ) );
        assertEquals( 5, Warmup2.stringMatch( "012345", "012345" ) );
        assertEquals( 0, Warmup2.stringMatch( "", "" ) );
        assertEquals( 0, Warmup2.stringMatch( "01", "0" ) );
        assertEquals( 0, Warmup2.stringMatch( "0123", "24" ) );
        assertEquals( 2, Warmup2.stringMatch( "012345", "012" ) );
    }

    @Test
    public void testStringX() throws Exception
    {
        assertEquals( "", Warmup2.stringX( "" ) );
        assertEquals( "x", Warmup2.stringX( "x" ) );
        assertEquals( "xx", Warmup2.stringX( "xx" ) );
        assertEquals( "xx", Warmup2.stringX( "xxx" ) );
        assertEquals( "xXx", Warmup2.stringX( "xXx" ) );
        assertEquals( "0XXX1", Warmup2.stringX( "0XxXxXxx1" ) );
        assertEquals( "x0XXX1x", Warmup2.stringX( "x0XxXxXxx1x" ) );
    }

    @Test
    public void testAltPairs() throws Exception
    {
        assertEquals( "", Warmup2.altPairs( "" ) );
        assertEquals( "0", Warmup2.altPairs( "0" ) );
        assertEquals( "01", Warmup2.altPairs( "01" ) );
        assertEquals( "01", Warmup2.altPairs( "012" ) );
        assertEquals( "01", Warmup2.altPairs( "0123" ) );
        assertEquals( "014", Warmup2.altPairs( "01234" ) );
        assertEquals( "0145", Warmup2.altPairs( "012345" ) );
        assertEquals( "0145", Warmup2.altPairs( "0123456" ) );
        assertEquals( "0145", Warmup2.altPairs( "01234567" ) );
        assertEquals( "01458", Warmup2.altPairs( "012345678" ) );
    }

    @Test
    public void testStringYak() throws Exception
    {
        assertEquals( "", Warmup2.stringYak( "" ) );
        assertEquals( "y", Warmup2.stringYak( "y" ) );
        assertEquals( "ya", Warmup2.stringYak( "ya" ) );
        assertEquals( "", Warmup2.stringYak( "yak" ) );
        assertEquals( "", Warmup2.stringYak( "ybk" ) );
        assertEquals( "aaabbb", Warmup2.stringYak( "aaayakbbb" ) );
        assertEquals( "aaabbb", Warmup2.stringYak( "aaaybkbbb" ) );
        assertEquals( "aaa", Warmup2.stringYak( "yakaaaybk" ) );
    }

    @Test
    public void testarray667() throws Exception
    {
        assertEquals( 1, Warmup2.array667( new int[]{ 6, 6, 2 } ) );
        assertEquals( 1, Warmup2.array667( new int[]{ 6, 6, 2, 6 } ) );
        assertEquals( 1, Warmup2.array667( new int[]{ 6, 7, 2, 6 } ) );
        assertEquals( 2, Warmup2.array667( new int[]{ 6, 6, 2, 6, 7 } ) );
        assertEquals( 0, Warmup2.array667( new int[]{ 1, 6, 3 } ) );
        assertEquals( 0, Warmup2.array667( new int[]{ 6, 1 } ) );
        assertEquals( 0, Warmup2.array667( new int[]{ } ) );
        assertEquals( 1, Warmup2.array667( new int[]{ 3, 6, 7, 6 } ) );
        assertEquals( 2, Warmup2.array667( new int[]{ 3, 6, 6, 7 } ) );
        assertEquals( 1, Warmup2.array667( new int[]{ 6, 3, 6, 6 } ) );
        assertEquals( 2, Warmup2.array667( new int[]{ 6, 7, 6, 6 } ) );
        assertEquals( 0, Warmup2.array667( new int[]{ 1, 2, 3, 5, 6 } ) );
        assertEquals( 1, Warmup2.array667( new int[]{ 1, 2, 3, 6, 6 } ) );
        assertEquals( 0, Warmup2.array667( new int[]{ 6 } ) );
    }

    @Test
    public void testNoTriples() throws Exception
    {
        assertTrue( Warmup2.noTriples( new int[]{ } ) );
        assertTrue( Warmup2.noTriples( new int[]{ 0 } ) );
        assertTrue( Warmup2.noTriples( new int[]{ 0, 0 } ) );
        assertTrue( Warmup2.noTriples( new int[]{ 0, 0, 1 } ) );
        assertTrue( Warmup2.noTriples( new int[]{ 0, 0, 1, 1, 0, 0, 1 } ) );
        assertFalse( Warmup2.noTriples( new int[]{ 0, 0, 0 } ) );
        assertFalse( Warmup2.noTriples( new int[]{ 0, 1, 1, 1, 0 } ) );
        assertFalse( Warmup2.noTriples( new int[]{ 1, 1, 0, 0, 2, 2, 2, } ) );
    }

    @Test
    public void testHas271() throws Exception
    {
        assertTrue( Warmup2.has271( new int[] {1, 2, 7, 1} ) );
        assertFalse( Warmup2.has271( new int[] {1, 2, 8, 1} ) );
        assertTrue( Warmup2.has271( new int[] {2, 7, 1} ) );
        assertTrue( Warmup2.has271( new int[] {3, 8, 2} ) );
        assertTrue( Warmup2.has271( new int[] {2, 7, 3} ) );
        assertFalse( Warmup2.has271( new int[] {2, 7, 4} ) );
        assertTrue( Warmup2.has271( new int[] {2, 7, -1} ) );

    }
}
