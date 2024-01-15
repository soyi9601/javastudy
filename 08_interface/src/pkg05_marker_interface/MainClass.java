package pkg05_marker_interface;

public class MainClass {

  public static void main(String[] args) {

    Person person = new Person();
    person.eat(new AppleMango());
    person.eat(new PineApple());
    person.eat(new Durian());
    
    DurianHatePerson durianhateperson = new DurianHatePerson();
    durianhateperson.eat(new AppleMango());
    durianhateperson.eat(new PineApple());
    // durianhateperson.eat(new Durian()); // 컴파일 오류 - 두리안을 아예 안받고 싶음
    
    
  }

}
