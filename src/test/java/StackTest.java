import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StackTest {

  @Test
  public void testEmptyWhenStackIsEmpty() {
    //given
    final Stack stack = new Stack();

    //then
    Assertions.assertTrue(stack.isEmpty());
    Assertions.assertEquals(0, stack.size());
  }

  @Test
  public void testPushElementSuccessfully() {
    //given
    final Stack stack = new Stack();
    final String firstElement = "First";

    //when
    stack.push(firstElement);

    //then
    Assertions.assertFalse(stack.isEmpty());
    Assertions.assertEquals(1, stack.size());
    Assertions.assertEquals(firstElement, stack.top());
  }

}
