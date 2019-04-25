public class NonEmptyList implements LispList {
  public NonEmptyList(Object first, LispList rest) {
    this.first = first;
    this.rest = rest; 
  }
  public String toString() {
    return this.first + ", " + this.rest;  
  }
  private Object first; // head
  private LispList rest; // tail
  public boolean empty() { return false; }
  public Object first() { return null; }
  public LispList rest() { return null; }
  public static void main(String[] args) {
    LispList a;
    a = new NonEmptyList("Julia", new EmptyList()); 
    System.out.println( a ); 
    a = new NonEmptyList("Kendall", a); 
    System.out.println( a ); 
    a = new NonEmptyList( "Sultan", new NonEmptyList( "Alex", new NonEmptyList( "Julia", new EmptyList() ) ) );
    System.out.println( a ); 
  }
}