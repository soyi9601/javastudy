package pkg05_marker_interface;

// Eatable을 포함시키지 않음. 음식

public class Durian implements Food {

  @Override
  public void eat() {
    System.out.println("두리안 먹는다");
  }
  
}
