
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
    public void last() {
        assertEquals(4, s.last(new int[]{5,1,2,12,4}));
        assertEquals(5, s.last(new int[]{0,1,2,9,4,5}));
        assertEquals(7, s.last(new int[]{8,1,2,7}));
        assertEquals(1, s.last(new int[]{9,1,2,4,4,1}));
        assertEquals(1, s.last(new int[]{1,1,1,1,1,1}));
    }

}
