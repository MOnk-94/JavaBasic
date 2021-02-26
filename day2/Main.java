package day2;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		//Scanner sc = new Scanner(System.in);
		System.out.println("####### 회원관리 #######");
		join();
	}
	public static void join() {
		Scanner sc = new Scanner(System.in);
		System.out.println("########회원가입 창########");
		final String idInput = "아이디 입력";
		System.out.println(idInput);
		String id = sc.next();
		System.out.println("비밀번호 입력:");
		String pw= sc.next();
		
		User us = new User();  // 타입의 user
		us.setId(id);
		us.setPw(pw);		
		System.out.println("당신이 정한 ID:" + us.getId() + "   비밀번호: "+ us.getPw());
		login(us);

	}
	public static void login(User us) {
		Scanner sc = new Scanner(System.in);		
		String result = "";
		
		System.out.println("#######로그인 창########");
		System.out.println("ID 입력:");
		String scid = sc.next();
		System.out.println("비밀번호 입력:");
		String scpw = sc.next();		
	
		String id = us.getId();
		String pw = us.getPw();
		
		if(scid.equals(id) && scpw.equals(pw)) {
			result = "로그인 성공";
		}
		else if(!scid.equals(id) && scpw.equals(pw)) {
			result = "ID가 다릅니다";
		}
		else if(scid.equals(id) && !scpw.equals(pw)) {
			result = "비번이 다릅니다";
		}
		else result = "ID와 비번 모두 틀렸습니다";
				
		System.out.println(result);
	}
	
}
