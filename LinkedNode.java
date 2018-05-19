public class LinkedNode {
  int data;
  LinkedNode next;

  public LinkedNode(int value){
    this.data = value;
  }

  public void insert(int value){
    if (this.next == null){
      LinkedNode new_node = new LinkedNode(value);
      this.next = new_node;
    } else {
      this.next.insert(value);
    }
  }

  public boolean find(int value){
    if(this.data == value){
      return true;
    } else {
      if (this.next == null){
        return false;
      } else {
        return this.next.find(value);
      }
    }
  }

  public void printList(){
    System.out.print(this.data + " ");
    if(this.next != null){
      this.next.printList();
    }
  }

  public LinkedNode delete(LinkedNode head, int value){
    LinkedNode n = head;

    if(n.data == value){
      return head.next; // moved head
    }

    while(n.next != null){
      LinkedNode prev = n;
      n = n.next;
      if(n.data == value){
        prev.next = n.next;
        return head;
      }
    }
    return head;
  }

  public static void main(String[] args) {
    LinkedNode root = new LinkedNode(3);
    root.insert(5);
    root.insert(12);
    root.insert(18);
    root.printList();
    System.out.println(root.find(18));
    System.out.println(root.find(1));
    System.out.println(root.find(6));
    root = root.delete(root, 12);
    root.printList();
    System.out.println(root.find(12));
    root = root.delete(root, 3);
    root.printList();
  }
}
