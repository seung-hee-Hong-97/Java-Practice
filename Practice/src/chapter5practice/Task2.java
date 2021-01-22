package chapter5practice;
/*
 <주문 내용>
 주문 번호: 201907210001
 주문자 아이디: abc123
 주문 날짜: 2019년 7월 21일
 주문자 이름: 홍길순
 주문 상품 번호: PD0345-12
 배송 주소: 서울시 영등포구 여의도동 20번지
 
 위 주문 내용을 구현할 수 있는 클래스를 만들고 인스턴스로 생성한 후 위와 같은 형식으로 출력해보자
 */
public class Task2 {
	public long orderNumber;
	public String orderID;
	public String orderDate;
	public String orderName;
	public String productNumber;
	public String address;
	
	public void showOrder() {
		System.out.println("주문 번호: " + orderNumber);
		System.out.println("주문 아이디: " + orderID);
		System.out.println("주문 날짜: " + orderDate);
		System.out.println("주문자 이름: " + orderName);
		System.out.println("주문 상품 번호: " + productNumber);
		System.out.println("배송 주소: " + address);
	}
	
	
	public static void main(String[] args) {
		Task2 person= new Task2();
		person.orderNumber= 201907210001L;
		person.orderID= "abc123";
		person.orderDate= "2019년 7월 21일";
		person.orderName= "홍길순";
		person.productNumber= "PD0345-12";
		person.address= "서울시 영등포구 여의도동 20번지";
		
		person.showOrder();
		
	}

}
