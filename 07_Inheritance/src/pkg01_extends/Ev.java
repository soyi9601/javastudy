package pkg01_extends;

// class 자식 extends 부모 {}
// class 서브 extends 슈퍼 {}
// 부모에 있는 요소를 다 가져올 순 있으나 private 은 가져올 수 없음.

public class Ev extends Car {

  public void charge() {
    // System.out.println(model);
    System.out.println(maker);
    System.out.println("충전");
  }
  
}
