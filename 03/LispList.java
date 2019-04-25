public interface LispList {
  boolean empty(); 
  Object first();
  LispList rest(); 
}