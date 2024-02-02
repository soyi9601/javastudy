package practice02_Lotto;

import java.util.Scanner;

public class Lotto {

  /**
   * 로또 구매
   * 로또 구매를 위해서 사용자로부터 money를 입력 받는 메소드
   * 로또 구매 비용은 최소 1000, 최대 100000이다.
   * @return money   사용자가 입력한 로또 구매 비용에서 1000 미만 단위는 버리고 반환. ex) 5999 입력 시 5000 반환
   * @return 0       로또 구매 실패 시 반환
   */
  
  public int buyLotto() {
    
    Scanner sc = new Scanner(System.in);
    System.out.println("얼마?");
    int money = sc.nextInt();
    
    
    
    return money;
    
    
  }
  
}
