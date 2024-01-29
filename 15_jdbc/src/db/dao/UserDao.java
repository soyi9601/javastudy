package db.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class UserDao {

  // private 메소드 (UserDao 내부에서 호출할 메소드)
  
  private Connection con;
  
  private void connection() {
    
    
    try {
      
      Class.forName("oracle.jdbc.OracleDriver");
      String url = System.getProperty("jdbc.url");
      String user = System.getProperty("jdbc.user");
      String password = System.getProperty("jdbc.password");
      con = DriverManager.getConnection(url, user, password);
      
    } catch (ClassNotFoundException e) {
      System.out.println("OracleDriver 클래스 로드 실패");
    } catch (SQLException e) {
      System.out.println("데이터벱이스 접속 실패");    
    }
  }
  
  private void close() {
    
    try {
      if(con != null) con.close();
    } catch (Exception e) {
      // TODO: handle exception
    }
    
  }
  
}
