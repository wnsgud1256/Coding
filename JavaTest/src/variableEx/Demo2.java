package variableEx;

public class Demo2 {

	static int i;		//여기서 선언된 i는 전역변수다.
					
	
	static void a() {
		int i = 0;			//여기서 i는 메소드a안에서만 유효한 변수다.
	}						//밖의 전역변수의 i와는 전혀 무관한 변수임.
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (i= 0; i<5; i++) { //여기서의 i는 for문 안에 지역변수 i다
			a();			
			System.out.println(i);
		}
	}

}
