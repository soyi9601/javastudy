package pkg03_ont_practice;

public class MainClass {

  
  public static void method1() {
    
     // 월에 따른 계절 출력하기
     int month = 7;
     String[] seasons = new String[] {"겨울", "봄", "여름", "가을" };
     
     
     // 코드 한줄만 추가하기
     System.out.println(seasons[month % 12 / 3]);
        
     /*
      * month     month % 12  month % 12 / 3
      * 12~2      0~2         0
      * 3~5       3~5         1
      * 6~8       6~8         2
      * 9~11      9~11        3
      * 
      */
     
  }
  
  public static void method2() {
    // 4일은 목요일, n일 후는 무슨 요일?
    
    int day = 4;      // 4일은 목요일
    int nDay = 10;    // nDay일 후
    String[] weekNames = new String[] {"일", "월", "화", "수", "목", "금", "토"}; // 요일 (월~일)
    
    // day의 nDay일 후
    day += nDay;
    
    // 코드 한줄만 추가할 것
    System.out.println(weekNames[day % 7]);
    
    /* mod 값이 index라고 생각
    int mod = day % 7;
    if(mod == 0) {
      weekName = "일";
    } else if(mod == 1) {
      weekName = "월";
    } else if(mod == 2) {
      weekName = "화";
    } else if(mod == 3) {
      weekName = "수";
    } else if(mod == 4) {
      weekName = "목";
    } else if(mod == 5) {
      weekName = "금";
    } else {
      weekName = "토";
    }
    */
  }
  
  public static void method3() {
    
    char[] letters = new char[26];
    
    char ch = 'A';
    
    for(int i = 0; i < letters.length; i++) {
      letters[i] = ch++;
    }
    for(int i = 0; i < letters.length; i++) {
      System.out.println(letters[i]);
    }
    
  }
  
  
  public static void method4() {
    
    // 배열 a의 마지막 3개 요소를 배열 b의 값으로 수정하기
    int[] a = new int[] {10, 20, 30, 0, 0, 0};
    int[] b = new int[] {40, 50, 60};
    
    /*
    궁극적인 답은 이것이나..
    a[3] = b[0];
    a[4] = b[1];
    a[5] = b[2];
    */
    
    
    // b가 기준이 된 이유는 int i = 0이라고 했기 때문에 b의 값을 적는 것
    for(int i = 0; i < b.length; i++) {
      a[3 + i] = b[i];
    }
    
    /*
     * 배열 복사를 위한 자바 표준 API
     *    System.arraycopy(b, 0, a, 3, b.length)
     *    1) 복사시작요소   : b[0] 요소를 a[3] 요소로 복사
     *    2) 복사할요소개수 : b.length개만큼 복사
     *    
     *    
     */
    
    for(int i = 0; i < a.length; i++) {
      System.out.println(a[i]);
    }
  }
  
  
  public static void method5() {
    
    // 10진수를 2진수로 변환하기
    
    // 10진수
    int number = 35;
    
    // 2진수
    int[] binary = new int[10];
    
    int i =0;
    while(number > 0) {
      binary[i++] = number % 2;
      // number = number / 2;
      number /= 2;
    }
    
    // int i = i -1을 쓸 수 없기 때문에 관례상 j 사용
    for(int j = i-1; j >= 0; j--) {
      System.out.print(binary[j]);
    }
    
  }
  
  
  public static void main(String[] args) {
    // TODO Auto-generated method stub
    method5();

  }

}
