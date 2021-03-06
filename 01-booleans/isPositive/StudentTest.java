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
  public void isPositiveReturnsTrueIfPositive(){
    assertTrue(s.isPositive(10));
  }
  @Test
  public void isPositiveReturnsTrueIfZero(){
    assertTrue(s.isPositive(0));
  }
  @Test
  public void isPositiveReturnsFalseIfNegative(){
    assertFalse(s.isPositive(-20));
  }
}
