package ArrayEx;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


public class ArrayExam1 {

	public static void main(String[] args) {
	
		//로또 번호뽑기
		Set<Integer> set = new HashSet<Integer>();
		
		while(set.size()<6) {
			int result = (int) (Math.random() * 45 +1);
			set.add(result);
		}
		
		List<Integer> list = new ArrayList<Integer>(set);
		
		for(Integer result : list) {
			System.out.print(result);
			System.out.print(",");
		}		
		
		}
	}


