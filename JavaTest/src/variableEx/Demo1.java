package variableEx;

public class Demo1 {
	
	//매개변수의 예제
	public static String numbering(int init, int limit) {
		int i = init;
		
		String output = "";
		while (i<limit) {
			//숫자를 화면에 출력 하는대신 변수 output에 값을 담음
			output += i;
			i++;
			
		}
		//output으로 리턴을 했기 때문에 output에 담긴 값들이 numbering에 담긴다.
		return output;
	}

	//void는 출력값 존재x 따라서 리턴값이 없다.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String result = numbering(1,5);
		//numbering이 리턴한 값이 변수 result에 담긴다.
		System.out.println(result);
	}

}
