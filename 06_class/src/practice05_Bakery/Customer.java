package practice05_Bakery;

public class Customer {

  // field
  private int money;
  private int count;      // 빵을 저장할 변수. 저장해야함. 안하면 빵을 받을 수 없음.
  
  
  // constructor
  public Customer() {
    // TODO Auto-generated constructor stub
  }


  public Customer(int money, int count) {
    super();
    this.money = money;
    this.count = count;
  }

  //method
  public int getMoney() {
    return money;
  }


  public void setMoney(int money) {
    this.money = money;
  }


  public int getCount() {
    return count;
  }


  public void setCount(int count) {
    this.count = count;
  }
  
  // 구매
  // 인자 : 구매할 가게, 구매할 빵 개수, 구매할 때 낼 돈
  // 반환 : 없음
  
  public void buy(Bakery bakery, int count, int money) {
    
    // XXXXX 붕어빵 집에서 판매를 하지 않았을 때 상황은 고려 XXXXX. 내 상황만 생각해서 적으면 됨
    // 가진 돈이 부족하다.
    if(this.money < money) {
      System.out.println("가진 돈이 부족하다.");
      return;
    }
    
    // 구매 (곧 Bakery 의 판매를 의미함.)
    BreadChange breadChange = null;
    if(bakery != null) {
      breadChange = bakery.sell(money, count);
    }
    //BreadChange breadChange = bakery.sell(money, count);
    
    
    // 구매 결과 처리
    if(breadChange != null) {
      count += breadChange.getBread();
      money += breadChange.getChange();
      this.money -= money;
    }
    
  }
  
  
}
