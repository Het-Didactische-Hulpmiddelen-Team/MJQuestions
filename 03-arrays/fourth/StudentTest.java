
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
    public void fourth() {
        assertEquals(12, s.fourth(new int[]{5,1,2,12,4}));
        assertEquals(9, s.fourth(new int[]{0,1,2,9,4,5}));
        assertEquals(7, s.fourth(new int[]{8,1,2,7}));
        assertEquals(4, s.fourth(new int[]{9,1,2,4,4,1}));
        assertEquals(1, s.fourth(new int[]{1,1,1,1,1,1}));
    }

}
