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
  
}
