import org.junit.Before;
import org.junit.After;
import org.junit.Test;

import static org.junit.Assert.*;

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
  public void inIntervalReturnsTrueIfBetween(){
    assertTrue(s.inInterval(5, 0 , 10));
  }
  @Test
  public void inIntervalReturnsTrueIfSameAsBottomValue(){
    assertTrue(s.inInterval(0,0,10));
  }
  @Test
  public void inIntervalReturnsFalseIfHigherThanTopValue(){
    assertFalse(s.inInterval(20,0,10));
  }
}
