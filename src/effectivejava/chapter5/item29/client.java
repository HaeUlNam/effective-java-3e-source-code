package effectivejava.chapter5.item29;

public class client {

  public static void main(String[] args) {
    stackUsingObjectCode();
    
  }


  /**
   * 스택을 Object로 만들었을 때 ClassCastException 발생
   */
  public static void stackUsingObjectCode() {
    StackUsingObject stackUsingObject = new StackUsingObject();
    stackUsingObject.push(1);
    stackUsingObject.push("abcString");

    Integer a = (Integer) stackUsingObject.pop(); // 에러 나는 부분
  }

}
