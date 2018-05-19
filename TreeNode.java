public class TreeNode {
  int data;
  TreeNode left;
  TreeNode right;

  public TreeNode(int data){
    this.data = data;
  }

  public void insert(int value){
    if(value <= this.data){
      if(this.left == null){
        this.left = new TreeNode(value);
      } else {
        this.left.insert(value);
      }
    } else {
      if (this.right == null){
        this.right = new TreeNode(value);
      } else {
        this.right.insert(value);
      }
    }
  }

  public boolean find(int value){
    if(value == this.data){
      return true;
    }
    if(value <= this.data){
      if (this.left == null){
        return false;
      } else {
        return this.left.find(value);
      }
    } else {
      if(this.right == null){
        return false;
      } else {
        return this.right.find(value);
      }
    }

  }

  public void inOrder(){
    if (this.left != null){
      this.left.inOrder();
    }
    System.out.print(this.data + " ");
    if (this.right != null){
      this.right.inOrder();
    }
  }

  public static void main(String[] args) {
    TreeNode root = new TreeNode(3);
    root.insert(2);
    root.insert(8);
    root.insert(15);
    root.insert(1);
    root.inOrder();
    System.out.println(root.find(8));
    System.out.println(root.find(1));
    System.out.println(root.find(-1));
    System.out.println(root.find(18));
    System.out.println(root.find(15));
  }

}
