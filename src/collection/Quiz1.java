package collection;

import java.util.ArrayList;

public class Quiz1 {

	public static void main(String[] args) {

		ArrayList<Character> list = new ArrayList<>();
		
		list.add('A');
		list.add('B');
		list.add('C');
		
		System.out.println(list.get(0));
		System.out.println(list.get(1));
		System.out.println(list.get(2));
		
		list.remove(1);
		System.out.println("B 삭제 : " + list.toString());
		System.out.println("리스트 사이즈: " + list.size());

	}

}
