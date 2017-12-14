package test.main;

import java.util.ArrayList;
import java.util.List;

public class MainClass03 {
	public static void main(String[] args) {
		//String type을 담을 수 있는 ArrayList 객체생성
		List<String> names = new ArrayList<String>();
		names.add("김구라");
		names.add("해골");
		names.add("원숭이");
		
		//List의 방의 갯수만큼 반복문을 돌면서 
		for(int i = 0; i < names.size(); i++) {
			String tmp = names.get(i);
			System.out.println(tmp);
		}
		
		System.out.println("---확장 for문 사용---");
		
		for(String tmp:names) {
			System.out.println(tmp);
		}
	}
	
}
