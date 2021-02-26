package day3;

import java.util.Scanner;

public class UI {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("전화번호를 입력하시오:");
		String ph = sc.next();
		System.out.println("메세지를 입력하시오:");
		String msg = sc.nextLine();
		System.out.println("입력한 정보:전화번호 [" + ph + "] 문자 [" + msg + "]:");
		// 객체 지향 전(전송하기 전)
		System.out.println("전송버튼 클릭");
		Kakao k = new Kakao();
		k.setPh(ph);
		k.setMsg(msg);
		// 객체 지향 후(전송 완료)
		System.out.println("저장된 정보:전화번호 [" + k.getPh() + "] 문자 [" + k.getMsg() + "]:");
	}
}
