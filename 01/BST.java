public class BST<T extends Comparable<T>> {
  private Node<T> root;
  public BST() {
    this.root = null;
  }
  public BST(Node<T> node) {
    this.root = node;
  }
  public BST(T value) {
    this.root = new Node<T>(value);
  }
  public void insert(T value) {
    if (this.root == null)
      this.root = new Node<T>(value);
    else if (this.root.value().compareTo(value) > 0)
      this.root.left.insert(value);
    else if (this.root.value().compareTo(value) < 0)
      this.root.right.insert(value);
  }
  public String print() {
    if (this.root == null) return "()";
    else return "(" + this.root.print() + ")";
  }
  public String toString() {
    return this.root == null ? "" : this.root + "";
  }
  public static void main(String[] args) {
     
  }
}
