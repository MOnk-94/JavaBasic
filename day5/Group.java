package day5;

import java.util.Scanner;

public class Group {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Student[] arr = new Student[3];
		
		for(int i=0;i<arr.length;i++) 	{
			System.out.println("�̸��� �Է��ϼ���:");
			String nam = sc.next();
			System.out.println("������ �Է��ϼ���:");
			int sco = sc.nextInt();
			Student sd = new Student();
			sd.setName(nam);
			sd.setScore(sco);		
			arr[i] = sd;
		}
		for(int i=0;i<3;i++) {
		System.out.println(arr[i].getName() + "�� ������?  " + arr[i].getScore());
		}

	}

}
