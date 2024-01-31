package db.view;

import javax.swing.JOptionPane;

import db.dto.UserDto;

public class RegisterView implements View {

  @Override
  public UserDto display() {

    String user_name = JOptionPane.showInputDialog("등록할 이름을 입력");
    String user_tel = JOptionPane.showInputDialog("등록할 연락처 입력");
    
    return new UserDto(0, user_name, user_tel, null);
  }

}
