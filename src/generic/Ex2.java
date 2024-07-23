package generic;

public class Ex2 {

	public static void main(String[] args) {

		ThreeDPrinter3 printer = new ThreeDPrinter3();
		
		Powder p1 = new Powder(); // Powder를 재료로 선택
		
		// Object material = new Powder()
		printer.setMaterial(p1); // 매개변수가 자동으로 형변환됨
		
		Object object = printer.getMaterial();
		
		// 재료를 꺼낼때는 직접 형변환을 해야함..
		// Object 타입의 변수를 다운캐스팅 했음
		Powder p2 = (Powder)object;  
				
		p2.doPrinting();

	}

}

// 파우더와 플라스틱을 재료로 사용하는 프린터 만들기
class ThreeDPrinter3 {
	
	private Object material; //자료형을 Object로 선언하면 파우더와 플라스틱 모두 저장할 수 있음

	public Object getMaterial() {
		return material;
	}

	public void setMaterial(Object material) {
		this.material = material;
	}
	
}