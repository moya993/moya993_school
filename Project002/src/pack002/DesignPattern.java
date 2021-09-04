package pack002;

import java.util.*;

// ������ ����(GoF)



/*
// ���ʸ� ����
// ���ʸ� ���� : ��� Ÿ���� ���� �޾��� �� �ִ� ���
// setter,getter
// �ڵ� ������ ������ ���Ǵ� Ÿ���� �ٸ����
// <T>, �����̳ʸ� ���, main�Լ����� ��ü�� �����Ҷ� Ÿ���� �������ָ� class���� <T>�� �Ǿ��ִ� �͵��� ��ü�� �ִ� Ÿ������ �����
class A<T>{
	private T data;
	public T getData() {
		return data;
	}
	public void setData(T data) {
		this.data = data;
	}
	
}

class B<T>{
	private T data;
	public T getData() {
		return data;
	}
	public void setData(T data) {
		this.data = data;
	}
	
}


public class DesignPattern {

	public static void main(String[] args) {
		A<Integer> a = new A<Integer>();		// ���ʸ� ����
		a.setData(100);
		System.out.println(a.getData());

		B<String> b = new B<String>();
		b.setData("ȣ���̼ұ�");
		System.out.println(b.getData());
		
		
		
		LinkedList<Integer> mm = new LinkedList<Integer>();
		
	}
}

*/











/*
// setter,getter
// �ڵ� ������ ������ ���Ǵ� Ÿ���� �ٸ����
class A{
	private int data;
	public int getData() {
		return data;
	}
	public void setData(int data) {
		this.data = data;
	}
	
}

class B{
	private String data;
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	
}

class C{
	private Tiger data;
	public Tiger getData() {
		return data;
	}
	public void setData(Tiger data) {
		this.data = data;
	}
	
}



public class DesignPattern {

	public static void main(String[] args) {
		A a = new A();
		a.setData(100);
		System.out.println(a.getData());

		B b = new B();
		b.setData("ȣ���̼ұ�");
		System.out.println(b.getData());
		
		
		
	}
}
*/








/*
//���ڷ��̼� ���� ����1
class Ŀ��{
	int ���� = 30;
	int ���() {
		System.out.println("Ŀ���ֹ�");
		return ����;
	}
}

class ���� extends Ŀ��{
	int ���� = 20;
	Ŀ�� a;	// �� ������Ե� ��ü�� ����޴´�.
	����(Ŀ�� a){
		this.a = a;
	}
	int ���() {
		System.out.println("�����߰�");
		return ���� + a.���();
	}
}

class ���� extends Ŀ��{
	int ���� = 10;
	Ŀ�� a;	// �� ������Ե� ��ü�� ����޴´�.
	����(Ŀ�� a){
		this.a = a;
	}
	int ���() {
		System.out.println("�����߰�");
		return ���� + a.���();
	}
}

public class DesignPattern {

	public static void main(String[] args) {
		Ŀ�� a = new Ŀ��();
//		System.out.println(a.���());
		a = new ����(a);
//		a = new ����(a);		// ���ڷ��̼� ������ �����߰��� �� �� �� �� �� �ִ�.
//		System.out.println(a.���());
		
//		a = new ����(a);
//		a = new ����(a);
		a = new ����(a);
		System.out.println(a.���());
//		a = new C(a);
//		System.out.println("---------------------");
//		System.out.println(a.run());
//		

	}

}
*/




/*
//���ڷ��̼� ����
class A{
	int num = 10;
	int run() {
		System.out.println("A Run");
		return num;
	}
}

class B extends A{
	int num = 20;
	A a;	// �� ������Ե� ��ü�� ����޴´�.
	B(A a){
		this.a = a;
	}
	int run() {
		System.out.println("B Run");
		return num + a.run();
	}
}


class C extends A{
	int num = 20;
	A a;	// �� ������Ե� ��ü�� ����޴´�.
	C(A a){
		this.a = a;
	}
	int run() {
		System.out.println("C Run");
		return num + a.run();
	}
}



public class DesignPattern {

	public static void main(String[] args) {
		A a = new A();
		a = new B(a);
		System.out.println(a.run());
		a = new C(a);
		System.out.println("---------------------");
		System.out.println(a.run());
		

	}

}
*/















/*
//�̱��� ����

//��ü�� �Ѱ��� ����������� Ŭ������ �ۼ��ϴ� ��
//��ü����µ� ����� ���� ��� ��� ���
//��ü�� �� �� �̻� �ʿ� ���� ��� ���

class Tiger{
	int num;
	private static Tiger instance = null;		// instance(���� �̸��� ������ instance)=null�� ��ü�� �ƴϴ� ��� �˷���
	
	private Tiger(){}	// ������ �տ� private�� ������ ��ü�� �� ����� ��
	
	static Tiger getInstance() {	// Tiger������ �Լ� ����, �Լ� �̸�(getInstance)���� �ؾ���, �Ϲ����� ��	
		if(instance == null) 	{			// static �ȿ����� static ����� ��� ����, �׷��� t = null �տ� static�� �ٿ������
			System.out.println(1);
			instance = new Tiger();		// ������ ��ü�� ��� ȣ���� ����, �׷��� static�� �����
		}								// �׷��� ��ü�� �� �ϳ��� ���� ����
		return instance;
	}
	
	void m1() {
		System.out.println(1000);
	}
}
	

public class DesignPattern {

	public static void main(String[] args) {
//		Tiger t1 = new Tiger();
//		Tiger t2 = new Tiger();
		Tiger t1 = Tiger.getInstance();
		Tiger t2 = Tiger.getInstance();
		System.out.println(t1.hashCode());
		System.out.println(t2.hashCode());
		
		t1.m1();	// ������ ��ü(t1 �̶�)�� 1���̱� ������ �� �Ȱ���
		t2.m1();	// ������ ��ü(t2 �̶�)�� 1���̱� ������ �� �Ȱ���
		t1.num = 2000;
		System.out.println("------------");
		System.out.println(t2.num);
	}

}
*/











