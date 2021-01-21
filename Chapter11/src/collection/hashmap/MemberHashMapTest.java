package collection.hashmap;

public class MemberHashMapTest {

	public static void main(String[] args) {
		
		MemberHashMap manager= new MemberHashMap();
		
		Member lee= new Member(1003, "Lee");
		Member cho= new Member(1012, "Cho");
		Member kim= new Member(1031, "Kim");
		Member lee2= new Member(1003, "Lee");

		manager.addMember(lee);
		manager.addMember(cho);
		manager.addMember(kim);
		manager.addMember(lee2);
		
		manager.showMemberInfo();
		
		manager.removeMember(1031);
		
		manager.showMemberInfo();
		
		
	}

}
