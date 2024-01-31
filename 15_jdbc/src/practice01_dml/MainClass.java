package practice01_dml;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class MainClass {
  
  /*
   * TALK_T 테이블에 1행씩 삽입하시오
   * 
   */
  
  public static void method1() {
    
    // 접속을 위해서 필요한 정보(주소, 계정정보)
    String url = "jdbc:oracle:thin:@192.168.0.214:1521:xe";
    String user = "GD";
    String password = "1111";
    
    Connection con = null;
    PreparedStatement ps = null;
    
    try {
      
      con = DriverManager.getConnection(url, user, password);
      System.out.println("접속 성공");
      
      String sql = "INSERT INTO TALK_T(TALK_NO, TALK_CONTENT, TALK_USER, WRITEN_AT) VALUES(TALK_SEQ.NEXTVAL, '안녕하세요', '이소이', CURRENT_TIMESTAMP)";  // ;세미콜론 뒤에다가 붙이기 괄호 앞에 붙이면 작동안됨
      
      ps = con.prepareStatement(sql);
      
      int result = ps.executeUpdate();
      System.out.println(result);
      
    } catch (SQLException e) {
      e.printStackTrace();
    } finally {
      try {
        if(ps != null) ps.close();
        if(con != null) con.close();
      } catch (Exception e2) {
        e2.printStackTrace();
      }
    }
    
    
    
    
    
  } 

  public static void main(String[] args) {

    method1(); 
    
  }

}
