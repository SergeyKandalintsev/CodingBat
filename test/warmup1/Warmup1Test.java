package warmup1;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Date: 16.06.13 test
 * @author Sergey Kandalintsev
 */
public class Warmup1Test
{
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
        assertEquals( 20, Warmup1.diff21( 1  ) );
        assertEquals( 19, Warmup1.diff21( 2  ) );
        assertEquals( 22, Warmup1.diff21( -1  ) );
        assertEquals( 23, Warmup1.diff21( -2 ) );
        assertEquals( 58, Warmup1.diff21( 50 ) );
    }
}
