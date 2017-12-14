package test.main;

import java.util.ArrayList;
import java.util.List;

import test.dto.MemberDto;

public class MainClass04 {

	public static void main(String[] args) {
		/*
		 * 3명의 회원정보를 각각 MemberDto 객체에 담고 ArrayList 객체에 MemberDto객체의 참조값을 누적시켜 보세요.
		 */
		 
		MemberDto mem1 = new MemberDto(1, "김구라", "노량진");
		MemberDto mem2 = new MemberDto(2, "주뎅이", "행신동");
		MemberDto mem3 = new MemberDto(3, "원숭이", "상도동");
		
		List<MemberDto> memberList = new ArrayList<MemberDto>();
		
		memberList.add(mem1);
		memberList.add(mem2);
		memberList.add(mem3);
		
		for(MemberDto tmp:memberList) {
			System.out.print(tmp.getNum() + ": " + tmp.getName() + ", " + tmp.getAddr());
			System.out.println();
		}
		
	}

}
