package db.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import db.dto.UserDto;

/*
 * DAO
 * 1. Database Access Object
 * 2. 데이터베이스에 접근해서 쿼리문을 실행하고 쿼리문의 실행 결과를 받는 객체이다.
 * 3. 하나의 객체만 만들어서 사용하는 Singleton Pattern 으로 DAO 객체를 생성한다. ** 중요! singleton 처리 -> 나중에는 현재 코드가 없을 수 있지만 singleton 으로 자동입력 됐다고 생각!
 */

/*
 * Singleton Pattern
 * 1. 오직 하나의 객체만 만들어서 사용하는 패턴이다.
 * 2. 클래스 내부에서 객체를 미리 만든 뒤 해당 객체를 가져다 사용할 수 있도록 메소드를 제공한다.
 * 3. 클래스 외부에서는 객체를 생성할 수 없도록 private 처리한다.
 */

/*
 * 메소드 호출방법
 * 1. 객체.메소드()
 * 2. 클래스.메소드()
 *    - 클래스.메소드는 클래스 멤버만 호출할 수 있다. userDao는 클래스 멤버(static 이 붙어있는 필드, 메소드)가 아님 -> static 은 static 만 부를 수 있음
 */

public class UserDao {

  // private 메소드 (UserDao 내부에서 호출할 메소드)
  
  // Singleton Pattern
  private UserDao() {}
  private static UserDao userDao = new UserDao();
  public static UserDao getInstance() {
    return userDao;
  }
  // public UserDao getInstance() 에 static 을 붙이고 싶으면 private UserDao userDao에도 static 붙여줘야함. -> 위에 서져있는 메소드 호출방법 확인
  
  // field
  private Connection con;
  private PreparedStatement ps;
  private ResultSet rs;
  
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
      if(rs != null) rs.close();
      if(ps != null) ps.close();
      if(con != null) con.close();
    } catch (Exception e) {
      // TODO: handle exception
    }
  }
  
  // public 메소드 (실제 기능을 담당하는 메소드)
  
  // 모든 사용자 조회하기 : getUsers, getUserList 등
  public List<UserDto> getUsers(){
    
    // 놓친 부분 **
    List<UserDto> users = new ArrayList<UserDto>();
    
    try {
      
      connection();     // 위에서 다 불러놨기 때문에 호출해줘야함. ** 
      
      String sql = "SELECT USER_NO, USER_NAME, USER_TEL, JOIN_DT FROM USER_T ORDER BY USER_NO DESC";
      ps = con.prepareStatement(sql);
      rs = ps.executeQuery();
      
      while(rs.next()) {
        UserDto userDto = new UserDto();
        userDto.setUser_no(rs.getInt(1));
        userDto.setUser_name(rs.getString(2));
        userDto.setUser_tel(rs.getString(3));
        userDto.setJoin_dt(rs.getString(4));
        
        users.add(userDto);
      } 
      
    } catch (Exception e) {
      e.printStackTrace();
    } finally {
      close();
    }
    // 놓친 부분 **
    return users;
    
  }
  
  // 특정 사용자 조회하기 : getUser, getUserByNo 등
  public UserDto getUser(int user_no) {
    
    UserDto userDto = null;   // 반환값이 없을 수도 있어서 null을 써야함
    
    try {
      connection();
     //  String sql = "SELECT USER_NO, USER_NAME, USER_TEL, JOIN_DT FROM USER_T WHERE USER_NO = " + user_no;  변수값을 user_no로 직접 쓰게 되면 안됨. 이런식으로는 작성하지 않음.
      String sql = "SELECT USER_NO, USER_NAME, USER_TEL, JOIN_DT FROM USER_T WHERE USER_NO = ?";
      
      ps = con.prepareStatement(sql);
      ps.setInt(1, user_no);  // ? <- 변수가 있으면 이거 까먹지말고 써주기. 첫번째 변수에 user_no 값 주기
      rs = ps.executeQuery();
      
      if(rs.next()) {
        userDto = new UserDto();
        userDto.setUser_no(rs.getInt(1));
        userDto.setUser_name(rs.getString(2));
        userDto.setUser_tel(rs.getString(3));
        userDto.setJoin_dt(rs.getString(4));
      }
    } catch (Exception e) {
      e.printStackTrace();
    } finally {
      close();
    }
    
    return userDto;
  }
  
  // 사용자 등록 : insertUser, saveUser, registerUser 등
  public int saveUser(UserDto userDto) {
    
    int result = 0;
    
    try {
      
      connection();
      String sql = "INSERT INTO USER_T (USER_NO, USER_NAME, USER_TEL, JOIN_DT) VALUES(USER_SEQ.NEXTVAL, ?, ?, TO_CHAR(CURRENT_DATE, 'YYYY-MM-DD'))";
      
      ps = con.prepareStatement(sql);
      ps.setString(1, userDto.getUser_name());
      ps.setString(2, userDto.getUser_tel());
      result = ps.executeUpdate();
      
    } catch (Exception e) {
      e.printStackTrace();
    } finally {
      close();
    }
    
    return result;
    
  }
  
  // 사용자 수정 : updateUser, modifyUser 등
  
  public int modifyUser(UserDto userDto) {
    
    int result = 0;
    
    try {
      
      connection();
      // String sql = "UPDATE USER_T SET USER_NAME = USER_NAME || 2";
      String sql = "UPDATE USER_T"
                 + "   SET USER_NAME = ?, USER_TEL = ?"
                 + " WHERE USER_NO = ?";
      
      ps = con.prepareStatement(sql);
      ps.setString(1, userDto.getUser_name());
      ps.setString(2, userDto.getUser_tel());
      ps.setInt(3, userDto.getUser_no());
      
      result = ps.executeUpdate();
      
    } catch (Exception e) {
      e.printStackTrace();
    } finally {
      close();
    }
    
    return result;
    
  }
  
  // 사용자 삭제 : deleteUser, removeUser 등
  
  public int removeUser(int user_no) {
    
    int result = 0;
    
    try {
      
      connection();
      
      String sql = "DELETE FROM USER_T WHERE USER_NO = ?";
      
      ps = con.prepareStatement(sql);
      ps.setInt(1, user_no);
      result = ps.executeUpdate();
      
    } catch (Exception e) {
      e.printStackTrace();
    } finally {
      close();
    }
    
    return result;
    
  }
  
}
