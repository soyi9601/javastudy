package pkg08_intermedia_method;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class MainClass {

  public static void method1() {
    
    // filter() 메소드
    // Stream<T> filter(Predicate<T> predicate) {}
    List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
    // Stream<Integer> numbers = list.stream();
    // numbers
    list.stream()
    .filter((number) -> number % 2 == 0 )
    .forEach((number) -> System.out.println(number));
        
  }
  
  public static void method2() {
    
    List<Book> books = Arrays.asList(
        new Book("a", "aa", 15000),
        new Book("b", "bb", 80000),
        new Book("c", "cc", 25000),
        new Book("d", "dd", 5000),
        new Book("e", "ee", 8000)
        );
        
    books.stream()
      .filter((book) -> book.getPrice() >= 10000)
      .forEach((book) -> System.out.println(book.getTitle()));
    
    List<Book> over20000 = books.stream()
        .filter((book) -> book.getPrice() >= 20000)
        .collect(Collectors.toList());
    System.out.println(over20000);
  }
  
  public static void method3() {
    
    // map() 메소드 : 
    // Stream<T> map(Function<T, R> function) {}
    
    List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
    
    list.stream()
    .map((number) -> number + 1)
    .forEach((number) -> System.out.println(number));
    
  }
  
  public static void method4() {
    
    // 20000 이상은 책 가격을 50% 세일한 리스트 생성하기
    List<Book> books = Arrays.asList(
        new Book("a", "aa", 15000),
        new Book("b", "bb", 80000),
        new Book("c", "cc", 25000),
        new Book("d", "dd", 5000),
        new Book("e", "ee", 8000)
        );
    
    List<Book> saleList = books.stream()
                          .filter((book) -> book.getPrice() >= 20000)
                          .map((book) -> new Book(book.getTitle(), book.getAuthor(), book.getPrice() / 2))
                          .toList();
                          // .collect(Collectors.toList());
    saleList.stream()
          .forEach((book) -> System.out.println(book.getTitle() + book.getPrice()));
                          
    /*
    books.stream().forEach((book) -> System.out.println(book.getTitle()));
    
    List<Book> over20000 = books.stream().filter((book) -> book.getPrice() >= 20000).collect(Collectors.toList());
    
    over20000.stream()
        .map((saleprice) -> Collectors.getPrice / 2)
        .forEach((saleprice) -> sysout)
    */
    
  }
  
  public static void main(String[] args) {

    method4();
    
  }

}
