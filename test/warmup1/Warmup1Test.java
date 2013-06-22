package warmup1;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Date: 16.06.13
 * @author Sergey Kandalintsev  test  test
 */
public class Warmup1Test
{
    @Test
    public void testSleepIn() throws Exception
    {
        assertTrue( Warmup1.sleepIn( false, false ) );
        assertFalse( Warmup1.sleepIn( true, false ) );
        assertTrue( Warmup1.sleepIn( false, true ) );
        assertTrue( Warmup1.sleepIn( true, true ) );
    }

    @Test
    public void testMonkeyTrouble() throws Exception
    {
        assertTrue( Warmup1.monkeyTrouble( true, true ) );
        assertTrue( Warmup1.monkeyTrouble( false, false ) );
        assertFalse( Warmup1.monkeyTrouble( true, false ) );
        assertFalse( Warmup1.monkeyTrouble( false, true ) );
    }

    @Test
    public void testSumDouble() throws Exception
    {
        assertEquals( 3, Warmup1.sumDouble( 1, 2 ) );
        assertEquals( 5, Warmup1.sumDouble( 3, 2 ) );
        assertEquals( 8, Warmup1.sumDouble( 2, 2 ) );
        assertEquals( -1, Warmup1.sumDouble( -1, 0 ) );
        assertEquals( 12, Warmup1.sumDouble( 3, 3 ) );
        assertEquals( 0, Warmup1.sumDouble( 0, 0 ) );
        assertEquals( 1, Warmup1.sumDouble( 0, 1 ) );
        assertEquals( 7, Warmup1.sumDouble( 3, 4 ) );
    }

    @Test
    public void testDiff21() throws Exception
    {
        assertEquals( 2, Warmup1.diff21( 19 ) );
        assertEquals( 11, Warmup1.diff21( 10 ) );
        assertEquals( 0, Warmup1.diff21( 21 ) );
        assertEquals( 2, Warmup1.diff21( 22 ) );
        assertEquals( 8, Warmup1.diff21( 25 ) );
        assertEquals( 18, Warmup1.diff21( 30 ) );
        assertEquals( 21, Warmup1.diff21( 0 ) );
        assertEquals( 20, Warmup1.diff21( 1 ) );
        assertEquals( 19, Warmup1.diff21( 2 ) );
        assertEquals( 22, Warmup1.diff21( -1 ) );
        assertEquals( 23, Warmup1.diff21( -2 ) );
        assertEquals( 58, Warmup1.diff21( 50 ) );
    }
}
