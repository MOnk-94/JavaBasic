package day1;

import java.util.Scanner;

public class Login {
	public static void main(String[] args) {
		System.out.println("�α��� â");
		Scanner sc = new Scanner(System.in);

		System.out.println("ID�� �Է��Ͻÿ�:");
		String id = sc.next();
		System.out.println("�н����带 �Է��Ͻÿ�:");
		String pw = sc.next();
		if (id.equals("������123") && pw.equals("123")) {
			System.out.println("�α��� ����");
		} else if (!id.equals("������123") && pw.equals("123")) {
			System.out.println("ID�� Ʋ���ϴ�");
		} else if (id.equals("������123") && !pw.equals("123")) {
			System.out.println("�н����尡 Ʋ���ϴ�");
		} else {
			System.out.println("�α��� ����");
		}
	}
}
