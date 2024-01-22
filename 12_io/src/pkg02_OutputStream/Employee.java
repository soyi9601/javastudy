package pkg02_OutputStream;

import java.io.Serializable;

public class Employee implements Serializable {
  
  
  /**
   * ctrl + 1
   */
  private static final long serialVersionUID = -7093663235806575250L;
  
  
  // field
  private String name;
  private int empNo;
  
  public Employee() {
    // TODO Auto-generated constructor stub
  }
  
  public Employee(String name, int empNo) {
    super();
    this.name = name;
    this.empNo = empNo;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getEmpNo() {
    return empNo;
  }

  public void setEmpNo(int empNo) {
    this.empNo = empNo;
  }

  @Override
  public String toString() {
    return "Employee [name=" + name + ", empNo=" + empNo + "]";
  }
  
  

}
