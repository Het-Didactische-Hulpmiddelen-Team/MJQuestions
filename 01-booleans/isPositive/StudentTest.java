import org.junit.Test;
import static org.junit.Assert.*;

public class StudentTest {
  
  @Test
  public void isPositiveReturnsTrueIfPositive(){
    assertTrue(student.isPositive(10));
  }
  @Test
  public void isPositiveReturnsTrueIfZero(){
    assertTrue(student.isPositive(0));
  }
  @Test
  public void isPositiveReturnsFalseIfNegative(){
    assertFalse(student.isPositive(-20));
  }
}
