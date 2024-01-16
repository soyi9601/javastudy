package practice03_BankAccout;

public class DepositException extends BankException {

  public DepositException(int errorCode) {
    super(errorCode);
  }
  public DepositException(String message, int errorCode) {
    super(message, errorCode);
  }
  
}
