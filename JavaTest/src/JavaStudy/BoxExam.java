package JavaStudy;
//제네릭 : 인스턴스를 만들때 사용하는 타입을 지정하는 문법
//제네릭을 쓰면 매번 형 변환을 할 필요가 없다
public class BoxExam {

	public static void main(String[] args) {
/*		Box box = new Box();
		box.setObj(new Object());
		Object obj = box.getObj();
		
		box.setObj("안녕");
		
		String str = (String)box.getObj();
		System.out.println(str);
		
		box.setObj(1);
		int value = (int)box.getObj();*/
		
		Box<Object> box = new Box<>();
		box.setObj(new Object());
		Object obj = box.getObj();
		
		Box<String> box2 = new Box<>();
		box2.setObj("Hello");
		String str = box2.getObj();
		
		Box<Integer> box3 = new Box<>();
		box3.setObj(4);
		int v2 = box3.getObj();
	}

}
