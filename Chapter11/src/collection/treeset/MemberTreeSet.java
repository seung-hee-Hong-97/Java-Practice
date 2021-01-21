package collection.treeset;

import java.util.Iterator;
import java.util.TreeSet;

public class MemberTreeSet {

	private TreeSet<Member> treeSet;
	
	public MemberTreeSet() {
		treeSet= new TreeSet<Member>(new Member());
	}
	
	public void addMember(Member member) {
		treeSet.add(member);
	}
	
	public boolean removeMember(int memberID) {
		Iterator<Member> ir= treeSet.iterator();
		while(ir.hasNext()) {
			Member member= ir.next();
			if(member.getMemberID() == memberID) {
				treeSet.remove(member);
				return true;
			}
		}
		System.out.println(memberID +"의 ID는 없습니다.");
		return false;
	}
	
	public void showMemberInfo() {
		for(Member m: treeSet) {
			System.out.println(m);
		}
		System.out.println();
	}
	
	
	
}
