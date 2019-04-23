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
    BST<Integer> a = new BST<Integer>();  
    System.out.println( a ); // expect: 
    System.out.println( a.print() ); // expect: 
    a.insert( 8 ); 
    System.out.println( a ); // expect: 8
    System.out.println( a.print() ); // expect: 
    a.insert( 3 ); 
    System.out.println( a ); // expect: 3 8 
    System.out.println( a.print() ); // expect: 
    a.insert( 1 ); 
    System.out.println( a ); // expect: 1 3 8 
    System.out.println( a.print() ); // expect: 
    a.insert( 6 ); 
    System.out.println( a ); // expect: 1 3 6 8 
    System.out.println( a.print() ); // expect: 
    a.insert( 4 ); 
    System.out.println( a ); // expect: 1 3 4 6 8 
    System.out.println( a.print() ); // expect: 
    a.insert( 10 ); 
    System.out.println( a ); // expect: 1 3 4 6 8 10  
    System.out.println( a.print() ); // expect: (8 (3 (1  . .) (6 (4  . .) . )) (10  . .))
                                             // (8 (3 (1 ()()) (6 (4 ()()) ())) (10 ()())) 
 
  }
}