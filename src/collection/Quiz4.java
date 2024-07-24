package collection;

import java.util.HashSet;
import java.util.Iterator;

public class Quiz4 {

	public static void main(String[] args) {

		// 제네릭 타입이라 내가 담고싶은 클래스 <Integer>
		HashSet<Integer> set = new HashSet<>();
		
		set.add(1);
		set.add(2);
		set.add(3);
		System.out.println("Set의 크기:" + set.size());
		
		// get메소드처럼 데이터를 꺼냄
		// set을 순회하는 장치.
		// get대신에 next를 쓰기위해서
		// 안에 있는 요소를 확인하기 위해서
		// hasnext와 next를 가지고 순회
		Iterator<Integer> ir = set.iterator();
		
		for(Integer integer : set) {
			System.out.println(integer);
		}

	}

}
