package collection.treemap;

import java.util.Iterator;
import java.util.TreeMap;

public class MemberTreeMap {
	
	private TreeMap<Integer, Member> treeMap;
	
	public MemberTreeMap() {
		treeMap= new TreeMap<Integer, Member>();
	}
	
	public void addMember(Member member) {
		treeMap.put(member.getMemberID(), member);
	}
	
	public boolean removeMember(int memberID) {
		if(treeMap.containsKey(memberID)) {
			treeMap.remove(memberID);
			return true;
		}
		System.out.println(memberID + "의 ID는 없습니다.");
		return false;
	}
	
	public void showMemberInfo() {
		Iterator<Integer> ir= treeMap.keySet().iterator();
		while(ir.hasNext()) {
			int key= ir.next();
			Member m= treeMap.get(key);
			System.out.println(m);
		}
		System.out.println();
	}
	
}
