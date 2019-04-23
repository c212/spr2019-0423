public class EmptyList implements LispList {
  public boolean empty() {
    return true; 
  }
  public static void main(String[] args) {
    LispList a = new EmptyList(); 
    System.out.println( a.empty() ); // true
  }
}