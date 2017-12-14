package test.main;
/*
 * [HashSet]
 * - 순서가 없다.
 * - 중복을 허용하지 않는다.
 * - 집합의 개념으로 데이터를 관리하고 싶을 때 사용한다.
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class MainClass12 {
	public static void main(String[] args) {
		
		Set<Integer> lottoNums = new HashSet<Integer>();
		
		Random ran = new Random();
		
		while(true) {
			//1~45 사이의 랜덤한 정수를 얻어낸다.
			int num = ran.nextInt(45) + 1;
			//Set에 저장
			lottoNums.add(num);
			//Set에 6개가 저장되면 반복문 탈출
			if(lottoNums.size() ==6) {
				break;//반복문 블럭 빠져나오기
			}
		}
		
		//Set를 List로 변환!
		List<Integer> nums = new ArrayList<Integer>(lottoNums);
		//정력
		Collections.sort(nums);
		//출력
		for(int tmp:nums) {
			System.out.println(tmp);
		}
	}
}
