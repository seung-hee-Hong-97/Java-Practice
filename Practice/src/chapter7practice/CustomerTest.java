package chapter7practice;

import java.util.ArrayList;

/* 일반 고객과 VIP 고객의 중간 등급 만들기
 고객이 늘어 VIP 고객만큼 물건을 많이 구입하지 않지만, 단골인 분들은 GOLD 등급으로 관리하고 싶다.
<GOLD등급의 혜택>
- 제품을 살 때 항상 10% 할인
- 보너스 포인트는 2% 적립
- 담당 전문 상담원은 없음

  배열을 활용하여 구현할 것
  고객은 현재 5명이다. VIP 1명, GOLD 2명, SILVER 2명 일 때, 각 고객이 10000원 짜리 제품을 구매한 경우
  지불한 금액과 적립된 보너스 포인트를 출력해라. ArrayList를 활용하여 구현
 
 <출력 결과>
 ======== 고객의 정보 출력 ========
이순신 님의 등급은 SILVER이며, 보너스 포인트는 0점 입니다.
신사임당 님의 등급은 SILVER이며, 보너스 포인트는 0점 입니다.
홍길동 님의 등급은 GOLD이며, 보너스 포인트는 0점 입니다.
이율곡 님의 등급은 GOLD이며, 보너스 포인트는 0점 입니다.
김유신 님의 등급은 VIP이며, 보너스 포인트는 0점 입니다. 담당 상담원 번호는 12345입니다.
======== 할인율과 보너스 포인트 계산 ========
이순신 님이 10000원 지불하셨습니다.
이순신 님의 현재 보너스 포인트는 100점 입니다.
신사임당 님이 10000원 지불하셨습니다.
신사임당 님의 현재 보너스 포인트는 100점 입니다.
홍길동 님이 9000원 지불하셨습니다.
홍길동 님의 현재 보너스 포인트는 200점 입니다.
이율곡 님이 9000원 지불하셨습니다.
이율곡 님의 현재 보너스 포인트는 200점 입니다.
김유신 님이 9000원 지불하셨습니다.
김유신 님의 현재 보너스 포인트는 500점 입니다.
 */

public class CustomerTest {

	public static void main(String[] args) {
		
		ArrayList<Customer> list= new ArrayList<Customer>();
		
		Customer lee= new Customer("이순신");
		Customer shin= new Customer("신사임당");
		Customer hong= new GoldCustomer("홍길동");
		Customer gok= new GoldCustomer("이율곡");
		Customer kim= new VIPCustomer("김유신");
		
		list.add(lee);
		list.add(shin);
		list.add(hong);
		list.add(gok);
		list.add(kim);
		
		System.out.println("======== 고객의 정보 출력 ========");
		for(Customer c: list) {
			System.out.println(c.showCustomerInfo());
		}
		
		int money= 10000;
		System.out.println("======== 할인율과 보너스 포인트 계산 ========");
		for(Customer c: list) {
			System.out.println(c.getCustomerName() + "님이 " + c.calcPrice(money) + "원 지불하셨습니다.");
			System.out.println(c.getCustomerName() + "님의 현재 보너스 포인트는 " + c.bonusPoint + "점 입니다.");
		}
		
		
	}

}
