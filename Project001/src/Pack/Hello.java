package Pack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import java.util.Vector;




/*
// ex)
public class Hello 
{
	public static void main(String[] args) 
	{	
		System.out.println("1000");
	}
}
*/



















//ex51)		���� �Լ�		
public class Hello 
{
	public static void main(String[] args) 
	{	
		LinkedList<Integer> mm = new LinkedList<Integer>();
		mm.add(33);
		mm.add(44);
		mm.add(77);
		for (int i = 0; i < 10; i++) {
			mm.add(i*2);
			
		}
		mm.add(101);
		mm.add(102);
		mm.add(103);
		System.out.println(mm);
		
		
		
		// 1. ¦���� �����Ϸ���? 1��
//		int size = mm.size();
//		
//		
//		for (int i = mm.size()-1; i >= 0; i--) {
//			if(mm.get(i) % 2 == 0) {
//				mm.remove(i);
//			}
//		}
//		System.out.println(mm);
		
		
		
		// 2.  ¦���� �����Ϸ���? 2��
//		for (int i = 0; i < 15; i++) {
//			int a = mm.get(15-i) % 2;
//				if (a % 2 == 0) {
//					mm.remove(15-i);
//				}
//		}
//		System.out.println(mm);
//		

		// 3. ¦���� �����Ϸ���? �������1. ���־Ⱦ�
//		for (int i = 0; i < mm.size(); ) {
//			int num = mm.get(i);
//			if(num % 2 == 0) {
//				mm.remove(i);
//			}else {
//				i++;
//			}
//		}
//		System.out.println(mm);
		
		
		// 4. ¦���� �����Ϸ���? ���ô���2. ���ͷ����� Ŭ���� ����ؼ� ��Ÿ��
//		for (Iterator<Integer> it = mm.iterator(); it.hasNext(); ) {	// hasNext();�� True �ƴϸ� False�� ������
//			Integer num = it.next();
//			if(num % 2 == 0) {
//				it.remove();
//			}
//		}
//		System.out.println(mm);
		
		
		// 5. ¦���� �����Ϸ���? �������3. removeIf �� �𸣰���, �ڵ���� �ȵ�
		// removeIf( Predicate<> )
//		mm.removeIf(new Predicate<Integer>() {
//			@Override
//			public boolean test(Integer num) {
//				return num % 2 == 0;
//			}
//		});		// removeIf()�� ���ǿ� ���缭 ��������
//		
//		System.out.println(mm);
//		
		
		// 5. ¦���� �����Ϸ���? �������4. ���� �Լ� ���
		mm.removeIf( num -> num % 2 == 0 );		// ->�� arrow �����ڶ�� ��
		System.out.println(mm);
		
	}
}






/*
//ex50)		������ ã��
public class Hello 
{
	public static void main(String[] args) 
	{	
		LinkedList<Integer> mm = new LinkedList<Integer>();
				
		for (int i = 0; i < 10; i++) {
			mm.add(i*10+i);
		}
		System.out.println(mm);
		
		for (int i = 0; i < mm.size(); i++) {
			int num = mm.get(i);
//			System.out.println(num);
			if(num == 44) {
				System.out.println(i+"��° ã�Ҵ�.");
				break;
			}
			if(i == mm.size()-1) {
				System.out.println("��ã��");
			}
		}
		
		System.out.println(mm);
		
		for (int i = 0; i < mm.size(); i++) {
			int x = mm.get(i);
			if(x == 55) {
				mm.remove(5);
			}
		}
		System.out.println(mm);
		

		
	}
}
*/





/*
//ex49)	*****CRUD***** 
// CRUD������ �޸� ������� �ӵ��� ����
// CRUD Ư�� Ȯ���غ���
public class Hello 
{
	public static void main(String[] args) 
	{	
		// �ؿ��� <Integer>�� �������ִ� �����̳��̴�.    <>   <- �����̳���
		LinkedList<Integer> mm = new LinkedList<Integer>();
		
		// CRUD ���� 4����
		
		// 1. C(Create)RUD
		mm.add(10);
		System.out.println(mm.size());	// �����͸� � ������ �ִ��� Ȯ��
		for (int i = 0; i < 10; i++) {
			mm.add(i*10+i);
		}
		
		System.out.println("-------------");
		
		// 2. CR(Reading)UD
		// 2-1. 
		System.out.println(mm);
		
		// 2-2. for�� Ȱ��
		// Ȱ�뵵�� ���� ����
		int size = mm.size();		// ��� ������ ���� �Լ��� �̸� ������ �־��ְ� ����ϼ�
		for (int i = 0; i < size; i++) {	// ��� ������ ���� ������ mm.size()�� ������ �־� ����ؾ���
			int data = mm.get(i);
			System.out.print(data + " ");
		}System.out.println();
		
		// 2-3. for-each��
		// ���� ���� ������ x, item, data, value������ ������ ���
		for (Integer x : mm) {
			System.out.print(x + " ");
		}System.out.println();
		

		System.out.println("-------------");
		
		
		// 3. CRU(Update)D
		mm.set(5, 999);		// 5�� �ڵ带 999�� ����
		System.out.println(mm);
		
		
		System.out.println("-------------");
		
		// 4. CRUD(Delete)
		mm.remove(5);	// 5�� �ڵ带 ����
		System.out.println(mm);
		
		
		
	}
}
*/














/*
//ex48-2)	����2
public class Hello 
{
	public static void main(String[] args) 
	{	

		// 0000 0000 1101 1100
				char c5 = 0x00dc;	// 1101 1100
				char mask = 0x80;	// 1000 0000
				String [] elec = new String[] {
						"������","��ǳ��","��ġ�����","��Ź��",
						"TV","���������̱�","��Ʈ��","��ǻ��"
						};
			
				
//				for (int i = 0; i < 8; i++)
//				{
//					System.out.println(
//							(c5 & mask)== mask ?
//							elec[i] +" ON":
//							elec[i] +" OFF");
//					mask >>= 1;
//				}

//				�� �Ʒ� ����
				
				
				for (int i = 0; i < 8; i++, mask >>= 1) 
				{
					System.out.println(
							(c5 & mask) == mask ?
							elec[i] +" ON":
							elec[i] +" OFF");
					
				}
	
	}
}
*/





/*
//ex48-1)	����
public class Hello 
{
	static String hexaToBinary(int n) {
		String s = Integer.toBinaryString(n);	// ���������� ġȯ������
		while(s.length() < 32) 
			s = "0" + s;
		
		
		StringBuffer s1 = new StringBuffer(s);
		for (int i = 0; i < 7; i++) 
			s1.insert((7-i)*4, " ");
		
		return s1.toString();
	}

	
	public static void main(String[] args) 
	{	
		int a = 0x0000cd5a;
		int b = 0x0000ff00;
		int d = 0x0000cd5a; 
	    int e = 0x000007e0;
		int f = 0x0000001f;
		
	    
		System.out.println(hexaToBinary(a));
		System.out.println(hexaToBinary(b));
		System.out.println(hexaToBinary( a & b ));	
		System.out.println(hexaToBinary( a & b >> 8 ));	// ���������� beat shift�� �߻�
		System.out.println((a & b) >> 8);	// cd00
		System.out.println("-----------------");
		
		System.out.println(hexaToBinary(d));
		System.out.println(hexaToBinary(e));
		
		System.out.println("-----------------");
		
		//25
		System.out.println(hexaToBinary(d));
		System.out.println(hexaToBinary(d & 0xc800));
		System.out.println((d & 0xf800) >> 11);


		//42
		System.out.println(hexaToBinary(d & e));
		System.out.println((d & e) >> 5);
		
		//26
		System.out.println(hexaToBinary(d & f));
		System.out.println(d & f);
		
		
		System.out.println("-----------------");
		int g = 0x0000cd5a;
		int h = 0x77000000;
		System.out.println(hexaToBinary(g | h));
		int c1 = 25; 
		int c2 = 42;
		int c3 = 26;
		int c4;
		
		
		
		c4 = (42 << 5)|(25 << 11)|26;
		System.out.println(hexaToBinary(c4));
		System.out.println(Integer.toHexString(c4));
	
		
		System.out.println("----------------- ");
		
		
//		c ������ǰ ����***************���ؿϷ�
	      char mask = 0x0080; // 0000 0000 1000 0000 , mask�����͸� ����Ʈ �����ڸ� ����ؼ� �б�
	      char n5 = 0x00dc;   // 0000 0000 1101 1100
	      String s2 = hexaToBinary(n5);
	      System.out.println(s2);
	      System.out.println(hexaToBinary(mask));
	      
	      String[] word = {"��ǳ��", "û�ұ�", "������", "���ڷ�����", "���������̾�", "��ǻ��", "�����", "����"};
	      
//	      8���� ���¸� ���
	      for(int i = 0; i < 8; i++) { 

	         if((n5 & (mask >> i)) == 0) {
	        	 word[i] += "�� �����ִ�.";
	        	 System.out.println(word[i]);
	         }else {
	        	 word[i] += "�� �����ִ�.";
	        	 System.out.println(word[i]);
	         }
	         
	         
	      }
			
	      
	      
	      
		
		
		
		
	}
}

*/









/*
// ex48)	����
public class Hello 
{
	static String hexaToBinary(int n) {
		String s = Integer.toBinaryString(n);	// ���������� ġȯ������
//		System.out.println(s);
//		System.out.println(s.length());
		while(s.length() < 32) {
			s = "0" + s;
		}
//		System.out.println(s);
		
		StringBuffer s1 = new StringBuffer(s);
//		s1.insert(4, "��");
//		System.out.println(s1);
//		s1.insert(9, "��");
//		System.out.println(s1);
		for (int i = 0; i < 7; i++) {
//			System.out.println((7-i)*4);
			s1.insert((7-i)*4, " ");
		}
//		System.out.println(s1);
		return s1.toString();
	}
	
	static int m1() {
		System.out.println(m1());
		return 100;
	}
	
	public static void main(String[] args) 
	{	
		// hexaToBinary�� 2������ ��� : 0011 1011 0001 0010 1100 1101 0101 1001
		// c�� �������� ��� : 0011 1011 0001 0010 1100 1101 0101 1001
		int a = 0x3b12cd59;		// d�� ����
		int b = 991087961; 		// c�� ����
		System.out.println(a);
		if(a == b) {
			System.out.println(1);
		}
		System.out.println(hexaToBinary(a));
		System.out.println(hexaToBinary(b));
		
	}
}
*/






/*
// ex47)	String Ŭ������ ������ �ִ°͵�

// String �����͸� �����ų �� ����.!!!!!!!!!!!!!!!!!!!!!!!!!!

public class Hello 
{
	public static void main(String[] args) 
	{	
		String s = "����ȭ�����Ǿ����ϴ�";	//
		
		// 1. String.length()
		// ���� ���� ���
		System.out.println(s.length());
		
		System.out.println("--------------------");
		
		// 2. charAt(int index)
		// index�� �μ����޸� ���ָ�charŸ������ ���ϵ�
		// index��ȣ�� �ִ� ���ڸ� �����
		// 3�� ���ڸ� �ϳ� �⎹��
		System.out.println(s.charAt(3));
		
		System.out.println("--------------------");
		
		// 3. indexOf(String str)
		// str�� �ش�Ǵ� �ε��� ��ȣ�� �����
		// ��ã���� -1�� ���
		System.out.println(s.indexOf("ȭ����"));
		System.out.println(s.indexOf("�����"));
		
		int n = s.indexOf("ȭ����");
		if(n != -1) {
			System.out.println(n+"��° find");
		} else {
			System.out.println("not found");
		}
		
		System.out.println("--------------------");
		
		// 4. String.replace(CharSequence target, CharSequence replacement)
		// ����!!! : ���� �����Ͱ� ����Ǿ��°� Ȯ��
		// �տ� �Է¹޴°� Ÿ��, �ڰ� ��ü�� ����
		System.out.println(s.replace("����", "������"));
		System.out.println(s);
		
		// !!!!!!!!!!!String�� �����͸� ������ �� ����!!!!!!!!!!!!!!!!!!
		// s�� ����Ȱ� �ƴմϱ�? ������ �����͸� �����Ѱ� �ƴϰ� ������ ��ü�� ����!!!!!!!!!!!!!!
		// �ؿ� s�� ��ü�� ���� �������
//		s = "���ѹα�";
		System.out.println(s);
		
		System.out.println("--------------------");
		
		// 5. String.substring(int beginIndex)
		// �����̽�
		// ���� �ڸ����� ���������� �߶� ���
		System.out.println(s.substring(5));
		System.out.println(s.substring(3,6));
		
		System.out.println("--------------------");
		
		// 6. String.trim()
		// ���̵� ��� �α����� �� �ַ� ���
		// �� ���� ���� ����
		String s2 = "   App   le   ";
		System.out.print(s2.trim());
		System.out.println("ȣ����");
		
		System.out.println("--------------------");
		
		// 7. 
		// String.toUpperCase()
		// String.toLowerCase()
		// �빮�ڷ� ����� ��, �ҹ��� �������
		String s3 = "APple";
		System.out.println(s3.toUpperCase());
		System.out.println(s3.toLowerCase());
		
		System.out.println("-------------------");
		
		
		// 8. �����͸� �޾��� �� ���
		byte[] data = new byte[] {65, 'B', 'C', 'D'};
		String s4 = new String(data, 0, data.length);
		System.out.println(s4);		// ���ڿ��� ��ȯ��
		
		// �����͸� �ϳ��� ������ �� ���
		String s5 = "Banana";
		byte[] data1 = s5.getBytes();
		for (byte value : data1) {
			System.out.println((char)value);
		}
		

	}
}
*/











/*
// ex46-2)		try-catch��, finally�� ����ϴ� ����
class Tiger{
	void m1(int a, int b) {
		if(a>b) {
			System.out.println(1);
		} else {
			return;
		}
		System.out.println(2);
	}

	void m2(int a, int b) {
		try {
			if(a>b) {
				System.out.println(1);
			} else {
				return;
			}
			System.out.println(2);			
		} catch (Exception e) {
			// TODO: handle exception
		} finally {		// ����ó���� ���� ������ ����Ǵ� �ڵ�
			System.out.println(2);
			
		}

	}
}
	
public class Hello 
{
	public static void main(String[] args) 
	{	
		try {
			int a = 10 / 1;
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			System.out.println(2);
		}
		
		System.out.println("--------------");
		
		Tiger t1 = new Tiger();
		
		t1.m1(3, 1);
		
		System.out.println("--------------");
		
		t1.m2(3, 1);
		
	}
}
*/










/*
// ex46-1)		Exception(����ó��) ,try-catch���� ����ϴ� ����
// throw�� try-catch�� �ѽ��� 
class Tiger{
	
	// 1��
	// try catch�� 
	void m1() {
		System.out.println(1);
		
		try {
			throw new Exception();		// �Ϻη� exception�� �߻���Ű�� �ڵ�			
		} catch (Exception e) {			// throw���� �ݵ�� try-catch���� �Բ� �����
			System.out.println("Exception �߻���");
		}
	}
	
	// 2��
	// try catch�� ���� Exception ������ ���ִ� ���
	// �Լ� �̸� �ڿ� throws Exception�� �־���
	// �� ����� �� �Լ��� ����ϴ� ����� �˾Ƽ� try-catch���� ����� Ȯ���϶�� ��
	// ���� ���ѱ��, å�������� ������
	void m2() throws Exception{
		System.out.println(2);
		
		throw new Exception();				
	}
}


public class Hello 
{
	public static void main(String[] args) 
	{	
		
		Tiger t1 = new Tiger();
	
		
		// 1��
		t1.m1();
		
		
		// 2��
		try {
			t1.m2();
		} catch (Exception e) {
			
		}
		System.out.println(3);
		
		
		// Thread
		for (int i = 0; i < 5; i++) {
			System.out.println(i);
			try {  Thread.sleep(2000);	} catch (Exception e) {}	// unhandle Exception������ ��ٸ� try-catch������ ��		
		}

		
		
	}
}

*/



/*
// ex46)	Exception(����ó��), try catch���� ���� ��
// Exception�� ������ �߻��ߴٴ°� ���α׷��� �˸��� ����
// �� �� try catch������ ������ ����Ұ��� �ߴ��Ұ��� �����ؾ���
// ���α׷��� �ߴܽ�Ű�°� ������ �ƴ�

public class Hello 
{
	public static void main(String[] args) 
	{	
		// 1��° Exception
		System.out.println(1);	// ������ε� ����� ��
		try {	
//			int a = 10 / 0;							
		} catch (Exception e) {
			e.printStackTrace();	
		}
		System.out.println(2);
		
		
		// 2��° Exception
		// ArrayIndex(OutOfBounds)Exception - ������ �Ѿ��� ���
		// try-catch���� ����ϸ� ��� ���α׷��� �ߴܵ����� ����
		int[]ar = {1, 2, 3};
		try {		
			ar[3] = 10;						
		} catch (Exception e) {

		}
		System.out.println(3);
		
		
		// 3��° Exception
		// (NullPointer)Exception
		String s = "����ȭ�����Ǿ����ϴ�.";
		System.out.println(s.length());
		s = null;
		try {
			System.out.println(s.length());		// ��ü�� �ƴ�ģ���� ���̸� ����Ϸ���
		} catch (Exception e) {			// Exception�� �Ⱦ��� ���������� ������ ����� �ȵ�
			// TODO: handle exception
		}
		System.out.println(4);	
		
	}
}
*/









/*
// ex45-5)	�������̽� ����5
// ���� �� ������� �������̽�
class Baduk{
	
	Ai ai;	// ��ü����
	
	Baduk(){
		System.out.println("�뱹�� �����մϴ�.");
	}
	Baduk(Ai ai){	// ��ü���� �ʱ�ȭ
		this.ai = ai;
	}
	void play() {
		ai.play();
	}
	void stop() {
		ai.stop();
	}

}

interface Ai{
	void play();
	void stop();
}


//���ۿ��� ����
class Alphago implements Ai{
	@Override
	public void play() {
		// TODO Auto-generated method stub
		System.out.println("�ΰ������� ���İ� �Դϴ�.");
	}
	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("���İ� ���� ����� �մϴ�.");
	}
	
	
}

//�Ƹ������� ����
class Betago implements Ai{
	@Override
	public void play() {
		// TODO Auto-generated method stub
		System.out.println("�ΰ������� ��Ÿ�� �Դϴ�.");
	}
	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("��Ÿ�� ���� ����� �մϴ�.");
	}
	
}


public class Hello 
{
	public static void main(String[] args) 
	{	
		Baduk baduk1 = new Baduk(new Alphago());
		Baduk baduk2 = new Baduk(new Betago());
		
		baduk1.play();
		baduk1.stop();
		baduk2.play();
		baduk2.stop();
		
	}
}
*/








/*
//ex45-4)	����4
class Baduk{
	Baduk(){
		System.out.println("�뱹�� �����մϴ�.");
	}

	void play(Ai ai) {
		ai.play();
	}

	void stop(Ai ai) {
		ai.stop();
	}
}


interface Ai{
	void play();
	void stop();
} 



//���ۿ��� ����
class Alphago implements Ai{
	public void play() {
		System.out.println("�ΰ������� ���İ� �Դϴ�.");
	}
	@Override
	public void stop() {
		System.out.println("���İ� ���� ����� �մϴ�.");
	}
	
}

//�Ƹ������� ����
class Betago implements Ai{
	public void play() {
		System.out.println("�ΰ������� ��Ÿ�� �Դϴ�.");
	}
	@Override
	public void stop() {
		System.out.println("��Ÿ�� ���� ����� �մϴ�.");
	}
	
}


public class Hello 
{
	public static void main(String[] args) 
	{	
		Baduk baduk = new Baduk();
		baduk.play(new Alphago());
		baduk.play(new Betago());
		
	}
}
*/







/*
// ex45-3)	����3
class Baduk{
	// ������ ����
	Baduk(){
		System.out.println("�뱹�� �����մϴ�.");
	}
	


	void play(AI ai) {
		ai.play();
	}
}


interface Ai{
	void play();
}


//���ۿ��� ����
class Alphago implements Ai{
	public void play() {
		System.out.println("�ΰ������� ���İ� �Դϴ�.");
	}
	
}

//�Ƹ������� ����
class Betago implements Ai{
	public void play() {
		System.out.println("�ΰ������� ��Ÿ�� �Դϴ�.");
	}
	
}


public class Hello 
{
	public static void main(String[] args) 
	{	
		Baduk baduk = new Baduk();
		baduk.play(new Alphago());
		baduk.play(new Betago());
		
	}
}
*/






/*
// ex45-2)	����2
// Ai�� ���� ��
class Baduk{
	// ������ ����
	Baduk(){
		System.out.println("�뱹�� �����մϴ�.");
	}
	
	// Alphago �Լ� ����
	void play(Alphago t) {		// AlphagoŸ������ �μ��� ��������
		System.out.println("�ΰ������� ���İ� �Դϴ�.");
	}
	
	// Betago �Լ� ����
	void play(Betago t) {		// BetagoŸ������ �μ��� ��������
		System.out.println("�ΰ������� ��Ÿ�� �Դϴ�.");
	}
	
	
	
}

// ���ۿ��� ����
class Alphago{
	// �Լ� ����
	void paly() {
		System.out.println("�ΰ������� ���İ� �Դϴ�.");
	}
	
}

// �Ƹ������� ����
class Betago{
	// �Լ� ����
	void paly() {
		System.out.println("�ΰ������� ��Ÿ�� �Դϴ�.");
	}
	
}


public class Hello 
{
	public static void main(String[] args) 
	{	
		Baduk baduk = new Baduk();
		baduk.play(new Alphago());
		baduk.play(new Betago());
		
		
		
	}
}
*/




/*
// ex45-1)	����	�������̽� 
// �� ���α׷��� ������ : �ΰ������� �ٲ�ٸ� ��� �� ���ΰ�?
// ���İ������ �Ǳ⶧���� ���� �� ���� ���α׷��̴�. 

class Baduk{
	// ������ ����
	Baduk(){
		System.out.println("�뱹�� �����մϴ�.");
	}
	
	// �Լ� ����
	void play() {
		System.out.println("�ΰ������� ���İ� �Դϴ�.");
	}
	
}


public class Hello 
{
	public static void main(String[] args) 
	{	
		Baduk baduk = new Baduk();
		baduk.play();
		
		
		
	}
}
*/












/*
// ex44-2)	�ؿ��� �Ȱ��� �ڵ����� ���ֻ���ϴ� �ڵ�
//	************�ٽú���******************
// 1
interface Animal{
	void m1();	// �������̽� �Լ� �ȿ����� �߰�ȣx
}


// 2
class Zoo {
	void sound(Animal t) {
		t.m1();		// �̰͸���� ����� �� ����
	}
}


public class Hello 
{
	public static void main(String[] args) 
	{	
		
		// 1
		// �μ����� �뵵�� ���� ���
		Animal t1 = new Animal() {
			@Override
			public void m1() {
				// TODO Auto-generated method stub
			System.out.println(1);	
			}
		};
		t1.m1();
		
		
		// 2
		Zoo t2 = new Zoo();
		t2.sound(new Animal() {
			@Override
			public void m1() {
				// TODO Auto-generated method stub
				System.out.println(2);
			}
		});
		
		
		
		
	}
}
*/





/*
// ex44-1)	�������̽� ���� 
class Zoo{
	void m1(Animal t) {
		t.m1();
	}
}

interface Animal{
	void m1(); 	
}


class Tiger implements Animal{
	public void m1() {
		System.out.println(1);
	}
	
	public void m2() {
		System.out.println(2);
	}
	
}

public class Hello 
{
	public static void main(String[] args) 
	{	
		Tiger t1 = new Tiger();		// �Ϲ����� ��ü����
		Animal t2 = new Tiger();	// ��ĳ����(��-��, ��-��)
		
		
		// �͸� Ŭ������ �͸� ��ü �� �� ���ֻ��
		//******�߿�*******
		// 1. �͸� Ŭ����
		Animal t3 = new Animal() {	// �͸�Ŭ������ �̿��Ͽ� ��ü�� ����
			@Override				// ����� Animal t3 = new Animal(){�������̵�};
			public void m1() {
				// TODO Auto-generated method stub
				System.out.println(2);
			}
		};	// ó������ �ȵǴ� �ڵ����� new Animal();���� ;�տ� �߰�ȣ ����� Ctrl+space�ؼ� �������̵� �ϱ�
		
		//******�߿�*******
		// 2. �͸� ��ü : ��ü�� ���� ģ���� ���
		new Animal() {
			@Override
		public void m1() {
			// TODO Auto-generated method stub
			System.out.println(3);
			}
		}.m1();;	//   }.�Լ��̸�   ���� ���
	
		t1.m1();
		t2.m1();
		t3.m1();

		
		// �Լ��μ��� ��ü�� �̿��Ͽ� �ڵ带 �����Ѵ�.
		Zoo t4 = new Zoo();
		t4.m1(new Animal() {
			@Override
			public void m1() {
				// TODO Auto-generated method stub
				System.out.println(4);
			}
		});
		
		
	
	}
}
*/








/*
// ex43-5)	this�� �� ��° ���
// ������ �ȿ��� �ʿ信 ���� �ٸ� �����ڸ� ȣ��
// super();�� �θ� ȣ��, this();�� �ڱ� Ŭ������ �ٸ� �����ڸ� ȣ��
class Tiger{
	
	Tiger(){
		System.out.println(1);
	}
	
	Tiger(int a){
		// �μ��� �����ʴ� ���� �����ڸ� ���� ȣ���Ѵ�.
		this();		// ���� �μ������� ���� default�����ڸ� ��
		System.out.println(a);
	}
	
	Tiger(int a, int b){
		// �μ��� �ϳ��� �޴� ���� �����ڸ� ���� ȣ���Ѵ�.
		this(a+b);	// ������ �ȿ��� �ٸ� ������ ȣ��, ���� �ִ� �����ڸ� ��
		System.out.println(a+" "+b);
	}
	
}


public class Hello 
{
	public static void main(String[] args) 
	{	
		Tiger t1 = new Tiger(10, 20);
		
	}
}
*/










/*
// ex43-4)	this�� �� ��° ���
// ���α׷����� ���� ��Ÿ���� ���
// �ڱ� �ڽ��� �ٸ�Ŭ������ �μ� ������ �ϱ� ���� ���
// ������ �� �ڽ��� �ʿ�� �Ҷ�, �ʿ��Է� �� �ڽ��� ������.

class Tiger{
	void m1() {
		Lion t1 = new Lion();
		
		if(t1.merry(this) == true) {
			System.out.println("�����մϴ�.");
		} else {
			System.out.println("�Ф�");
		}
		
	}
	
	int m2() {
		return 100;
	}
	
	String m3() {
		return "����";
	}
	
}

class Lion{
	boolean merry(Tiger t) {
		if(t.m2() >= 80) {
			System.out.println("yes");
			return true;
		} else {
			String s = t.m3();
			
			switch (s) {
			case "�¼�": {
				return true;
			}
			
			case "����": {
				return false;
			}
			default:
				return false;
			}
			
			
			
			
		}
	}
		

}

public class Hello 
{
	public static void main(String[] args) 
	{
		Tiger t1 = new Tiger();
		t1.m1();
	}
}
*/





/*
// ex43-3) this�� �� ��° ���
// �Լ��ȿ��� ü�̴� �ؼ� ȣ���ϱ� ����
// �Լ��� ü�̴� ������ ���� ���
// ���ֻ��
class Tiger{
	Tiger(){
		System.out.println(1);
	}
	
	Tiger m1() {
		return this;
	}
	
	Tiger m2() {
		System.out.println(2);
		return this;
	}
	
	void m3() {
		System.out.println(3);
	}
	
//	Tiger t = new Tiger();
//	return t;
	
	
}


public class Hello 
{
	public static void main(String[] args) 
	{	
		Tiger t1 = new Tiger();
		
		System.out.println("------------");
		
		Tiger t2 = t1.m1();
		
		System.out.println(t1.hashCode());
		System.out.println(t2.hashCode());
		
		t2.m2().m1().m2().m2().m3();;	// ü�̴� : �Լ��ȿ��� �� �Լ��� ȣ���ϴ� ��
		t1.m1().m2();;		
	
		System.out.println("------------");
		
		t1.m1().m2().m3();;
		// �� �Ѱ��� �Ʒ� 3�� �ڵ尡 ����
		System.out.println("------------");
		t1.m1();
		t1.m2();
		System.out.println("ȣ����");
		t1.m3();
		
	}
}
*/







/*
// ex43-2)		this�� ù ��° ���
class Tiger{
	
//	Tiger this;		// <- �� �ڵ�� �����Ǿ� ����
//	Tiger(Tiger t){		// <- Tiger t �ڵ�� �����Ǿ� ����
//		this = t;	// <- �� �ڵ�� �����Ǿ� ����
//	}
	
	int a, b, size;	// �ʵ庯��
	// �ؿ� ������ ���� ��������ʹ� ������
	
	
	// ��������� x,y�� �ٲ�, self������ �Ͼ�� ��
	Tiger(int a, int b, int size){		// �����ڸ� ����� ������ ��������� �ʱ�ȭ ��Ű�� ������, �ٸ� ������ ����
		this.a = a;		// ����� �������̶� �ʵ��� �������̶� ��ø�� �� �����ϱ� ������
		this.b = b;		
		this.size = size;
		
	}
	
	 void show() {
		 System.out.println(this.a+" "+this.b+" "+size);		// ��� a,b�� (this.)�� �����Ǿ� ����
		 
	 }
	
}

public class Hello 
{
	public static void main(String[] args) 
	{	
		Tiger t1 = new Tiger(10, 20, 30);
		
		t1.show();
		
		
		int num = 10;
		num = num;		// self ����, �ڱⰡ ������ �ִ� ������ �ڱ� ������ ����, ������� �ڵ�
		
		
	}
}
*/






/*
// ex43-1)		this
class Tiger{
// ���� this��� ������ ������	
//	Tiger this;			// ���� ���� �ʾƵ� �˾Ƽ� �������
//	
//	Tiger(Tiger t, int a, int b){	// Tiger t�� �����Ǿ�����
//		this = t;		// �ڵ尡 �����Ǿ�����
//	}
	
	Tiger(int a, int b){
		System.out.println(this.hashCode());
	}
	
	void m1(int a, String b, Tiger c) {
		System.out.println(1);
	}
		
}

public class Hello 
{
	public static void main(String[] args) 
	{	
		Tiger t1 = new Tiger(10, 20);		// t1�� ���� t�� �Ѿ
		System.out.println(t1.hashCode());		
		System.out.println("---------------");
		Tiger t2 = new Tiger(30, 40);	// t2�� ���� Tiger�������� t�� �Ѿ
		System.out.println(t2.hashCode());
		
	}
}
*/









/*
// ex42)	final
final class Animal{
	final int NUM = 10;		// final�� �����Ŵ� ���� ������ �� ����, ���� ������ �� ���°� ������ ��
	
	Animal(){}
	
	final void M1() {	// �Լ� �տ� final�� ������ �� �ڵ� ���ķκ��� �������̵��� �ȵ�, �� �ڸ��� ������
		
	}
}

//class Tiger extends Animal{
//	void M1() {
//	
//	}
//	
//}

public class Hello 
{
	public static void main(String[] args) 
	{	
		Animal t1 = new Animal();
//		t1.num = 20;	 ������ final�� ���ȭ ���ױ� ������ �� �̻� ���� �Ұ���
		System.out.println(Math.PI);
		
		String s1 = null;	// StringŬ������ ��ӹ��� �� ����.
				
	}
}
*/







/*
// ex41)	�������̽� 
class A{
	void m1() {
		System.out.println(1);
	}
}

interface B{
	void m2();		// �Լ����� or �Լ� ������Ÿ�� �̶�� ��
}

interface C{
	void m3();
}

class D extends A implements B,C{
	@Override
	public void m2() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void m3() {
		// TODO Auto-generated method stub
		
	}
}



@FunctionalInterface		// �Լ������� 1���� ������ ������ ��
interface E{
	void m1();
}




public class Hello 
{
	public static void main(String[] args) 
	{	
		D t = new D();
		t.m1();
		t.m2();
		t.m3();
		Thread t2 = null;	// t2�� ��ü�� �ƴϴ� ��� ��
		String s = null;
		StringBuffer sf = null;		// ���ʸ� ���� ����
		
		
	}
}
*/








/*
// solid ��Ģ ���캸��
// ex40)	�������̽� ����************
interface �ѱ����� {		// ��κ� class�ȿ� interface�� �Ѱ��ۿ� �Ⱦ�
	void �Ա�();
	void ���();
	void ��ü();
	void ����(); 

}

class �������� implements �ѱ�����{
	@Override
	public void �Ա�() {
		System.out.println("�������� 3%�Դϴ�.");
		
	}
	@Override
	public void ���() {
		// TODO Auto-generated method stub
	
	}
	@Override
	public void ��ü() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void ����() {
		// TODO Auto-generated method stub
		
	}
}


class �츮���� implements �ѱ�����{
	@Override
	public void �Ա�() {
		System.out.println("�������� 10% �Դϴ�.");
		
	}
	@Override
	public void ���() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void ��ü() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void ����() {
		// TODO Auto-generated method stub
		
	}
}

public class Hello 
{
	public static void main(String[] args) 
	{	
		�������� t1 = new ��������();
		�츮���� t2 = new �츮����();
		
		t1.�Ա�();
		t2.�Ա�();
		
		
	}
}
*/







/*
// ex39)	abstract �������̵�
abstract class �������� {		// �Լ��տ� abstract�� ������ class �տ��� ������ abstract�� �پ����
	void Į() {
		System.out.println("Į�� �� ����ϴ�.����");
	}
	abstract void ����() {
		// �Լ��տ� abstract�� ������ class �տ��� ������ abstract�� �پ����
	}
}

class ���׳�1 extends ��������{
	void ����() {
		System.out.println("+5�� ����");
	}
}

class ���׳�2 extends ��������{		// �������̵� :  �θ� ������ �Լ� �̸��� �ڽ��� ������ �ִ� �Լ��� �Ȱ��� ����
	@override	// ������̼� : ���α׷��Ӱ� �Ǽ��� �� �ִ� �� ������ �����ϱ� ���� ���
	void ����() {
		// TODO Auto-generated constructor stub
	}
}


public class Hello 
{
	public static void main(String[] args) 
	{	
		���׳�1 t1 = new ���׳�1();
		���׳�2 t2 = new ���׳�2();
		t1.Į();
		t1.����();
		t2.Į();
		t2.����();
	}
	
}

*/







/*
// ex38)	abstract(�߻� = �̿ϼ�)	and		�������̽�
 
 
//abstract class Animal {		// abstract �̿ϼ��� Ŭ����
//	abstract void m1(); 	// abstract �̿ϼ��� �Լ�
//}

interface Animal {		// �������̽� 
	void m1();
	// �� void m1(); �Լ� �տ��� ���� abstract�� ����, �������̽� ����� �Լ� �տ� ������ ����	
}

class Tiger implements Animal{		
	public void m1() {		// �θ�Ŭ������ abstract�̱� ������ �ݵ�� �Լ� ������ ������� 
		System.out.println(2);
	}
}

public class Hello 
{
	public static void main(String[] args) 
	{	
		Animal a = new Tiger();
		a.m1();
		
	//	Animal t2 = new Animal		abstract�� �� Ŭ�����δ� ��ü���� �Ұ�	
		
		
	}
}
*/







/*
// ex37)	��ĳ������ ����ϴ� ����, ������

// Animal���� cry�� ���Ŀ� �ٸ� ������ ����� ��
class Animal{
	void cry() {
		System.out.println("...");
	}
	
}

class Dog extends Animal{
	void cry() {
		System.out.println("�۸�");
	}
	
}

class Cat extends Animal{
	void cry() {
		System.out.println("�߿�");
	}
	
}

class Sneak extends Animal{

}


public class Hello 
{
	public static void main(String[] args) 
	{	
		Random rn = new Random();
		
		Animal t0 = new Dog();
		Animal t1 = new Cat();
		Animal t2 = new Sneak();
		
		
		for (int i = 0; i < 10; i++) {
			int num = rn.nextInt(3);
			switch (num) {
			case 0:
				t0.cry();
				break;
			case 1:
				t1.cry();
				break;
			case 2:
				t2.cry();
				break;
			}
		}
		
		System.out.println("--------------------");
		
		// ���� switch���̶� �Ȱ��� ����� ��Ÿ��
		// ��ĳ���� ����� ��
		Animal[] t3 = new Animal[] {new Dog(), new Cat(), new Sneak()};		// �ڿ��� �����Ͱ� �ʱ�ȭ ��
		for (int i = 0; i < 10; i++) {
			t3[rn.nextInt(3)].cry();	
			
		}
		
		
	}
}
*/






/*
// ex36)	���� �߻� �ڵ�
public class Hello 
{
	public static void main(String[] args) 
	{	
		Random rn = new Random();
		
		System.out.println(rn.nextInt());
		
		for (int num = 0;  num < rn.nextInt(2); num++) {
			//System.out.println(num);
			System.out.println(rn.nextInt(10));
		}			
		
		
	}
}

*/




/*
// ex35)		�迭 
public class Hello {
	
	public static void main(String[] args) {
	
		int a=10;

		// �迭 ���� 
		int [] ar = new int[5]; 			// �ڡڡ� �迭�� ÷�� "0 ~ �迭�� ����-1" ���� ��밡��
		int [] br = new int[]{1,2,3,4,5};   // 
		int [] cr = {10,20,30,40,50};		// ���� ���� ��� ���� ���X

		System.out.println(ar.length); // �迭�� ���� Ȯ��

		for (int i = 0; i < br.length; i++) {
			System.out.print(br[i]+" ");
		} System.out.println();

		// ����ȭ �� ���� foreach ++ ������ �κ�
		// ���� x,data,value ���̾���.

		for (int x : cr) {   
			System.out.print(x+" ");
		}
		
		cr[0]=100;
		cr[4]=200;

		//cr[5]=300; ��ȿ�������
		//cr[-1] =100;

	
		int num =3;
		ar[num] = 500;

		//ar[num*3-5] =0;// �����ؼ� ��밡�� ! ������ ��ȿ������ ����ߴ�

		ar[2]=3;
		ar[ar[2]]=999; //ar[2]


		System.out.println(ar[2]+" "+ar[3]);
		ar[ar[3]-998]=888;

		for (int x : ar) {   
			System.out.print(x+" ");
		}
		System.out.println();
		
		System.out.println("===================================================");
		
		boolean []dr = {true, true, false ,true};

		for (boolean b : dr) {   
			System.out.print(b+" ");
		}System.out.println();
		
		System.out.println("===================================================");

		String [] ss = new String[4]; //String 
		ss[0] ="ȣ����";
		ss[1] ="�޹���";
		ss[2] ="�ϸ�";
		ss[3] ="�䳢";

		for(int i=0 ; i< ss.length ; i++){
			System.out.print(ss[i]+" ");
		}
		System.out.println();
		
		System.out.println("===================================================");
		
		String [] st = new String[]{"�عٶ��","���޷�","�ε鷹"};

		String S1 = "ȣ����";				 // ���� ���
		String s2 = new String("������"); // ������ ���
		String [] su = new String[]{new String("�عٶ��"),new String("���޷�"),new String("�ε鷹")};

		for(int i=0 ; i< st.length ; i++){
			System.out.print(st[i]+" ");
		}
		System.out.println();
		
	}
}
*/






/*
// ex34)	��ĳ���� ����************�ʵ�***************
class Animal{
	void cry() {
		System.out.println("...");
	}
	
}

class Dog extends Animal{
	void cry() {
		System.out.println("�۸�");
	}
	
}

class Cat extends Animal{
	void cry() {
		System.out.println("�߿�");
	}
	
}

class Sneak extends Animal{

}


class Zoo{
	
//	void sound(Dog t) {
//		t.cry();	
//	}
//	void sound(Cat t) {	// �����ε�
//		t.cry();
//	}
//	void sound(Sneak t)	{	// �����ε�
//		t.cry();
//	}
	
	
	// solid ��Ģ 5������ - ����-��� ��Ģ
	// ��� Ȯ�忡�� ���������� �ڵ带 �����ϴ� ���� �����ִ�.
	void sound(Animal t) {		// ��ĳ������ ���� ���� ���� 3�� �ּ�ó�� �Լ��� ��� �߰� �����ְ� Animal�μ��� �����鼭 �� ���� ����
		t.cry();
	}
	
	
	
}


public class Hello 
{
	public static void main(String[] args) 
	{	
		// ��ĳ����(��-�θ�, ��-�ڽ� ����)
		Animal t1 = new Dog();
		Animal t2 = new Cat();
		Animal t3 = new Sneak();
		
		t1.cry();
		t2.cry();
		t3.cry();	// �ڽ�Ŭ������ cry�Լ��� ���� ������ �θ��� �Լ��� �����ٰ� ȣ����
		
		///////////////////////�� �Ʒ��� ������ ��ĳ���� �� ������?////////////////////////
		
		Dog t4 = new Dog();
		Cat t5 = new Cat();
		Sneak t6 = new Sneak();
		
		t4.cry();
		t5.cry();
		t6.cry();	
		
		System.out.println("-----------------------");
		
		Zoo t7 = new Zoo();
		
		t7.sound(new Dog());
		t7.sound(new Cat());
		t7.sound(new Sneak());
		
	
		
	}
}
*/







/*
// ex33)	
class Animal{
	void m1(){		
		System.out.println(1);
	}
	
	void m3() {
		System.out.println(31);
	}
}

class Tiger extends Animal{
	void m2() {
		System.out.println(2);
	}
	
	void m3() {
		System.out.println(32);
	}
}


public class Hello 
{
	public static void main(String[] args) 
	{	
		Animal t1 = new Animal();	// case1
		Tiger t2 = new Tiger();		// case2
		Animal t3 = new Tiger();	// case3 : ��ĳ����(��-�� ����)
	//	Tiger t4 = new Animal();	// case4 : �ٿ�ĳ����
			
		t3.m1();	// m2�޸𸮴� ������ m2������ ������ ����
		
		t3.m3();	//  �Լ��� ȣ���ϱ� ���� ������ �ڽĿ��� m3�� ������ �ڽ��� m3�� ȣ���ϰ� ������ �θ��� m3�� ���
		
		
	}
}
*/







/*
// ex32)	��Ӱ��迡���� ������
class Animal{
	Animal(){
		System.out.println("�θ������ ��");
	}
	Animal(int n){
		System.out.println("�θ������" + n);
		
	}
}

class Tiger extends Animal{
	Tiger(){
		// ���� ���ο� �ڵ尡 1���� �����Ǿ� �ִ�.  �װ� [ super(); ] ��
		super();	// �θ��� �����ڸ� call ��Ű��� ��, super();�� ������ �ȿ����� ��밡��
		System.out.println("ù ��° �ڽĻ�����");
		
	}
	Tiger(int num) {
		super(num+100);		// super�� �ݵ�� ù �ٿ� �;���
		System.out.println("2���� �ڽ� ������");
		
	}
	Tiger(int a, int b) {
		super(a*b);		// super�� �ݵ�� ù �ٿ� �;���
		System.out.println("3���� �ڽ� ������");
		
	}
	
	
}


public class Hello 
{
	public static void main(String[] args) 
	{	
		Animal t1 = new Animal();
		Tiger t2 = new Tiger(); 	// �ڽĻ����ڰ� ���� call�� �ǰ� �θ�����ڰ� call �� 
		Tiger t3 = new Tiger(3, 4); 	 
		
	}
}

*/







/*
// ex31)	���
class Animal{	// �θ� Ŭ����
	void m2() {
		System.out.println(2);
	}
	
	void m3() {
		System.out.println(31);
	}
	
}

class Tiger extends Animal{		// �ڽ� Ŭ����		Tiger -> Animal �ڽ��� �θ������� 
	void m1() {
		System.out.println(1);
	}
	
	void m3() {
		System.out.println(32);
	}
	
	void m4() {
		m3();	// �ڱⰡ ������ �ִ� �Լ� m3�� ȣ��************
		super.m3();		// �θ��Լ��� m3�� ȣ��************ ���������� ��ȸ�ؼ� �θ� ȣ��
		System.out.println(4);
	}
	
}

public class Hello 
{
	public static void main(String[] args) 
	{	
		Animal t1 = new Animal();	// Animal�� ��� ��Ӱ� ����x
		Tiger t2 = new Tiger();
		t2.m1();
		t2.m2();	// t2. �ϸ� ���� Tiger Ŭ�������� ���� �Լ��� ã��
		t2.m3();	// �θ�� �ڽ��� ������ �Լ��� ������ ������ �ڱ� Ŭ������ �Լ��� ���� ���
		System.out.println("----------------");
		t2.m4();	// �θ��� �Լ� m3�� ȣ���Ϸ��� ���������� ����
		
		
		
	}
}
*/







/*
// ex30)	�����Լ�
public class Hello 
{
	public static void main(String[] args) 
	{	
		// ���밪
				int v1 = Math.abs(-5);
				double v2 = Math.abs(3.14);
				System.out.println(v1);
				System.out.println(v2);
				
				// �ø���
				double v3 = Math.ceil(5.3);
				double v4 = Math.ceil(-5.3);
				System.out.println(v3);
				System.out.println(v4);
				
				// ������
				double v5 = Math.floor(5.3);
				double v6 = Math.floor(-5.3);
				System.out.println(v5);
				System.out.println(v6);
				
				// �ִ밪
				double v7 = Math.max(5, 9);
				double v8 = Math.max(5.3, 2.5);
				System.out.println(v7);
				System.out.println(v8);
				
				// �ּҰ�
				double v9 = Math.min(5, 9);
				double v10 = Math.min(5.3, 2.5);
				System.out.println(v9);
				System.out.println(v10);
				
				// ������
				double v11 = Math.random();
				System.out.println(v11);
				// return ���� 0.0 <= v11 < 1.0
				
				// ����� ������ �Ǽ���
				double v12 = Math.rint(5.3);
				double v13 = Math.rint(5.7);
				System.out.println(v12);
				System.out.println(v13);
				
				
				long v14 = Math.round(5.3);
				long v15 = Math.round(5.3);
				System.out.println(v14);
				System.out.println(v15);
	}
}

*/



/*
// ex29)	static

// static�Լ� �ȿ����� static����� ��� ����
class Tiger{
	static void myMain() {
		Tiger t = new Tiger();	//�ڱ� class �ȿ��� �ڽſ� ���� ��ü ���� ����
		t.m1();
		
	}
	void m1() {
	}
	
}

public class Hello 
{
	static int num = 10;
	
	Hello(){}
	
	static void m1() {
		System.out.println("1����");
	}
	
	
	public static void main(String[] args)		// void main�� �Լ� �̸�,void ���� static�� ������ ��ü ������ ���� �ʴ��̻� ȣ�� �Ұ���
	{	
		System.out.println(num);
		
		Hello h = new Hello();
		
		h.m1();
		h.m2();
		Hello.m1();
	//	Hello.m2();
		
	}
	
	void m2() {
		System.out.println("2����");
	}
	
	
}
*/





/*
// ex28)	static


// static�� ��ü�����ؼ� ����� �����ϴ� ���� �Ƴ��� ���� ���
class Tiger{
	int num1;
	static int num2 = 100;	// static ������ class ���ٵ� �� ���� �ö�(����ž ���)
	
	static void m1() {
		System.out.println("static �Լ� ��");
	}

	
}

public class Hello 
{
	public static void main(String[] args) 
	{	
		System.out.println(Tiger.num2);		// static�� class�̸�.�����̸����� ��ü���� ���ϰ� ȣ�� ����
		
		Tiger t1 = new Tiger();
		Tiger t2 = new Tiger();
		
		System.out.println(t1.num1);
		System.out.println(t1.num2);
		
		t2.num2 = 200;
		System.out.println(t1.num2);
		
		System.out.println(Tiger.num2);		// ���� static�� ���� ��Ģ
	
		Tiger.m1();

		
		
		// static����
		System.out.println(Math.abs(10));
		
		
	}
}
*/








/*
// ex27)	������ ���� ��
class Car{
	int fuel = 100;	
	String name;
	
	Car(){
		name = "����";
	}
	
	Car(String n,int f){
		fuel = f;
		name = n;
	}
	
	void inject() {
		fuel += 100;
	}
	
	void inject(int f) {
		fuel = fuel + f;
	}
	
	void move(){
		System.out.println(name+" ���� �޸���.");
		fuel -= 30;
	}
	
	void stop() {
		fuel -= 10;
		System.out.println(" ���� �����");
	}
	
	void show() {
		System.out.println(fuel);
	}

	
	
}

public class Hello 
{
	public static void main(String[] args) 
	{	
		Car car1 = new Car();
		Car car2 = new Car("����", 200);
			
		car1.move();
		car1.show();
		car2.move();
		car2.show();
		
	}
}
*/








/*
// ex26)	������ ����
class Tiger{	// class �ȿ� �ƹ��͵� ������ �˾Ƽ� default �����ڸ� ����
	Tiger(int a, int b){
		
	}
	Tiger(){}
}

public class Hello 
{
	public static void main(String[] args) 
	{	
		Tiger t1 = new Tiger();
		Tiger t2 = new Tiger(10, 20);
		
		
	}
}
*/








/*
// ex25)	������

// 1. �����ڴ� �Լ��̴�. ������ (������ �Լ�)��� ��
// 2. �Լ� �̸��� Ŭ�����̸��� �ݵ�� �����ؾ� ��
// 3. ������ �Լ��� ���ϰ��� ���� �� ����. �׷��� void ������ ������
// 4. ������ �Լ��� �����ε��� ������
// 5. ��ü�� ������ �� �� �� �� ȣ���(���Ƿ� ȣ�� �Ұ���)
// 6. �����ڸ� ����ϴ� ������ ��� �޼ҵ带 �ʱ�ȭ ��Ű�� �������� ���
// 7. ������ �Լ��� �ۼ����� �����ÿ��� �ڵ����� default�����ڰ� �������

class Tiger{	
	int age = 20;	// �ʵ忡�� �̸� ���� �����ϰ� ����ϴ°� �ȵǳ�? ������ �׷��� ��ü�� �����Ǵ� ��� age�� 20�� ��
	String name = "ȫ�浿";
	Tiger(){	// default������,	���� �ʱ�ȭ �ϱ� ���� �ַ� ���
		System.out.println("������ ��");
		System.out.println("�����ڰ� ȣ��Ǿ���.");
		// age = 20;
		// name = "ȫ�浿";
	}
	Tiger(int a, String n){ 
		age = a;
		name = n;
	}
	void showInfo() {
		System.out.println(age+" "+name);
	}
}

public class Hello 
{
	public static void main(String[] args) 
	{	
		Tiger t1 = new Tiger();		//new �ڿ��ִ� Tiger�� �����ڸ� ȣ����
		Tiger t2 = new Tiger();		// ��ü�� �����ɶ����� �����ڰ� ȣ��� 		
		Tiger t3 = new Tiger(100,"������");
		Tiger t4 = new Tiger(200,"�޹���");
				
		t1.showInfo();
		t2.showInfo();
		t3.showInfo();
		t4.showInfo();
		
		
	}
}
*/






/*
// ex24) ¥����~	
public class Hello 
{
	public static void main(String[] args) 
	{	
		int a = 100;
		// ���ڿ��� ��ȯ �ϰ� �������( Integer.soString() )
		String s1 = Integer.toString(a);
		System.out.println(s1+200);		// ���ڿ� ó��
		// sugar code
		String s2 = ""+a;	// ���ڿ� ó��
		System.out.println(s2);
		
		String s3 = "456";
		int b = Integer.parseInt(s3);	// parseInt�� ������ �м��Ѵ�, �ؼ��Ѵ�
		System.out.println(b+100);
	}
}
*/




/*
// ex23)	�����ε�
class Tiger{
	// �Լ� �����ε�, �Լ� �����Ƕ�� �Ҹ�
	// ���޵Ǵ� �Լ��� ������ �ٸ�����, Ÿ���� �ٸ� �� �Լ� �̸��� �ٸ��� ��� ����	
	void method01() {	// �Լ� �̸��� ������ �̸����� ���� ����
		System.out.println(1);
	}	
	
	void method01(int a) {		// �Լ� �̸��� ������ �̸����� ���� ����
		System.out.println(2);
	}
	
	void method01(int a, int b) {	// �Լ� �̸��� ������ �̸����� ���� ����
		System.out.println(3);
	}
	
	void method01(String a, int b) {	// �Լ� �̸��� ������ �̸����� ���� ����
		System.out.println(4);
	}
	
	
	// �Լ� �̸��� �Ȱ��� �����ȴٸ� �����ε�, ������
	int getAreaRect(int w, int h) {
		return w*h;
	}
	
	int getAreaRect(int length) {
		return length*length;
	}
	
	
	
}


public class Hello 
{
	public static void main(String[] args) 
	{	
		Tiger t1 = new Tiger();
		t1.method01();
		t1.method01(10);
		t1.method01(1, 1);
		t1.method01("ȣ����", 1);
	}
}
*/






/*
//ex22)		�ݺ��� continue, break
public class Hello 
{
	public static void main(String[] args) 
	{	
		for (int i = 0; i < 10; i++) {
			if(i < 3) {
				continue;	// for������ continue�� ������ �ٷ� i++�� ��
			}
			System.out.println(i);
			if(i == 7) {
				break;
			}
		}
		System.out.println("ȣ����");
		
		
		System.out.println("-------------------------");
		
		int num = 0;
		while(true) {
			num++;
			if(num == 10) {
				System.out.println("ȣ����"+num);
				break;
			}			
			if(num%2 == 0) {
				System.out.println("�ڳ���"+num);
				continue;
			}
		}
		
		
		
		
	}
}

*/







/*
//ex21)		***********�ʵ�*************8
class Tiger{
	int m1(int a, int b) {

		if(a>b) {
			return 100;
		} else {
			System.out.println("ȣ����");
			// return 200; or 
		}
		return 500;
	}
	
	void m2() {
		System.out.println(1);
		return;		// �Լ��� ���� �ߴ��� ��
		// System.out.println(2);
	}
	
	void m3(int num) {
		for (int i = 0; i < 10; i++) {
			if(i == num) {
				System.out.println("ã�Ҵ�.");
				return;		// �Լ��� ���� �ʰ� �Ϸ��� return �� ���	
			}
		}
		System.out.println("�˻������� ã�� ����");
	}
	
	
	
}


public class Hello 
{
	public static void main(String[] args) 
	{	
		Tiger t = new Tiger();
		System.out.println(t.m1(3, 2));
		
		t.m3(2);
		
		t.m3(11);
		
		
		
	}
}

*/




/*
// ex20)	**************�ʵ�**************
class Tiger{
	String m1() {
		return "������"; 
	}
	Lion m2() {
		//return new Lion();
		Lion t = new Lion();
		return t;
	}
	Lion m3(Lion t) {
		return t;
	}
	
}

class Lion{
	void show() {
		System.out.println(1000);
	}
}


public class Hello 
{

	public static void main(String[] args) 
	{	
		// m1
		Tiger t1 = new Tiger();
		String s1 = t1.m1();
		System.out.println(s1);
		System.out.println(t1.m1());
		
		
		// m2
		Lion t2 = t1.m2();
		t2.show();
		
		
		// m3
		Lion tt1 = new Lion();
		Lion tt2 = new Lion();
		Lion tt3 = new Lion();
		Lion t3 = t1.m3(new Lion());
		Lion t3 = t1.m3(tt1);
		Lion t3 = t1.m3(tt2);
		Lion t3 = t1.m3(tt3);
		
		t3.show();
		
		
		// return �Ǵ°��� Lion ��ü�̱� ������ ����
		t1.m3(new Lion()).show();;
		
	}
}

*/




/*
// ex19)
class Tiger{
	// ����!!! �μ������� �� int a,b�� �ȵ�
	void m1(int a, int b) {		// �μ������� ������ ����
		System.out.println(a+" "+b);
		System.out.println(a*b+a);
	}
	void m2(int a, char b, boolean c, float d, String e) { 
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
	}
	void m3(Lion a) {
		System.out.println(a.hashCode());
		a.sound();
	}

}


class Lion{
	void sound() {
		System.out.println("����");
	}
	
}


public class Hello 
{
	public static void main(String[] args) 
	{	
		String s1 = "ȣ����";		// String�� Java���� ������� ǥ�� Ŭ����
		System.out.println(s1);
		System.out.println(s1.length());
		
		
		Tiger t1 = new Tiger();
		
		
		
		t1.m1(3,4);

		t1.m2(10, 'F', false, 3.14f, "��������");
		
		
		
		Lion t2 = new Lion();	// Lion Ŭ���� ��ü ����
		System.out.println(t2.hashCode());
		
		t1.m3(t2);	
		
		
		// Lion a�� new Lion()
		t1.m3(new Lion());		
		
	}
}
*/






/*

// ex18)

// Ŭ���� ����
class Tiger
{
	// merry��� �޼ҵ� ���� = �Լ���� �Ҹ�
	// ���� ���Ǵ� �ڵ带 �ҷ��� �����
	// �Լ��� ������ 4����
	
	// 1. �μ�����x
	void merry() {
		System.out.println("��");
	}
	
	// 2. �μ�����o
	// int num = 3
	void happy(int num) {	
		for (int i = 0; i < num; i++) {
			System.out.println('��');
		}
	}

	// 3. return o, void�� ���ϰ��� �� �� ����
	int turtle() {
		System.out.println("�ź��� call");
		return 15;
	}

	// 4. �μ�����o, return o
	int fish(int num) {
		int n = num*3;
		return n;
		
		
	}
	
	
	
	
}


public class Hello 
{
	public static void main(String[] args) 
	{	
		Tiger t = new Tiger();		// new ��ü��() + Ctrl,1
		
		//1 
		t.merry();	// �Լ��� call(ȣ��)�� ��
		t.merry();
		t.merry();
		
		for(int i = 0; i < 10; i++) {
			t.merry();
		}
		
		// 2
		System.out.println("--------------------");
		t.happy(3);		// �μ�����
		
		System.out.println("--------------------");
		// 3
		int num = t.turtle();	// return���� ������ �����ؼ� �Ʒ����� ���
		System.out.println(num);
		System.out.println(t.turtle());	// return���� �ٷ� ���� ��
		
		// 4
		int cnt = t.fish(7);
		System.out.println(cnt);
		System.out.println(t.fish(345));
		
		
		
		//     �Լ��� ����
		// return��   �μ�����
		//    x         x
		//    x         o
		//    o         x
		//    o         o
		
		
	}
}

*/









/*
// ex17)	**********classŬ����************

class Tiger{
	// �ʵ� : Ŭ���� �ȿ��� �����Ǵ� ����(�ʵ�, ���, ���� 3���� �̸����� �Ҹ�) 
	int a;
	int b = 20;
	int c,d = 30;
	// ������ 
	// �޼ҵ� 
}




public class Hello 
{	
	public static void main(String[] args) 
	{	
		// ��ü ���� ���, �Ǿ�(Tiger)�� �ǵ� (Tiger)�̸��� �׻� ���ƾ���
		Tiger t1 = new Tiger();
		Tiger t2 = new Tiger();
		
		// �ʵ带 ����ϱ� ���ؼ��� (��ü.�ʵ��)    
		// ex)t1.a
		t1.a = 100;
		t1.c = t1.a+30;
		System.out.println(t1.a);
		System.out.println(t1.b);
		System.out.println(t1.c);
		System.out.println(t1.d);
		System.out.println(t2.c);
		
		// ��� ��ü�� �����Ǹ� �ݵ�� �ڱ��ڽ��� ������ȣ�� �߱޹޴´�.
		// ������ȣ�� Ȯ���ϴ� ��� (��ü.hashCode())
		System.out.println(t1.hashCode());
		System.out.println(t2.hashCode());
		
		
		// t3�� t3�� �޸𸮸� ������(����)
		// �ٸ� �̸������� ������ �޸� ����
		Tiger t3;
		t3 = t2;	
		System.out.println(t3.hashCode());	// t3�� t2�� �ؽð��� ����
		t3.a = 999;
		System.out.println(t2.a);
		System.out.println(t3.a);
		
		
	}
}

*/









/*
// ex16)
public class Hello 
{
	public static void main(String[] args) 
	{	
		int a = 10, b;
		b = a++; 	// ���� ���� ������ �Ͼ, a�� ������ �ִ� ���� �����ϰ��� a�� ������
		System.out.println(a+" "+b);
		System.out.println(String.format("%d %d", a, b));
				
		int c = 10, d;
		d = ++c;	// ���� ���� ������ �Ͼ, c�� ������Ű�� d�� ����
		System.out.println(c+" "+d);
		
		int a1 = 10, a2 = 10;
		System.out.println(a1++);
		System.out.println(++a2);
		System.out.println(++a1);
		System.out.println(a2++);
		
		
	}
}
*/





/*
// ex15)	short
public class Hello 
{
	public static void main(String[] args) 
	{	
		int a = 10;		// �����ؼ� ���� �ڸ��� �ִ� 10�� ���ͷ��̶�� �θ�
		int b = 20;
		short c = 30;
		b = (int)c;	// Ÿ�� ĳ����
		
	
		
		int num = 10;
		num = num + 3;
		num+=3;		// �������� ������ �ϴ� �ӵ��� �� ����
		
		
		
		int a1 = 0, a2 = 0;
		a1 = a2 + 3;
		
		
		
		int t = +1;		// ���ڿ� +�� �ִ� ������ �ڸ����� ������ ��
		int u = -1;
		int k = 0;
		k+=3;
		k = 3;
		
		
		
		int d = 0;
		d++;	// �ӵ��� ���� ����
		System.out.println(d);
		++d;	// �ӵ��� ���� ����
		System.out.println(d);
		d=d+1;	// �������� ���� �ӵ��� ����
		System.out.println(d);
		d+=1;
		System.out.println(d);
		
		
		
	}
}
*/




/*
// ex14)
public class Hello 
{
	public static void main(String[] args) 
	{	
		int n = 87;
		while(true) {
			System.out.println(n);
			if(n%2 == 0) {
				n = n/2;
			}else {
				n = n*3+1;
			
			//n = (n%2==0) ? n/2 : n*3+1;
			
			
			
			if(n==1) {
				System.out.println(n);
				System.out.println("Ż���ϱ� ����");
				break;
			}
			
	}
			
			// �ݺ�Ƚ���� �𸣴� ���α׷�
			int n2 = 1234;
			int sum = 0;
			while(true) {
				int r = n2;
				n2 = n2/10;
				sum = sum+r;
				
				if(n2 == 0) {
					break;
				}
				System.out.println(sum);
				
				
				
		}	

	}
	
}


*/


/*
// ex13)	while��
public class Hello {
	public static void main(String[] args) {
		// 1. while
		//int num = 0;
		//while(true) {
		//	num++;
		//	System.out.println(num+" ");
		//}
		
		
		// 2. while
		//int n = 0;
		//while(n<10) {
		//	System.out.println(n);
		//	n++;
		//}
		//System.out.println("ȣ����");
		
		// 3. while
		int a = 0;
		while(true) {
			System.out.println(a);
				if(a == 5){
				System.out.println("Ż���ϱ� ����");
				break;
			}
			a++;
		}
		
		
		
	}
	
}
*/



/*
// ex10)   for��  =  for(�ʱ�;����;����){}

public class Hello {
	public static void main(String[] args) {
		System.out.println(1000);
		int num = 10;
		num = num + 3;
		System.out.println(num);
		num = num + 1;
		System.out.println(num);
		num++; // �ڽ��̰����� �ִ� ���� 1������Ű�� ���׿�����(++)
		System.out.println(num);
		num--; // �ڽ��� ������ �ִ� ����1���ҽ�Ű�� ���׿�����(--)
		System.out.println(num);
		++num;
		System.out.println(num);
		--num;
		System.out.println(num);

		for (int i = 0; i < 3; i = i + 1) {
			System.out.println("ȣ����" + i);
		}

		// for���� �߸��� ����1
		for (int i = 5; i < 4; i++) {

		} // for���� �߸��� ����2
		for (int i = 0; i > 4; i++) {

		} // for���� �߸��� ����3
		for (int i = 0; i < 4; i = i + 3) {

		}

		// for���� ����ϴ� ����1
		for (int i = 0; i < 5; i++) {

		} // for���� ����ϴ� ����2
		for (int i = 1; i <= 5; i++) {

		} // for���� ����ϴ� ����3 // ����,����� ��ǥ ���α׷� ©�� ���
		int n = 5;
		for (int i = -n; i <= n; i++) {

		}
		
		int sum = 0;
		for (int i = 1; i <= 10; i++) {
			sum = sum + i;
		}
		System.out.println(sum);
		
		
		int n = 7;
		for (int i = 1; i <= 10; i++) {
			System.out.println(n+" * "+i+" = "+i*n);
		}
		

	}

*/
	
	
/*
// ex9) switch ��
public class Hello {
	public static void main(String[] args) { 
		// 1��. case�ڿ��� ������ �� �� ����.
		// 2��. switch�ȿ��� ������ ���� �� �ִ�.
		// 3��.default,break�� ������ �� �ִ�.
		// 4��. �ǵ����� ��쿡�� break�� ������ �� �ִ�.
		// 5��. case�б⿡������Ǵ´� ������ 1���� �̻��ϰ�� �Ϲ������� ���ó���� ��
		int num = 10;
		switch (10) {
		case 10: {
			System.out.println(1);
			break;
		}
		case 20: {
			{
				System.out.println(2);
				System.out.println(100);
				break;
			}
		}
		case 30: {
			System.out.println(3);
			break;
		}
		default:
			System.out.println(4);
		}
	}

}
*/


/*
	// ex8) 
	public class Hello {
 		public static void main(String[] args) { 
 	//1 ��.if��
 	 if(true){
 	 	System.out.println(1);
 	 };
 	 if(false){
 	 	System.out.println(2);
 	 }

	// 2��. if-else��
	if(false){
		System.out.println(5);
	}else{
		System.out.println(6);
	}

	// 3��. *****���׿���******
	int a = 10;
	int b = 5;
	int c;if(a>b)
	{
		c = 7;
	}else
	{
		c = 8;
	}System.out.println(c);

	c=a>b?7:8;System.out.println(c);

	if(a>b)
	{
		System.out.println("ȣ����");
	}else
	{
		System.out.println("�ڳ���");
	}

	System.out.println(a>b?"ȣ����":"�ڳ���");

	// 4��. else-if�� (n���߿� 1��) // switch ������ �ٲ� �� ������ �ٲٴ°� ����
	int num = 83;

	if(num>=90)
	{
		System.out.println("A");
	}else if(num>=80)
	{
		System.out.println("B");
	}else if(num>=70)
	{
		System.out.println("C");
	}else if(num>=60)
	{
		System.out.println("D");
	}else
	{
		System.out.println("F");
	}

}
}
*/ 

/*
// ex7)
public class Hello {
	public static void main(String[] args) { 
	// ���������
  
 // 1) 
	int a; 
	a = 10; S
	ystem.out.println(a);
  
  // 2) 
	int b,c,d; 
	b = 1; 
	c = 2; 
	d = 3; 
	System.out.println(b+c+d);
  	System.out.println(b+" "+c+" "+d);
  
  
  // 3) 
  int e = 10; 
  int f = 20, g = 30; 
  int h, i = 40, j; 
  h = 50; 
  j = 60;
  System.out.println(e+" "+f+" "+g); 
  System.out.println(i+" "+h+" "+j);
  
  // 4) 
  int a10; 
  a10 = 10; 
  System.out.println(a10); 
  a10 = 20;
  System.out.println(a10);
  
  // 5) // swap���α׷� 
  int aa = 88, bb = 99; 
  int temp;
  
  System.out.println(aa); System.out.println(bb);
  
  temp = aa; //temp = 88 
  aa = bb; // aa = 99 
  bb = temp; // bb = 88
  
  System.out.println(aa); 
  System.out.println(bb);
  
  // 6) 
  // 5,6 ���� 
  int cc = 100, dd = 200; 
  int tt = cc; cc = dd; dd = tt;
  System.out.println(cc); 
  System.out.println(dd);
  
  // 7) 
  int a1 = 17, b1 = 3; 
  System.out.println(a1+b1);
  System.out.println(a1-b1); 
  System.out.println(a1*b1);
  System.out.println(a1/b1); 
  System.out.println(a1%b1);
  
  System.out.println(a1>b1); 
  System.out.println(a1>=b1);
  System.out.println(a1<b1); 
  System.out.println(a1<=b1);
  System.out.println(a1==b1); 
  System.out.println(a1!=b1);
  
  // ��������� �񱳿��꺸�� �켱������ ����, �׸��� Ȥ�� �� ������ ������ �� ������ �������� �Ͼ 
  // ��� -> �� ->������ ������ �켱���� 
  System.out.println(a1>b1*7);
  
  System.out.println(a1>b1*7||a1-10>b1);
  
}
}
*/


/*
  // ex6) 
	public class Hello {
		public static void main(String[] args) {
			byte apple;
			apple = -128;
			System.out.println(apple);
			System.out.println(Byte.MIN_VALUE);
			System.out.println(Byte.MAX_VALUE);
			short banana;
			banana = 30000;
			System.out.println(Short.MIN_VALUE);
			System.out.println(Short.MAX_VALUE);
			System.out.println(banana);
			int orange;
			orange = 2000000;
			System.out.println(Integer.MIN_VALUE);
			System.out.println(Integer.MAX_VALUE);
			System.out.println(orange);
			long melon;
			melon = 999999999;
			System.out.println(Long.MIN_VALUE);
			System.out.println(Long.MAX_VALUE);
			System.out.println(melon);

			float tiger; // 4byte tiger = 3.14f; System.out.println(tiger); double lion;
			// 8byte lion = 3.14; System.out.println(lion);

			char cat; // ����� �� �� ���� cat = '��';
			System.out.println((int) Character.MIN_VALUE);
			System.out.println((int) Character.MAX_VALUE);
			System.out.println(cat);

			boolean dog;
			dog = true;
			System.out.println(dog);

		}
	}
*/


/*
// ex5)
public class Hello {
	public static void main(String[] args) {
		System.out.println(10); // �������
		System.out.println('��'); // �������
		System.out.println("ȣ����"); // ���ڿ����
		System.out.println("1000"); // ���ڿ����

		System.out.println(10 + 20); // ����+����(�������)
		System.out.println(10 + "ȣ����"); // ���ڿ� ����(����� ���ڿ�)
		System.out.println("ȣ����" + "10"); // ���ڿ� ����(����� ���ڿ�)
		System.out.println("ȣ����" + "�ڳ���"); // ����� ���ڿ� ����
		System.out.println(10 + "ȣ����" + 20); // ����� ���ڿ� ����
		System.out.println(10 + 20 + "ȣ����"); // ����� ���ڿ� ����
		System.out.println("ȣ����" + 10 + 20 + "ȣ����"); // ���ʺ��� �ϳ��� ����
		System.out.println(10 + "    " + 20); // ���� �ΰ��� �� ���ο� ��������� ���
	}
}
*/


/*
  // ex4) 
	public class Hello {
		public static void main(String[] args) { // ������
			System.out.println(false || true);
			System.out.println(true || false);
			System.out.println(false || false);
			System.out.println(true || true);

			System.out.println(false && true);
			System.out.println(true && false);
			System.out.println(false && false);
			System.out.println(true && true);

			System.out.println(true & true & false);
			System.out.println(false | false | true);

			// &,|�� ���̾��� �ȵ�, ��ȣ�� ������� ���°� ���� System.out.println(false & (false | true));

			System.out.println(3 > 2 | false | 6 <= 3);

			// ���������� System.out.println(!true);

			System.out.println(!(3 > 2));

		}
	} 
*/

/*
 // ex3) 

	public class Hello {
		public static void main(String[] args) { // �񱳿���(���迬��)
			System.out.println(5 > 3);
			System.out.println(5 >= 3);
			System.out.println(5 < 3);
			System.out.println(5 <= 3);
			System.out.println(5 == 3);
			System.out.println(5 != 3);
		}
	}
*/
	
/*
  // ex2) 
	public class Hello {
		public static void main(String[] args) { // �������
			System.out.println(20 + 3);
			System.out.println(20 - 3);
			System.out.println(20 * 3);
			System.out.println(20 / 3);
			System.out.println(20 % 3);
			System.out.println(3 + 2 * 4);
			System.out.println((3 + 2) * 4);
		}
	} 
*/

/*
// ex1)
public class Hello {
	public static void main(String[] args) {

		System.out.println("1000");
	}
}
*/