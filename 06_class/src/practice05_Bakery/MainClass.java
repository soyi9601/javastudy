package practice05_Bakery;

public class MainClass {

  public static void main(String[] args) {
    
    Bakery bakery = new Bakery();
    Customer customer = new Customer();
    
    bakery.sell(10, 10000);
    customer.buy(bakery, 5, 5000);

  }

}
