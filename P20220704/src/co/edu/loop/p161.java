package co.edu.loop;

import java.util.Scanner;

public class p161 {

	public static void main(String[] args) {
		
		boolean run = true;
		int balance = 0;
		Scanner scanner = new Scanner(System.in);

		while(run) {
			System.out.println("-----------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("-----------------------------");
			System.out.print("선택> ");
			
			int menu = scanner.nextInt();
			if (menu == 1) {
				System.out.print("예금액>");
				int amt = scanner.nextInt();
			}
		}
		System.out.println("프로그램 종료");
	}
}
