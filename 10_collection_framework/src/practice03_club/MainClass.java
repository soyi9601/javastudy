package practice03_club;

public class MainClass {

  public static void main(String[] args) {

    Club club = new Club();
    
    // Person p1 = new Person("1");      : p1 생성함
    // club.leaveClub(p1);               : -> p1 생성했을 때
    // club.enterClub(new Person("1"));  : p1 생성하지 않으면 이렇게 만들어주면 됨
    
    Person p1 = new Person("1");
    Person p2 = new Person("2");
    Person p3 = new Person("3");
    Person p4 = new Person("4");
    Person p5 = new Person("5");
    
    club.enterClub(p1);
    club.enterClub(p2);
    club.enterClub(p3);
    club.enterClub(p3);
    club.enterClub(p3);
    club.enterClub(p4);
    club.enterClub(p5);
    club.enterClub(new Person("6"));
    club.enterClub(new Person("6"));
    
    club.leaveClub(p1);
    
    club.poolList();
    
    
  }

}
