package ap1;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Date: 21.06.13
 *
 * @author Sergey Kandalintsev
 */
public class Ap1Test
{
    @Test
    public void testScoresIncreasing() throws Exception
    {
        assertTrue( Ap1.scoresIncreasing( new int[]{ 1, 3, 4 } ) );
        assertFalse( Ap1.scoresIncreasing( new int[]{ 1, 3, 2 } ) );
        assertTrue( Ap1.scoresIncreasing( new int[]{ 1, 1, 4 } ) );
        assertTrue( Ap1.scoresIncreasing( new int[]{ 1, 1, 2, 4, 4, 7 } ) );
        assertFalse( Ap1.scoresIncreasing( new int[]{ 1, 1, 2, 4, 3, 7 } ) );
        assertTrue( Ap1.scoresIncreasing( new int[]{ -5, 4, 11 } ) );
    }

    @Test
    public void testScores100() throws Exception
    {
        assertTrue( Ap1.scores100( new int[]{ 100, 100 } ) );
        assertTrue( Ap1.scores100( new int[]{ 100, 100, 100 } ) );
        assertTrue( Ap1.scores100( new int[]{ 1, 100, 100 } ) );
        assertTrue( Ap1.scores100( new int[]{ 100, 1, 1, 100, 100 } ) );
        assertFalse( Ap1.scores100( new int[]{ 1, 100 } ) );
        assertFalse( Ap1.scores100( new int[]{ 100, 1, 100, 1, 100 } ) );
    }

    @Test
    public void testScoresClump() throws Exception
    {
        assertTrue( Ap1.scoresClump( new int[]{ 1, 2, 3 } ) );
        assertTrue( Ap1.scoresClump( new int[]{ 1, 2, 5, 5, 6, 11, 12 } ) );
        assertTrue( Ap1.scoresClump( new int[]{ 10, 1, 8, 1, 2, 3 } ) );
        assertTrue( Ap1.scoresClump( new int[]{ 1, 2, 3, 18 } ) );
        assertFalse( Ap1.scoresClump( new int[]{ } ) );
        assertFalse( Ap1.scoresClump( new int[]{ 0 } ) );
        assertFalse( Ap1.scoresClump( new int[]{ 0, 1 } ) );
        assertFalse( Ap1.scoresClump( new int[]{ 0, 1, 18 } ) );
        assertFalse( Ap1.scoresClump( new int[]{ 0, 1, 3, 5, 21, 22, 28 } ) );
    }

    @Test
    public void testScoresAverage() throws Exception
    {
        assertEquals( 4, Ap1.scoresAverage( new int[]{ 2, 2, 4, 4 } ) );
        assertEquals( 4, Ap1.scoresAverage( new int[]{ 4, 4, 4, 2, 2, 2 } ) );
        assertEquals( 4, Ap1.scoresAverage( new int[]{ 3, 4, 5, 1, 2, 3 } ) );
        assertEquals( 6, Ap1.scoresAverage( new int[]{ 5, 6 } ) );
        assertEquals( 5, Ap1.scoresAverage( new int[]{ 5, 4 } ) );
        assertEquals( 5, Ap1.scoresAverage( new int[]{ 5, 4, 5, 6, 2, 1, 2, 3 } ) );
    }

    @Test
    public void testWordsCount() throws Exception
    {
        assertEquals( 2, Ap1.wordsCount( new String[]{ "a", "bb", "b", "ccc" }, 1 ) );
        assertEquals( 1, Ap1.wordsCount( new String[]{ "a", "bb", "b", "ccc" }, 3 ) );
        assertEquals( 0, Ap1.wordsCount( new String[]{ "a", "bb", "b", "ccc" }, 4 ) );
        assertEquals( 1, Ap1.wordsCount( new String[]{ "", "bb", "b", "ccc" }, 0 ) );
        assertEquals( 0, Ap1.wordsCount( new String[]{ "" }, 1 ) );
        assertEquals( 1, Ap1.wordsCount( new String[]{ "" }, 0 ) );
    }

    @Test
    public void testWordsFront() throws Exception
    {
        assertArrayEquals( new String[]{ "a" }, Ap1.wordsFront( new String[]{ "a", "b", "c", "d" }, 1 ) );
        assertArrayEquals( new String[]{ "a", "b" }, Ap1.wordsFront( new String[]{ "a", "b", "c", "d" }, 2 ) );
        assertArrayEquals( new String[]{ "a", "b", "c" }, Ap1.wordsFront( new String[]{ "a", "b", "c", "d" }, 3 ) );
    }
}
