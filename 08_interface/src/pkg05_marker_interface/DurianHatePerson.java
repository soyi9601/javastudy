package pkg05_marker_interface;

public class DurianHatePerson {

  public void eat(Eatable eatable) {    // eatable을 포함하고 있는 객체만 .eat이 가능하게끔.
    ((Food) eatable).eat();       // Food 타입으로 캐스팅 -> 다운캐스팅 아님!
  }
  
  /*
  public void eat(Food food) {
    if(food instanceof Durian) {
      return;
    }
    food.eat();
  }
  */
  
}
