package practice03_Employee;

public class Regular extends Employee {

  // field
  private int salary;

  // using superClass를 사용해서 불러오기
  public Regular(int empNo, String name) {
    super(empNo, name);
    // TODO Auto-generated constructor stub
  }

  // using fields 에서 employee(int, string) 있는걸로 체크해서 불러오기
  public Regular(int empNo, String name, int salary) {
    super(empNo, name);
    this.salary = salary;
  }

  public int getSalary() {
    return salary;
  }

  public void setSalary(int salary) {
    this.salary = salary;
  }
  
  @Override
  public void info() {
    super.info();
    System.out.println("연봉 : " + salary);
  }
  
}
