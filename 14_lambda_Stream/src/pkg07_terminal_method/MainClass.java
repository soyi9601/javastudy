package pkg07_terminal_method;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.lang.reflect.Array;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Stream;

public class MainClass {

  public static void method1() {
    
    // java.util.stream.Stream 생성
    Stream<String> seasons = Stream.of("spring", "summer", "autumn", "winter");
    
    // forEach() 메소드 호출
    // Stream 에 저장된 요소를 하나씩 Consumer 의 파라미터에 전달하는 메소드이다.
    seasons.forEach((season) -> System.out.println(season));
  }
  
  public static void method2() {
    
    // 배열을 Stream 으로 만들기
    String[] seasons = {"spring", "summer", "autumn", "winter"};
    Stream<String> stream = Arrays.stream(seasons);
    
    // forEach() 메소드
    stream.forEach((season) -> {
      System.out.println(season);
    });
    
  }
  
  public static void method3() {
    
    // Collection(List, Set) 을 Stream 으로 만들기
    
    List<String> seasons = Arrays.asList("spring", "summer", "autumn", "winter");
    Stream<String> stream = seasons.stream();
    stream.forEach((season) -> System.out.println(season));
    
    //new HashSet<String>(seasons).stream().forEach();
  }
  
  public static void method4() {
    
    File dir = new File("\\storage");
    File file = new File(dir, "sample2.txt");
    
    BufferedReader in = null;
    
    try {
      
      in = new BufferedReader(new FileReader(file));
      
      StringBuilder builder = new StringBuilder();
      in.lines().forEach( (line) -> builder.append(line).append("\n") );
      
      in.close();
      
      System.out.println(builder.toString());
      
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
  
  public static void method5() {
    
    // javaHome 안에 있는 파일명 출력하기
    File javaHome = new File("\\Program Files\\Java\\jdk-17");
    File[] files = javaHome.listFiles();
    Stream<File> stream = Arrays.stream(files);
    stream.forEach((file) -> System.out.println(file.getName()));
    
    
    try {
      
      // path라는 인터페이스에 paths(.nio)인 클래스
      Path path = Paths.get("\\Program Files\\Java\\jdk-17");
      Stream<Path> stream2 = Files.list(path);
      stream2.forEach((p) -> System.out.println(path.getFileName()));
      
      stream2.close();
      
    } catch (Exception e) {
      e.printStackTrace();
    }
    
    /*
    List<String> files = Arrays.asList(javaHome.list());
    Stream<String> stream = files.stream();
    stream.forEach((file) -> System.out.println(files));
    */
    
    /*
    try {
      
      in = new BufferedReader(new FileReader(javaHome));
      
      StringBuilder builder = new StringBuilder();
      in.lines().forEach( (line) -> builder.append(line).append(String.format("%-20s", javaHome.getName().substring(0, Math.min(javaHome.getName().length(), 20)))) );
      
      in.close();
      
      System.out.println(builder.toString());
      
    } catch (Exception e) {
      e.printStackTrace();
    }
    */
    
  }
  
  public static void main(String[] args) {

    method5();
    
    
  }

}
