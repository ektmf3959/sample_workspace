package co.edu.io.memo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

// 등록,조회,삭제,목록
public class MemoManager {
	List<Memo> memoStorage = new ArrayList<>();
	Scanner scn = new Scanner(System.in);
	File flie = new File("c:/Dev/memo.dat");

	// 싱글톤.
	private static MemoManager instance = new MemoManager();
	
	private MemoManager() {
		// 파일 정보 => ArrayList.
		readFromFile();
		
	}
	public static MemoManager getInstance() {
		return instance;
	}

	// 등록.
	public void inputData() {
		System.out.print("메모번호> ");
		int no = Integer.parseInt(scn.nextLine());
		System.out.print("작성날짜> ");
		String date = scn.nextLine();
		System.out.print("내용> ");
		String content = scn.nextLine();

		memoStorage.add(new Memo(no, date, content));

	}

	// 날짜 입력하고 모든 메모를 리스트로 출력
	public void search() {
		System.out.println("날짜 입력> ");
		String memoDate = scn.nextLine();
		boolean isExist = false; //
		for (int i = 0; i < memoStorage.size(); i++) {
			if (memoDate.equals(memoStorage.get(i).getDate())) {
				System.out.println(memoStorage.get(i));
				isExist = true;
			}
		}
		if (!isExist) // if(isExist == false)
			System.out.println("해당 날짜의 메모가 없습니다.");
	}

	// 번호 -> 삭제.
	public void deleteData() {
		System.out.println("삭제 번호 입력> ");
		int delNo = Integer.parseInt(scn.nextLine());
		Iterator<Memo> iter = memoStorage.iterator();
		while (iter.hasNext()) {
			Memo memo = iter.next();
			if (memo.getNo() == delNo) {
				iter.remove();
				System.out.println("삭제완료.");
				return;
			}
		}
		System.out.println("일치하는 번호가 없습니다.");
	}

	// 종료.
	public void storeToFile() {
		try {
			FileOutputStream fos = new FileOutputStream(flie);
			// 객체처리해주는 보조스트림 ObjectOutputStream : ArrayList = > 바이트배열 변경.
			ObjectOutputStream oos = new ObjectOutputStream(fos);

			oos.writeObject(memoStorage);
			oos.close();
		} catch (IOException e) {

			e.printStackTrace();
		}

	}
	
	// 파일 -> 컬렉션
	public void readFromFile() {
		try {
			FileInputStream fis = new FileInputStream(flie);
			ObjectInputStream ois = new ObjectInputStream(fis);
			
			memoStorage = (List<Memo>) ois.readObject();
			ois.close();
		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
			new File("c:/Dev/memo.data");
		}
		
	}
}
