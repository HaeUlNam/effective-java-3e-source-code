package effectivejava.chapter5.item29;

public class client {

  public static void main(String[] args) {
    StackUsingObject stackUsingObject = new StackUsingObject();
    stackUsingObject.push(1);
    stackUsingObject.push("abcString");

    Integer a = (Integer) stackUsingObject.pop();
  }

}
