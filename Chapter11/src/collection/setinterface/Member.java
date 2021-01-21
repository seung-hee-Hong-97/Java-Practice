package collection.setinterface;

public class Member {

	private int memberID;
	private String memberName;
	
	public Member(int memberID, String memberName) {
		this.memberID= memberID;
		this.memberName= memberName;
	}

	public String toString() {
		return memberName +"회원 님의 ID는 " + memberID + "입니다.";
	}
	
	public int getMemberID() {
		return memberID;
	}

	public void setMemberID(int memberID) {
		this.memberID = memberID;
	}

	public String getMemberName() {
		return memberName;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Member) {
			Member m= (Member) obj;
			if(this.memberID == m.memberID || this.memberName == m.memberName) {
				return true;
			}
			else {
				return false;
			}
		}
		return false;
	}

	@Override
	public int hashCode() {
		return this.memberID;
	}
	
	
	
	
	
	
}
