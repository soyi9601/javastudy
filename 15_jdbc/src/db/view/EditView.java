package db.view;

import javax.swing.JOptionPane;

import db.dto.UserDto;

public class EditView implements View {

  @Override
  public UserDto display() {

    String user_no = JOptionPane.showInputDialog("수정할 번호 입력");
    String user_name = JOptionPane.showInputDialog("수정 할 이름을 입력");
    String user_tel = JOptionPane.showInputDialog("수정 할 연락처 입력");
    
    return new UserDto(Integer.parseInt(user_no), user_name, user_tel, null);
    
    // user_no 는 int 타입인데 joptionpane 때문에 String으로 입력한 다음 강제 변환 해서 반환 해줘야함.
  }

}
