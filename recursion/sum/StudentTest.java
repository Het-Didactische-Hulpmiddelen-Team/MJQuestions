
import org.junit.Before;
import org.junit.After;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StudentTest {


    private Student s;

    @Before
    public void setUp() {
        s = new Student();
    }

    @After
    public void tearDown() {
        s = null;
    }

    @Test
    public void sum0To0() {
        assertEquals(0, s.sum(0, 0));
    }

    @Test
    public void PositiveToPositive() {
        assertEquals(1, s.sum(1, 1));
        assertEquals(15, s.sum(0, 5));
        assertEquals(5, s.sum(5, 5));
        assertEquals(165, s.sum(10, 20));
    }

    @Test
    public void NegativeToPositive() {
        assertEquals(0, s.sum(-5, 5));
        assertEquals(34, s.sum(-6, 10));
        assertEquals(8, s.sum(-7, 8));
    }

}
