package co.edu.api;

public class ResourceExample {
	public static void main(String[] args) {
		
		Class cls = ClassEx.class;
		String path = cls.getResource("aa.txt").getPath();
		System.out.println("경로: " + path);
	}
}
