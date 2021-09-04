package pack002;

import java.io.*;
import java.util.*;






/*
// 입출력 프로그램 - 파일 reading
public class InputOutputEx {

	public static void main(String[] args) {
		try {
			Reader r = new FileReader("test02.txt");	
			
			while(true) {		
				int data = r.read();
				if(data == -1) {		// 음수값이 리턴되면 파일을 다 읽었다는 뜻
					break;
				}
				System.out.println((char)data);
			}
			
//			System.out.println((char)data);
			r.close();									
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(1000);
	}

}
*/




/*
// 파일 입출력 예시1)
public class InputOutputEx {

	public static void main(String[] args) {
		try {
			Writer w = new FileWriter("test01.txt");	// 파일을 열었음, 만듬
			
			for (int i = 0; i < 8; i++) {
				for (int j = 0; j < 10; j++) {
					w.write((i+j)%2==0 ?"o ":"x ");		// 삼항연산자 연습좀 하자
				} w.write("\n");
			}

			
			w.close();								// 파일을 닫음
			System.out.println("파일 입출력 종료");		// 파일을 닫고나면 상황이 끝났다는 출력코드를 걸어주는게 좋음
			
			
		} catch (Exception e) {

		}
	}

}
*/





/*
// 파일 입출력
// 파일을 열고 나서는 닫아야함
// 왜냐면 다른곳에서 사용 못하기 때문
class Lion{		// 모든 클래스의 부모는 object임, 원래 Lion 클래스 부모가 있음
	
}

public class InputOutputEx {

	public static void main(String[] args) {
		try {
			Writer w = new FileWriter("test01.txt");	// 파일을 열었음, 만듬
			
			w.write("apple");		// 출력하고자 하는 내용을 집어넣기
			w.write("\n\n");
			w.write("무궁화");
			
			
			w.close();								// 파일을 닫음
			System.out.println("파일 입출력 종료");		// 파일을 닫고나면 상황이 끝났다는 출력코드를 걸어주는게 좋음
			
			
		} catch (Exception e) {

		}
	}

}
*/














/*
// 이중 for문
public class InputOutputEx {

	public static void main(String[] args) {
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 4; j++) {
				System.out.print("[" + i + " " + j + "]");
			}
			System.out.println();
		}System.out.println();
	
		
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 6; j++) {
				if((i+j)%2 == 0) {
					System.out.print("o ");
				}else {
					System.out.print("x ");
				}
			}System.out.println();
		}System.out.println();
	
	}

}
*/






