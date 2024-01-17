package practice03_club;

public class Person {

  private String id;
  
  public Person() {
    // TODO Auto-generated constructor stub
  }
  public Person(String id) {
    super();
    this.id = id;
  }

  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }
  @Override
  public String toString() {
    return "Person [id=" + id + "]";
  }
  
}
