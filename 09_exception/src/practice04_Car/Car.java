package practice04_Car;

public class Car {

  // field
  private Driver driver;
  private int currSpeed;
  private int fuel;
  public final static int MAX_SPEED = 100;
  
  
  // construct
  public Car() {
    // TODO Auto-generated constructor stub
  }

  public Car(Driver driver, int currSpeed, int fuel) {
    super();
    this.driver = driver;
    this.currSpeed = currSpeed;
    this.fuel = fuel;
  }

  
  //static 은 get.set 호출 안함. -> Car.MAX_SPEED 라고 호출하면 됨
  public Driver getDriver() {
    return driver;
  }

  public void setDriver(Driver driver) {
    this.driver = driver;
  }

  public int getCurrSpeed() {
    return currSpeed;
  }

  public void setCurrSpeed(int currSpeed) {
    this.currSpeed = currSpeed;
  }

  public int getFuel() {
    return fuel;
  }

  public void setFuel(int fuel) {
    this.fuel = fuel;
  }
  
  public void enginStart() {
    if(driver == null || fuel == 0) {
      System.out.println("시동 실패");
    } else {
      System.out.println("시동 성공");
    }
  }
  
  // 1초당 10씩 속도가 증가하는 accelerator
  // 1초당 1씩 연료가 줄어드는 accelerator
  public void acclerator(int pushTime) {
    
    if(currSpeed == MAX_SPEED ) {
      System.out.println("이미 최고속도입니다.");
      return;
    }
    if(fuel == 0) {
      System.out.println("연료가 없습니다");
      return;
    }
    
    if(pushTime <= 0) {
      System.out.println("acceleator를 잘 밟으세요");
      return;
    }
    
    // currSpeed += (pushTime * 10);
    //1초당 n씩 속도가 증가하는 accelerator(bestDriver는 10, 아니면 5씩)
    int n = driver.isBestDriver() ? 10 : 5;
    currSpeed += (pushTime * n); 
    // currSpeed += (pushTime * driver.isBestDriver() ? 10 : 5); 
    currSpeed = Math.min(currSpeed, MAX_SPEED);
    /*  현재속도와 MAX_SPEED중에 최소값을 고르겠다. 밑에 수식을 Math.min으로 쓸 수 있음.
    if(currSpeed > MAX_SPEED) {
      currSpeed = MAX_SPEED;
    }
    */
    
    
    fuel -= pushTime;
    fuel = Math.max(fuel, 0);
    // fuel 값을 0보다 큰것으로 고르겠다. Math.max 수식 쓸 수 있음
    
    System.out.println("현재 연료량 : " + fuel + ", 현재속도 : " + currSpeed);
    
  
    
  }
  
  
  // 1초당 10씩 속도가 줄어드는 brake
  public void brake(int pushTime) {
    
    if(currSpeed == 0) {
      System.out.println("속도가 0이다");
      return;
    }
    if(pushTime <= 0) {
      System.out.println("brake 를 잘 밟으세요");
      return;
    }
    
    currSpeed -= (pushTime * 10);
    currSpeed = Math.max(currSpeed, 0);
    
    System.out.println("현재 연료량 : " + fuel + ", 현재속도 : " + currSpeed);
    
  }
  
}
