package practice03_Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Company {

  // field
  private String name;
  private List<Employee> employees;   // 선언
  private Scanner sc;
  
  // constructor
  public Company(String name) {
    this.name = name;
    employees = new ArrayList<Employee>();
    sc = new Scanner(System.in);
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
    employees.add(employee);
  }
  
  // 해고
  public void fire(int empNo) {
    employees.remove(empNo);
  }
  
  // 조회
  public void search(int empNo) {
    System.out.println(employees.getClass());
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
