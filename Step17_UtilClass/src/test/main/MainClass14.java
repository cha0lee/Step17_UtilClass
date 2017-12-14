package test.main;

public class MainClass14 {

	public static void main(String[] args) {
		//java.lang.StringBuilder
		StringBuilder builder = new StringBuilder();
		
		String myStr = "";
		
		for(int i = 0; i < 10; i++) {
			builder.append("누적할 문자열...");
			myStr += "누적할 문자열2...";
		}
		
		//StringBuilder 객체에 누적된 문자열 String type으로 얻어내기
		String str = builder.toString();
		System.out.println(str);
		System.out.println("------");
		System.out.println(myStr);
		

	}

}
