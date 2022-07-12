package sec01.exam14;

public class AutoBoxingUnBoxingExample {
	public static void main(String[] args) {
		// 자동복싱
		Integer obj = 100;
		System.out.println("Value: " + obj.intValue());

		// 대입시 자동언박싱
		int value = obj;
		System.out.println("Value: " + value);

		
		
		
		// 연산시 자동 언박싱
		int result = obj + 100;
		System.out.println("result: " + result);
	}
}
