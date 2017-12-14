package test.main;

import java.util.ArrayList;
import java.util.List;

import test.dto.MemberDto;

public class MainClass04_2 {

	public static void main(String[] args) {
		/*
		 * 3명의 회원정보를 각각 MemberDto 객체에 담고 ArrayList 객체에 MemberDto객체의 참조값을 누적시켜 보세요.
		 */
		
		
		int[] nums = {1, 2, 3};
		String[] memNames = {"김구라", "주뎅이", "원숭이"};
		String[] memAddr = {"노량진", "행신동", "상도동"};
		 
	
		List<MemberDto> memberList = new ArrayList<MemberDto>();
		
		for(int i = 0; i < nums.length; i++) {
			
			MemberDto member = new MemberDto();
			
			member.setNum(nums[i]);
			member.setName(memNames[i]);
			member.setAddr(memAddr[i]);
			
			memberList.add(member);
			
		}
		
		//멤버 필드 출력	
		for(MemberDto tmp:memberList) {
			System.out.print(tmp.getNum() + ": " + tmp.getName() + ", " + tmp.getAddr());
			System.out.println();
		}
		
	}

}
