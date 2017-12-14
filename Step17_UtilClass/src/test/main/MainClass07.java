package test.main;

import java.util.ArrayList;
import java.util.List;

import test.dto.MemberDto;

public class MainClass07 {
	public static void main(String[] args) {
		MemberDto dto1 = new MemberDto(1, "김구라", "노량진");
		MemberDto dto2 = new MemberDto(2, "해골", "행신동");
		MemberDto dto3 = new MemberDto(3, "원숭이", "상도동");
		
		MemberDto[] members = new MemberDto[3];
		
		members[0] = dto1;
		members[1] = dto2;
		members[2] = dto3;
		
		//membres에 들어있는 참조값을 이용해서 "해골"을 참조해서 a라는 이름의 변수에 대입해 보세요.
		String a = members[1].getName();
		
		List<MemberDto> members2 = new ArrayList<>();
		
		for(MemberDto tmp:members) {
			members2.add(tmp);
		}
		
		//members2에 들어있는 참조값을 이용해서 "해골"을 참조해서 b라는 이름의 변수에 대입해 보세요.
		String b = members2.get(1).getName();
		
		System.out.println(b);
	
	}

}
