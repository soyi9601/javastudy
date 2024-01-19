package practice03_Employee;

public class MainClass {

  public static void main(String[] args) {

    Company company = new Company("Samsung");
    
    // new CompanyHandler(company) 객체
    new CompanyHandler(company).manage();
    
  }

}
