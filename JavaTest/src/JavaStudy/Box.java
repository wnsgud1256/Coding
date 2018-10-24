package JavaStudy;


public class Box<E> {

	private E obj; //필드 선언
	
	public void setObj(E obj)	{	//값을 설정 할수 있는 set 메서드, 값을 받아와서 설정
		this.obj = obj; 
		
	}
	
	public E getObj() {		//값을 반환하는 get 메서드
		return obj;
	}
						
}
