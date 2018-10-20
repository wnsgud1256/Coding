package ove;

//클래스의 메소드를 정의 할때 같은이름 이지만 서로다른 매개변수의 형식을 가지고 있는 메소드를 여러개를 정할수 있는 방법
//타입과 매개변수의 수가 중요함.
public class overloading {
	
	public int plus (int x, int y) {
		
		return x + y;
	}
	public int plus (int x, int y, int z) {
		
		return x + y + z;
		
	}
	public String plus (String x, String y) {
		
		return x + y;
	}

}
