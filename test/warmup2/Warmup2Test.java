package warmup2;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Date: 25.06.13
 *
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
}
