package db.main;

import java.util.List;

import db.dao.UserDao;
import db.dto.UserDto;

public class MainClass {

  public static void main(String[] args) {

    // 1행 추가
    //UserDto userDto = new UserDto(0, "테스트이름", "테스트연락처", null);
    UserDao userDao = UserDao.getInstance();
//    int result = userDao.saveUser(userDto);
//    System.out.println(result + "행 삽입");
    
    // 전체 목록 확인
    List<UserDto> users = userDao.getUsers();
    for(UserDto user : users) {
      System.out.println(user);
    }
    
    // 10번째 목록 확인
//    UserDto userDto = userDao.getUser(10);
//    System.out.println(userDto);
    
//    UserDto userDto = new UserDto(1, "수정", "수정연락처", null);
//    int result = userDao.modifyUser(userDto);
//    System.out.println(result + "행 수정");
    
//    int result = userDao.removeUser(2);
//    System.out.println(result + "행 삭제");
    
  }

}
