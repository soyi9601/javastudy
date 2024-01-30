package pkg03_dql;

import java.sql.Date;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/*
 * DTO
 * 1. Data Transfer Object
 * 2. 데이터베이스의 데이터를 자바와 주고 받을 때 사용하는 객체이다
 * 3. 기본적으로 테이블 하나당 DTO 하나를 만든다.
 * 4. 필드는 칼럼에 매칭하고 생성자와 Getter/Setter 를 만든다.
 */

/*
 * java -jar lombok.jar : 실행
 * 프롬프트 cd : 폴더 바꾸기 명령어
 * 
 * lombok.jar 다운로드 받고 -> cmd 에서 cd - GDJ77 - jar 폴더로 변경
 * 바꾼 후 java -jar lombok.jar 엔터
 * 빨간 고추 뜨면 이클립스 폴더 찾아서 설치
 */

/*
 * select 를 봤을 때 결과가 여러 개 일 경우 반복문 돌리기 - 목록 보기
 * pk 를 호출하는 (1개만 볼 경우) if(rs.next) 로 상세보기 
 */


@ToString
@NoArgsConstructor    // default constructor
@AllArgsConstructor   //  constructor using field
@Getter
@Setter
public class SampleDto {
  private int sample_no;
  private String sample_content;
  private String sample_edior;
  private Date sample_dt;
}
