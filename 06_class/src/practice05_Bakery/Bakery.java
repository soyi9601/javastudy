package practice05_Bakery;

public class Bakery {

  // field
  private int count;    // 빵개수
  public final static int PRICE = 500;    // 빵 가격
  private int money;
  
  
  // constructor
  public Bakery() {
    // TODO Auto-generated constructor stub
  }

  public Bakery(int count, int money) {
    super();
    this.count = count;
    this.money = money;
  }

  
  // method
  public int getCount() {
    return count;
  }

  public void setCount(int count) {
    this.count = count;
  }

  public int getMoney() {
    return money;
  }

  public void setMoney(int money) {
    this.money = money;
  }
  
  // 판매
  // 전달 받는 인자 : 돈, 구매 할 빵개수
  // 되돌려 줄 반환 : 잔돈, 구매한 빵개수 -> BreadChange 객체
  // 전달받는 인자(. , .) 반환은 1개로 해야함. 잔돈+구매한빵개수를 하나로 객체화 시킬 것
  
  // 여기서 BreadChange가 반환해줘야하는 값
  // return null --> 줄 빵이 없다. null을 반환해줘야함.
  public BreadChange sell(int money, int count) {
    
    // 판매할 빵이 없다.
    if(this.count < count) {
      System.out.println("빵이 부족하다.");
      return null;
    }
    
    // 잔돈이 부족하다.
    if(this.money < money - count * PRICE) {
      System.out.println("잔돈이 부족하다");
      return null;
    }
    
    // 고객이 낸 돈이 부족하다.
    if(count * PRICE > money) {
      System.out.println("돈 더주세요");
      return null;
    }
    
    // 판매처리하기
    this.money += count * PRICE;
    this.count -= count;
    
    // 반환
    return new BreadChange(count, money - count * PRICE);
    
  }
  
}
