package day1;

import java.util.Scanner;

public class Login {
	public static void main(String[] args) {
		System.out.println("로그인 창");
		Scanner sc = new Scanner(System.in);

		System.out.println("ID를 입력하시오:");
		String id = sc.next();
		System.out.println("패스워드를 입력하시오:");
		String pw = sc.next();
		if (id.equals("가나다123") && pw.equals("123")) {
			System.out.println("로그인 성공");
		} else if (!id.equals("가나다123") && pw.equals("123")) {
			System.out.println("ID가 틀립니다");
		} else if (id.equals("가나다123") && !pw.equals("123")) {
			System.out.println("패스워드가 틀립니다");
		} else {
			System.out.println("로그인 실패");
		}
	}
}
