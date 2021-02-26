package day1;

import java.util.Scanner;

public class Login2 {
	public static void main(String[] args) {
		System.out.println("로그인 창");
		Scanner sc = new Scanner(System.in);
		//클래스 인스턴스 변수 = new 클래스명 ; 객체를 만드는 식
		String result = ""; // 디폴트가 변수인 상태
		final String WRONG = "틀립니다";  // (코드가 길어질 경우) WRONG은 상수라는 것을 표현

		System.out.println("ID를 입력하시오:");
		String id = sc.next(); // 맞는 아이디 kwon
		System.out.println("패스워드를 입력하시오:");
		String pw = sc.next(); // 맞는 비번 1
		if (id.equals("kwon") && pw.equals("1")) {
			result = "로그인 성공";
		} else if (!id.equals("kwon") && pw.equals("1")) {
			System.out.println("ID가" + " " + WRONG);
		} else if (id.equals("kwon") && !pw.equals("1")) {
			System.out.println("패스워드가" + " " + WRONG);
		} else {
			result = "ID PW 모두" + " " + WRONG;
		}
		System.out.println(result);
	}
}
