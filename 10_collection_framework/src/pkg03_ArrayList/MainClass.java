package pkg03_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainClass {

  /*
   * ArrayList 클래스
   * 1. 배열 리스트를 구현한 클래스이다.
   * 2. 실무에서는 배열 대신 사용한다.
   * 3. 배열의 특징을 그대로 가지고 있다.
   *    1) 순서대로 데이터가 저장된다.
   *    2) 인덱스를 가지고 있다.
   */
  
  public static void method1() {
    
    // ArrayList 선언 (사용가능타입 : Collection<E>, List<E>, )
    List<Integer> numbers;                // int[] numbers;
    
    // ArrayList 생성
    numbers = new ArrayList<Integer>();   // number = new int[10];
    
    // 요소 추가하기
    numbers.add(5);
    numbers.add(4);
    numbers.add(3);
    numbers.add(2);
    numbers.add(1);
    
    // 요소 가져오기
    System.out.println(numbers.get(0));
    System.out.println(numbers.get(1));
    System.out.println(numbers.get(2));
    System.out.println(numbers.get(3));
    System.out.println(numbers.get(4));
    
  }
  
  public static void method2() {
    
    List<String> hobbies = new ArrayList<String>();
    
    
    // 요소 추가하기
    hobbies.add("게임");
    hobbies.add("여행");
    hobbies.add("노래");
    hobbies.add("독서");
    hobbies.add("모임");
    
    // 저장된 요소의 개수
    System.out.println(hobbies.size());
    
    // for 문
    
    /*
     * 아래 for 문보다 더 밑에 있는 for문이 더 개선된 문장
    for(int i = 0; i < hobbies.size(); i++) {
      System.out.println(hobbies.get(i));
    }
    */
    
    for(int i = 0, size = hobbies.size(); i < size; i++) {
      System.out.println(hobbies.get(i));
    }
    
  }
  
  public static void method3() {

    // 배열을 ArrayList로 바꾸기
    Integer[] arr = new Integer[] {10, 20, 30};
    
    // 배열을 ArrayList로 바꿔서 반환하는 java.util.Arrays 클래스의 asList 메소드
    List<Integer> numbers = Arrays.asList(arr);
    
    // 주의!
    // numbers 는 길이를 변경할 수 없다. (추가, 삭제 불가)
    System.out.println(numbers.toString());
    System.out.println(numbers);              // toString 메소드 생략
    
  }
  
  public static void method4() {
    
    List<String> seasons = new ArrayList<String>();
    
    seasons.add("봄");
    seasons.add("여름");
    seasons.add("파인애플");
    seasons.add("피자");
    seasons.add("겨울");
    
    // 요소 수정하기
    seasons.set(2, "가을");
    
    // 요소 삭제하기
    String removeItem = seasons.remove(3);
    System.out.println(removeItem);
    
    System.out.println(seasons);
    
  }
  
  public static void main(String[] args) {

    method4();
    
  }

}
