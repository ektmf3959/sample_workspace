package com.edu;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentApp {

	List<Student> list = new ArrayList<Student>();
	Scanner scn = new Scanner(System.in);

	public void execute() {
		System.out.println("1.등록 2.수정 3.리스트 9.종료");
		System.out.println("선택> ");
		int selectNo = Integer.parseInt(scn.nextLine());
	
		while (true) {
			if(selectNo==1) {
				System.out.println("1.고등학생 2.대학생");
				int choice = Integer.parseInt(scn.nextLine());
				System.out.println("학생번호> ");
				String studNo = scn.nextLine();
				System.out.println("학생 이름> ");
				String studName = scn.nextLine();
				System.out.println("점수> ");
				int score = scn.nextInt();			
				
				if(choice == 1) {
					System.out.println("담임교사> ");
					String teach = scn.nextLine();
					System.out.println("학년 정보>" );
					String grade = scn.nextLine();
				} else if (choice == 2) {
					
				} else if (choice == 3) {
					for (int i = 0; i < list.size(); i++) {
						if (student.getStudNo() == list.get(i).getStudNo()) {
							members.get(i).setPhone(member.getPhone());
						}
				}
					}
			}
		}
		
	}
	
	public void addStudent() {
		
	}
	
	public void modStudent() {
		
	}
	
	public void studentList() {
		
	}
}
