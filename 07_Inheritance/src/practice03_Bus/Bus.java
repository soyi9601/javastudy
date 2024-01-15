package practice03_Bus;

public class Bus {

  
  // field
  private Seat[] seats;
  private int numOfPerson;
  
  
  // constructor
  public Bus() {
    seats = new Seat[25];
    for(int i = 0; i < seats.length; i++) {
      seats[i] = new Seat();
    }
  }
  
  public void on(Person person) {
    if(numOfPerson >= seats.length) {
      System.out.println("만석");
      return;
    }
    for(int i =0; i < seats.length; i++) {
      if(seats[i].getPerson() == null) {
        seats[i].setPerson(person);
        numOfPerson++;
        break;
      }
    }
  }
  
  
}
