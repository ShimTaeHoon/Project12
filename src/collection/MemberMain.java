package collection;

public class MemberMain {

	public static void main(String[] args) {

		MemberArrayList memberArrayList = new MemberArrayList();
		
		Member member1 = new Member(1001, "둘리1");
		Member member2 = new Member(1002, "둘리2");
		Member member3 = new Member(1003, "둘리3");
		Member member4 = new Member(1004, "둘리4");
		
		System.out.println("MemberArrayList를 생성하고 4명의 회원을 추가하세요!");
		memberArrayList.addMember(member1);
		memberArrayList.addMember(member2);
		memberArrayList.addMember(member3);
		memberArrayList.addMember(member4);
		memberArrayList.showAllMember();

		memberArrayList.removeMember(1004);
		memberArrayList.showAllMember();
		
		System.out.println();
		
	}

}
