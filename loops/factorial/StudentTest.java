import loops.factorial.Student;
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
        public void factorialTest() {
            for (int i = 0; i < 100; i++) {
                assertEquals(factorial(i), s.factorial(i));
            }

        }

        private int factorial(int n) {
            int result = 1;
            while (n > 0) {
                result *= n;
                n--;
            }
            return result;
        }
    }