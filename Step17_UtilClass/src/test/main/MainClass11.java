package test.main;
/*
 * [HashSet]
 * - 순서가 없다.
 * - 중복을 허용하지 않는다.
 * - 집합의 개념으로 데이터를 관리하고 싶을 때 사용한다.
 */

import java.util.HashSet;
import java.util.Iterator;

public class MainClass11 {
	public static void main(String[] args) {
		
		HashSet<Integer> nums = new HashSet<Integer>();
		nums.add(10);
		nums.add(20);
		nums.add(30);
		nums.add(40);
		nums.add(50);
		nums.add(50);
		nums.add(50);
		nums.add(40);
		
		int size = nums.size();
		
		//반복자 객체 리턴 받기
		Iterator<Integer> it = nums.iterator();
		while(it.hasNext()) {
			int tmp=it.next();
			//콘솔에 출력해 보기
			System.out.println(tmp);
		}
		
	}
}
