package variableEx;

public class Demo5 {

	// this는 객체 자신을 참조하는 기능이다.
	static double PI = 3.14;
	int left, right;		//매개변수 left ,right 선언.
	
	public void setOprands(int left, int right) {//매개변수로 선언된 left와 right로
		this.left = left; 		//setOprands메소드의 지역변수 left와 right를 생성.
		this.right = right;
	}
	
	public void sum() {
		System.out.println(this.left + this.right);
	}
	
	public void avg( ) {
		System.out.println((this.left+ this.right) / 2);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
