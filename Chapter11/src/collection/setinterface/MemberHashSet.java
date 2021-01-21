package collection.setinterface;

import java.util.HashSet;
import java.util.Iterator;

public class MemberHashSet {

	private HashSet<Member> hashSet;
	
	public MemberHashSet() {
		hashSet= new HashSet<Member>();
	}
	
	public void addMember(Member member) {
		hashSet.add(member);
	}
	
	public boolean removeMember(int memberID) {
		Iterator<Member> ir= hashSet.iterator();
		while(ir.hasNext()) {
			Member member= ir.next();
			if(member.getMemberID() == memberID) {
				hashSet.remove(member);
				return true;
			}
		}
		System.out.println(memberID +"의 ID는 존재하지 않습니다.");
		return false;
	}
	
	public void showMemberInfo() {
		for(Member m: hashSet) {
			System.out.println(m);
		}
		System.out.println();
	}
	
	
}
