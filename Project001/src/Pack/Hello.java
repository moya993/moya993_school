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



















//ex51)		람다 함수		
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
		
		
		
		// 1. 짝수만 삭제하려면? 1번
//		int size = mm.size();
//		
//		
//		for (int i = mm.size()-1; i >= 0; i--) {
//			if(mm.get(i) % 2 == 0) {
//				mm.remove(i);
//			}
//		}
//		System.out.println(mm);
		
		
		
		// 2.  짝수만 삭제하려면? 2번
//		for (int i = 0; i < 15; i++) {
//			int a = mm.get(15-i) % 2;
//				if (a % 2 == 0) {
//					mm.remove(15-i);
//				}
//		}
//		System.out.println(mm);
//		

		// 3. 짝수만 삭제하려면? 강사님픽1. 자주안씀
//		for (int i = 0; i < mm.size(); ) {
//			int num = mm.get(i);
//			if(num % 2 == 0) {
//				mm.remove(i);
//			}else {
//				i++;
//			}
//		}
//		System.out.println(mm);
		
		
		// 4. 짝수만 삭제하려면? 강시님픽2. 이터레이터 클래스 사용해서 나타냄
//		for (Iterator<Integer> it = mm.iterator(); it.hasNext(); ) {	// hasNext();는 True 아니면 False를 리턴함
//			Integer num = it.next();
//			if(num % 2 == 0) {
//				it.remove();
//			}
//		}
//		System.out.println(mm);
		
		
		// 5. 짝수만 삭제하려면? 강사님픽3. removeIf 잘 모르겠음, 코드실행 안됨
		// removeIf( Predicate<> )
//		mm.removeIf(new Predicate<Integer>() {
//			@Override
//			public boolean test(Integer num) {
//				return num % 2 == 0;
//			}
//		});		// removeIf()는 조건에 맞춰서 제거해줌
//		
//		System.out.println(mm);
//		
		
		// 5. 짝수만 삭제하려면? 강사님픽4. 람다 함수 사용
		mm.removeIf( num -> num % 2 == 0 );		// ->를 arrow 연산자라고 함
		System.out.println(mm);
		
	}
}






/*
//ex50)		데이터 찾기
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
				System.out.println(i+"번째 찾았다.");
				break;
			}
			if(i == mm.size()-1) {
				System.out.println("못찾음");
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
// CRUD에서는 메모리 상관없이 속도만 따짐
// CRUD 특성 확인해보기
public class Hello 
{
	public static void main(String[] args) 
	{	
		// 밑에는 <Integer>만 관리해주는 컨테이너이다.    <>   <- 컨테이너임
		LinkedList<Integer> mm = new LinkedList<Integer>();
		
		// CRUD 과정 4가지
		
		// 1. C(Create)RUD
		mm.add(10);
		System.out.println(mm.size());	// 데이터를 몇개 가지고 있는지 확인
		for (int i = 0; i < 10; i++) {
			mm.add(i*10+i);
		}
		
		System.out.println("-------------");
		
		// 2. CR(Reading)UD
		// 2-1. 
		System.out.println(mm);
		
		// 2-2. for문 활용
		// 활용도가 제일 높음
		int size = mm.size();		// 비용 절감을 위해 함수를 미리 변수에 넣어주고 사용하셈
		for (int i = 0; i < size; i++) {	// 비용 절감을 위해 위에서 mm.size()를 변수에 넣어 사용해야함
			int data = mm.get(i);
			System.out.print(data + " ");
		}System.out.println();
		
		// 2-3. for-each문
		// 많이 쓰는 변수는 x, item, data, value정도를 변수로 사용
		for (Integer x : mm) {
			System.out.print(x + " ");
		}System.out.println();
		

		System.out.println("-------------");
		
		
		// 3. CRU(Update)D
		mm.set(5, 999);		// 5번 코드를 999로 변경
		System.out.println(mm);
		
		
		System.out.println("-------------");
		
		// 4. CRUD(Delete)
		mm.remove(5);	// 5번 코드를 날림
		System.out.println(mm);
		
		
		
	}
}
*/














/*
//ex48-2)	진법2
public class Hello 
{
	public static void main(String[] args) 
	{	

		// 0000 0000 1101 1100
				char c5 = 0x00dc;	// 1101 1100
				char mask = 0x80;	// 1000 0000
				String [] elec = new String[] {
						"에어컨","선풍기","김치냉장고","세탁기",
						"TV","에어프라이기","노트북","컴퓨터"
						};
			
				
//				for (int i = 0; i < 8; i++)
//				{
//					System.out.println(
//							(c5 & mask)== mask ?
//							elec[i] +" ON":
//							elec[i] +" OFF");
//					mask >>= 1;
//				}

//				위 아래 동일
				
				
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
//ex48-1)	진법
public class Hello 
{
	static String hexaToBinary(int n) {
		String s = Integer.toBinaryString(n);	// 문자형으로 치환시켜줌
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
		System.out.println(hexaToBinary( a & b >> 8 ));	// 오른쪽으로 beat shift가 발생
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
		
		
//		c 가전제품 상태***************이해완료
	      char mask = 0x0080; // 0000 0000 1000 0000 , mask데이터를 시프트 연산자를 사용해서 밀기
	      char n5 = 0x00dc;   // 0000 0000 1101 1100
	      String s2 = hexaToBinary(n5);
	      System.out.println(s2);
	      System.out.println(hexaToBinary(mask));
	      
	      String[] word = {"선풍기", "청소기", "에어컨", "전자레인지", "에어프라이어", "컴퓨터", "냉장고", "의자"};
	      
//	      8개를 상태를 출력
	      for(int i = 0; i < 8; i++) { 

	         if((n5 & (mask >> i)) == 0) {
	        	 word[i] += "가 꺼져있다.";
	        	 System.out.println(word[i]);
	         }else {
	        	 word[i] += "가 켜져있다.";
	        	 System.out.println(word[i]);
	         }
	         
	         
	      }
			
	      
	      
	      
		
		
		
		
	}
}

*/









/*
// ex48)	진법
public class Hello 
{
	static String hexaToBinary(int n) {
		String s = Integer.toBinaryString(n);	// 문자형으로 치환시켜줌
//		System.out.println(s);
//		System.out.println(s.length());
		while(s.length() < 32) {
			s = "0" + s;
		}
//		System.out.println(s);
		
		StringBuffer s1 = new StringBuffer(s);
//		s1.insert(4, "안");
//		System.out.println(s1);
//		s1.insert(9, "녕");
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
		// hexaToBinary가 2진수일 경우 : 0011 1011 0001 0010 1100 1101 0101 1001
		// c가 이진수일 경우 : 0011 1011 0001 0010 1100 1101 0101 1001
		int a = 0x3b12cd59;		// d랑 같음
		int b = 991087961; 		// c랑 같음
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
// ex47)	String 클래스가 가지고 있는것들

// String 데이터를 변경시킬 수 없다.!!!!!!!!!!!!!!!!!!!!!!!!!!

public class Hello 
{
	public static void main(String[] args) 
	{	
		String s = "무궁화꽃이피었습니다";	//
		
		// 1. String.length()
		// 글자 길이 출력
		System.out.println(s.length());
		
		System.out.println("--------------------");
		
		// 2. charAt(int index)
		// index에 인수전달만 해주면char타입으로 리턴됨
		// index번호에 있는 글자를 출력함
		// 3번 문자를 하나 출렫함
		System.out.println(s.charAt(3));
		
		System.out.println("--------------------");
		
		// 3. indexOf(String str)
		// str에 해당되는 인덱스 번호를 출력함
		// 못찾으면 -1로 출력
		System.out.println(s.indexOf("화꽃이"));
		System.out.println(s.indexOf("목꽃이"));
		
		int n = s.indexOf("화꽃이");
		if(n != -1) {
			System.out.println(n+"번째 find");
		} else {
			System.out.println("not found");
		}
		
		System.out.println("--------------------");
		
		// 4. String.replace(CharSequence target, CharSequence replacement)
		// 주의!!! : 원본 데이터가 변경되었는가 확인
		// 앞에 입력받는게 타겟, 뒤가 대체할 글자
		System.out.println(s.replace("꽃이", "나무가"));
		System.out.println(s);
		
		// !!!!!!!!!!!String은 데이터를 변경할 수 없음!!!!!!!!!!!!!!!!!!
		// s가 변경된거 아닙니까? 하지만 데이터를 갱신한게 아니고 기존의 객체를 없앰!!!!!!!!!!!!!!
		// 밑에 s는 객체를 새로 만든거임
//		s = "대한민국";
		System.out.println(s);
		
		System.out.println("--------------------");
		
		// 5. String.substring(int beginIndex)
		// 슬라이싱
		// 숫자 자리부터 마지막까지 잘라서 출력
		System.out.println(s.substring(5));
		System.out.println(s.substring(3,6));
		
		System.out.println("--------------------");
		
		// 6. String.trim()
		// 아이디 비번 로그인할 때 주로 사용
		// 앞 뒤의 공백 제거
		String s2 = "   App   le   ";
		System.out.print(s2.trim());
		System.out.println("호랑이");
		
		System.out.println("--------------------");
		
		// 7. 
		// String.toUpperCase()
		// String.toLowerCase()
		// 대문자로 만들어 줌, 소문자 만들어줌
		String s3 = "APple";
		System.out.println(s3.toUpperCase());
		System.out.println(s3.toLowerCase());
		
		System.out.println("-------------------");
		
		
		// 8. 데이터를 받았을 때 사용
		byte[] data = new byte[] {65, 'B', 'C', 'D'};
		String s4 = new String(data, 0, data.length);
		System.out.println(s4);		// 문자열로 변환됨
		
		// 데이터를 하나씩 전솧할 때 사용
		String s5 = "Banana";
		byte[] data1 = s5.getBytes();
		for (byte value : data1) {
			System.out.println((char)value);
		}
		

	}
}
*/











/*
// ex46-2)		try-catch문, finally를 사용하는 이유
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
		} finally {		// 예외처리를 떠나 무조건 실행되는 코드
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
// ex46-1)		Exception(예외처리) ,try-catch문을 사용하는 이유
// throw랑 try-catch는 한쌍임 
class Tiger{
	
	// 1번
	// try catch문 
	void m1() {
		System.out.println(1);
		
		try {
			throw new Exception();		// 일부로 exception을 발생시키는 코드			
		} catch (Exception e) {			// throw에는 반드시 try-catch문과 함께 써야함
			System.out.println("Exception 발생함");
		}
	}
	
	// 2번
	// try catch문 없이 Exception 에러를 없애는 방법
	// 함수 이름 뒤에 throws Exception을 넣어줌
	// 이 방법은 이 함수를 사용하는 사람이 알아서 try-catch문을 써봐서 확인하라는 말
	// 예외 떠넘기기, 책임전가함 개나쁨
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
	
		
		// 1번
		t1.m1();
		
		
		// 2번
		try {
			t1.m2();
		} catch (Exception e) {
			
		}
		System.out.println(3);
		
		
		// Thread
		for (int i = 0; i < 5; i++) {
			System.out.println(i);
			try {  Thread.sleep(2000);	} catch (Exception e) {}	// unhandle Exception에러가 뜬다면 try-catch문쓰면 끝		
		}

		
		
	}
}

*/



/*
// ex46)	Exception(예외처리), try catch문과 같이 씀
// Exception은 문제가 발생했다는걸 프로그램에 알리는 역할
// 이 때 try catch문으로 실행을 계속할건지 중단할건지 결정해야함
// 프로그램을 중단시키는게 목적이 아님

public class Hello 
{
	public static void main(String[] args) 
	{	
		// 1번째 Exception
		System.out.println(1);	// 어떤식으로든 출력이 됨
		try {	
//			int a = 10 / 0;							
		} catch (Exception e) {
			e.printStackTrace();	
		}
		System.out.println(2);
		
		
		// 2번째 Exception
		// ArrayIndex(OutOfBounds)Exception - 범위를 넘었을 경우
		// try-catch문을 사용하면 적어도 프로그램이 중단되지는 않음
		int[]ar = {1, 2, 3};
		try {		
			ar[3] = 10;						
		} catch (Exception e) {

		}
		System.out.println(3);
		
		
		// 3번째 Exception
		// (NullPointer)Exception
		String s = "무궁화꽃이피었습니다.";
		System.out.println(s.length());
		s = null;
		try {
			System.out.println(s.length());		// 객체가 아닌친구의 길이를 출력하려함
		} catch (Exception e) {			// Exception을 안쓰면 오류가떠서 다음께 출력이 안됨
			// TODO: handle exception
		}
		System.out.println(4);	
		
	}
}
*/









/*
// ex45-5)	인터페이스 연습5
// 제일 잘 만들어진 인터페이스
class Baduk{
	
	Ai ai;	// 객체선언
	
	Baduk(){
		System.out.println("대국을 시작합니다.");
	}
	Baduk(Ai ai){	// 객체변수 초기화
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


//구글에서 만듬
class Alphago implements Ai{
	@Override
	public void play() {
		// TODO Auto-generated method stub
		System.out.println("인공지능은 알파고 입니다.");
	}
	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("알파고가 점수 계산을 합니다.");
	}
	
	
}

//아마존에서 만듬
class Betago implements Ai{
	@Override
	public void play() {
		// TODO Auto-generated method stub
		System.out.println("인공지능은 베타고 입니다.");
	}
	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("베타고가 점수 계산을 합니다.");
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
//ex45-4)	연습4
class Baduk{
	Baduk(){
		System.out.println("대국을 시작합니다.");
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



//구글에서 만듬
class Alphago implements Ai{
	public void play() {
		System.out.println("인공지능은 알파고 입니다.");
	}
	@Override
	public void stop() {
		System.out.println("알파고가 점수 계산을 합니다.");
	}
	
}

//아마존에서 만듬
class Betago implements Ai{
	public void play() {
		System.out.println("인공지능은 베타고 입니다.");
	}
	@Override
	public void stop() {
		System.out.println("베타고가 점수 계산을 합니다.");
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
// ex45-3)	연습3
class Baduk{
	// 생성자 생성
	Baduk(){
		System.out.println("대국을 시작합니다.");
	}
	


	void play(AI ai) {
		ai.play();
	}
}


interface Ai{
	void play();
}


//구글에서 만듬
class Alphago implements Ai{
	public void play() {
		System.out.println("인공지능은 알파고 입니다.");
	}
	
}

//아마존에서 만듬
class Betago implements Ai{
	public void play() {
		System.out.println("인공지능은 베타고 입니다.");
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
// ex45-2)	연습2
// Ai가 새로 생
class Baduk{
	// 생성자 생성
	Baduk(){
		System.out.println("대국을 시작합니다.");
	}
	
	// Alphago 함수 생성
	void play(Alphago t) {		// Alphago타입으로 인수를 받을거임
		System.out.println("인공지능은 알파고 입니다.");
	}
	
	// Betago 함수 생성
	void play(Betago t) {		// Betago타입으로 인수를 받을거임
		System.out.println("인공지능은 베타고 입니다.");
	}
	
	
	
}

// 구글에서 만듬
class Alphago{
	// 함수 생성
	void paly() {
		System.out.println("인공지능은 알파고 입니다.");
	}
	
}

// 아마존에서 만듬
class Betago{
	// 함수 생성
	void paly() {
		System.out.println("인공지능은 베타고 입니다.");
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
// ex45-1)	연습	인터페이스 
// 이 프로그램의 문제점 : 인공지능이 바뀐다면 어떻게 할 것인가?
// 알파고까지만 되기때문에 문제 가 많은 프로그램이다. 

class Baduk{
	// 생성자 생성
	Baduk(){
		System.out.println("대국을 시작합니다.");
	}
	
	// 함수 생성
	void play() {
		System.out.println("인공지능은 알파고 입니다.");
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
// ex44-2)	밑에와 똑같은 코드지만 자주사용하는 코드
//	************다시보기******************
// 1
interface Animal{
	void m1();	// 인터페이스 함수 안에서는 중괄호x
}


// 2
class Zoo {
	void sound(Animal t) {
		t.m1();		// 이것말고는 사용할 게 없음
	}
}


public class Hello 
{
	public static void main(String[] args) 
	{	
		
		// 1
		// 인수전달 용도로 자주 사용
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
// ex44-1)	인터페이스 문법 
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
		Tiger t1 = new Tiger();		// 일반적인 객체생성
		Animal t2 = new Tiger();	// 업캐스팅(왼-부, 좌-자)
		
		
		// 익명 클래스랑 익명 객체 둘 다 자주사용
		//******중요*******
		// 1. 익명 클래스
		Animal t3 = new Animal() {	// 익명클래스를 이용하여 객체를 생성
			@Override				// 모양은 Animal t3 = new Animal(){오버라이드};
			public void m1() {
				// TODO Auto-generated method stub
				System.out.println(2);
			}
		};	// 처음부터 안되는 코드지만 new Animal();에서 ;앞에 중괄호 만들고 Ctrl+space해서 오버라이드 하기
		
		//******중요*******
		// 2. 익명 객체 : 객체가 없는 친구를 사용
		new Animal() {
			@Override
		public void m1() {
			// TODO Auto-generated method stub
			System.out.println(3);
			}
		}.m1();;	//   }.함수이름   으로 사용
	
		t1.m1();
		t2.m1();
		t3.m1();

		
		// 함수인수의 객체를 이용하여 코드를 전달한다.
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
// ex43-5)	this의 네 번째 용법
// 생성자 안에서 필요에 따라 다른 생성자를 호출
// super();은 부모를 호출, this();는 자기 클래스의 다른 생성자를 호출
class Tiger{
	
	Tiger(){
		System.out.println(1);
	}
	
	Tiger(int a){
		// 인수를 받지않는 위에 생성자를 먼저 호출한다.
		this();		// 위의 인수전달이 없는 default생성자를 콜
		System.out.println(a);
	}
	
	Tiger(int a, int b){
		// 인수를 하나만 받는 위에 생성자를 먼저 호출한다.
		this(a+b);	// 생성자 안에서 다른 생성자 호출, 위에 있는 생성자를 콜
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
// ex43-4)	this의 세 번째 용법
// 프로그램에서 자주 나타나는 용법
// 자기 자신을 다른클래스로 인수 전달을 하기 위해 사용
// 상대방이 나 자신을 필요로 할때, 너에게로 나 자신을 보낸다.

class Tiger{
	void m1() {
		Lion t1 = new Lion();
		
		if(t1.merry(this) == true) {
			System.out.println("감사합니다.");
		} else {
			System.out.println("ㅠㅠ");
		}
		
	}
	
	int m2() {
		return 100;
	}
	
	String m3() {
		return "난폭";
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
			case "온순": {
				return true;
			}
			
			case "난폭": {
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
// ex43-3) this의 두 번째 용법
// 함수안에서 체이닝 해서 호출하기 위함
// 함수의 체이닝 목적을 위해 사용
// 자주사용
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
		
		t2.m2().m1().m2().m2().m3();;	// 체이닝 : 함수안에서 또 함수를 호출하는 것
		t1.m1().m2();;		
	
		System.out.println("------------");
		
		t1.m1().m2().m3();;
		// 위 한개랑 아래 3개 코드가 같음
		System.out.println("------------");
		t1.m1();
		t1.m2();
		System.out.println("호랑이");
		t1.m3();
		
	}
}
*/







/*
// ex43-2)		this의 첫 번째 용법
class Tiger{
	
//	Tiger this;		// <- 이 코드는 생략되어 있음
//	Tiger(Tiger t){		// <- Tiger t 코드는 생략되어 있음
//		this = t;	// <- 이 코드는 생략되어 있음
//	}
	
	int a, b, size;	// 필드변수
	// 밑에 생성자 안의 멤버변수와는 별개임
	
	
	// 멤버변수를 x,y로 바꿈, self대입이 일어나는 중
	Tiger(int a, int b, int size){		// 생성자를 만드는 이유는 멤버변수를 초기화 시키기 위함임, 다른 이유는 없음
		this.a = a;		// 멤버의 변수명이랑 필드의 변수명이랑 중첩될 때 구분하기 위함임
		this.b = b;		
		this.size = size;
		
	}
	
	 void show() {
		 System.out.println(this.a+" "+this.b+" "+size);		// 출력 a,b는 (this.)가 생략되어 있음
		 
	 }
	
}

public class Hello 
{
	public static void main(String[] args) 
	{	
		Tiger t1 = new Tiger(10, 20, 30);
		
		t1.show();
		
		
		int num = 10;
		num = num;		// self 대입, 자기가 가지고 있는 변수를 자기 변수에 대입, 쓸모없는 코드
		
		
	}
}
*/






/*
// ex43-1)		this
class Tiger{
// 원래 this라는 변수가 존재함	
//	Tiger this;			// 내가 적지 않아도 알아서 만들어줌
//	
//	Tiger(Tiger t, int a, int b){	// Tiger t가 생략되어있음
//		this = t;		// 코드가 생략되어있음
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
		Tiger t1 = new Tiger(10, 20);		// t1이 위에 t로 넘어감
		System.out.println(t1.hashCode());		
		System.out.println("---------------");
		Tiger t2 = new Tiger(30, 40);	// t2가 위의 Tiger생성자의 t로 넘어감
		System.out.println(t2.hashCode());
		
	}
}
*/









/*
// ex42)	final
final class Animal{
	final int NUM = 10;		// final이 붙은거는 값을 변경할 수 없음, 값을 변경할 수 없는걸 상수라고 함
	
	Animal(){}
	
	final void M1() {	// 함수 앞에 final이 붙으면 이 코드 이후로부터 오버라이딩이 안됨, 이 자리가 마지막
		
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
//		t1.num = 20;	 위에서 final로 상수화 시켰기 때문에 더 이상 변경 불가능
		System.out.println(Math.PI);
		
		String s1 = null;	// String클래스는 상속받을 수 없다.
				
	}
}
*/







/*
// ex41)	인터페이스 
class A{
	void m1() {
		System.out.println(1);
	}
}

interface B{
	void m2();		// 함수원형 or 함수 프로토타입 이라고 함
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



@FunctionalInterface		// 함수원형이 1개만 쓰도록 제한을 검
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
		Thread t2 = null;	// t2는 객체가 아니다 라는 뜻
		String s = null;
		StringBuffer sf = null;		// 제너릭 문법 공부
		
		
	}
}
*/








/*
// solid 원칙 살펴보기
// ex40)	인터페이스 예시************
interface 한국은행 {		// 대부분 class안에 interface는 한개밖에 안씀
	void 입금();
	void 출금();
	void 이체();
	void 대출(); 

}

class 국민은행 implements 한국은행{
	@Override
	public void 입금() {
		System.out.println("이자율은 3%입니다.");
		
	}
	@Override
	public void 출금() {
		// TODO Auto-generated method stub
	
	}
	@Override
	public void 이체() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void 대출() {
		// TODO Auto-generated method stub
		
	}
}


class 우리은행 implements 한국은행{
	@Override
	public void 입금() {
		System.out.println("이자율은 10% 입니다.");
		
	}
	@Override
	public void 출금() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void 이체() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void 대출() {
		// TODO Auto-generated method stub
		
	}
}

public class Hello 
{
	public static void main(String[] args) 
	{	
		국민은행 t1 = new 국민은행();
		우리은행 t2 = new 우리은행();
		
		t1.입금();
		t2.입금();
		
		
	}
}
*/







/*
// ex39)	abstract 오버라이딩
abstract class 대장장이 {		// 함수앞에 abstract가 붙으면 class 앞에도 무조건 abstract가 붙어야함
	void 칼() {
		System.out.println("칼을 잘 만듭니다.ㅎㅎ");
	}
	abstract void 방패() {
		// 함수앞에 abstract가 붙으면 class 앞에도 무조건 abstract가 붙어야함
	}
}

class 나그네1 extends 대장장이{
	void 방패() {
		System.out.println("+5강 방패");
	}
}

class 나그네2 extends 대장장이{		// 오버라이딩 :  부모가 가지는 함수 이름과 자식이 가지고 있는 함수를 똑같이 만듬
	@override	// 어노테이션 : 프로그래머가 실수할 수 있는 걸 사전에 방지하기 위해 사용
	void 방패() {
		// TODO Auto-generated constructor stub
	}
}


public class Hello 
{
	public static void main(String[] args) 
	{	
		나그네1 t1 = new 나그네1();
		나그네2 t2 = new 나그네2();
		t1.칼();
		t1.방패();
		t2.칼();
		t2.방패();
	}
	
}

*/







/*
// ex38)	abstract(추상 = 미완성)	and		인터페이스
 
 
//abstract class Animal {		// abstract 미완성된 클래스
//	abstract void m1(); 	// abstract 미완성된 함수
//}

interface Animal {		// 인터페이스 
	void m1();
	// 위 void m1(); 함수 앞에는 원래 abstract가 붙음, 인터페이스 만들면 함수 앞에 무조건 붙음	
}

class Tiger implements Animal{		
	public void m1() {		// 부모클래스가 abstract이기 때문에 반드시 함수 선언을 해줘야함 
		System.out.println(2);
	}
}

public class Hello 
{
	public static void main(String[] args) 
	{	
		Animal a = new Tiger();
		a.m1();
		
	//	Animal t2 = new Animal		abstract가 들어간 클래스로는 객체생성 불가	
		
		
	}
}
*/







/*
// ex37)	업캐스팅을 사용하는 이유, 다형성

// Animal안의 cry가 추후에 다른 내용을 출력할 때
class Animal{
	void cry() {
		System.out.println("...");
	}
	
}

class Dog extends Animal{
	void cry() {
		System.out.println("멍멍");
	}
	
}

class Cat extends Animal{
	void cry() {
		System.out.println("야옹");
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
		
		// 위에 switch문이랑 똑같은 결과가 나타남
		// 업캐스팅 사용한 것
		Animal[] t3 = new Animal[] {new Dog(), new Cat(), new Sneak()};		// 뒤에서 데이터가 초기화 됨
		for (int i = 0; i < 10; i++) {
			t3[rn.nextInt(3)].cry();	
			
		}
		
		
	}
}
*/






/*
// ex36)	난수 발생 코드
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
// ex35)		배열 
public class Hello {
	
	public static void main(String[] args) {
	
		int a=10;

		// 배열 사용법 
		int [] ar = new int[5]; 			// ★★★ 배열의 첨자 "0 ~ 배열의 길이-1" 까지 사용가능
		int [] br = new int[]{1,2,3,4,5};   // 
		int [] cr = {10,20,30,40,50};		// 가장 쉬운 방법 실전 사용X

		System.out.println(ar.length); // 배열의 개수 확인

		for (int i = 0; i < br.length; i++) {
			System.out.print(br[i]+" ");
		} System.out.println();

		// 간략화 된 포문 foreach ++ 생략된 부분
		// 변수 x,data,value 많이쓴다.

		for (int x : cr) {   
			System.out.print(x+" ");
		}
		
		cr[0]=100;
		cr[4]=200;

		//cr[5]=300; 유효범위벗어남
		//cr[-1] =100;

	
		int num =3;
		ar[num] = 500;

		//ar[num*3-5] =0;// 조심해서 사용가능 ! 계산식이 유효범위를 맞춰야댐

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
		ss[0] ="호랑이";
		ss[1] ="앵무새";
		ss[2] ="하마";
		ss[3] ="토끼";

		for(int i=0 ; i< ss.length ; i++){
			System.out.print(ss[i]+" ");
		}
		System.out.println();
		
		System.out.println("===================================================");
		
		String [] st = new String[]{"해바라기","진달레","민들레"};

		String S1 = "호랑이";				 // 간편 방법
		String s2 = new String("독수리"); // 정석인 방법
		String [] su = new String[]{new String("해바라기"),new String("진달레"),new String("민들레")};

		for(int i=0 ; i< st.length ; i++){
			System.out.print(st[i]+" ");
		}
		System.out.println();
		
	}
}
*/






/*
// ex34)	업캐스팅 예시************필독***************
class Animal{
	void cry() {
		System.out.println("...");
	}
	
}

class Dog extends Animal{
	void cry() {
		System.out.println("멍멍");
	}
	
}

class Cat extends Animal{
	void cry() {
		System.out.println("야옹");
	}
	
}

class Sneak extends Animal{

}


class Zoo{
	
//	void sound(Dog t) {
//		t.cry();	
//	}
//	void sound(Cat t) {	// 오버로딩
//		t.cry();
//	}
//	void sound(Sneak t)	{	// 오버로딩
//		t.cry();
//	}
	
	
	// solid 원칙 5가지중 - 개방-폐쇄 원칙
	// 요소 확장에는 열려있으나 코드를 변경하는 것은 닫혀있다.
	void sound(Animal t) {		// 업캐스팅을 쓰는 이유 위의 3개 주석처럼 함수를 계속 추가 안해주고 Animal인수를 받으면서 한 번에 가능
		t.cry();
	}
	
	
	
}


public class Hello 
{
	public static void main(String[] args) 
	{	
		// 업캐스팅(좌-부모, 우-자식 관계)
		Animal t1 = new Dog();
		Animal t2 = new Cat();
		Animal t3 = new Sneak();
		
		t1.cry();
		t2.cry();
		t3.cry();	// 자식클래스에 cry함수가 없기 때문에 부모의 함수를 가져다가 호출함
		
		///////////////////////위 아래가 같은데 업캐스팅 왜 쓰는지?////////////////////////
		
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
		Animal t3 = new Tiger();	// case3 : 업캐스팅(부-자 관계)
	//	Tiger t4 = new Animal();	// case4 : 다운캐스팅
			
		t3.m1();	// m2메모리는 있지만 m2문법에 접근은 못함
		
		t3.m3();	//  함수를 호출하기 전에 무조건 자식에게 m3이 있으면 자식의 m3를 호출하고 없으면 부모의 m3를 출력
		
		
	}
}
*/







/*
// ex32)	상속관계에서의 생성자
class Animal{
	Animal(){
		System.out.println("부모생성자 콜");
	}
	Animal(int n){
		System.out.println("부모생성자" + n);
		
	}
}

class Tiger extends Animal{
	Tiger(){
		// 현재 라인에 코드가 1줄이 생략되어 있다.  그게 [ super(); ] 임
		super();	// 부모의 생성자를 call 시키라는 뜻, super();은 생성자 안에서만 사용가능
		System.out.println("첫 번째 자식생성자");
		
	}
	Tiger(int num) {
		super(num+100);		// super는 반드시 첫 줄에 와야함
		System.out.println("2번쨰 자식 생성자");
		
	}
	Tiger(int a, int b) {
		super(a*b);		// super는 반드시 첫 줄에 와야함
		System.out.println("3번쨰 자식 생성자");
		
	}
	
	
}


public class Hello 
{
	public static void main(String[] args) 
	{	
		Animal t1 = new Animal();
		Tiger t2 = new Tiger(); 	// 자식생성자가 먼저 call이 되고 부모생성자가 call 됨 
		Tiger t3 = new Tiger(3, 4); 	 
		
	}
}

*/







/*
// ex31)	상속
class Animal{	// 부모 클래스
	void m2() {
		System.out.println(2);
	}
	
	void m3() {
		System.out.println(31);
	}
	
}

class Tiger extends Animal{		// 자식 클래스		Tiger -> Animal 자식이 부모쪽으로 
	void m1() {
		System.out.println(1);
	}
	
	void m3() {
		System.out.println(32);
	}
	
	void m4() {
		m3();	// 자기가 가지고 있는 함수 m3을 호출************
		super.m3();		// 부모함수의 m3를 호출************ 간접적으로 우회해서 부모를 호출
		System.out.println(4);
	}
	
}

public class Hello 
{
	public static void main(String[] args) 
	{	
		Animal t1 = new Animal();	// Animal만 사용 상속과 관계x
		Tiger t2 = new Tiger();
		t2.m1();
		t2.m2();	// t2. 하면 먼저 Tiger 클래스에서 먼저 함수를 찾음
		t2.m3();	// 부모와 자식이 동일한 함수를 가지고 있으면 자기 클래스의 함수를 먼저 사용
		System.out.println("----------------");
		t2.m4();	// 부모의 함수 m3를 호출하려면 간접적으로 접근
		
		
		
	}
}
*/







/*
// ex30)	수학함수
public class Hello 
{
	public static void main(String[] args) 
	{	
		// 절대값
				int v1 = Math.abs(-5);
				double v2 = Math.abs(3.14);
				System.out.println(v1);
				System.out.println(v2);
				
				// 올림값
				double v3 = Math.ceil(5.3);
				double v4 = Math.ceil(-5.3);
				System.out.println(v3);
				System.out.println(v4);
				
				// 버림값
				double v5 = Math.floor(5.3);
				double v6 = Math.floor(-5.3);
				System.out.println(v5);
				System.out.println(v6);
				
				// 최대값
				double v7 = Math.max(5, 9);
				double v8 = Math.max(5.3, 2.5);
				System.out.println(v7);
				System.out.println(v8);
				
				// 최소값
				double v9 = Math.min(5, 9);
				double v10 = Math.min(5.3, 2.5);
				System.out.println(v9);
				System.out.println(v10);
				
				// 랜덤값
				double v11 = Math.random();
				System.out.println(v11);
				// return 값은 0.0 <= v11 < 1.0
				
				// 가까운 정수의 실수값
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

// static함수 안에서는 static멤버만 사용 가능
class Tiger{
	static void myMain() {
		Tiger t = new Tiger();	//자기 class 안에서 자신에 대한 객체 생성 가능
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
		System.out.println("1번콜");
	}
	
	
	public static void main(String[] args)		// void main은 함수 이름,void 앞의 static이 빠지면 객체 생성을 하지 않는이상 호출 불가능
	{	
		System.out.println(num);
		
		Hello h = new Hello();
		
		h.m1();
		h.m2();
		Hello.m1();
	//	Hello.m2();
		
	}
	
	void m2() {
		System.out.println("2번콜");
	}
	
	
}
*/





/*
// ex28)	static


// static은 객체생성해서 비용을 낭비하는 것을 아끼기 위해 사용
class Tiger{
	int num1;
	static int num2 = 100;	// static 붙은건 class 보다도 맨 위에 올라감(관제탑 기능)
	
	static void m1() {
		System.out.println("static 함수 콜");
	}

	
}

public class Hello 
{
	public static void main(String[] args) 
	{	
		System.out.println(Tiger.num2);		// static은 class이름.변수이름으로 객체생성 안하고 호출 가능
		
		Tiger t1 = new Tiger();
		Tiger t2 = new Tiger();
		
		System.out.println(t1.num1);
		System.out.println(t1.num2);
		
		t2.num2 = 200;
		System.out.println(t1.num2);
		
		System.out.println(Tiger.num2);		// 원래 static을 쓰는 원칙
	
		Tiger.m1();

		
		
		// static예시
		System.out.println(Math.abs(10));
		
		
	}
}
*/








/*
// ex27)	생성자 연습 ㄱ
class Car{
	int fuel = 100;	
	String name;
	
	Car(){
		name = "무명";
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
		System.out.println(name+" 차가 달린다.");
		fuel -= 30;
	}
	
	void stop() {
		fuel -= 10;
		System.out.println(" 차가 멈춘다");
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
		Car car2 = new Car("꼬마", 200);
			
		car1.move();
		car1.show();
		car2.move();
		car2.show();
		
	}
}
*/








/*
// ex26)	생성자 연습
class Tiger{	// class 안에 아무것도 없으면 알아서 default 생성자를 만듬
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
// ex25)	생성자

// 1. 생성자는 함수이다. 때문에 (생성자 함수)라고 함
// 2. 함수 이름은 클래스이름과 반드시 동일해야 함
// 3. 생성자 함수는 리턴값을 가질 수 없다. 그래서 void 조차도 생략함
// 4. 생성자 함수도 오버로딩이 가능함
// 5. 객체가 생성될 때 단 한 번 호출됨(임의로 호출 불가능)
// 6. 생성자를 사용하는 목적은 멤버 메소드를 초기화 시키는 목적으로 사용
// 7. 생성자 함수를 작성하지 않을시에는 자동으로 default생성자가 만들어짐

class Tiger{	
	int age = 20;	// 필드에서 미리 값을 지정하고 사용하는건 안되나? 하지만 그러면 객체가 생성되는 모든 age가 20이 됨
	String name = "홍길동";
	Tiger(){	// default생성자,	값을 초기화 하기 위해 주로 사용
		System.out.println("생성자 콜");
		System.out.println("생성자가 호출되었다.");
		// age = 20;
		// name = "홍길동";
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
		Tiger t1 = new Tiger();		//new 뒤에있는 Tiger가 생성자를 호출함
		Tiger t2 = new Tiger();		// 객체가 생성될때마다 생성자가 호출됨 		
		Tiger t3 = new Tiger(100,"강감찬");
		Tiger t4 = new Tiger(200,"앵무새");
				
		t1.showInfo();
		t2.showInfo();
		t3.showInfo();
		t4.showInfo();
		
		
	}
}
*/






/*
// ex24) 짜투리~	
public class Hello 
{
	public static void main(String[] args) 
	{	
		int a = 100;
		// 문자열로 변환 하고 싶을경우( Integer.soString() )
		String s1 = Integer.toString(a);
		System.out.println(s1+200);		// 문자열 처리
		// sugar code
		String s2 = ""+a;	// 문자열 처리
		System.out.println(s2);
		
		String s3 = "456";
		int b = Integer.parseInt(s3);	// parseInt는 구문을 분석한다, 해석한다
		System.out.println(b+100);
	}
}
*/




/*
// ex23)	오버로딩
class Tiger{
	// 함수 오버로딩, 함수 재정의라고 불림
	// 전달되는 함수의 개수가 다르던지, 타입이 다를 때 함수 이름을 다르게 사용 가능	
	void method01() {	// 함수 이름을 동일한 이름으로 생성 가능
		System.out.println(1);
	}	
	
	void method01(int a) {		// 함수 이름을 동일한 이름으로 생성 가능
		System.out.println(2);
	}
	
	void method01(int a, int b) {	// 함수 이름을 동일한 이름으로 생성 가능
		System.out.println(3);
	}
	
	void method01(String a, int b) {	// 함수 이름을 동일한 이름으로 생성 가능
		System.out.println(4);
	}
	
	
	// 함수 이름이 똑같이 제공된다면 오버로딩, 재정의
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
		t1.method01("호랑이", 1);
	}
}
*/






/*
//ex22)		반복문 continue, break
public class Hello 
{
	public static void main(String[] args) 
	{	
		for (int i = 0; i < 10; i++) {
			if(i < 3) {
				continue;	// for문에서 continue를 만나면 바로 i++로 감
			}
			System.out.println(i);
			if(i == 7) {
				break;
			}
		}
		System.out.println("호랑이");
		
		
		System.out.println("-------------------------");
		
		int num = 0;
		while(true) {
			num++;
			if(num == 10) {
				System.out.println("호랑이"+num);
				break;
			}			
			if(num%2 == 0) {
				System.out.println("코끼리"+num);
				continue;
			}
		}
		
		
		
		
	}
}

*/







/*
//ex21)		***********필독*************8
class Tiger{
	int m1(int a, int b) {

		if(a>b) {
			return 100;
		} else {
			System.out.println("호랑이");
			// return 200; or 
		}
		return 500;
	}
	
	void m2() {
		System.out.println(1);
		return;		// 함수가 실행 중단이 됨
		// System.out.println(2);
	}
	
	void m3(int num) {
		for (int i = 0; i < 10; i++) {
			if(i == num) {
				System.out.println("찾았다.");
				return;		// 함수가 돌지 않게 하려면 return 값 사용	
			}
		}
		System.out.println("검색데이터 찾지 못함");
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
// ex20)	**************필독**************
class Tiger{
	String m1() {
		return "독수리"; 
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
		
		
		// return 되는것이 Lion 객체이기 때문에 가능
		t1.m3(new Lion()).show();;
		
	}
}

*/




/*
// ex19)
class Tiger{
	// 주의!!! 인수전달할 때 int a,b는 안됨
	void m1(int a, int b) {		// 인수전달은 여러개 가능
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
		System.out.println("허허");
	}
	
}


public class Hello 
{
	public static void main(String[] args) 
	{	
		String s1 = "호랑이";		// String은 Java에서 만들어준 표준 클래스
		System.out.println(s1);
		System.out.println(s1.length());
		
		
		Tiger t1 = new Tiger();
		
		
		
		t1.m1(3,4);

		t1.m2(10, 'F', false, 3.14f, "땅강아지");
		
		
		
		Lion t2 = new Lion();	// Lion 클래스 객체 생성
		System.out.println(t2.hashCode());
		
		t1.m3(t2);	
		
		
		// Lion a는 new Lion()
		t1.m3(new Lion());		
		
	}
}
*/






/*

// ex18)

// 클래스 생성
class Tiger
{
	// merry라는 메소드 생성 = 함수라고도 불림
	// 자주 사용되는 코드를 불러서 사용함
	// 함수의 유형은 4가지
	
	// 1. 인수전달x
	void merry() {
		System.out.println("멍");
	}
	
	// 2. 인수전달o
	// int num = 3
	void happy(int num) {	
		for (int i = 0; i < num; i++) {
			System.out.println('왕');
		}
	}

	// 3. return o, void는 리턴값을 쓸 수 없음
	int turtle() {
		System.out.println("거북이 call");
		return 15;
	}

	// 4. 인수전달o, return o
	int fish(int num) {
		int n = num*3;
		return n;
		
		
	}
	
	
	
	
}


public class Hello 
{
	public static void main(String[] args) 
	{	
		Tiger t = new Tiger();		// new 객체명() + Ctrl,1
		
		//1 
		t.merry();	// 함수를 call(호출)한 것
		t.merry();
		t.merry();
		
		for(int i = 0; i < 10; i++) {
			t.merry();
		}
		
		// 2
		System.out.println("--------------------");
		t.happy(3);		// 인수전달
		
		System.out.println("--------------------");
		// 3
		int num = t.turtle();	// return값을 변수에 저장해서 아래에서 출력
		System.out.println(num);
		System.out.println(t.turtle());	// return값을 바로 받을 때
		
		// 4
		int cnt = t.fish(7);
		System.out.println(cnt);
		System.out.println(t.fish(345));
		
		
		
		//     함수의 구성
		// return값   인수전달
		//    x         x
		//    x         o
		//    o         x
		//    o         o
		
		
	}
}

*/









/*
// ex17)	**********class클래스************

class Tiger{
	// 필드 : 클래스 안에서 생성되는 변수(필드, 멤버, 변수 3가지 이름으로 불림) 
	int a;
	int b = 20;
	int c,d = 30;
	// 생성자 
	// 메소드 
}




public class Hello 
{	
	public static void main(String[] args) 
	{	
		// 객체 생성 방법, 맨앞(Tiger)와 맨뒤 (Tiger)이름은 항상 같아야함
		Tiger t1 = new Tiger();
		Tiger t2 = new Tiger();
		
		// 필드를 사용하기 위해서는 (객체.필드명)    
		// ex)t1.a
		t1.a = 100;
		t1.c = t1.a+30;
		System.out.println(t1.a);
		System.out.println(t1.b);
		System.out.println(t1.c);
		System.out.println(t1.d);
		System.out.println(t2.c);
		
		// 모든 객체는 생성되면 반드시 자기자신의 고유번호를 발급받는다.
		// 고유번호를 확인하는 방법 (객체.hashCode())
		System.out.println(t1.hashCode());
		System.out.println(t2.hashCode());
		
		
		// t3와 t3의 메모리를 공유함(참조)
		// 다른 이름이지만 동일한 메모리 공유
		Tiger t3;
		t3 = t2;	
		System.out.println(t3.hashCode());	// t3와 t2의 해시값이 같음
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
		b = a++; 	// 대입 증가 순서로 일어남, a가 가지고 있는 수를 대입하고나서 a가 증가함
		System.out.println(a+" "+b);
		System.out.println(String.format("%d %d", a, b));
				
		int c = 10, d;
		d = ++c;	// 증가 대입 순서로 일어남, c를 증가시키고 d에 대입
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
		int a = 10;		// 대입해서 들어가는 자리에 있는 10을 리터럴이라고 부름
		int b = 20;
		short c = 30;
		b = (int)c;	// 타입 캐스팅
		
	
		
		int num = 10;
		num = num + 3;
		num+=3;		// 위에보다 컴파일 하는 속도가 더 빠름
		
		
		
		int a1 = 0, a2 = 0;
		a1 = a2 + 3;
		
		
		
		int t = +1;		// 숫자에 +를 넣는 이유는 자리맞춤 때문에 함
		int u = -1;
		int k = 0;
		k+=3;
		k = 3;
		
		
		
		int d = 0;
		d++;	// 속도가 제일 빠름
		System.out.println(d);
		++d;	// 속도가 제일 빠름
		System.out.println(d);
		d=d+1;	// 위에보다 수행 속도가 느림
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
				System.out.println("탈출하기 직전");
				break;
			}
			
	}
			
			// 반복횟수를 모르는 프로그램
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
// ex13)	while문
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
		//System.out.println("호랑이");
		
		// 3. while
		int a = 0;
		while(true) {
			System.out.println(a);
				if(a == 5){
				System.out.println("탈출하기 직전");
				break;
			}
			a++;
		}
		
		
		
	}
	
}
*/



/*
// ex10)   for문  =  for(초기;조건;증감){}

public class Hello {
	public static void main(String[] args) {
		System.out.println(1000);
		int num = 10;
		num = num + 3;
		System.out.println(num);
		num = num + 1;
		System.out.println(num);
		num++; // 자신이가지고 있는 값을 1증가시키는 단항연산자(++)
		System.out.println(num);
		num--; // 자신이 가지고 있는 값을1감소시키는 단항연산자(--)
		System.out.println(num);
		++num;
		System.out.println(num);
		--num;
		System.out.println(num);

		for (int i = 0; i < 3; i = i + 1) {
			System.out.println("호랑이" + i);
		}

		// for문의 잘못된 예시1
		for (int i = 5; i < 4; i++) {

		} // for문의 잘못된 예시2
		for (int i = 0; i > 4; i++) {

		} // for문의 잘못된 예시3
		for (int i = 0; i < 4; i = i + 3) {

		}

		// for문을 사용하는 형식1
		for (int i = 0; i < 5; i++) {

		} // for문을 사용하는 형식2
		for (int i = 1; i <= 5; i++) {

		} // for문을 사용하는 형식3 // 음수,양수의 좌표 프로그램 짤때 사용
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
// ex9) switch 문
public class Hello {
	public static void main(String[] args) { 
		// 1번. case뒤에는 변수가 올 수 없다.
		// 2번. switch안에는 변수를 넣을 수 있다.
		// 3번.default,break는 생략할 수 있다.
		// 4번. 의도적인 경우에는 break를 생략할 수 있다.
		// 5번. case분기에서실행되는는 문장이 1문장 이상일경우 일반적으로 블록처리를 함
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
 	//1 번.if문
 	 if(true){
 	 	System.out.println(1);
 	 };
 	 if(false){
 	 	System.out.println(2);
 	 }

	// 2번. if-else문
	if(false){
		System.out.println(5);
	}else{
		System.out.println(6);
	}

	// 3번. *****삼항연산******
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
		System.out.println("호랑이");
	}else
	{
		System.out.println("코끼리");
	}

	System.out.println(a>b?"호랑이":"코끼리");

	// 4번. else-if문 (n개중에 1개) // switch 문으로 바꿀 수 있으면 바꾸는게 좋음
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
	// 변수사용방법
  
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
  
  // 5) // swap프로그램 
  int aa = 88, bb = 99; 
  int temp;
  
  System.out.println(aa); System.out.println(bb);
  
  temp = aa; //temp = 88 
  aa = bb; // aa = 99 
  bb = temp; // bb = 88
  
  System.out.println(aa); 
  System.out.println(bb);
  
  // 6) 
  // 5,6 동일 
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
  
  // 산술연산이 비교연산보다 우선순위에 있음, 그리고 혹시 논리 연산이 있으면 그 다음에 논리연산이 일어남 
  // 산술 -> 비교 ->논리연산 순서로 우선순위 
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

			char cat; // 양수만 쓸 수 있음 cat = '한';
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
		System.out.println(10); // 숫자출력
		System.out.println('한'); // 문자출력
		System.out.println("호랑이"); // 문자열출력
		System.out.println("1000"); // 문자열출력

		System.out.println(10 + 20); // 숫자+숫자(산술연산)
		System.out.println(10 + "호랑이"); // 문자열 연결(결과는 문자열)
		System.out.println("호랑이" + "10"); // 문자열 연결(결과는 문자열)
		System.out.println("호랑이" + "코끼리"); // 결과는 문자열 연결
		System.out.println(10 + "호랑이" + 20); // 결과는 문자열 연결
		System.out.println(10 + 20 + "호랑이"); // 결과는 문자열 연결
		System.out.println("호랑이" + 10 + 20 + "호랑이"); // 왼쪽부터 하나씩 연결
		System.out.println(10 + "    " + 20); // 숫자 두개를 한 라인에 쓰고싶을때 사용
	}
}
*/


/*
  // ex4) 
	public class Hello {
		public static void main(String[] args) { // 논리연산
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

			// &,|는 같이쓰면 안됨, 괄호로 구분지어서 쓰는건 가능 System.out.println(false & (false | true));

			System.out.println(3 > 2 | false | 6 <= 3);

			// 부정연산자 System.out.println(!true);

			System.out.println(!(3 > 2));

		}
	} 
*/

/*
 // ex3) 

	public class Hello {
		public static void main(String[] args) { // 비교연산(관계연산)
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
		public static void main(String[] args) { // 산술연산
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