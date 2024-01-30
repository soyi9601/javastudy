package practice02_dql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class MainClass {

  public static void method1() {
    Connection con = null;
    PreparedStatement ps = null;
    ResultSet rs = null;
    
    try {
      
      Class.forName("oracle.jdbc.OracleDriver");
      
      String url = System.getProperty("jdbc.url");
      String user = System.getProperty("jdbc.user");
      String password = System.getProperty("jdbc.password");
      con = DriverManager.getConnection(url, user, password);
      
      String sql = "SELECT TALK_NO, TALK_CONTENT, TALK_USER, WRITTEN_AT"
                + "   FROM (SELECT ROW_NUMBER() OVER(ORDER BY TALK_NO DESC) AS RN, TALK_NO, TALK_CONTENT, TALK_USER, WRITTEN_AT"
                + "           FROM TALK_T)"
                + "  WHERE RN BETWEEN 11 AND 20";
      
      /*
       * String sql = "SELECT TALK_NO, TALK_CONTENT, TALK_USER, WRITTEN_AT"
                + "   FROM (SELECT ROW_NUMBER() OVER(ORDER BY TALK_NO DESC) AS RN, TALK_NO, TALK_CONTENT, TALK_USER, WRITTEN_AT"
                + "           FROM TALK_T)"
                + "  WHERE RN BETWEEN ? AND ?";
       */
      
      ps = con.prepareStatement(sql);
      
      /*
       * int begin = 21;
       * int end = 30;
       * 
       */
      
      rs = ps.executeQuery();
      
      List<TalkDto> talks = new ArrayList<TalkDto>();
      
      while(rs.next()) {
        TalkDto talkDto = new TalkDto();
        talkDto.setTalk_no(rs.getInt(1));
        talkDto.setTalk_content(rs.getString(2));
        talkDto.setTalk_user(rs.getString(3));
        talkDto.setWritten_at(rs.getTimestamp(4));
        
        talks.add(talkDto);
      }
      
      for(int i = 0, size = talks.size(); i < size; i++) {
        System.out.println(talks.get(i));
      }      
    } catch (Exception e) {
      e.printStackTrace();
    } finally {
      try {
        if(rs != null) rs.close();
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
