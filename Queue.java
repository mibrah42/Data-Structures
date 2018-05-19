public class Queue<T> {
  private static class QueueNode<T> {
    private T data;
    private QueueNode<T> next;

    public QueueNode(T data){
      this.data = data;
    }
  }

  private QueueNode<T> first;
  private QueueNode<T> last;

  public void enqueue(T data) {
    QueueNode<T> new_node = new QueueNode<T>(data);
    if(last != null){
      last.next = new_node;
    }
    last = new_node;
    if (first == null){
      first = last;
    }
  }

  public T dequeue() throws NoSuchElementException{
    if (first == null) throw new NoSuchElementException("queue is empty");
    T temp = first.data;
    first = first.next;
    if (first == null){
      last = null;
    }
    return temp;
  }

  public T peek() throws NoSuchElementException{
    if (first == null) throw new NoSuchElementException("queue is empty");
    return first.data;
  }

  public boolean isEmpty(){
    return first == null;
  }

  public static void main(String[] args) throws NoSuchElementException{
    Queue<Integer> myQueue = new Queue<Integer>();
    myQueue.enqueue(3);
    myQueue.enqueue(7);
    myQueue.enqueue(2);
    myQueue.enqueue(6);
    System.out.println(myQueue.dequeue());
    System.out.println(myQueue.dequeue());
    System.out.println(myQueue.peek());
    System.out.println(myQueue.dequeue());
    System.out.println(myQueue.isEmpty());
    System.out.println(myQueue.dequeue());
    System.out.println(myQueue.isEmpty());
    // System.out.println(myQueue.peek());
    // System.out.println(myQueue.dequeue());
  }
}
