package practice02_BankAccout;

public class BankAccount {

  // field
  private String accNo;
  private long balance;
  
  public BankAccount() {
    this.accNo = "";
    this.balance = 0;
  }
  
  public BankAccount(String accNo, long balance) {
    this.accNo = accNo;
    this.balance = balance;
  }
  

  public String getAccNo() {
    return accNo;
  }
  public void setAccNo(String accNo) {
    this.accNo = accNo;
  }
  
  public long getBalance() {
    return balance;
  }
  public void setBalance(long balance) {
    this.balance = balance;
  }
  
//  public void deposit(long money) {
//    if(money <= 0) {
//      System.out.println(money + "실패");
//    } else {
//      balance += money;
//      System.out.println( balance + "성공");
//    }
//  }
  
  public void deposit(long money) throws RuntimeException {
    
    if(money <= 0) {
      throw new RuntimeException(money + "원 입금 불가");
    }
    
    balance += money;
    
  }
  
/*
  public void deposit(long money) {
    if(money <= 0) {
      System.out.println("X");
    } else {
      balance += money;
      System.out.println(balance + "성공");
    }
  }
  */
  
  /*
   if(money <= 0) {
    System.out.println(depositMoney + "실패");
    return;
  } 

*/
  
  public long withdrawal(long money) throws RuntimeException {
    
    if(money <= 0) {
      throw new RuntimeException(money + "원 출금 불가");
    }
    if(money > balance) {
      throw new RuntimeException("잔액 부족");
    }
    
    balance -= money;
    return money;
    
  }
  
  /*
  public long withdrawal(long money) {
    if(money <= 0) {
      return 0L;
    }
    if(balance < money) {
      System.out.println("실패");
      return 0L;
    } else {
      balance -= money;
      return money;
    }
  }
  */
  
  public void transfer(BankAccount account, long money) throws RuntimeException {
    
    // 내 통장에서 출금 -> 출금된 금액이 반환 -> 네 통장에 입금
    
    // 내 통장에서 출금
    // long a = withdrawal(money);
    // 
    
    // 네 통장에 입금
    // account.deposit(a);
    
    account.deposit(withdrawal(money));
    
    /*
    long yourmoney =0;
    if(balance < money) {
      System.out.println("실패");
    } else {
      balance -= money;
      
      
      yourmoney = account.getBalance();
      yourmoney += money;
      
      account.setBalance(yourmoney);
      
      System.out.println(balance + "내돈" + yourmoney );
      
    }
    */
    
    
    
  }
  
}
