package collection;

import java.lang.classfile.instruction.CharacterRange;
import java.util.ArrayList;

public class Quiz2 {

	public static void main(String[] args) {

		ArrayList<Character> list = new ArrayList<Character>();

		list.add('A');
		list.add('B');
		list.add('C');

		System.out.println("리스트 요소 삭제 전: " + list);

		for (int i = 0; i < list.size(); i++) {

			char ch = list.get(i);
			
			if (ch == 'A') {
				list.remove(i);
			}
		}
		
		System.out.println("리스트 요소 삭제 후 크기 : " + list.size());
		System.out.println("리스트 요소 삭제 후 : " + list);

	}

}
