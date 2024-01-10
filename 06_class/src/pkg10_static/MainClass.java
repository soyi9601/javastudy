package pkg10_static;

public class MainClass {

  public static void main(String[] args) {

    // 클래스 멤버 호출 : 클래스.멤버
    
    System.out.println(Calculator.maker); // maker : 필드
    
    Calculator.add(1, 3);                 // add : 메소드
  }

}
