package chapter12practice;

import java.util.ArrayList;
import java.util.List;

/* ex)
 패키지 여행을 떠나는 고객들이 있다. 여행 비용은 15세 이상은 100만원, 그 미만은 50만원이다.
 다음과 같이 고객 세 명이 여행을 간다고 했을 때 비용과 고객 명단에 대한 출력을 스트림을 활용해 만들어봐라
 
 <고객 리스트>
 고객 번호	이름		나이		비용
 1			이순신	40		100
 2			김유신	20		100
 3			홍길동	13		50
 
 1) 고객 명단(이름)을 출력
 2) 여행의 총 비용을 계산해서 출력
 3) 고객 중 20세 이상인 사람을 이름 순으로(가나다 순) 정렬하여 출력
 */

public class TravelTest {

	public static void main(String[] args) {
		
		TravelCustomer lee= new TravelCustomer("이순신", 40, 100);
		TravelCustomer kim= new TravelCustomer("김유신", 20, 100);
		TravelCustomer hong= new TravelCustomer("홍길동", 13, 50);
		TravelCustomer shin= new TravelCustomer("신사임당", 17, 100);
		TravelCustomer ju= new TravelCustomer("주몽", 28, 100);
		
		List<TravelCustomer> list= new ArrayList<TravelCustomer>();
		list.add(ju);
		list.add(hong);
		list.add(shin);
		list.add(kim);
		list.add(lee);
		
		System.out.println(list);
		
		// 1. 고객 명단(이름) 출력
		list.stream().map(c->c.getName()).forEach(s->System.out.println(s));
		
		// 2. 고객들의 총 여행 비용을 계산해서 출력
		int total= list.stream().mapToInt(c->c.getPrice()).sum();
		System.out.println("총 비용: " + total + "만원");
		
		//3. 고객 중 20세 이상인 사람을 이름 순으로(가나다 순) 정렬하여 출력
		list.stream().filter(c->c.getAge()>=20).map(c->c.getName()).sorted().forEach(s->System.out.println(s));
		
		
		
	}

}
