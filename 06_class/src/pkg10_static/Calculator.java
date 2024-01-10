package pkg10_static;

/*
 * 메모리 공간 할당 과정
 * 
 * 클래스 영역(메소드 영역) -> 스택 영역 -> 힙 영역
 * 클래스 로드                 변수         배열, 인스턴스(객체)
 * static                       
 */

/*
 * 클래스 멤버
 * 1. 클래스 영역에 저장되는 멤버이다.
 * 2. 인스턴스의 생성이 없어도 접근이 가능하다.
 * 3. 클래스 메소드에서는 클래스 멤버만 호출할 수 있다. 
 *    (인스턴스 멤버는 호출할 수 없다. = 인스턴스는 힙영역에 있음. 클래스 메소드 영역에는 힙영역에 있는 인스턴스가 없음. 그러므로 호출 불가)
 * 4. 호출 방법
 *    1) 클래스.멤버     - 추천
 *    2) 인스턴스.멤버   - 가능하지만 비추천
 *
 */

public class Calculator {

  // final : 상수(값을 바꿀 수 없다)
  // final static 객체는 public 으로 공개해도 된다. private 으로 외부로부터 접근을 막을 필요X
  public final static String maker = "samsung";
  
  // 클래스 메소드
  public static void add(int a, int b) {
     System.out.println(a + "+" + b + "=" + (a + b));
  }
  
}
