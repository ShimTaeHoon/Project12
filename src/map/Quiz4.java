package map;

import java.util.HashMap;
import java.util.Set;

public class Quiz4 {

	public static void main(String[] args) {

		HashMap<Integer, Student> map = new HashMap<Integer, Student>();

		Student student = new Student(1001, "둘리", 90, 80, 70);
		Student student2 = new Student(1002, "도우너", 55, 65, 75);
		Student student3 = new Student(1003, "또치", 80, 50, 50);
		
		map.put(1, student);
		map.put(2, student2);
		map.put(3, student3);
		
		System.out.println(student.toString());
		
		student.SumAvg();
		student2.SumAvg();
		student3.SumAvg();
		
		int totalscore_kor =0;
		
		Set<Integer> keySet = map.keySet();
		for (Integer key : keySet) {
			totalscore_kor += map.get(key).koScore;
//			System.out.println(key);
		}
		
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