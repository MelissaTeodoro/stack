public class Stack {

  private Object element;
  private Long quantity = 0L;

  public boolean isEmpty() {
    return element == null;
  }

  public Long size() {
    return this.quantity;
  }

  public void push(final Object element) {
    this.element = element;
    this.quantity++;
  }

  public Object top() {
    return element;
  }
}
