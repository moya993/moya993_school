package pack002;

import java.io.*;
import java.util.*;






/*
// ����� ���α׷� - ���� reading
public class InputOutputEx {

	public static void main(String[] args) {
		try {
			Reader r = new FileReader("test02.txt");	
			
			while(true) {		
				int data = r.read();
				if(data == -1) {		// �������� ���ϵǸ� ������ �� �о��ٴ� ��
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
// ���� ����� ����1)
public class InputOutputEx {

	public static void main(String[] args) {
		try {
			Writer w = new FileWriter("test01.txt");	// ������ ������, ����
			
			for (int i = 0; i < 8; i++) {
				for (int j = 0; j < 10; j++) {
					w.write((i+j)%2==0 ?"o ":"x ");		// ���׿����� ������ ����
				} w.write("\n");
			}

			
			w.close();								// ������ ����
			System.out.println("���� ����� ����");		// ������ �ݰ��� ��Ȳ�� �����ٴ� ����ڵ带 �ɾ��ִ°� ����
			
			
		} catch (Exception e) {

		}
	}

}
*/





/*
// ���� �����
// ������ ���� ������ �ݾƾ���
// �ֳĸ� �ٸ������� ��� ���ϱ� ����
class Lion{		// ��� Ŭ������ �θ�� object��, ���� Lion Ŭ���� �θ� ����
	
}

public class InputOutputEx {

	public static void main(String[] args) {
		try {
			Writer w = new FileWriter("test01.txt");	// ������ ������, ����
			
			w.write("apple");		// ����ϰ��� �ϴ� ������ ����ֱ�
			w.write("\n\n");
			w.write("����ȭ");
			
			
			w.close();								// ������ ����
			System.out.println("���� ����� ����");		// ������ �ݰ��� ��Ȳ�� �����ٴ� ����ڵ带 �ɾ��ִ°� ����
			
			
		} catch (Exception e) {

		}
	}

}
*/














/*
// ���� for��
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






