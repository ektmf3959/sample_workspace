package co.edu.collect.board;

import java.util.List;
import java.util.Scanner;

public class BoardApp {
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {

		// 메뉴선택 => 선택값 => 구현
		while (true) {
			System.out.println("1.목록 2.등록 3.조회(작성자) 4.삭제 5.종료");
			System.out.println("메뉴 선택 >> ");
			
			int menu = Integer.parseInt(scn.nextLine());
			String title = "";
			
			if (menu == 1) {
				System.out.println("목록보기 >>");
				BoardDAO j = BoardDAO.getInstance();
				List<Board> list = j.boardList();
				for (Board brd : list) {
					System.out.println(brd.toString());			
			} 
			}else if (menu == 2) {
				int choice = 0;
				System.out.println("이름을 입력하세요 > ");
				String title1 = scn.nextLine();
				System.out.println("제목을 입력하세요 > ");
				String title2 = scn.nextLine();
				System.out.println("내용을 입력하세요 > ");
				String title3 = scn.nextLine();
				
				BoardDAO instance = BoardDAO.getInstance();
				Board board = new Board(title1,title2,title3);
						
				instance.add(board);
			
			} else if (menu == 3) {
				System.out.println("제목을 입력하세요 > ");
				String title4 = scn.nextLine();
				
				BoardDAO instance = BoardDAO.getInstance();
				Board n2 = new Board(title4);
						
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

