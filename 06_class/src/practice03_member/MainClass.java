package practice03_member;

public class MainClass {

  public static void main(String[] args) {
    
    // 임의의 정보를 가지는 Member 1명을 만들고, 정보 출력하기
       
    // 필드를 이용한 생성자    
    Address address = new Address("111-11", "서울", "151번", "아파트", "101호", true);
    Contact contact = new Contact("02", "023456789");
    
    
    
    // 디폴트 형식 생성자 + setter
    /*
    Address address = new Address();
    Contact contact = new Contact();
    */
    Member member = new Member();
    
    member.setId("elsa");
    member.setAddress(address);
    member.setContact(contact);
    /*
    address.setPostCode("111-11");
    address.setRoadAddress("서울");
    address.setJibunAddress("151번");
    address.setDetailAddress("아파트");
    address.setExtraAddress("101호");
    address.setBasicAddress(true);
    
    contact.setTel("02");
    contact.setMobile("0101234567");
   */
    
    
    // 정보 출력 getter
    System.out.println("아이디 :" + member.getId());
    System.out.println("우편번호 : " + member.getAddress().getPostCode());
    System.out.println(member.getAddress().getRoadAddress());
    System.out.println(member.getAddress().getJibunAddress());
    System.out.println(member.getAddress().getDetailAddress());
    System.out.println(member.getAddress().getExtraAddress());
    System.out.println(member.getAddress().isBasicAddress());
    System.out.println(member.getContact().getTel());
    System.out.println(member.getContact().getMobile());
    
    
  }

}
