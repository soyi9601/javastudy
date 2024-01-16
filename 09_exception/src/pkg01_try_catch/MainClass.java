package pkg01_try_catch;

public class MainClass {

  public static void method1() {
    
    // 예외 처리가 발생하는 상황
    String userInput = "12.3";
    
    int number = Integer.parseInt(userInput);
    System.out.println(number);
    
  }
  
  public static void method2() {
    
    // 예외 처리 : try - catch
    try {
      String userInput = "12.3";
      
      int number = Integer.parseInt(userInput);
      System.out.println(number);
    } catch (NumberFormatException e) {
      
      System.out.println("정수만 입력하세요");
      
    }
    
  }

  public static void method3() {
    
    String[] userInputs = {"10", "20", "1.5", "2.5", "30"};
    
    for(int i = 0; i < userInputs.length; i++) {
      try {
        int number = Integer.parseInt(userInputs[i]);
        System.out.println(number);
      } catch (NumberFormatException e) {
        System.out.println(userInputs[i] + "는 정수가 아닙니다");
      }
      // 실행하고싶은 코드는 try 에 넣고 예외처리는 catch 블록에 하나씩 넣으면 됨
    }
  }
  
  public static void method4() {
    
    // 다중 catch 블록
    String[] userInputs = {"10", "20", "15", "25", "30"};
    
    try {
      for(int i = 0; i < 6; i++) {
        int number = Integer.parseInt(userInputs[i]);
        System.out.println(number);
      }
    } catch(ArrayIndexOutOfBoundsException e) {
      System.out.println("사용할 수 없는 인덱스가 사용되었습니다.");
    } catch(RuntimeException e) {
      System.out.println("정수만 처리할 수 있습니다");
    }    
  }     // catch 다중 블록은 꼭 자식 -> 부모 순으로 배치해야함!! 부모자식관계가 아니면 상관없음
  
  public static void main(String[] args) {

    method4();
    
  }

}
