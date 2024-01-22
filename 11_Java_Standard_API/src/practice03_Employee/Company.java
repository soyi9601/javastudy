package practice03_Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Company {

  // field
  private String name;
  private List<Employee> employees;   // 선언
  
  // constructor
  public Company(String name) {
    this.name = name;
    employees = new ArrayList<Employee>();
  }
  
  //method
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }
  
  
  // 고용
  public void hire(Employee employee) {
    if(employee == null) {
      throw new RuntimeException("고용된 사원 정보가 올바르지 않습니다.");
    }
    if(employees.contains(employee)) {
      throw new RuntimeException("이미 등록된 사원 번호입니다");
    }
    employees.add(employee);
  }
  
  
  // 해고
  public void fire(int empNo) {
    if(employees.isEmpty()) {
      throw new RuntimeException("해고할 사원이 없습니다.");
    }
    for(int i = 0, size = employees.size(); i < size; i++) {
      if(employees.get(i).getEmpNo() == empNo) {
        employees.remove(i);
        break;
      }
    }
  }
  
  /*
  remove(Objcet) : 객체 비교가 안되기때문에 지금 쓰지 못함 + 향상 for 문도 쓰지 못함
  remove(index)  : 해고할 사원의 위치를 알아야함
  
  */
  
  // 조회
  public void search(int empNo) {
    if(employees.isEmpty()) {
      throw new RuntimeException("조회할 사원이 없습니다.");
    }
    Employee searchEmployee = new Employee(empNo, null);
    for(Employee employee : employees) {
      if(employee.equals(searchEmployee)) {
        employee.info();
      }
    }
  }
  
  
  // 전체 조회
  public void searchAll() throws RuntimeException {
    if(employees.isEmpty()) {
      throw new RuntimeException("사원이 없습니다");
    }
    System.out.println("전체 사원 명단");
    for(Employee employee : employees) {
      employee.info();
      System.out.println("---------------");
    }
    
  }
  
  
}
