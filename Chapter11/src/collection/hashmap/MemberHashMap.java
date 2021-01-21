package collection.hashmap;

import java.util.HashMap;
import java.util.Iterator;

public class MemberHashMap {

	private HashMap<Integer, Member> hashMap;
	
	public MemberHashMap() {
		hashMap= new HashMap<Integer, Member>();
	}
	
	public void addMember(Member member) {
		hashMap.put(member.getMemberID(), member);
	}
	
	public boolean removeMember(int memberID) {
		if(hashMap.containsKey(memberID)) {
			hashMap.remove(memberID);
			return true;
		}
		System.out.println(memberID + "의 ID는 존재하지 않습니다.");
		return false;
	}
	
	public void showMemberInfo() {
		Iterator<Integer> ir= hashMap.keySet().iterator();
		while(ir.hasNext()) {
			int key= ir.next();
			Member m= hashMap.get(key);
			System.out.println(m);
		}
		System.out.println();
	}
	
	
}
