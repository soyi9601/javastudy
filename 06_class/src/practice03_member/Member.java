package practice03_member;

public class Member {

  // field
  private String id;
  private Contact contact;    // 다른 Class 안에 있는 
  private Address address;
  
  
  // constructor
  public Member() {
    // TODO Auto-generated constructor stub
  }

  public Member(String id, Contact contact, Address address) {
    super();
    this.id = id;
    this.contact = contact;
    this.address = address;
  }

  
  // method
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Contact getContact() {
    return contact;
  }

  public void setContact(Contact contact) {
    this.contact = contact;
  }

  public Address getAddress() {
    return address;
  }

  public void setAddress(Address address) {
    this.address = address;
  }
  
  
  
}
