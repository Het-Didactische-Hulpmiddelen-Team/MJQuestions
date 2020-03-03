import org.junit.Test;
import static org.junit.Assert.*;

public class studentTest {
  
  @Test
  public void inIntervalReturnsTrueIfBetween(){
    assertTrue(student.inInterval(5, 0 , 10));
  }
  @Test
  public void inIntervalReturnsTrueIfSameAsBottomValue(){
    assertTrue(student.inInterval(0,0,10));
  }
  @Test
  public void inIntervalReturnsFalseIfHigherThanTopValue(){
    assertFalse(student.inInterval(20,0,10));
  }
}
