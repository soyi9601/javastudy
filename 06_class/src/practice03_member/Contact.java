package practice03_member;

public class Contact {

  // field
  private String tel;
  private String mobile;
  
  
  // constructor
  public Contact() {
    // TODO Auto-generated constructor stub
  }

  public Contact(String tel, String mobile) {
    super();
    this.tel = tel;
    this.mobile = mobile;
  }

  
  // 메소드
  public String getTel() {
    return tel;
  }

  public void setTel(String tel) {
    this.tel = tel;
  }

  public String getMobile() {
    return mobile;
  }

  public void setMobile(String mobile) {
    this.mobile = mobile;
  }
  
  
  
}
