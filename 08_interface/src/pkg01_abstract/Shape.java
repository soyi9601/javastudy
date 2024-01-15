package pkg01_abstract;

/*
 * 추상 클래스
 * 1. 추상 메소드를 가지고 있는 클래스이다.
 * 2. 추상 클래스는 객체 생성이 불가능하다.
 *    1) 익명 내부 타입(Anonymous Inner Type) 으로 생성할 수 있다.
 *    2) 익명 내부 타입은 객체를 생성할 때 추상 메소드를 곧바로 오버라이드해서 만드는 것을 의미한다.
 * 3. 형식
 *    abstract class 클래스명{}
 */

public abstract class Shape {

  // field
  private String name;
  
  // constrictor
  public Shape() {
    // TODO Auto-generated constructor stub
  }
  public Shape(String name) {
    super();
    this.name = name;
  }

  // method
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }
  
  // !공통 메소드는 부모-자식 간에서는 부모에 넣자!
  
  // 본문이 필요하지 않은 메소드 : return 값이 현재 없음. 하지만 안적으면 컴파일 오류가 나기 때문에 0이라고 적음.
  
  
  /*
   * 추상 메소드
   * 1. 본문이 없는 메소드이다.
   * 2. 형식
   *    abstract 반환타입 메소드명(매개변수) {}  <--- 원래 이렇게 적어야하지만 본문이 없으므로
   *    abstract 반환타입 메소드명(매개변수); 로 작성
   */
  
  
  //넓이를 반환하는 메소드
  /*
   public double getArea() {
    return 0;
  }
  */
  public abstract double getArea();
  
  // 둘레 길이를 반환하는 메소드
  /*
  public double getCircum() {
    return 0;
  }
  */
  public abstract double getCircum();
  
  
}
