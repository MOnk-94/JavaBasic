package day1;

import java.util.Scanner;

public class Login2 {
	public static void main(String[] args) {
		System.out.println("�α��� â");
		Scanner sc = new Scanner(System.in);
		//Ŭ���� �ν��Ͻ� ���� = new Ŭ������ ; ��ü�� ����� ��
		String result = ""; // ����Ʈ�� ������ ����
		final String WRONG = "Ʋ���ϴ�";  // (�ڵ尡 ����� ���) WRONG�� ������ ���� ǥ��

		System.out.println("ID�� �Է��Ͻÿ�:");
		String id = sc.next(); // �´� ���̵� kwon
		System.out.println("�н����带 �Է��Ͻÿ�:");
		String pw = sc.next(); // �´� ��� 1
		if (id.equals("kwon") && pw.equals("1")) {
			result = "�α��� ����";
		} else if (!id.equals("kwon") && pw.equals("1")) {
			System.out.println("ID��" + " " + WRONG);
		} else if (id.equals("kwon") && !pw.equals("1")) {
			System.out.println("�н����尡" + " " + WRONG);
		} else {
			result = "ID PW ���" + " " + WRONG;
		}
		System.out.println(result);
	}
}
