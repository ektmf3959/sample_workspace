package co.edu.collect;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListExample {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("사과");
		list.add("100");

		for (int i = 0; i < list.size(); i++) {
			String result = list.get(i);
			System.out.println(result);
		}

		// List컬렉션 List (인터페이스) => ArrayList , LinkedList, vector
		List<String> sList = new ArrayList<String>();
		sList.add("홍길동");
		sList.add("김민기");
		sList.get(1); // 값을 읽어올때.
		String result = sList.get(1);
		sList.remove(0);
		sList.set(0, "황길동");

		Iterator<String> iter = sList.iterator();
		while (iter.hasNext()) {
			String val = iter.next();
			System.out.println(val);
		}
		// index 기반으로 요소를 저장
		for (int i = 0; i < sList.size(); i++) {
			System.out.println(sList.get(i));

		}
		// 확장 for 구문
		for (String val : sList) {
			System.out.println(val);
		}
	}
}
