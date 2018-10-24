package superEx;

public class Truck extends Car {

	public Truck() {	//기본생성자 생성
		super(); //부모의 기본 생성자를 호출  , 자동으로 부모의 생성자도호출
		System.out.println("트럭의 기본 생성자");
	}
}
