package practice01_BankAccount;

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
  
  public void deposit(long money) {
    if(money <= 0) {
      System.out.println(money + "실패");
    } else {
      balance += money;
      System.out.println( balance + "성공");
    }
  }
  
  /*
   if(money <= 0) {
    System.out.println(depositMoney + "실패");
    return;
  } 

*/
  
  public long withdrawal(long money) {
    if(money <= 0) {
      System.out.println(money + "출금불가");
      return 0L;
    }
    if(money > balance) {
      System.out.println("잔액부족");
      return 0L;
    }
    
    balance -= money;
    return money;
  }
  
  public void transfer(BankAccount account, long money) {
    
    // 내 통장에서 출금 -> 출금된 금액이 반환 -> 네 통장에 입금
    
    // 내 통장에서 출금
    // long a = withdrawal(money);
    
    // 네 통장에 입금
    // account.deposit(a);
    
    account.deposit(withdrawal(money));
    
    
  }
  
}
