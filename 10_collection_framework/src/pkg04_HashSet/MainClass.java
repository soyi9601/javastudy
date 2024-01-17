package pkg04_HashSet;

import java.util.HashSet;
import java.util.Set;

public class MainClass {
  
  public static void method1() {
    
    /*
     * HashSet 타입 선언
     */
    Set<String> hobbies;
    
    // HashSet 객체 생성
    hobbies = new HashSet<String>();
    
    // 요소 추가하기 (순서 없이 저장되고, 중복 저장이 불가능하다.)
    hobbies.add("수영");
    hobbies.add("수영");
    hobbies.add("수영");
    hobbies.add("여행");
    hobbies.add("모임");
    hobbies.add("요리");
    hobbies.add("영화");
    hobbies.add("운동");
    
    // advances for 문
    for(String hobby : hobbies) {
      System.out.println(hobby);
    }
    
  }

  public static void main(String[] args) {

    method1();
    
  }

}
