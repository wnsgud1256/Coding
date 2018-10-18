package ove;

//부모가 가지고 있는 메소드를 물려받긴 했지만 그 부모가 가지고 있는 메소드를 쓰지 않고
//자식클래스에 필요에 따라 그메소드를 재정의해서 기능을 변경하는 방법
//결론은 부모클래스에  sum이라는 이름의 클래스가 있고 그걸 자식 클래스가 상속 받고 있지만
//자식 클래스에서는 부모클래스에 있는 sum클래스의 기능이 아닌 자식클래스에서 sum기능을 새로 정의 한 후
//그 기능을 쓴다는 것이다. 이게 오버라이딩이다.
//부모의 리턴 데이터 타입과 자식의 리턴 데이터 타입이같아야함. 그리고 메소드의 이름도 같아야하고
//메소드 매개변수의 숫자와 데이터 타입 그리고 순서가 같아야 한다.
public class overriding {
	int a =1; 
	int b =2;

	public void sum( ) {
		System.out.println("a+b는"+ (a + b));
	}
	
	
	
	public static void main(String[] args) {
		
	}
}
