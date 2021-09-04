package pack002;

import java.util.*;
import java.util.function.Predicate;




// ���� �Լ��� ����

interface Test1{
	void m1();
}

interface Test2{
	void m1(int num);
}

// �������̽� �ȿ��� �Լ��� �Ѱ��� ������ ���� ��� ����
interface Test3{
	int m1();		// return�� int�� �ִٴ� ��
}

interface Test4{
	String m1(int num, String str);	// return�� String������ ����
}

interface Test5{
	void m1();
}



public class RamdaEx {

	public static void main(String[] args) {

		// ex1) �͸� Ŭ���� ����1
		Test1 t1 = new Test1() {
			@Override
			public void m1() {
			System.out.println(1);
			}
		};
		t1.m1();
		System.out.println();
		
		// ex2) ���� �Լ��� �⺻�� ����� ���
		// new ��ü�������� �Լ�()���� �� �����ϰ�  " ()-> " �����ϸ� ��
		// �� ex1)�� ex2)�� ���� ������
		Test1 t2 = ()-> {
			System.out.println(2);
		};
		t2.m1();
		System.out.println();
		
		// ex3) ���� �Լ����� �μ������� �� ��
		// �� ��° �������̽� Test2���� �μ� ������ ����
		Test2 t3 = (n)-> {		// n �տ� Ÿ���� ���� ����, �� �������̽� Test2�� int�� �˾Ƽ� �Ѿ��, num�� �� ���ڸ� ���
			System.out.println(n);	
		};
		t3.m1(100);
		System.out.println();
		
		// ex4)	���� �Լ����� ���ϰ��� �������
		Test3 t4 = ()-> {
			System.out.println(3);
			return 100;		// interface Test3�� �����Ա� ������ int���� ���ϰ��� ������ �ʿ���
		};
		System.out.println(t4.m1());
		System.out.println();
		
		
		// ex5) ���� �Լ����� ���ϰ��� �� �� �̻� ���� ��
		Test4 t5 = (n, s)->{	// �� �������̽� Test4�� num, str�� n��s�� ���
			return n+s;
		};
		System.out.println(t5.m1(100, "ȣ����"));
		
		// ex6) ���� �Լ� �ȿ��� return ���� �ڵ尡 ���� ��쿡�� '{}'��'return'Ű���带 ������ �� �ִ�. 
//		Test3 t6 = ()->{
//			return 100;
//		};
// 		->
		Test3 t6 = ()-> 100;		// <-  �� �ڵ�(ex6)�� �̷��� ��������
		
		
		
 		
	}

}






/*
// ���� �Լ� ����		****�ٽ� ����******
interface Test1{
	void m1();
}

interface Test2{
	int m1();	// return�� int������ ����
}

class Tiger{
	void m2(Test1 t) {		// �Լ��� Test1���� ���޹�������
		t.m1();				// main�Լ��� t1.t1���� �������
	}
	void m3(Test2 t) {		// �Լ��� Test2�� ���޹�������
		System.out.println(t.m1());
	}
}


public class RamdaEx {

	public static void main(String[] args) {

		Test1 t1 = ()-> {	// ���� �Լ� ����
			System.out.println(1);
		};
		
		Tiger tiger = new Tiger();		// tiger��ü ����
		
		tiger.m2(t1);		// �ٷ� �� main�Լ����� t1 ���� �Լ��� ���� �� ����
		
		// ���� ��� ���
		tiger.m2(()->{		// ���� ���� �ٷ� ���� ���
			System.out.println(2);
		});	
		
		tiger.m3(()->100);	// �� interface Test2�� ������ �޴� �Լ��� ȣ������
		
 		
		
		
		
		// LinkedList �� ���� �Լ�
		LinkedList<Integer> mm = new LinkedList<Integer>();
		mm.removeIf((lion)-> lion%2==0);	// �ƹ� �̸��̳� �־ ��
		
		// �� �ڵ�� �Ʒ� �ڵ�� ���� ���� ���� �ڵ常 ���
//		mm.removeIf((lion)-> { 
//			return lion %2==0; 
//		});

		
		
		
		
		
		
		
	}

}
*/















