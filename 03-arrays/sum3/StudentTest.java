
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
    public void sum3() {
        assertEquals(8, s.sum3(new int[]{5, 1, 2}));
        assertEquals(6, s.sum3(new int[]{1, 3, 2}));
        assertEquals(24, s.sum3(new int[]{12, 7, 5}));
        assertEquals(14, s.sum3(new int[]{9, 1, 4}));
    }
}
