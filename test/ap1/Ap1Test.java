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
        assertTrue( Ap1.scoresIncreasing( new int[] {1, 3, 4} ) );
        assertFalse( Ap1.scoresIncreasing( new int[] {1, 3, 2} ) );
        assertTrue( Ap1.scoresIncreasing( new int[] {1, 1, 4} ) );
        assertTrue( Ap1.scoresIncreasing( new int[] {1, 1, 2, 4, 4, 7} ) );
        assertFalse( Ap1.scoresIncreasing( new int[] {1, 1, 2, 4, 3, 7} ) );
        assertTrue( Ap1.scoresIncreasing( new int[] {-5, 4, 11} ) );
    }

    @Test
    public void testScores100() throws Exception
    {
        assertTrue( Ap1.scores100( new int[] {100, 100} ) );
        assertTrue( Ap1.scores100( new int[] {100, 100, 100} ) );
        assertTrue( Ap1.scores100( new int[] {1, 100, 100} ) );
        assertTrue( Ap1.scores100( new int[] {100, 1, 1, 100, 100} ) );
        assertFalse( Ap1.scores100( new int[] {1, 100} ) );
        assertFalse( Ap1.scores100( new int[] {100, 1, 100, 1, 100} ) );
    }
}
