package test.main;

import java.util.ArrayList;
import java.util.List;

import test.dto.MemberDto;

public class MainClass06 {

	public static void main(String[] args) {
		
		String[] names = new String[3];
		names[0] = "김구라";
		names[1] = "해골";
		names[2] = "원숭이";
		
		//1번 방의 데이터 참조해서 변수에 담기
		String a = names[1];
		
		//배열의 방의 갯수
		int length = names.length;
		
		//2번 방 삭제?
		names[2] = null; //방 자체는 삭제 불가
		
		ArrayList<String> names2 = new ArrayList<String>();
		names2.add("김구라");
		names2.add("해골");
		names2.add("원숭이"); 
		
		//1번 인덱스의 데이터 참조해서 변수에 담기
		String b = names2.get(1);
		
		//가변 배열의 현재 방의 갯수
		int size = names2.size();//메소드로 리턴받기
		
		//2번 방 삭제
		names2.remove(2);
		
		//아래에 추가한 printNames()메소드를 호출해 보세요.
		printNames(names);
		
		//아래에 추가한 printFriends()메소드를 호출해 보세요.
		printFriends(names2);
		
	}
	
	/* String[] type을 인자로 전달받는 static 멤버 메소드를 만들어 보세요.
	 * 접근지정자: public
	 * return type: void
	 * method name: printNames
	 * 메소드에 전달되는 인자를 받을 변수명: names
	 */ 
	
	public static void printNames(String[] arg) {
		//반목문 돌면서 배열에 있는 모든 문자열을 출력하는 코드를 작성해 보세요.
		for(String tmp:arg) {
			System.out.println(tmp);
		}		
	}
	
	/* List<String> type을 인자로 전달받는 static 멤버 메소드를 만들어 보세요.
	 * 접근지정자: public
	 * return type: void
	 * method name: printFriends
	 * 메소드에 전달되는 인자를 받을 변수명: arg
	 */ 
	
	public static void printFriends(List<String> arg) {
		
	}

}
