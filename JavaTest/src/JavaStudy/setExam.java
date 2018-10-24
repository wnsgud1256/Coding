package JavaStudy;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class setExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> set1 = new HashSet<>();
		boolean flag1 = set1.add("kang");
		boolean flag2 = set1.add("park");
		boolean flag3 = set1.add("kang");
		
		System.out.println(set1.size()); //true 값만  계산 해서 2가 나옴 중복된 값은 false임
		
		System.out.println(flag1);
		System.out.println(flag2);
		System.out.println(flag3);
		
		Iterator<String> iter = set1.iterator();//하나씩 꺼냄
		while(iter.hasNext())	{	//지금 현재 이 set에  자료구조에 자료구조가 있으면 true 아니면 false 값을 반환
		String str = iter.next();//값을 꺼낼때 인덱스가 필요한게 아니기 때문에 for 보단 while문을 쓰는게좋음.
		System.out.println(str);//next는 값을 꺼낸후 다음 값을 꺼내는 구문 set자료에있던 모든 값들을 꺼내서 출력함.
		}
		}

}
