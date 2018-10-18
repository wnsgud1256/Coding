package variableEx;


//This의 예제

class C {
	int v = 10; // 전역변수(기본값)
	
	void m( ) {
		int v = 20; //m메소드의 지역변수
		System.out.println(v);//변수를 중첩시키는 경우에는 지역변수의
								//우선순위가 더 높기 때문에 
							  //출력은 지역변수의 값이 된다.

		System.out.println(this.v);//인스턴스 자신을 의미하는 값이 This임.
								   //This가 붙으면 객체에 대한 전역의 의미를
								   //가진다.

	}
}



public class Demo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		C c1 = new C(); //C클래스에 대한 객체를 생성후 c1이라는 변수에 담은
		c1.m(); //C클래스에 대한 메소드를 사용 할수 있기때문에
				//C클래스에 있는 m의 메소드를 실행 시킴
	}

}
