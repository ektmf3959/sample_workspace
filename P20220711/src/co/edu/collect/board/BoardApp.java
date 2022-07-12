package co.edu.collect.board;

import java.util.Scanner;

public class BoardApp {
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {

		// 메뉴선택 => 선택값 => 구현
		while (true) {
			System.out.println("1.목록 2.등록 3.조회(작성자) 4.삭제 5.종료");
			int menu = scn.nextInt(); scn.nextLine();
			
			if (menu == 1) {
				
			} else if (menu == 2) {
				int choice = 0;
				System.out.println("이름을 입력하세요 > ");
				String name = scn.nextLine();
				System.out.println("제목을 입력하세요 > ");
				String title = scn.nextLine();
				System.out.println("내용을 입력하세요 > ");
				String content = scn.nextLine();
				
				BoardDAO instance = BoardDAO.getInstance();
				Board n1 = new Board(title,name,content);
						
				instance.add(n1);
			
			} else if (menu == 3) {
				System.out.println("제목을 입력하세요 > ");
				String title = scn.nextLine();
				
				BoardDAO instance = BoardDAO.getInstance();
				Board n2 = new Board(title);
						
				instance.search(n2);
			} else if (menu == 4) {

			} else if (menu == 5) {
				System.out.println("프로그램을 종료합니다.");
				break;
			} else {
				System.out.println("잘못된 메뉴를 입력했습니다.");
			}
		}
	}

//	private static void add() {
//		int choice = 0;
//		System.out.println("이름을 입력하세요 > ");
//		String name = scn.nextLine();
//		System.out.println("제목을 입력하세요 > ");
//		String title = scn.nextLine();
//		System.out.println("내용을 입력하세요 > ");
//		String content = scn.nextLine();
		
//		BoardDAO instance = BoardDAO.getInstance();
//		Board n1 = new Board(title,name,content);
				
//		instance.add(n1);
	}

