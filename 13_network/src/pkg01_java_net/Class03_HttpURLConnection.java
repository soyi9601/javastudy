package pkg01_java_net;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class Class03_HttpURLConnection {

  public static void main(String[] args) {

    String spec = "https://www.naver.com/";
    URL url = null;
    HttpURLConnection con = null;
    
    // 자식 -> 부모 : 업캐스팅은 자동으로 됨. 부모 -> 자식 : 자동으로 전환되지 않음
    
    try {
      
      url = new URL(spec);
      con = (HttpURLConnection) url.openConnection();    // 부모 -> 자식 이라서 다운 캐스팅 해줘야 오류나지 않음.
      
      /*
       * 접속 상태 확인 (HTTP Response Code : 응답 코드)
       * 1. 200 : 정상
       * 2. 4xx : 요청 문제 (클라이언트 문제)
       * 3. 5xx : 서버 문제
       */
      
      int responseCode = con.getResponseCode();        // 서버 -> 클라이언트 (서버가 클라이언트에 보내는게 응답)
      if(responseCode == HttpURLConnection.HTTP_OK) {       // responseCode == 200 과 동일 : 아는 숫자라면 적어도 되지만 저렇게 메소드 불러오는게 더.. 나음!
        System.out.println("정상 접속");
      } else {
        System.out.println("접속 불가");
      }
      
      
      /*
       * Content-Type 
       * 1. 컨텐트 타입
       * 2. 종류
       *    1) 문서 타입   : text/xxx
       *    2) 이미지 타입 : image/xxx
       *    3) 데이터 타입 : application/xxx
       */
      String contentType = con.getContentType();
      System.out.println(contentType);
      
      /*
       * 요청 메소드 (Request Method, 요청 방법)
       * 1. GET  : 주소창(URL)을 이용한 요청
       * 2. POST : 본문(Body)를 이용한 요청
       */
      String requestMethod = con.getRequestMethod();
      System.out.println(requestMethod);
      
      /*
       * 요청 헤더
       * 1. 요청 정보가 저장된다.
       * 2. 종류
       *    1) User-Agent     : 무엇으로 접속하였는지에 관한 정보
       *    2) Referer        : 이전 접속 주소 정보
       *    3) Content-Type   : 컨텐트 타입
       *    4) Content-Length : 컨텐트 크기
       */
//      Map<String, List<String>> requestHeader = con.getRequestProperties();
//      for(Entry<String, List<String>> entry : requestHeader.entrySet()) {
//        System.out.println(entry.getKey() + ":" + entry.getValue());
//      }
      String userAgent = con.getRequestProperty("User-Agent");
      System.out.println(userAgent);
      String referer = con.getRequestProperty("Referer");
      System.out.println(referer);
      
      
      
      
    } catch (MalformedURLException e) {     // IOException 이 부모 -> 자식을 위에다가 부모가 밑에 와야함.
      e.printStackTrace();
    } catch (IOException e) {             // IOException 이 connection과 연관
      e.printStackTrace();      
    } finally {
      
      if(con != null)
      con.disconnect();     // null에 대한 예외처리를 하지 않으면 nullpuintException 뜰 수 있어서 null 처리 해줘야함.
      
    }
    
  }

}
