package MethodEx;

public class MethodDemo {

	public static void main(String[] args) { 
		// TODO Auto-generated method stub
		MethodDemo1(5); //정의된 메소드 호출
		//메소드의 입력값은 매개변수를 통해서  이루어진다.
	}
	
	public static void MethodDemo1(int a) { //MethodDemo1 메소드 생성
										//여기서 a는 매개변수임.
		int i = 0;
		while (i<a) {
			System.out.print(i);
			i++;
		}
	}
	
}
