package collection.treemap;

public class MemberTreeMapTest {

	public static void main(String[] args) {

		MemberTreeMap manager= new MemberTreeMap();
		
		Member Lee= new Member(100, "Lee");
		Member Kim= new Member(201, "Kim");
		Member Park= new Member(105, "Park");
		
		manager.addMember(Kim);
		manager.addMember(Park);
		manager.addMember(Lee);
		
		manager.showMemberInfo();
		
		manager.removeMember(201);
		manager.showMemberInfo();
	}

}
