package test.main;

import java.util.HashMap;
import java.util.Map;

public class MainClass08 {
	public static void main(String[] args) {
		/*
		 * javascript에서의 {}와 유사하게 데이터를 관리하는 type
		 * - HashMap
		 */
		//HashMap<key generic, value generic>
		Map<String, Object> map = new HashMap<>();
		map.put("num", 1);
		map.put("name", "김구라");
		map.put("isMan", true);
		
		//변수에 담을 때에는 value의 원래 data type으로 캐스팅해야함
		int a = (int)map.get("num");
		String b = (String)map.get("name");
	}
}
