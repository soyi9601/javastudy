package db.view;

import javax.swing.JOptionPane;

import db.dto.UserDto;

public class DeleteView implements View {

  @Override
  public UserDto display() {
    
    String user_no = JOptionPane.showInputDialog("삭제 할 번호 입력");
    if(JOptionPane.showConfirmDialog(null, "정말 삭제?") != JOptionPane.OK_OPTION) {
      return new UserDto(-1, null, null, null);  
    }
    return new UserDto(Integer.parseInt(user_no), null, null, null);
    
  }

}
