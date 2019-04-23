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
  public int size() {
    if (this.root == null) return 0; 
    else return 1 + this.root.left.size() + this.root.right.size(); 
  }
  public T find(int k) { // k is 0 based 
    // System.out.println("Looking for element index " + k + " in tree " + this.print()); 
    if (k < 0) return null; 
    else if (k >= this.size()) return null; 
    else if (k < this.root.left.size()) return this.root.left.find(k);  
    else if (k == this.root.left.size()) return this.root.value;  
    else // if k > this.root.left.size() 
      return this.root.right.find( k - this.root.left.size() - 1); 
  }
  
  public static void main(String[] args) {
    BST<Integer> a = new BST<Integer>();  
    a.insert( 8 ); 
    a.insert( 3 ); 
    a.insert( 1 ); 
    a.insert( 6 ); 
    a.insert( 4 ); 
    a.insert(10 ); 
    a.insert( 7 ); 
    a.insert(14); 
    a.insert(13 ); 
    System.out.println( a ); // expect: 1 3 4 6 7 8 10 13 14 
    System.out.println( a.find(3) ); // 6
    System.out.println( a.find(7) ); // 13
    System.out.println( a.find(-2) ); // null 
    System.out.println( a.find(10) ); // null 
  }
}
