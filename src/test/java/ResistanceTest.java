import org.junit.Test;
import resistance.Parallel;
import resistance.Series;

import static junit.framework.TestCase.assertEquals;

public class ResistanceTest {

    @Test
    public void seriesTest(){
        double[] resistances = {1,1,1};

        double expected = 3;
        double actual = Series.resistanceSeries(resistances);

        assertEquals(expected,actual);

    }

    @Test
    public void parallelTest(){
        double[] resistance = {10, 10};
        double expected = 5;

        double actual = Parallel.resistanceParallel(resistance);

        assertEquals(expected,actual);

    }
}
