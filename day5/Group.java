package day5;

import java.util.Scanner;

public class Group {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Student[] arr = new Student[3];
		
		for(int i=0;i<arr.length;i++) 	{
			System.out.println("이름을 입력하세요:");
			String nam = sc.next();
			System.out.println("점수를 입력하세요:");
			int sco = sc.nextInt();
			Student sd = new Student();
			sd.setName(nam);
			sd.setScore(sco);		
			arr[i] = sd;
		}
		for(int i=0;i<3;i++) {
		System.out.println(arr[i].getName() + "의 점수는?  " + arr[i].getScore());
		}

	}

}
