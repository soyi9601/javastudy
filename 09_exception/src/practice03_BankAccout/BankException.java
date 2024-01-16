package practice03_BankAccout;

public class BankException extends Exception {

  // field
  private int errorCode;
  
  public BankException(int errorCode) {
    this.errorCode = errorCode;
  }
  public BankException(String message, int errorCode) {
    super();
    this.errorCode = errorCode;
  }

  public int getErrorCode() {
    return errorCode;
  }

  public void setErrorCode(int errorCode) {
    this.errorCode = errorCode;
  }
  
}
