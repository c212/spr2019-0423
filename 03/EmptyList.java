public class EmptyList implements LispList {
  public boolean empty() { return true; }
  // https://docs.oracle.com/javase/8/docs/api/java/lang/UnsupportedOperationException.html
  public Object first() throws UnsupportedOperationException { 
    // Elle: it compiles without throws why is that? 
    throw new UnsupportedOperationException(); 
  }
  public LispList rest() throws UnsupportedOperationException { 
    throw new UnsupportedOperationException(); 
  } 
  public static void main(String[] args) {
    EmptyList a = new EmptyList(); 
    System.out.println( a ); 
    try { 
      System.out.println( a.first() );
    } catch (UnsupportedOperationException e) {
      System.out.println( "An empty list has no first." ); 
    }
    // System.out.println( a.rest() ); 
    System.out.println( a.empty() ); // true 
    
  }
}