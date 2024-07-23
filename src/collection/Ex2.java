package collection;

import java.util.ArrayList;

public class Ex2 {

	public static void main(String[] args) {
		
		// 회원 리스트 생성
		ArrayList<Member> list = new ArrayList<>();
		
		Member member1 = new Member(1001, "둘리");
		Member member2 = new Member(1002, "또치");
		Member member3 = new Member(1003, "도우너");
		
		list.add(member1);
		list.add(member2);
		list.add(member3);
		list.add(member3); // 리스트의 특징: 순서 o, 중복 o
		
		// 1. 풀어서
		Member m = list.get(0);
		System.out.println(m);
		
		// 2. 간단하게
		System.out.println(list.get(1));
		
		list.remove(0); // 1번째 회원 삭제
		
		System.out.println("전체 회원 수 : " + list.size());
		
		// 리스트 출력하기
		System.out.println(list);
		
		// for문을 이용해서 전체 회원 정보 출력하기
		for (int i = 0; i < list.size(); i++) {
			Member member = list.get(i); // 리스트에서 회원을 꺼냄
			System.out.println(member.toString()); // toString 생략가능
			// print문안에서 참조변수 호출하면 자동으로 toString 불러와짐
			// 아래 Member클래스에서 toString 오버라이딩 해줬음
		}
		
		
	}

}

//쇼핑몰 회원
class Member {
	int memberId; //회원아이디
	String memberName; //회원이름
	
	public Member(int memberId, String memberName) {
		super();
		this.memberId = memberId;
		this.memberName = memberName;
	}

	@Override
	public String toString() {
		return "Member [memberId=" + memberId + ", memberName=" + memberName + "]";
	}
	
}