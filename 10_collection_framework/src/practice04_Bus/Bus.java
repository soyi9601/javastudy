package practice04_Bus;

import java.util.ArrayList;
import java.util.List;

public class Bus {

  // field
  private List<Seat> seats;
  public static final int LIMIT = 25;
  private int numOfPerson;
    

  // constructor
  public Bus() {
    
    seats = new ArrayList<Seat>(LIMIT);    
    for(int i = 0; i < LIMIT; i++) {
      seats.add(new Seat());        // 순차적으로 비어있는 seat에 추가를 해야하기 때문
    }
    
  }
  
  // 버스 타기(앞 자리부터 채우는 방식으로 앉기)
  public void on(Person person) throws RuntimeException {
    
    if(numOfPerson >= LIMIT) {
      throw new RuntimeException("만석");
    }
    
    for(int i =0; i < LIMIT; i++) {
      // 각 좌석을 의미
      Seat seat = seats.get(i);
      if(seat.getPerson() == null) {      // seats.get(i) : 의자, seats.get(i).getPerson() : 의자에 앉아있는 사람
        seat.setPerson(person);
        numOfPerson++;
        break;
      }
    }
    
  }
  
  //버스 내리기
   public void off(int seatNo) throws RuntimeException {
     if(seatNo <= 0 || seatNo > LIMIT) {
       throw new RuntimeException("좌석 번호가 잘못 전달되었습니다.");
     }
     seats.get(seatNo - 1).setPerson(null);
     numOfPerson--;
   }
   
   // 버스 탑승 명단
   public void info() {
     System.out.println("===== 탑승자 목록 확인 =====");
     for(int i = 0; i < LIMIT; i++) {
       // 각 좌석에 앉아 있는 사람
       Person person = seats.get(i).getPerson();
       if(person == null) {
         System.out.println(String.format("%02d", i + 1) + "번 좌석 : 비어 있음");
       } else {
         System.out.println(String.format("%02d", i + 1) + "번 좌석 : " + person.getName());
       }
     }
   }


  
  
  
}
