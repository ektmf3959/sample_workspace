package co.edu.collect;

import java.util.HashMap;
import java.util.Map;

/*
 * 키: 값 쌍으로 저장 =>Map.
 */
public class HashMapExample {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("홍길동", 80);
		map.put("김민수", 85);
		map.put("최기동", 92);
		
		int score = map.get("홍길동"); // 값을 얻으려고 키를 get(키) 사용.
		System.out.println(score);
	}
}
