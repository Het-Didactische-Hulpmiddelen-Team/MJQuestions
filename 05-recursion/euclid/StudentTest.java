
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
    public void euclid() {
        assertEquals(5, s.euclid(20, 5));
        assertEquals(5, s.euclid(5, 20));
        assertEquals(1, s.euclid(20, 19));
        assertEquals(1, s.euclid(17, 31));
        assertEquals(13, s.euclid(65, 117));
    }

}
