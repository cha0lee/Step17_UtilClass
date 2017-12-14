﻿package test.dto;
/*
 *  Data Transfer Object 의 약자 : Dto
 */
public class MemberDto {
	//맴버 필드 정의하기
	private int num;
	private String name;
	private String addr;
	
	//디폴트 생성자
	public MemberDto() {
	//생성자의 인자로 필드에 저장할 값을 전달받는 생성자	
	}

	public MemberDto(int num, String name, String addr) {
		super();
		this.num = num;
		this.name = name;
		this.addr = addr;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}
	
	
	
}
