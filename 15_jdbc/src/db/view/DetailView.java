package db.view;

import javax.swing.JOptionPane;

import db.dto.UserDto;

public class DetailView implements View {

  @Override
  public UserDto display() {
    
    String user_no = JOptionPane.showInputDialog("조회 할 사용자의 번호를 입력하세요.");
    // JoptionPane 은 무조건 String 으로 반환해야함. int 값 줄 수 없음    
    return new UserDto(Integer.parseInt(user_no), null, null, null);
  }

}
