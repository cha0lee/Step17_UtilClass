package test.main;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MainClass09 {
	public static void main(String[] args) {
		Map<String, Object> map1 = new HashMap<String, Object>();
		
		map1.put("num", 1);
		map1.put("name", "김구라");
		map1.put("addr", "노량진");
		
		Map<String, Object> map2 = new HashMap<>();
		
		map2.put("num", 2);
		map2.put("name", "해골");
		map2.put("addr", "행신동");
		
		Map<String, Object> map3 = new HashMap<>();
		
		map3.put("num", 3);
		map3.put("name", "원숭이");
		map3.put("addr", "동물원");
		
		//3명의 정보를 각각 담고 있는 HashMap 객체를 ArrayList객체에 누적시켜 보세요.
		List<Map<String,Object>> memberList = new ArrayList<Map<String,Object>>();
		
		memberList.add(map1);
		memberList.add(map2);
		memberList.add(map3);
		
		//이름값을 출력하여 확인.
		
		
		//아래의 메소드를 호출해 보세요.
		printMembers(memberList);	 
		
	}
	
	/*
	 * List<Map<String,Object>> 를 전달받는 static 멤버 메소드를 만들어 보세요.
	 * 메소드명: printMembers
	 */
	
	public static void printMembers(List<Map<String, Object>> arg) {
		/*
		 * 인자로 전달받은 arg에 있는 참조값을 이용해서 회원정보를 아래와 같은 형식으로 출력해 보세요.
		 * 
		 * 번호: 1, 이름: 김구라, 주소: 노량진
		 * 번호: 2, 이름: 해골, 주소: 행신동		 
		 */
		
		for(Map<String, Object> tmp:arg) {
			System.out.println("번호: " + tmp.get("num") + ", 이름: " + tmp.get("name") + ", 주소: " + tmp.get("addr"));
		}
		
	}
		
	
	

}
