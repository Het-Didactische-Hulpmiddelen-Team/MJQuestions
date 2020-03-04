import org.junit.Before;
import org.junit.After;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StudentTest {

    private Student student;

    @Before
    public void setUp(){
        student = new Student();
    }

    @After
    public void tearDown(){
        student = null;
    }
    
    @Test
    public void formatTimeTest() {
        for (int h = 0; h < 24; h++) {
            for (int m = 0; m < 60; m++) {
                for (int s = 0; s < 60; s++) {
                    assertEquals(formatTime(h, m, s), student.formatTime(h, m, s));
                }
            }
        }
    }

    private String formatTime(int h, int m, int s) {
        return h + ":" + m + ":" + s;
    }

}