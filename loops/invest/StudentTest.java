import loops.invest.Student;
import org.junit.Before;
import org.junit.After;
import org.junit.Test;

import java.sql.PreparedStatement;

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
    public void investTest() {
        for (int i = 1000; i < 10000; i += 100) {
            assertEquals(invest(i), s.invest(i));
        }

    }

    private int invest(int g) {
        int b = 1000;
        int y = 0;
        while (b < g) {
            b *= 1.05;
            y++;
        }
        return y;
    }

}