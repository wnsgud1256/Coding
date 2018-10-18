package variableEx;

//지역변수와 매개변수의 다른예제
public class Demo3 {

	static int i =5; //전역변수
	
	static void a() { 
		int i = 10; //여기서 생성된 변수i는 지역변수다.
		b();	    
	}
	
	static void b() { 
		System.out.println(i); //전역변수의 i의 값을 출력
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		a();
		//여기서 a의 값은 a메소드에 있는 지역변수가 담겨있는 값이 실행 되는게 아니라
		//전역변수로 설정된 5라는값이 실행됨
		//a메소드에 있던 지역변수i값은 사라지고 대신 a메소드에서 호출한 전역변수i의
		//값을 가지고 있는 b의 값이 최종적으로 출력이됨.
	}

}
