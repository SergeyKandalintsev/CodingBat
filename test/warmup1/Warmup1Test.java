package warmup1;

import org.junit.Test;

import static org.junit.Assert.*;

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

    @Test
    public void testParrotTrouble() throws Exception
    {
        assertTrue( Warmup1.parrotTrouble( true, 6 ) );
        assertFalse( Warmup1.parrotTrouble( true, 7 ) );
        assertFalse( Warmup1.parrotTrouble( false, 6 ) );
        assertTrue( Warmup1.parrotTrouble( true, 21 ) );
        assertFalse( Warmup1.parrotTrouble( false, 21 ) );
        assertFalse( Warmup1.parrotTrouble( false, 20 ) );
        assertTrue( Warmup1.parrotTrouble( true, 23 ) );
        assertFalse( Warmup1.parrotTrouble( false, 23 ) );
        assertFalse( Warmup1.parrotTrouble( true, 20 ) );
        assertFalse( Warmup1.parrotTrouble( false, 12 ) );
    }

    @Test
    public void testMakes10() throws Exception
    {
        assertTrue( Warmup1.makes10( 9, 10 ) );
        assertTrue( Warmup1.makes10( 1, 9 ) );
        assertTrue( Warmup1.makes10( 10, 1 ) );
        assertTrue( Warmup1.makes10( 10, 10 ) );
        assertTrue( Warmup1.makes10( 8, 2 ) );
        assertTrue( Warmup1.makes10( 10, 42 ) );
        assertTrue( Warmup1.makes10( 12, -2 ) );
        assertFalse( Warmup1.makes10( 9, 9 ) );
        assertFalse( Warmup1.makes10( 8, 3 ) );
    }

    @Test
    public void testNearHundred() throws Exception
    {
        assertTrue( Warmup1.nearHundred( 93 ) );
        assertTrue( Warmup1.nearHundred( 90 ) );
        assertTrue( Warmup1.nearHundred( 110 ) );
        assertTrue( Warmup1.nearHundred( 191 ) );
        assertTrue( Warmup1.nearHundred( 190 ) );
        assertTrue( Warmup1.nearHundred( 200 ) );
        assertTrue( Warmup1.nearHundred( 210 ) );
        assertFalse( Warmup1.nearHundred( 89 ) );
        assertFalse( Warmup1.nearHundred( 111 ) );
        assertFalse( Warmup1.nearHundred( 121 ) );
        assertFalse( Warmup1.nearHundred( 0 ) );
        assertFalse( Warmup1.nearHundred( 5 ) );
        assertFalse( Warmup1.nearHundred( 189 ) );
        assertFalse( Warmup1.nearHundred( 211 ) );
        assertFalse( Warmup1.nearHundred( 290 ) );
    }

    @Test
    public void testPosNeg() throws Exception
    {
        assertTrue( Warmup1.posNeg( -1, 1, false ) );
        assertTrue( Warmup1.posNeg( 1, -1, false ) );
        assertFalse( Warmup1.posNeg( 0, 0, false ) );
        assertFalse( Warmup1.posNeg( 1, 0, false ) );
        assertFalse( Warmup1.posNeg( 1, 1, false ) );
        assertTrue( Warmup1.posNeg( -1, -1, true ) );
        assertFalse( Warmup1.posNeg( -1, 1, true ) );
        assertFalse( Warmup1.posNeg( 1, 1, true ) );
        assertFalse( Warmup1.posNeg( -1, 0, true ) );
    }

    @Test
    public void testNotString() throws Exception
    {
        assertEquals( "not candy", Warmup1.notString( "candy" ) );
        assertEquals( "not x", Warmup1.notString( "x" ) );
        assertEquals( "not bad", Warmup1.notString( "not bad" ) );
        assertEquals( "not bad", Warmup1.notString( "bad" ) );
        assertEquals( "not", Warmup1.notString( "not" ) );
        assertEquals( "not is not", Warmup1.notString( "is not" ) );
        assertEquals( "not no", Warmup1.notString( "no" ) );
        assertEquals( "not ", Warmup1.notString( "" ) );
    }

    @Test
    public void testMissingChar() throws Exception
    {
        assertEquals( "", Warmup1.missingChar( "0", 0 ) );
        assertEquals( "1", Warmup1.missingChar( "01", 0 ) );
        assertEquals( "0", Warmup1.missingChar( "01", 1 ) );
        assertEquals( "12", Warmup1.missingChar( "012", 0 ) );
        assertEquals( "02", Warmup1.missingChar( "012", 1 ) );
        assertEquals( "01", Warmup1.missingChar( "012", 2 ) );
        assertEquals( "023", Warmup1.missingChar( "0123", 1 ) );
        assertEquals( "013", Warmup1.missingChar( "0123", 2 ) );
    }

    @Test
    public void testFrontBack() throws Exception
    {
        assertEquals( "", Warmup1.frontBack( "" ) );
        assertEquals( "0", Warmup1.frontBack( "0" ) );
        assertEquals( "10", Warmup1.frontBack( "01" ) );
        assertEquals( "210", Warmup1.frontBack( "012" ) );
        assertEquals( "3120", Warmup1.frontBack( "0123" ) );
    }

    @Test
    public void testFront3() throws Exception
    {
        assertEquals( "", Warmup1.front3( "" ) );
        assertEquals( "000", Warmup1.front3( "0" ) );
        assertEquals( "010101", Warmup1.front3( "01" ) );
        assertEquals( "012012012", Warmup1.front3( "012" ) );
        assertEquals( "012012012", Warmup1.front3( "0123" ) );
    }

    @Test
    public void testBackAround() throws Exception
    {
        assertEquals( "000", Warmup1.backAround( "0" ) );
        assertEquals( "1011", Warmup1.backAround( "01" ) );
        assertEquals( "20122", Warmup1.backAround( "012" ) );
    }

    @Test
    public void testOr35() throws Exception
    {
        assertTrue( Warmup1.or35( 0 ) );
        assertTrue( Warmup1.or35( 6 ) );
        assertTrue( Warmup1.or35( 10 ) );
        assertTrue( Warmup1.or35( 15 ) );
        assertFalse( Warmup1.or35( 11 ) );
    }

    @Test
    public void testFront22() throws Exception
    {
        assertEquals( "", Warmup1.front22( "" ) );
        assertEquals( "000", Warmup1.front22( "0" ) );
        assertEquals( "010101", Warmup1.front22( "01" ) );
        assertEquals( "0101201", Warmup1.front22( "012" ) );
        assertEquals( "01012301", Warmup1.front22( "0123" ) );
    }

    @Test
    public void testStartHi() throws Exception
    {
        assertTrue( Warmup1.startHi( "hi" ) );
        assertTrue( Warmup1.startHi( "hihi" ) );
        assertFalse( Warmup1.startHi( "" ) );
        assertFalse( Warmup1.startHi( "0" ) );
        assertFalse( Warmup1.startHi( "01" ) );
        assertFalse( Warmup1.startHi( "012" ) );
    }

    @Test
    public void testIcyHot() throws Exception
    {
        assertTrue( Warmup1.icyHot( -1, 101 ) );
        assertTrue( Warmup1.icyHot( 101, -1 ) );
        assertFalse( Warmup1.icyHot( 0, 100) );
        assertFalse( Warmup1.icyHot( 5, 25) );
        assertFalse( Warmup1.icyHot( -5, 99) );
        assertFalse( Warmup1.icyHot( 101, 1) );
    }
}