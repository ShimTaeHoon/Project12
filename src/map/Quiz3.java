package map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class Quiz3 {

	public static void main(String[] args) {

		HashMap<String, Float> map = new HashMap<String, Float>();

		// 데이터 추가
		map.put("국어", 80.0f);
		map.put("수학", 90.0f);
		map.put("영어", 100.0f);
		
		// 과목명만 출력
		Set<String> keySet = map.keySet();
		for (String key : keySet) {
			System.out.println("[과목명]:" + key);
		}
		
		// 점수만 출력
//		System.out.println("[점수]:" + map.get("국어"));
//		System.out.println("[점수]:" + map.get("수학"));
//		System.out.println("[점수]:" + map.get("영어"));
		
		// Collection은 리스트와 set의 부모임
		Collection<Float> values = map.values();
		for(float value : values) {
			System.out.println("[점수]" + value);
		}
	}
}
