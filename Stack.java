public class Stack<T> {
  private static class StackNode<T> {
    private T data;
    private StackNode<T> next;

    public StackNode(T data){
      this.data = data;
    }
  }

  private StackNode<T> top;

  public T pop() throws EmptyStackException{
    if (top == null) throw new EmptyStackException("Cannot pop since stack is Empty");
    T temp = top.data;
    top = top.next;
    return temp;
  }

  public void push(T data){
    StackNode<T> node = new StackNode<T>(data);
    node.next = top;
    top = node;
  }

  public T peek() throws EmptyStackException{
    if(top == null) throw new EmptyStackException("Cannot peek since stack is Empty");
    return top.data;
  }

  public boolean isEmpty(){
    return top == null;
  }

  public static void main(String[] args) throws EmptyStackException{
    Stack<Integer> myStack = new Stack<Integer>();
    myStack.push(3);
    myStack.push(5);
    myStack.push(9);
    myStack.push(8);
    System.out.println(myStack.peek());
    System.out.println(myStack.pop());
    System.out.println(myStack.pop());
    System.out.println(myStack.peek());
    System.out.println(myStack.isEmpty());
    System.out.println(myStack.pop());
    System.out.println(myStack.peek());
    System.out.println(myStack.pop());
    System.out.println(myStack.isEmpty());
    // System.out.println(myStack.peek());
    // System.out.println(myStack.pop());


  }
}
