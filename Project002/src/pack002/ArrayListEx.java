package pack002;

import java.util.*;



/*
//ex)
public class ArrayListEx 
{
	public static void main(String[] args) 
	{	
		System.out.println("1000");
	}
}
*/








//3. Map컬랙션
//key와 value값으로 구성된 Entry 객체를 저장하는 구조를 가짐
//key와 value 값은 모두 객체임
//key는 중복 저장x, value는 중복 저장o
//유일하게 객체 추가를 put으로 한다.





//3 - 2 - 1. Properties
// hashtable의 하위 클래스  hashtable의 모든 특징을 그대로 가진다.
// 대신 key, value를 <String> 타입으로 제한한 컬렉션이다.
// 주로 애플리케이션의 옵션 정보, 데이터베이스 연결 정보 , 국제화 정보가 저장된 프로퍼티(~.properties)파일을 읽을 때 주로 사용
// 






/*
//3 - 2. Hashtable
// HashMap과 동일한 내부 구조
// 동기화된 메소드로 구성되어 있음
// 하나의 스레드가 실행을 완료해야만 다른 스레드를 실행할 수 있다.
// 그래서 멀티 스레드 환경에서 안전하게 객체를 추가, 삭제할 수 있다.
// Map<K, V> map = new Hashtable<K, V>();


// 아이디와 비밀번호 검사하기
public class ArrayListEx 
{
	public static void main(String[] args) 
	{
		Map<String, String> map = new Hashtable<String, String>();
		
		map.put("spring", "12");		// 아이디, 비밀번호를 미리 저장시킨다.
		map.put("summer", "123");
		map.put("fall", "1234");
		map.put("winter", "12345");
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("아이디와 비밀번호를 입력해주세요");
			System.out.print("아이디 : ");
			String id = sc.nextLine();	// 키보드로 입력한 아이디를 읽음
			
			System.out.print("비밀번호 : ");
			String password = sc.nextLine();	// 키보드로 입력한 비밀번호를 읽음
			System.out.println();
			
			if(map.containsKey(id)) {		// 아이디인 키가 존재하는지 확인한다.
				if(map.get(id).equals(password)) {		// 비밀번호를 비교한다.
					System.out.println("로그인 되었습니다");
					break;
				} else {
					System.out.println("비밀번호가 일치하지 않습니다.");
				}
			}
			
		}
		
	}
	
}
*/













/*

//3 - 1. HashMap
// 대표적인 Map컬랙션
// Map<K, V> map = new HashMap<K, V>();
// 키와 값은 기본 타입(byte, int, double...)사용 불가능
// 클래스 및 인터페이스 타입만 가능함

// 이름을 키로, 점수를 값으로 저장하는 HashMap 사용 방법
public class ArrayListEx 
{
	public static void main(String[] args) 
	{	
		// Map 컬렉션 생성
		Map<String, Integer> map = new HashMap<String, Integer>();
		
		// 객체 저장
		map.put("신용권", 85);
		map.put("홍길동", 90);
		map.put("강감찬", 80);
		map.put("홍길동", 95);	// 2번째 키와 같기때문에 마지막 저장한 값으로 대치
		System.out.println("총 Entry 수 : "+ map.size());		//저장된 총 Entry 수 얻기
		System.out.println();
		
		// 객체 찾기
		System.out.println("\t홍길동 : " + map.get("홍길동"));		//이름(키)으로 점수(값)검색
		System.out.println();
		
		// 객체를 하나씩 처리
		Set<String> keySet = map.keySet();	//key Set 얻기
		Iterator<String> keyIterator = keySet.iterator();	// 반복해서 키를 얻고 값을 Map에서 얻어냄
		while(keyIterator.hasNext()) {
			String key = keyIterator.next();
			Integer value = map.get(key);
			System.out.println("\t" + key + " : " + value);
		}
		System.out.println();
		
		
		// 객체 삭제
		map.remove("홍길동");		// 키로 Map.Entry를 제거
		System.out.println("총 Entry 수 :" + map.size());
		
		
		// 객체를 하나씩 처리
		Set<Map.Entry<String, Integer>> entrySet = map.entrySet();	// Map.Entry Set얻기
		Iterator<Map.Entry<String, Integer>> entryIterator = entrySet.iterator();
		
		while(entryIterator.hasNext()) {		//반복해서 Map.Entry를 얻고 키와 값을 얻어냄
			Map.Entry<String, Integer> entry = entryIterator.next();
			String key = entry.getKey();
			Integer value = entry.getValue();
			System.out.println("\t" + key + " : " + value);			
			
		}
		
		// 객체 전체 삭제
		map.clear();	// 모든 Map.Entry 삭제
		System.out.println("총 Entry 수:" + map.size());
		
		
	}
}
*/












///////////////////////////////////////////////////////////////////////////////////////
/*
//2. Set컬랙션

// 저장 순서를 유지 못함
// 객체를 중복해서 저장할 수 없음, 하나의 null값만 저장 가능
// 인덱스로 객체를 검색해서 가져오는 메소드가 없음
// 대신, 전체 객체를 대상으로 한번씩 반복해서 가져오는 반복자(Iterator)를 제공한다.
// Iterator 선언은 : Iterator<E> iterator = set.iterator();
// Iterator 인터페이스 안에는 hasNext() : True, False 출력, next() : 하나의 객체를 가져옴, remove() : 객체 제거가 있음




//2 - 1. HashSet
//2 - 1 - 2. Member 객체를 중복 없이 저장하는 HashSet
public class ArrayListEx 
{
	public static void main(String[] args) 
	{	
		Set<Member> set = new HashSet<Member>();
		
		
		set.add(new Member("홍길동", 30));	//인스턴스는 다르지만 내부 데이터가 동일하므로 객체 1개만 저장
		set.add(new Member("홍길동", 30));	//인스턴스는 다르지만 내부 데이터가 동일하므로 객체 1개만 저장
		
		System.out.println("총 객체수 : " + set.size());
	}
}
*/






/*
//2. Set컬랙션

//2 - 1. HashSet
//2 - 1 - 1. equals()와 HashCode() 메소드 정의
public class ArrayListEx 
{
	public String name;
	public int age;
	
	public ArrayListEx(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	// equals
	@Override
	public boolean equals(Object obj) {		//name과 age값이 같으면 true를 리턴
		if(obj instanceof ArrayListEx) {
			ArrayListEx arrayListEx = (ArrayListEx) obj;
			return arrayListEx.name.equals(name) && (arrayListEx.age==age);
		}else {
			return false;
		}
		
	}
	
	// hashCode
	@Override
	public int hashCode() {		// name과 age값이 같으면 동일한 hashCode가 리턴
		return name.hashCode() + age;
	}	//String의 hashCode() 이용
	
	public static void main(String[] args) 
	{	

	}
}
*/











/*
//2. Set컬랙션

//2 - 1. HashSet
// *해시코드*
// Set<E> set = new HashSet<E>();
// 객체들을 순서 없이 저장하고, 동일한 객체는 중복 저장하지 않음
// 객체를 저장하기 전에 해시코드를 얻어내서 이미 저장되어 있는 객체들의 해시코드와 비교
// String 객체를 중복 없이 저장하는 HashSet
public class ArrayListEx 
{
	public static void main(String[] args) 
	{	
		Set<String> set = new HashSet<String>();
		
		set.add("Java");
		set.add("JDBC");
		set.add("Servlet/JSP");
		set.add("Java");	// 첫 번째에 Java가 있어 위에꺼만 저장됨
		set.add("iBATIS");
		
		int size = set.size();	//저장된 객체 수 얻기
		System.out.println("총 객체수 : "+set.size());		// 4개 저장됨
		System.out.println();
		
		/////////반복자 얻기 다시봐//////////////////////
		Iterator<String> iterator = set.iterator();		// 반복자 얻기
		while(iterator.hasNext()) {		// 객체 수만큼 루핑
			String element = iterator.next(); 	// 한 개의 객체를 가져온다.
			System.out.println("\t" + element);
		}
		
		set.remove("JDBC");		// 한 개의 객체 삭제
		set.remove("iBATIS");	// 한 개의 객체 삭제
		
		System.out.println("총 객체 수 : " + set.size());
		
		iterator = set.iterator();		// 반복자 얻기
		while(iterator.hasNext()) {		// 객체 수만큼 루핑
			String element = iterator.next(); 	// 한 개의 객체를 가져온다.
			System.out.println("\t" + element);
		}
		System.out.println();
		
		set.clear();
		if(set.isEmpty()) {	System.out.println("비어 있음");	}
		

	}
}
*/


/*
//2. Set컬랙션

//2 - 1.  ***********다시하셈
public class ArrayListEx 
{
	public static void main(String[] args) 
	{	
		Set<String> set = new Set<String>();		// 왜 에러뜨는거야
		Iterator<String> iterator = set.iterator();
		while(iterator.hasNext()) {		//저장된 객체 수만큼 루핑한다.
			// String 객체 하나를 가져옴
			String str = iterator.next();
		}
	
		while(iterator.hasNext()) {
			String str = iterator.next();
			if(str.equals("홍길동")) {
				iterator.remove();
			}
		}
		
	}
}
*/
////////////////////////////////////////////////////////////////////////////////////////








/*
//1. List컬랙션
//List 컬랙션은 저장 순서를 유지함

//1 - 3. LinkedList
//ArrayList와 사용 방법은 같지만 내부구조가 완전 다름
//빈번한 객체 삭제와 삽입이 일어나는 곳에서 유용하게 사용됨
//List<E> list = new LinkedList<E>();
//10000개의 객체를 삽입하는데 걸린 시간 측정한 것
//List인터페이스의 add(int index, E element)사용
public class ArrayListEx 
{
	public static void main(String[] args) 
	{	
		List<String> list1 = new LinkedList<String>();
		List<String> list2 = new LinkedList<String>();
	
		long startTime;
		long endTime;
		
		startTime = System.nanoTime();
		for (int i = 0; i < 10000; i++) {
			list1.add(0, String.valueOf(i));
		}
		
		endTime = System.nanoTime();
		System.out.println("Array 걸린시간: " + (endTime-startTime) + " ns");
		
		startTime = System.nanoTime();
		for (int i = 0; i < 10000; i++) {
			list2.add(0,String.valueOf(i));
		}
	
		endTime = System.nanoTime();
		System.out.println("LinkedList 걸린시간: " + (endTime-startTime) + " ns");
	
	}
}
*/



/*
//1. List컬랙션

//1 - 2. Vector 
//기본적으로 ArrayList와 동일한 내부 구조를 가짐
//List<E> list = new Vector<E>(); 
//스레드가 안전한 상태에서 실행 가능
public class ArrayListEx 
{
	String subject;
	String content;
	String writer;
	
	
	public ArrayListEx(String subject, String content, String writer) {
		this.subject = subject;
		this.content = content;
		this.writer = writer;
	}
	
	public static void main(String[] args) 
	{	
		List<ArrayListEx> list = new Vector<ArrayListEx>();		
		
		list.add(new ArrayListEx("제목1", "내용1", "글쓴이1"));	// ArrayListEx 객체를 저장
		list.add(new ArrayListEx("제목2", "내용2", "글쓴이2"));
		list.add(new ArrayListEx("제목3", "내용3", "글쓴이3"));
		list.add(new ArrayListEx("제목4", "내용4", "글쓴이4"));
		list.add(new ArrayListEx("제목5", "내용5", "글쓴이5"));
		
		list.remove(2);	// 2번 인덱스 객체(제목3) 삭제
		list.remove(3);
		
		for (int i = 0; i < list.size(); i++) {
			ArrayListEx arrayListEx = list.get(i);
			System.out.println(arrayListEx.subject + "\t" + arrayListEx.content + "\t" + arrayListEx.writer);
		}
		
		
		
		
	}
}
*/



/*
//	1. List컬랙션

//	1 - 1. ArrayList 
//인덱스 번호가 앞으로 당겨지기 때문에 빈번하게 객체가 삭제되고 삽입되는 곳에서는 사용 안함
//List<E> list = new ArrayList<E>();

public class ArrayListEx 
{
	public static void main(String[] args) 
	{	
		List<String> list = new ArrayList<String>();
		
		// 객체 저장 - add
		list.add("Java");	// String 객체를 저장
		list.add("JDBC");
		list.add("Servelt/JSP");
		list.add(2, "Database");	// 2번째 인덱스에 Database저장
		list.add("iBATIS");
		System.out.println(list);
		System.out.println();
		
		// 객체 개수 - size
		int size = list.size();		// list에 저장된 총 객체 수 얻기
		System.out.println("총 객체수 : "+ list.size());
		System.out.println();
		
		// 원하는 객체 호출 - get
		String skill = list.get(2);		// 2번 인덱스 번호의 객체 얻기
		System.out.println("2번 인덱스에는 : "+ skill);
		System.out.println();
		
		for (int i = 0; i < list.size(); i++) {
			String str = list.get(i);
			System.out.println(i + " : " + str);
		}
		System.out.println();
		
		// 객체 삭제
		list.remove(2);		// 2번에 있는 Database 삭제
		list.remove(2);		// 2번으로 옮겨진 Servlet/JSP 삭제
		list.remove("iBATIS");
		System.out.println(list);
		
		// 저장된 총 객체 수만큼 루핑
		for (int i = 0; i < list.size(); i++) {
			String str = list.get(i);
			System.out.println(i + ":" + str);
		}
		
		
		///////////////////////////////////////////////
		
		//1 1. ArrayList - Arrays.asList()메소드
		// 고정된 객체로들로 구성할 때 asList()메소드 사용
		List<String> list1 = Arrays.asList("홍길동", "신용권", "감자바");
		for (String name : list1) {
			System.out.println(name);
		}
		
		
		List<Integer> list2 = Arrays.asList(1, 2, 3);
		for (int value : list2) {
			System.out.println(value);
		}
		
	}
}
*/