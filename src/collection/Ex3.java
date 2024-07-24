package collection;

import java.util.HashSet;
import java.util.Iterator;

public class Ex3 {

	public static void main(String[] args) {
		// preference > save action > 최상단 체크박스 선택
		// 컨트롤 S하면 자동으로 HashSet 임포트 됨
		HashSet<String> hashSet = new HashSet<>();

		// 순서대로 안나오고 바구니안에 쌓이는 구조
		// 중복값은 추가 안되서 안나옴
		hashSet.add("둘리"); // 회원 추가
		hashSet.add("또치");
		hashSet.add("도우너");
		hashSet.add("도우너"); // 중복된 값은 추가 불가
		System.out.println("set 목록: " + hashSet + " 크기: " + hashSet.size());
		
		hashSet.remove("도우너"); // 순서가 없는 set은 인덱스 사용 불가
		System.out.println("set 목록: " + hashSet + " 크기: " + hashSet.size());

		// Iterator 객체 생성
		Iterator<String> ir = hashSet.iterator();
		
		while(ir.hasNext()) { // 다음 요소가 있으면
			String member = ir.next(); // 다음 요소를 가져옴
			System.out.print(member + " ");
		}
		
		for(String member : hashSet) {
			System.out.print(member + " ");
		}
		
	}
}
