package map;

import java.util.Collection;
import java.util.HashMap;

public class Quiz5 {

	public static void main(String[] args) {
	
	System.out.println("MemberHashMap를 생성하고 4명의 회원을 추가하세요!");
	
	MemberHashMap hashMap = new MemberHashMap()	;
	
	Member member1 = new Member(1001, "둘리1");
	Member member2 = new Member(1002, "둘리2");
	Member member3 = new Member(1003, "둘리3");
	Member member4 = new Member(1004, "둘리4");
	
	hashMap.addMember(member1);
	hashMap.addMember(member2);
	hashMap.addMember(member3);
	hashMap.addMember(member4);
	
	hashMap.showAllMember();
	
	System.out.println("1004번 회원을 삭제하세요");
	
	hashMap.removeMember(1004);
	
	hashMap.showAllMember();
	
	}
	
}

class MemberHashMap {
	
	// 회원목록을 저장할 map
	HashMap<Integer, Member>map; // map 선언
	
	// 생성자의 목적 : 인스턴스 생성 + 초기화
	// 빈객체를 사용하면 nullpoint에러남
	public MemberHashMap() {
		map = new HashMap<>(); // map 생성
	}
	
	// 맵에 회원을 추가하는 메소드
	public void addMember(Member member) {
		map.put(member.memberId, member);
	}
	
	public void removeMember(int memberId) {
		// 특정키가 있는지 확인후 boolean으로 출력 있으면 true 없으면 false
		if (map.containsKey(memberId)) { // 특정 키 없으면 false
			map.remove(memberId);
			System.out.println(memberId + "번 회원을 삭제하였습니다");
			return; // 삭제 후 함수 종료
		}
		System.out.println(memberId + "번 회원이 존재하지 않습니다"); // 특정 키 없으면 false 후 오류메세지
	}
	
	public void showAllMember() {
		
		Collection<Member> values = map.values();
		
		// map은 for문을 쓸수 없지만 Collection은 for문사용 가능
		for(Member member : values) {
			System.out.println(member);
			
		}
		
	}
	
}