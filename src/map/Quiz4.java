package map;

import java.util.Collection;
import java.util.HashMap;

public class Quiz4 {

	public static void main(String[] args) {

		HashMap<Integer, Student> map = new HashMap<Integer, Student>();

		map.put(1001, new Student(1001, "둘리", 90, 80, 70));
		map.put(1002, new Student(1001, "도우너", 55, 65, 75));
		map.put(1003, new Student(1001, "또치", 80, 50, 50));
		
		Collection<Student> values = map.values();
		
		// 학생 기준이라 FOR문 안쪽에서
		// 학생인스턴스만 추출할 때 key.values();
		for (Student student : values) {
			// 총점 구하기
			int sum = student.koScore + student.mathScore + student.engScore;
			// 평균 구하기(실수로 구하기, 소수점 때문)
			double avg = sum / 3.0;
			// for문 안에서 출력해야함!
			System.out.println(student.name + "학생의 총점: " + sum + " 학생의 평균: " + avg);
		}// for문이 한번 돌면, 한 학생에 대한 정보가 나옴
		
		int korSum = 0;
		int mathSum = 0;
		int engSum = 0;
		
		for (Student student : values) {
			korSum = korSum + student.koScore;
			mathSum = mathSum + student.mathScore;
			engSum = engSum + student.engScore;
		} // for문이 다 끝나야지 과목에 대한 정보가 나옴
		// 과목이 기준이라 for문 바깥에 출력
		
		System.out.println("국어의 총점 : " + korSum);
		System.out.println("영어의 총점 : " + engSum);
		System.out.println("수학의 총점 : " + mathSum);
		
//		Student student = new Student(1001, "둘리", 90, 80, 70);
//		Student student2 = new Student(1002, "도우너", 55, 65, 75);
//		Student student3 = new Student(1003, "또치", 80, 50, 50);
//		
//		map.put(1, student);
//		map.put(2, student2);
//		map.put(3, student3);
//		
//		System.out.println(student.toString());
//		
//		student.SumAvg();
//		student2.SumAvg();
//		student3.SumAvg();
//		
//		int totalscore_kor =0;
//		
//		Set<Integer> keySet = map.keySet();
//		for (Integer key : keySet) {
//			totalscore_kor += map.get(key).koScore;
////			System.out.println(key);
//		}
		
	}

}

class Student {

	int studentNo;
	String name;
	int koScore;
	int mathScore;
	int engScore;

	public Student(int studentNo, String name, int koScore, int mathScore, int engScore) {
		super();
		this.studentNo = studentNo;
		this.name = name;
		this.koScore = koScore;
		this.mathScore = mathScore;
		this.engScore = engScore;
	}

	@Override
	public String toString() {
		return "Student [studentNo=" + studentNo + ", name=" + name + ", koScore=" + koScore + ", mathScore="
				+ mathScore + ", engScore=" + engScore + "]";
	}
	
	public void SumAvg() {
		int sum = 0;
		int avg = 0;
		sum = this.koScore + this.mathScore + this.engScore;
		avg = sum / 3;
		System.out.println(this.name + "의 총점 : " + sum + " 평균 : " + avg);
	}	

}