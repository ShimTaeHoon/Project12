package collection;

import java.util.ArrayList;

public class MemberTest {

	public static void main(String[] args) {

		ArrayList<Member> list = new ArrayList<Member>();

		MemberArrayList member = new MemberArrayList();
		member.addMember(null);

	}

}

class MemberArrayList {

	// 회원 목록
	ArrayList<Member> list; // 리스트 선언

	// 인스턴스 생성 + 초기화
	public MemberArrayList() {
		list = new ArrayList<Member>(); // 리스트를 먼저 생성해야함, 초기화까지
	}

	// 리스트에 회원을 추가하는 메소드
	public void addMember(Member member) {
		list.add(member);
		
	}

	// 아이디를 가지고 회원을 삭제하는 메소드
	public void removeMember(int memberId) {

		for (int i = 0; i < list.size(); i++) {
			Member member = list.get(i);
			int id = member.memberId;

			if (id == memberId) {
				list.remove(i);
				System.out.println(memberId + "번 회원을 삭제하였습니다");
				return;
			}
		}

		System.out.println(memberId + "번 회원이 존재하지 않습니다");

	}

	public void showAllMember() {

		for (int i = 0; i < list.size(); i++) {
			Member member = list.get(i);
			System.out.println(member);
		}
		System.out.println();
	}

}
