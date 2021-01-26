package chapter13practice;

/* 
매개 변수로 전달된 아이디가 null 이거나 8미만 이거나 20자 초과인 경우 예외를 발생 시키는 예외 클래스를 직접 만들고 예외를 발생해라
*/

public class IDFormatTest {
	
	private String userID;
	
	public String getUserID() {
		return userID;
	}

	public void setUserID(String userID) throws IDFormatException{
		if(userID == null) {
			throw new IDFormatException("아이디는 null이 될 수 없습니다.");
		}
		else if(userID.length()<8 || userID.length()>20) {
			throw new IDFormatException("아이디의 길이를 8이상 20이하로 맞추세요.");
		}
		else {
			System.out.println("아이디: " + userID);
		}
	}

	public static void main(String[] args) {
		
		IDFormatTest idfTest= new IDFormatTest();
		
		String id= null;
		
		try {
			idfTest.setUserID(id);
			
		} catch(IDFormatException e) {
			System.out.println(e);
		}
		
		id= "asfgsdfsdffgd";
		
		try {
			idfTest.setUserID(id);
			
		} catch(IDFormatException e) {
			System.out.println(e);
		}
		
	}

}
