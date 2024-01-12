package pkg07_polymorphism;

public class Person {

  public void powerOn(Elec elec) {    // Elec elec = new Tv() 또는 Elec elec = new Radio()
    
    // elec.powerOn();   // 호출이 되지 않으면 업캐스팅의 문제점 : 부모 타입의 메소드만 호출 할 수 있는데 지금

    
    /*
     * 1. 다운캐스팅으로 powerOn() 호출하기 -> 전자제품이 추가 될 때 마다 코드의 추가가 필요하므로 추천하지 않는다. 
     * if(elec instanceof Tv) { 
     * ((Tv) elec).powerOn(); 
     * } else if(elec instanceof Radio) {
     * ((Radio) elec).powerOn();
     */
    
    /*
     * 2. Elec에 powerOn() 메소드를 추가한다.
     */
    elec.powerOn();
    
    
    
  }
  
}
