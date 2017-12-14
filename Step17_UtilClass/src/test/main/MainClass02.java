package test.main;

import java.util.ArrayList;
import java.util.List;

public class MainClass02 {
	public static void main(String[] args) {
		//String type을 담을 수 있는 ArrayList 객체생성
		List<String> msgs = new ArrayList<String>();
		msgs.add("하나");
		msgs.add("두울");
		msgs.add("세엣");
		
		//ArrayList에는 기본데이터 타입을 담을 수 없고 참조 데이터 타입을 담아야 한다. int = Integer, double = Double
		//int type을 담을 수 있는 ArrayList 객체 생성
		List<Integer> nums = new ArrayList<Integer>();
		nums.add(10);
		nums.add(20);
		nums.add(30);
		
		String a = msgs.get(0);
		String b = msgs.get(1);
		String c = msgs.get(2);
	}

	
}
