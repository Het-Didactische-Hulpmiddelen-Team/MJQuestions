
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
    public void tShirtsMoreThan100() {
        assertEquals(909, s.tShirts2(101));
        assertEquals(4500, s.tShirts2(500));
    }

    @Test
    public void tShirtsEquals100() {
        assertEquals(900, s.tShirts2(100));
    }

    @Test
    public void tShirtsLessThan100() {
        assertEquals(0, s.tShirts2(0));
        assertEquals(10, s.tShirts2(1));
        assertEquals(20, s.tShirts2(2));
        assertEquals(30, s.tShirts2(3));
    }
}
