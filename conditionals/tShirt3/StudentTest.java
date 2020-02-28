
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
    public void tShirtsLessThan100() {
        assertEquals(0, s.tShirts3(0));
        assertEquals(10, s.tShirts3(1));
        assertEquals(20, s.tShirts3(2));
        assertEquals(30, s.tShirts3(3));
    }

    @Test
    public void tShirtsEquals100() {
        assertEquals(900, s.tShirts3(100));
    }

    @Test
    public void tShirtsMoreThan100LessThan500() {
        assertEquals(909, s.tShirts3(101));
        assertEquals(4491, s.tShirts3(499));
    }

    @Test
    public void tShirtsEquals500() {
        assertEquals(4000, s.tShirts3(500));
    }

    @Test
    public void tShirtsMoreThan500() {
        assertEquals(4008, s.tShirts3(501));
        assertEquals(8000, s.tShirts3(1000));
    }
}
