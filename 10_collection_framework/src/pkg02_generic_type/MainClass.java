package pkg02_generic_type;

public class MainClass {

  public static void main(String[] args) {

    // Integer 저장용 Container
    Container<Integer> container1 = new Container<Integer>();
    container1.setItem(10);
    System.out.println(container1.getItem());
    
    
    // String 저장용 Container
    Container<String> container2 = new Container<>();         // 생성자에서 <>안에 내용은 생략 가능
    container2.setItem("Hello");
    System.out.println(container2.getItem());
    
    
  }

}
