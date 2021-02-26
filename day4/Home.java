package day4;

import java.util.Scanner;

public class Home {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("####회원가입####");
		System.out.println("이름을 입력하시오");
		String na = sc.next();
		System.out.println("나이를 입력하시오");
		int ag = sc.nextInt();
		System.out.println("이메일을 입력하시오");
		String em = sc.next();
		System.out.println("입력한 정보:\n이름 [" + na + "] \n문자 [" + ag + "] \n이메일 [" + em + "]");
		
		Member m = new Member();
		m.setName(na);
		m.setAge(ag);
		m.setEmail(em);				
		System.out.println("저장된 정보:\n이름 [" + na + "]\n문자 [" + ag + "]\n이메일 [" + em + "]");
		System.out.println("####회원가입완료####");
	}
}
