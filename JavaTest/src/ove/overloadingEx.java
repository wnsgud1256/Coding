package ove;

//오버로딩 활용

public class overloadingEx {
	
	public static void main(String[] args) {
		
	overloading a = new overloading(); //객체 인스턴스 생성
	
	System.out.println(a.plus(5, 7));
	
	System.out.println(a.plus(5, 7, 10));
	
	System.out.println(a.plus("hello", "Myjava"));
	}
	
}
