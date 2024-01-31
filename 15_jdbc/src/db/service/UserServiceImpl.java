package db.service;

import java.util.List;

import db.dao.UserDao;
import db.dto.UserDto;

/*
 * UserService interface 를 만든 후 클래스 만들 때 interface 타이핑해서 추가해줘야함.
 */

/*
 * Business Layer
 * 1. 핵심 로직을 처리하는 부분이다.
 * 2. Persistence Layer 와 통신하는 레이어이다.
 * 3. DAO 로 전달할 데이터를 가공하거나, DAO 로 부터 전달 받은 데이터를 가공한다.
 */

public class UserServiceImpl implements UserService {

  // field
  private UserDao userDao;
  
  // constructor
  public UserServiceImpl() {
    userDao = UserDao.getInstance();
  }
  
  @Override
  public List<UserDto> getUsers() {
    // TODO Auto-generated method stub
    return userDao.getUsers();
  }

  @Override
  public UserDto getUser(int user_no) {
    // TODO Auto-generated method stub
    return userDao.getUser(user_no);
  }

  @Override
  public int saveUser(UserDto userDto) {
    // TODO Auto-generated method stub
    return userDao.saveUser(userDto);
  }

  @Override
  public int modifyUser(UserDto userDto) {
    // TODO Auto-generated method stub
    return userDao.modifyUser(userDto);
  }

  @Override
  public int removeUser(int user_no) {
    // TODO Auto-generated method stub
    return userDao.removeUser(user_no);
  }

}
