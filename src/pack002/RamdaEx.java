package pack002;

import java.util.*;
import java.util.function.Predicate;




// 람다 함수의 문법

interface Test1{
	void m1();
}

interface Test2{
	void m1(int num);
}

// 인터페이스 안에서 함수를 한개만 지정할 때만 사용 가능
interface Test3{
	int m1();		// return이 int로 있다는 뜻
}

interface Test4{
	String m1(int num, String str);	// return이 String형으로 있음
}

interface Test5{
	void m1();
}



public class RamdaEx {

	public static void main(String[] args) {

		// ex1) 익명 클래스 생성1
		Test1 t1 = new Test1() {
			@Override
			public void m1() {
			System.out.println(1);
			}
		};
		t1.m1();
		System.out.println();
		
		// ex2) 람다 함수의 기본형 만드는 방범
		// new 객체생성부터 함수()까지 다 삭제하고  " ()-> " 생성하면 됨
		// 위 ex1)과 ex2)는 완전 동일함
		Test1 t2 = ()-> {
			System.out.println(2);
		};
		t2.m1();
		System.out.println();
		
		// ex3) 람다 함수에서 인수전달을 할 때
		// 두 번째 인터페이스 Test2에서 인수 전달을 받음
		Test2 t3 = (n)-> {		// n 앞에 타입을 생략 가능, 위 인터페이스 Test2의 int가 알아서 넘어옴, num의 맨 앞자만 사용
			System.out.println(n);	
		};
		t3.m1(100);
		System.out.println();
		
		// ex4)	람다 함수에서 리턴값이 있을경우
		Test3 t4 = ()-> {
			System.out.println(3);
			return 100;		// interface Test3을 가져왔기 때문에 int형의 리턴값이 무조건 필요함
		};
		System.out.println(t4.m1());
		System.out.println();
		
		
		// ex5) 람다 함수에서 리턴값을 두 개 이상 받을 때
		Test4 t5 = (n, s)->{	// 위 인터페이스 Test4의 num, str의 n과s만 사용
			return n+s;
		};
		System.out.println(t5.m1(100, "호랑이"));
		
		// ex6) 람다 함수 안에서 return 말고 코드가 없을 경우에는 '{}'와'return'키워드를 생략할 수 있다. 
//		Test3 t6 = ()->{
//			return 100;
//		};
// 		->
		Test3 t6 = ()-> 100;		// <-  위 코드(ex6)를 이렇게 생략가능
		
		
		
 		
	}

}






/*
// 람다 함수 예제		****다시 보기******
interface Test1{
	void m1();
}

interface Test2{
	int m1();	// return이 int형으로 있음
}

class Tiger{
	void m2(Test1 t) {		// 함수를 Test1으로 전달받을거임
		t.m1();				// main함수의 t1.t1과는 관계없음
	}
	void m3(Test2 t) {		// 함수를 Test2로 전달받을거임
		System.out.println(t.m1());
	}
}


public class RamdaEx {

	public static void main(String[] args) {

		Test1 t1 = ()-> {	// 람다 함수 생성
			System.out.println(1);
		};
		
		Tiger tiger = new Tiger();		// tiger객체 생성
		
		tiger.m2(t1);		// 바로 위 main함수안의 t1 람다 함수를 받을 수 있음
		
		// 실제 사용 모습
		tiger.m2(()->{		// 람다 식을 바로 적는 방법
			System.out.println(2);
		});	
		
		tiger.m3(()->100);	// 위 interface Test2의 리턴을 받는 함수를 호출했음
		
 		
		
		
		
		// LinkedList 와 람다 함수
		LinkedList<Integer> mm = new LinkedList<Integer>();
		mm.removeIf((lion)-> lion%2==0);	// 아무 이름이나 넣어도 됨
		
		// 위 코드와 아래 코드는 같음 보통 위에 코드만 사용
//		mm.removeIf((lion)-> { 
//			return lion %2==0; 
//		});

		
		
		
		
		
		
		
	}

}
*/















