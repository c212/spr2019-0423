public class NonEmptyList implements LispList {
  public boolean empty() { return false; }
  public Object first() { return null; }
  public LispList rest() { return null; }
  public static void main(String[] args) {
    NonEmptyList a; 
    a = new NonEmptyList(); 
    System.out.println( a ); 
    System.out.println( a.empty() ); 
    
  }
}