
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
    public void productMoreThan1() {
        assertEquals(0, s.product(0));
        assertEquals(1, s.product(1));
        assertEquals(2, s.product(2));
        assertEquals(6, s.product(3));
        assertEquals(24, s.product(4));
        assertEquals(120, s.product(5));
        assertEquals(39916800, s.product(11));
    }

    @Test
    public void productEquals1() {
        assertEquals(1, s.product(1));
    }

    @Test
    public void productEquals0() {
        assertEquals(0, s.product(0));
    }


}
