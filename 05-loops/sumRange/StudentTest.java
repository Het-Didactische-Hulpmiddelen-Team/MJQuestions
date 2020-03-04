import org.junit.Before;
import org.junit.After;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StudentTest {


    private Student s;

    @Before
    public void setUp(){
        s = new Student();
    }

    @After
    public void tearDown(){
        s = null;
    }

    @Test
    public void sumRangeZeroToZero() {
        assertEquals(sumRange(0, 0), s.sumRange(0, 0));
    }

    @Test
    public void sumRangePositiveToNegative() {
        for (int i = 1; i < 100; i++) {
            int j = -i;
            assertEquals(sumRange(i, j), s.sumRange(i, j));
        }
    }

    @Test
    public void sumRangeNegativeToPositive() {
        for (int i = 1; i < 100; i++) {
            int j = -i;
            assertEquals(sumRange(j, i), s.sumRange(j, i));
        }
    }

    @Test
    public void sumRangeTest() {
        for (int i = 1; i < 100; i++) {
            int j = i * 10;
            assertEquals(sumRange(i, j), s.sumRange(i, j));
        }
    }

    @Test
    public void sumRangeBackwards() {
        assertEquals(sumRange(0, 0), s.sumRange(0, 0));
    }


    private int sumRange(int a, int b)
    {
        int r = 0;
        while (a <= b) {
            r += a;
            a++;
        }
        return r;
    }

}
