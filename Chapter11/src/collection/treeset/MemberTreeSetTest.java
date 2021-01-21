package collection.treeset;

public class MemberTreeSetTest {

	public static void main(String[] args) {

		MemberTreeSet manager= new MemberTreeSet();
		
		Member lee= new Member(102, "Lee");
		Member ki= new Member(321, "Ki");
		Member shin= new Member(231, "Shin");
		Member ki2= new Member(321, "Ki");
		
		manager.addMember(ki);
		manager.addMember(shin);
		manager.addMember(ki2);
		manager.addMember(lee);
		
		manager.showMemberInfo();
		
		
	}

}
