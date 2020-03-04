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
    public void repeatTestZero() {
        assertEquals(repeat("test", 0), s.repeat("test", 0));
    }

    @Test
    public void repeatTest() {
        String test = "test";
        for (int i = 0; i < 100; i++) {
            assertEquals(repeat(test+i, 0), s.repeat(test+i, 0));
        }
    }

    private String repeat(String s, int n)
    {
        String r = "";
        for (int i = 0; i != n; ++i) {
            r += s;
        }
        return r;
    }

}