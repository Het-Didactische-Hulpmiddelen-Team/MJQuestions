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
    public void tShirtsMoreThan10() {
        assertEquals(995, s.tShirts(100));
        assertEquals(105, s.tShirts(11));
        assertEquals(115, s.tShirts(12));
    }

    @Test
    public void tShirtsEquals10() {
        assertEquals(95, s.tShirts(10));
    }

    @Test
    public void tShirtsLessThan10() {
        assertEquals(50, s.tShirts(5));
        assertEquals(60, s.tShirts(6));
        assertEquals(90, s.tShirts(9));
    }


}
