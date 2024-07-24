package map;

import java.util.HashMap;

public class Quiz2 {

	public static void main(String[] args) {

		HashMap<String, Integer> hash = new HashMap<String, Integer>();
		
		hash.put("국어", 80);
		hash.put("수학", 90);
		hash.put("영어", 100);
		
		hash.replace("국어", 50);
		hash.replace("수학", 90);
		hash.replace("영어", 100);
		
		hash.remove("영어");
		
		System.out.println(hash.get("국어"));
		System.out.println(hash.get("수학"));
		System.out.println(hash.get("영어"));
		
		System.out.println("map에 저장된 모든 요소 : " + hash);
		System.out.println("map의 크기 : " + hash.size());

	}

}
