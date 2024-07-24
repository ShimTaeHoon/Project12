package map;

import java.util.HashMap;

public class Quiz1 {

	public static void main(String[] args) {

		HashMap<Character, String> hash = new HashMap<Character, String>();
		
		hash.put('a', "사과");
		hash.put('b', "바나나");
		hash.put('c', "코코넛");
		
		if(hash.containsKey('b')) {
			System.out.println("b값을 찾았습니다.");
		}
		
		hash.replace('b', "블루베리");
		System.out.println(hash);		

		hash.remove('a');
		System.out.println(hash);
	}

}
