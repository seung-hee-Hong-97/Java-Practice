package collection.setinterface;

public class MemberHashSetTest {

	public static void main(String[] args) {

		MemberHashSet manager= new MemberHashSet();
		
		Member lee= new Member(100, "Lee");
		Member shin= new Member(103, "Shin");
		Member park= new Member(105, "Park");
		Member park2= new Member(105, "Park2");
		
		manager.addMember(lee);
		manager.addMember(shin);
		manager.addMember(park);
		manager.addMember(park2);
		
		manager.showMemberInfo();
		
		manager.removeMember(103);
		
		manager.showMemberInfo();
	}

}
