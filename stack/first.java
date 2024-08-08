import java.util.ArrayList;

public class first {
  static class stack{
    static ArrayList<Integer> stack = new ArrayList<>();

    public static boolean isEmpty(){
      return stack.size() == 0;
    }

    // push operation
    public static void Push(int data){
      stack.add(data);
    }

    // pop operation
    public static void Pop(){
      if (!isEmpty()) {
        stack.remove(stack.size() - 1);
      }
    }

    // peek operation
    public static int Peek(){
      if (!isEmpty()) {
        return stack.get(stack.size() - 1);
      }
      throw new IllegalStateException("Stack is empty");
    }
  }

  public static void main(String[] args) {
    System.out.println("Welcome to the stack");

    stack s = new stack();
    s.Push(1);
    s.Push(2);
    s.Push(3);
    s.Push(4);

    // Print the stack
    while (!s.isEmpty()) {
      System.out.println(s.Peek());
      s.Pop();
    }
    System.out.println("Finish");
  }
}
