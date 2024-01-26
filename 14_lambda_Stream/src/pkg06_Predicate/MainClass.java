package pkg06_Predicate;

import java.util.function.Predicate;

public class MainClass {
  
  /*
   * java.util.function.Predicate
   * 
   * 1. 형식
   *    public interface Predicate<T> {    // return 타입은 boolean으로 정해져있음 -> 파라미터만 전달하면 됨
   *        boolean test(T t);
   *    }
   *    
   * 2. 파라미터 O, 반환 O boolean 형식의 test() 메소드를 지원하는 함수형 인터페이스이다.
   */

  public static void method1() {
    
    // Predicate<Integer> isEvenNumber = (number) -> { return number % 2 == 0; };
    Predicate<Integer> isEvenNumber = (number) -> number % 2 == 0;
    if(isEvenNumber.test(5)) {
      System.out.println("짝수");
    } else {
      System.out.println("홀수");
    }
    
  }
  
  public static void method2(Predicate<Integer> predicate, int number) {
    
    if(predicate.test(number)) {
      System.out.println("짝수");
    } else {
      System.out.println("홀수");
    }
    
  }
  
  public static void main(String[] args) {

    method1();
    method2( (number) -> number % 2 == 0, 4);
    
  }

}
