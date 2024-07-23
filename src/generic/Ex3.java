package generic;

public class Ex3 {

	public static void main(String[] args) {
		
		// 파우더를 사용하는 프린터기 생성
		ThreeDPrinter<Powder> printer1 = new ThreeDPrinter<>(); // 객체를 생성할 때 타입을
		printer1.setMaterial(new Powder());
		Powder powder = printer1.getMaterial(); // 재료를 꺼낼 때 Powder가 반환됨
		powder.doPrinting();
		
		// 플라스틱을 사용하는 프린터기 생성
		ThreeDPrinter<Plastic> printer2 = new ThreeDPrinter<>(); // 객체를 생헝할 때 타입을
		printer2.setMaterial(new Plastic());
		Plastic plastic = printer2.getMaterial();
		plastic.doPrinting();
		
	}
	
}

// 제네릭 클래스 만들기
// 프린터 클래스에 타입을 무엇을 쓸지 몰라서 우선 <T>로 설정
// 타입을 편하게 쓰기 위해서...(여러가지 타입)
class ThreeDPrinter<T> { // 다이아몬드 연산자안에 문자T 작성
	
	// Object대신 문자T 작성(T대신에 마음대로 설정 가능) // 원래 Object자리
	private T material;

	// 우리가 삽입하는 타입에 따라 T가 치환됨
	public T getMaterial() {
		return material;
	}

	public void setMaterial(T material) {
		this.material = material;
	} 
	
}
