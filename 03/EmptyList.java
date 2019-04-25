public class EmptyList implements LispList {
  public boolean empty() { return true; }; 
  public Object first() { return null; }
  public LispList rest() { return null; } 
  public static void main(String[] args) {
    EmptyList a = new EmptyList(); 
    System.out.println( a ); 
    System.out.println( a.first() ); 
    System.out.println( a.rest() ); 
    System.out.println( a.empty() ); // true 
    
  }
}