package logic1;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Date: 17.06.13
 * @author Sergey Kandalintsev
 */
public class Logic1Test
{
    @Test
    public void testCigarPartyAtWorkDay() throws Exception
    {
        assertFalse( Logic1.cigarParty( 39, false ) );
        assertTrue( Logic1.cigarParty( 40, false ) );
        assertTrue( Logic1.cigarParty( 41, false ) );
        assertTrue( Logic1.cigarParty( 60, false ) );
        assertFalse( Logic1.cigarParty( 61, false ) );
    }

    @Test
    public void testCigarPartyAtWeekend() throws Exception
    {
        assertFalse( Logic1.cigarParty( 39, true ) );
        assertTrue( Logic1.cigarParty( 40, true ) );
        assertTrue( Logic1.cigarParty( 60, true ) );
        assertTrue( Logic1.cigarParty( 88, true ) );
    }

    @Test
    public void testDateFashion() throws Exception
    {
        assertEquals( 0, Logic1.dateFashion( 9, 2 ) );
        assertEquals( 0, Logic1.dateFashion( 1, 8 ) );
        assertEquals( 2, Logic1.dateFashion( 8, 3 ) );
        assertEquals( 2, Logic1.dateFashion( 5, 9 ) );
        assertEquals( 1, Logic1.dateFashion( 5, 5 ) );
        assertEquals( 1, Logic1.dateFashion( 6, 7 ) );
    }

    @Test
    public void testSquirrelPlayAtNoSummer() throws Exception
    {
        assertFalse( Logic1.squirrelPlay( 59, false ) );
        assertTrue( Logic1.squirrelPlay( 60, false ) );
        assertTrue( Logic1.squirrelPlay( 70, false ) );
        assertTrue( Logic1.squirrelPlay( 90, false ) );
        assertFalse( Logic1.squirrelPlay( 91, false ) );
    }

    @Test
    public void testSquirrelPlayAtSummer() throws Exception
    {
        assertFalse( Logic1.squirrelPlay( 59, true ) );
        assertTrue( Logic1.squirrelPlay( 60, true ) );
        assertTrue( Logic1.squirrelPlay( 70, true ) );
        assertTrue( Logic1.squirrelPlay( 90, true ) );
        assertTrue( Logic1.squirrelPlay( 100, true ) );
        assertFalse( Logic1.squirrelPlay( 101, true ) );
    }

    @Test
    public void testCaughtSpeeding() throws Exception
    {
        assertEquals( 0, Logic1.caughtSpeeding( 59, false ) );
        assertEquals( 0, Logic1.caughtSpeeding( 60, false ) );
        assertEquals( 1, Logic1.caughtSpeeding( 61, false ) );
        assertEquals( 1, Logic1.caughtSpeeding( 80, false ) );
        assertEquals( 2, Logic1.caughtSpeeding( 81, false ) );
    }

    @Test
    public void testCaughtSpeedingAtBirthday() throws Exception
    {
        assertEquals( 0, Logic1.caughtSpeeding( 64, true ) );
        assertEquals( 0, Logic1.caughtSpeeding( 65, true ) );
        assertEquals( 1, Logic1.caughtSpeeding( 66, true ) );
        assertEquals( 1, Logic1.caughtSpeeding( 85, true ) );
        assertEquals( 2, Logic1.caughtSpeeding( 86, true ) );
    }

    @Test
    public void testSortaSum() throws Exception
    {
        assertEquals( 9, Logic1.sortaSum( 4, 5 ) );
        assertEquals( 20, Logic1.sortaSum( 5, 5 ) );
        assertEquals( 20, Logic1.sortaSum( 11, 8 ) );
        assertEquals( 20, Logic1.sortaSum( 10, 10 ) );
        assertEquals( 21, Logic1.sortaSum( 7, 14 ) );
    }

    @Test
    public void testAlarmClock() throws Exception
    {
        assertEquals( "7:00", Logic1.alarmClock( 1, false ) );
        assertEquals( "10:00", Logic1.alarmClock( 0, false ) );
        assertEquals( "10:00", Logic1.alarmClock( 6, false ) );
    }

    @Test
    public void testAlarmClockAtVacation() throws Exception
    {
        assertEquals( "10:00", Logic1.alarmClock( 1, true ) );
        assertEquals( "off", Logic1.alarmClock( 0, true ) );
        assertEquals( "off", Logic1.alarmClock( 6, true ) );
    }

    @Test
    public void testLove6() throws Exception
    {
        assertTrue( Logic1.love6( 6, 1 ) );
        assertTrue( Logic1.love6( -7, -1 ) );
        assertTrue( Logic1.love6( 2, 4 ) );
        assertTrue( Logic1.love6( 7, 1 ) );
        assertTrue( Logic1.love6( 1, 7 ) );
        assertFalse( Logic1.love6( 66, 18 ) );
    }

    @Test
    public void testIn1To10Inside() throws Exception
    {
        assertTrue( Logic1.in1To10( 1, false ) );
        assertTrue( Logic1.in1To10( 7, false ) );
        assertTrue( Logic1.in1To10( 10, false ) );
        assertFalse( Logic1.in1To10( -5, false ) );
        assertFalse( Logic1.in1To10( 11, false ) );
    }

    @Test
    public void testIn1To10Outside() throws Exception
    {
        assertTrue( Logic1.in1To10( 0, true ) );
        assertTrue( Logic1.in1To10( 1, true ) );
        assertFalse( Logic1.in1To10( 7, true ) );
        assertTrue( Logic1.in1To10( 10, true ) );
        assertTrue( Logic1.in1To10( 11, true ) );
    }

    @Test
    public void testSpecialEleven() throws Exception
    {
        assertTrue( Logic1.specialEleven( 121 ) );
        assertTrue( Logic1.specialEleven( 122 ) );
        assertFalse( Logic1.specialEleven( 123 ) );
        assertTrue( Logic1.specialEleven( 0 ) );
        assertTrue( Logic1.specialEleven( 1 ) );
        assertFalse( Logic1.specialEleven( 2 ) );
    }

    @Test
    public void testMore20() throws Exception
    {
        assertFalse( Logic1.more20( 0 ) );
        assertTrue( Logic1.more20( 1 ) );
        assertTrue( Logic1.more20( 2 ) );
        assertFalse( Logic1.more20( 20 ) );
        assertTrue( Logic1.more20( 21 ) );
        assertTrue( Logic1.more20( 22 ) );
    }

    @Test
    public void testOld35() throws Exception
    {
        assertTrue( Logic1.old35( 3 ) );
        assertTrue( Logic1.old35( 6 ) );
        assertTrue( Logic1.old35( 5 ) );
        assertTrue( Logic1.old35( 10 ) );
        assertFalse( Logic1.old35( 15 ) );
        assertFalse( Logic1.old35( 19 ) );
    }

    @Test
    public void testLess20() throws Exception
    {
        assertTrue( Logic1.less20( 58 ) );
        assertTrue( Logic1.less20( 59 ) );
        assertFalse( Logic1.less20( 0 ) );
        assertFalse( Logic1.less20( 60 ) );
    }
}
