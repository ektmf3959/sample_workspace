package co.edu.collect;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.Map.Entry;

/*
 * 이름, 점수 => map저장.
 * 김민수, 80/ 황현익, 75 / 이현승,88 / 
 * Scanner 클래스 입력 > 학생이름 입력 -> 점수 반환.
 */
public class MapExample {
	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);

		Map<String, Integer> students = new HashMap<String, Integer>();
		students.put("황현익", 75);
		students.put("김민수", 80);
		students.put("이현승", 88);

		//출력결과
		//평균점수: 81
		//최고점수: 88 최고점수 학생의 이름:이현승
		
		
		System.out.println("학생 이름을 입력하세요. > ");
		String name = scn.nextLine();

		Set<Entry<String, Integer>> set = students.entrySet();
		for (Entry<String, Integer> ent : set) {
			if (ent.getKey().equals(name)) {
				System.out.println("학생의 점수: " + ent.getValue());
			}
		}

		Set<String> keySet = students.keySet();

	}
}
