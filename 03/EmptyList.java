public class EmptyList implements LispList {
  public boolean empty() { return false; }; 
  public Object first() { return null; }
  public LispList rest() { return null; } 
}