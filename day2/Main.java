package day2;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		//Scanner sc = new Scanner(System.in);
		System.out.println("####### ȸ������ #######");
		join();
	}
	public static void join() {
		Scanner sc = new Scanner(System.in);
		System.out.println("########ȸ������ â########");
		final String idInput = "���̵� �Է�";
		System.out.println(idInput);
		String id = sc.next();
		System.out.println("��й�ȣ �Է�:");
		String pw= sc.next();
		
		User us = new User();  // Ÿ���� user
		us.setId(id);
		us.setPw(pw);		
		System.out.println("����� ���� ID:" + us.getId() + "   ��й�ȣ: "+ us.getPw());
		login(us);

	}
	public static void login(User us) {
		Scanner sc = new Scanner(System.in);		
		String result = "";
		
		System.out.println("#######�α��� â########");
		System.out.println("ID �Է�:");
		String scid = sc.next();
		System.out.println("��й�ȣ �Է�:");
		String scpw = sc.next();		
	
		String id = us.getId();
		String pw = us.getPw();
		
		if(scid.equals(id) && scpw.equals(pw)) {
			result = "�α��� ����";
		}
		else if(!scid.equals(id) && scpw.equals(pw)) {
			result = "ID�� �ٸ��ϴ�";
		}
		else if(scid.equals(id) && !scpw.equals(pw)) {
			result = "����� �ٸ��ϴ�";
		}
		else result = "ID�� ��� ��� Ʋ�Ƚ��ϴ�";
				
		System.out.println(result);
	}
	
}
