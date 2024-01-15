package pkg03_interface_extends;

public class MainClass {

  public static void main(String[] args) {

    Elec elec = new SmartPhone();
    elec.powerOn();
    ((SmartPhone) elec).call();
    ((SmartPhone) elec).game();
    
    Computer computer = new SmartPhone();
    computer.powerOn();
    computer.game();
    ((SmartPhone) computer).call();
    
    Phone phone = new SmartPhone();
    phone.call();
    ((SmartPhone) phone).powerOn();
    ((SmartPhone) phone).game();
    
    SmartPhone smartphone = new SmartPhone();
    smartphone.call();
    smartphone.game();
    smartphone.powerOn();
    
    
  }

}
