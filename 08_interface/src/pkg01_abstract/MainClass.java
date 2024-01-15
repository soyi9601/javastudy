package pkg01_abstract;

public class MainClass {

  public static void main(String[] args) {

    // 자식 객체를 부모타입으로 upcasting(자동 변환) 한 것.
    Shape shape1 = new Circle("원", 0, 0, 1.5);
    Shape shape2 = new Rectangle("사각형", 0, 0, 5, 5);
    
    // 업캐스팅된 객체(자식 객체)는 부모의 메소드만 호출할 수 있다. -> Circle의 메소드가 불러와지지 않음.
    System.out.println(shape1.getName());
    System.out.println(shape2.getName());
    
    // 업캐스팅된 객체(자식 객체)의 메소드는 다운캐스팅 후 호출할 수 있다.
    // shape1이 Circle이 맞다면
    if(shape1 instanceof Circle) {
      System.out.println( ((Circle) shape1).getX() );
      System.out.println( ((Circle) shape1).getName() );
      System.out.println( ((Circle) shape1).getRadius() );
    }
    
    // instanceof 쓰면 sysout 없을 때는 shape2.get 까지 하면 Rectangle의 메소드를 보여주면서 자동완성 가능.
    if(shape2 instanceof Rectangle) {
      System.out.println(((Rectangle) shape2).getX1());
      System.out.println(((Rectangle) shape2).getX2());
      System.out.println(((Rectangle) shape2).getY1());
    }
    
    System.out.println("넓이 : " + shape1.getArea());
    System.out.println("둘레 : " + shape1.getCircum());
    System.out.println("넓이 : " + shape2.getArea());
    System.out.println("둘레 : " + shape2.getCircum());
    
  }

}
