package day4;

import java.util.Scanner;

public class Home {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("####ȸ������####");
		System.out.println("�̸��� �Է��Ͻÿ�");
		String na = sc.next();
		System.out.println("���̸� �Է��Ͻÿ�");
		int ag = sc.nextInt();
		System.out.println("�̸����� �Է��Ͻÿ�");
		String em = sc.next();
		System.out.println("�Է��� ����:\n�̸� [" + na + "] \n���� [" + ag + "] \n�̸��� [" + em + "]");
		
		Member m = new Member();
		m.setName(na);
		m.setAge(ag);
		m.setEmail(em);				
		System.out.println("����� ����:\n�̸� [" + na + "]\n���� [" + ag + "]\n�̸��� [" + em + "]");
		System.out.println("####ȸ�����ԿϷ�####");
	}
}
