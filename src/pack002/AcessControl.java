package pack002;

import java.util.*;




// 접근 제어자

// Private -> Default -> Protected -> Public


/*
class Tiger{
	private int a;		// 이 Tiger 클래스 안에서만 사용 가능, "데이터를 은닉"한다 라고 함
	public int b;		// public은 누구든지 사용 가능

	
	////////////////////////////////
	// setter함수, getter함수
	// private 변수를 만들고 우클릭 source -> getter,setter자동으로 만들어 주는 함수가 있음
	// private 변수값을 밖에서 변경하게 할 수 있는 방법
	private int num;	// 외부에서 num값을 설정하러면 함수 앞에 public을 붙여 값을 설정하게 함
	// setNum과 getNum을 자바bin이라고 함
	public void setNum(int num)	{	// 함수 이름(set)과 변수 이름(num)을 합쳐서 사용해야 함	, 국룰임
		this.num = num;	
	}
	public int getNum() {		
		return this.num;
	}
	/////////////////////////////////
	
	
	void m1() {
		a = 100;		// 위 a에 private가 걸려있어 클래스 내부 멤버로만 사용 가능
		b = 200;
	}
	
	
	// 함수 앞에 private를 붙이는 경우
	// 내부 클래스를 구성하는데만 사용 가능
	// 외부에서 호출해도 필요 없는 함수 만들 때
	private void m2() {
		
	}
	
}


public class AcessControl {

	public static void main(String[] args) {

		Tiger t = new Tiger();
		t.b = 10;
		//t.a  = 20;		// Tiger클래스의 a에 private가 걸려있어 사용 불가능
		
		t.setNum(100);
		System.out.println(t.getNum());
		
	}

}
*/



/*
// private 예시

class Tiger{
	private String name;		
	private int age;
	
	// name의 setter,getter
	String getName() {
		return name;
	}
	void setName(String name) {
		this.name = name;
	}

	// age의 setter,getter 
	int getAge() {
		return age;
	}
	void setAge(int age) {
		this.age = age;
	}
	
	
}


public class AcessControl {

	public static void main(String[] args) {

		
	}

}
*/







