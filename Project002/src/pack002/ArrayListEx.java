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








//3. Map�÷���
//key�� value������ ������ Entry ��ü�� �����ϴ� ������ ����
//key�� value ���� ��� ��ü��
//key�� �ߺ� ����x, value�� �ߺ� ����o
//�����ϰ� ��ü �߰��� put���� �Ѵ�.





//3 - 2 - 1. Properties
// hashtable�� ���� Ŭ����  hashtable�� ��� Ư¡�� �״�� ������.
// ��� key, value�� <String> Ÿ������ ������ �÷����̴�.
// �ַ� ���ø����̼��� �ɼ� ����, �����ͺ��̽� ���� ���� , ����ȭ ������ ����� ������Ƽ(~.properties)������ ���� �� �ַ� ���
// 






/*
//3 - 2. Hashtable
// HashMap�� ������ ���� ����
// ����ȭ�� �޼ҵ�� �����Ǿ� ����
// �ϳ��� �����尡 ������ �Ϸ��ؾ߸� �ٸ� �����带 ������ �� �ִ�.
// �׷��� ��Ƽ ������ ȯ�濡�� �����ϰ� ��ü�� �߰�, ������ �� �ִ�.
// Map<K, V> map = new Hashtable<K, V>();


// ���̵�� ��й�ȣ �˻��ϱ�
public class ArrayListEx 
{
	public static void main(String[] args) 
	{
		Map<String, String> map = new Hashtable<String, String>();
		
		map.put("spring", "12");		// ���̵�, ��й�ȣ�� �̸� �����Ų��.
		map.put("summer", "123");
		map.put("fall", "1234");
		map.put("winter", "12345");
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("���̵�� ��й�ȣ�� �Է����ּ���");
			System.out.print("���̵� : ");
			String id = sc.nextLine();	// Ű����� �Է��� ���̵� ����
			
			System.out.print("��й�ȣ : ");
			String password = sc.nextLine();	// Ű����� �Է��� ��й�ȣ�� ����
			System.out.println();
			
			if(map.containsKey(id)) {		// ���̵��� Ű�� �����ϴ��� Ȯ���Ѵ�.
				if(map.get(id).equals(password)) {		// ��й�ȣ�� ���Ѵ�.
					System.out.println("�α��� �Ǿ����ϴ�");
					break;
				} else {
					System.out.println("��й�ȣ�� ��ġ���� �ʽ��ϴ�.");
				}
			}
			
		}
		
	}
	
}
*/













/*

//3 - 1. HashMap
// ��ǥ���� Map�÷���
// Map<K, V> map = new HashMap<K, V>();
// Ű�� ���� �⺻ Ÿ��(byte, int, double...)��� �Ұ���
// Ŭ���� �� �������̽� Ÿ�Ը� ������

// �̸��� Ű��, ������ ������ �����ϴ� HashMap ��� ���
public class ArrayListEx 
{
	public static void main(String[] args) 
	{	
		// Map �÷��� ����
		Map<String, Integer> map = new HashMap<String, Integer>();
		
		// ��ü ����
		map.put("�ſ��", 85);
		map.put("ȫ�浿", 90);
		map.put("������", 80);
		map.put("ȫ�浿", 95);	// 2��° Ű�� ���⶧���� ������ ������ ������ ��ġ
		System.out.println("�� Entry �� : "+ map.size());		//����� �� Entry �� ���
		System.out.println();
		
		// ��ü ã��
		System.out.println("\tȫ�浿 : " + map.get("ȫ�浿"));		//�̸�(Ű)���� ����(��)�˻�
		System.out.println();
		
		// ��ü�� �ϳ��� ó��
		Set<String> keySet = map.keySet();	//key Set ���
		Iterator<String> keyIterator = keySet.iterator();	// �ݺ��ؼ� Ű�� ��� ���� Map���� ��
		while(keyIterator.hasNext()) {
			String key = keyIterator.next();
			Integer value = map.get(key);
			System.out.println("\t" + key + " : " + value);
		}
		System.out.println();
		
		
		// ��ü ����
		map.remove("ȫ�浿");		// Ű�� Map.Entry�� ����
		System.out.println("�� Entry �� :" + map.size());
		
		
		// ��ü�� �ϳ��� ó��
		Set<Map.Entry<String, Integer>> entrySet = map.entrySet();	// Map.Entry Set���
		Iterator<Map.Entry<String, Integer>> entryIterator = entrySet.iterator();
		
		while(entryIterator.hasNext()) {		//�ݺ��ؼ� Map.Entry�� ��� Ű�� ���� ��
			Map.Entry<String, Integer> entry = entryIterator.next();
			String key = entry.getKey();
			Integer value = entry.getValue();
			System.out.println("\t" + key + " : " + value);			
			
		}
		
		// ��ü ��ü ����
		map.clear();	// ��� Map.Entry ����
		System.out.println("�� Entry ��:" + map.size());
		
		
	}
}
*/












///////////////////////////////////////////////////////////////////////////////////////
/*
//2. Set�÷���

// ���� ������ ���� ����
// ��ü�� �ߺ��ؼ� ������ �� ����, �ϳ��� null���� ���� ����
// �ε����� ��ü�� �˻��ؼ� �������� �޼ҵ尡 ����
// ���, ��ü ��ü�� ������� �ѹ��� �ݺ��ؼ� �������� �ݺ���(Iterator)�� �����Ѵ�.
// Iterator ������ : Iterator<E> iterator = set.iterator();
// Iterator �������̽� �ȿ��� hasNext() : True, False ���, next() : �ϳ��� ��ü�� ������, remove() : ��ü ���Ű� ����




//2 - 1. HashSet
//2 - 1 - 2. Member ��ü�� �ߺ� ���� �����ϴ� HashSet
public class ArrayListEx 
{
	public static void main(String[] args) 
	{	
		Set<Member> set = new HashSet<Member>();
		
		
		set.add(new Member("ȫ�浿", 30));	//�ν��Ͻ��� �ٸ����� ���� �����Ͱ� �����ϹǷ� ��ü 1���� ����
		set.add(new Member("ȫ�浿", 30));	//�ν��Ͻ��� �ٸ����� ���� �����Ͱ� �����ϹǷ� ��ü 1���� ����
		
		System.out.println("�� ��ü�� : " + set.size());
	}
}
*/






/*
//2. Set�÷���

//2 - 1. HashSet
//2 - 1 - 1. equals()�� HashCode() �޼ҵ� ����
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
	public boolean equals(Object obj) {		//name�� age���� ������ true�� ����
		if(obj instanceof ArrayListEx) {
			ArrayListEx arrayListEx = (ArrayListEx) obj;
			return arrayListEx.name.equals(name) && (arrayListEx.age==age);
		}else {
			return false;
		}
		
	}
	
	// hashCode
	@Override
	public int hashCode() {		// name�� age���� ������ ������ hashCode�� ����
		return name.hashCode() + age;
	}	//String�� hashCode() �̿�
	
	public static void main(String[] args) 
	{	

	}
}
*/











/*
//2. Set�÷���

//2 - 1. HashSet
// *�ؽ��ڵ�*
// Set<E> set = new HashSet<E>();
// ��ü���� ���� ���� �����ϰ�, ������ ��ü�� �ߺ� �������� ����
// ��ü�� �����ϱ� ���� �ؽ��ڵ带 ���� �̹� ����Ǿ� �ִ� ��ü���� �ؽ��ڵ�� ��
// String ��ü�� �ߺ� ���� �����ϴ� HashSet
public class ArrayListEx 
{
	public static void main(String[] args) 
	{	
		Set<String> set = new HashSet<String>();
		
		set.add("Java");
		set.add("JDBC");
		set.add("Servlet/JSP");
		set.add("Java");	// ù ��°�� Java�� �־� �������� �����
		set.add("iBATIS");
		
		int size = set.size();	//����� ��ü �� ���
		System.out.println("�� ��ü�� : "+set.size());		// 4�� �����
		System.out.println();
		
		/////////�ݺ��� ��� �ٽú�//////////////////////
		Iterator<String> iterator = set.iterator();		// �ݺ��� ���
		while(iterator.hasNext()) {		// ��ü ����ŭ ����
			String element = iterator.next(); 	// �� ���� ��ü�� �����´�.
			System.out.println("\t" + element);
		}
		
		set.remove("JDBC");		// �� ���� ��ü ����
		set.remove("iBATIS");	// �� ���� ��ü ����
		
		System.out.println("�� ��ü �� : " + set.size());
		
		iterator = set.iterator();		// �ݺ��� ���
		while(iterator.hasNext()) {		// ��ü ����ŭ ����
			String element = iterator.next(); 	// �� ���� ��ü�� �����´�.
			System.out.println("\t" + element);
		}
		System.out.println();
		
		set.clear();
		if(set.isEmpty()) {	System.out.println("��� ����");	}
		

	}
}
*/


/*
//2. Set�÷���

//2 - 1.  ***********�ٽ��ϼ�
public class ArrayListEx 
{
	public static void main(String[] args) 
	{	
		Set<String> set = new Set<String>();		// �� �����ߴ°ž�
		Iterator<String> iterator = set.iterator();
		while(iterator.hasNext()) {		//����� ��ü ����ŭ �����Ѵ�.
			// String ��ü �ϳ��� ������
			String str = iterator.next();
		}
	
		while(iterator.hasNext()) {
			String str = iterator.next();
			if(str.equals("ȫ�浿")) {
				iterator.remove();
			}
		}
		
	}
}
*/
////////////////////////////////////////////////////////////////////////////////////////








/*
//1. List�÷���
//List �÷����� ���� ������ ������

//1 - 3. LinkedList
//ArrayList�� ��� ����� ������ ���α����� ���� �ٸ�
//����� ��ü ������ ������ �Ͼ�� ������ �����ϰ� ����
//List<E> list = new LinkedList<E>();
//10000���� ��ü�� �����ϴµ� �ɸ� �ð� ������ ��
//List�������̽��� add(int index, E element)���
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
		System.out.println("Array �ɸ��ð�: " + (endTime-startTime) + " ns");
		
		startTime = System.nanoTime();
		for (int i = 0; i < 10000; i++) {
			list2.add(0,String.valueOf(i));
		}
	
		endTime = System.nanoTime();
		System.out.println("LinkedList �ɸ��ð�: " + (endTime-startTime) + " ns");
	
	}
}
*/



/*
//1. List�÷���

//1 - 2. Vector 
//�⺻������ ArrayList�� ������ ���� ������ ����
//List<E> list = new Vector<E>(); 
//�����尡 ������ ���¿��� ���� ����
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
		
		list.add(new ArrayListEx("����1", "����1", "�۾���1"));	// ArrayListEx ��ü�� ����
		list.add(new ArrayListEx("����2", "����2", "�۾���2"));
		list.add(new ArrayListEx("����3", "����3", "�۾���3"));
		list.add(new ArrayListEx("����4", "����4", "�۾���4"));
		list.add(new ArrayListEx("����5", "����5", "�۾���5"));
		
		list.remove(2);	// 2�� �ε��� ��ü(����3) ����
		list.remove(3);
		
		for (int i = 0; i < list.size(); i++) {
			ArrayListEx arrayListEx = list.get(i);
			System.out.println(arrayListEx.subject + "\t" + arrayListEx.content + "\t" + arrayListEx.writer);
		}
		
		
		
		
	}
}
*/



/*
//	1. List�÷���

//	1 - 1. ArrayList 
//�ε��� ��ȣ�� ������ ������� ������ ����ϰ� ��ü�� �����ǰ� ���ԵǴ� �������� ��� ����
//List<E> list = new ArrayList<E>();

public class ArrayListEx 
{
	public static void main(String[] args) 
	{	
		List<String> list = new ArrayList<String>();
		
		// ��ü ���� - add
		list.add("Java");	// String ��ü�� ����
		list.add("JDBC");
		list.add("Servelt/JSP");
		list.add(2, "Database");	// 2��° �ε����� Database����
		list.add("iBATIS");
		System.out.println(list);
		System.out.println();
		
		// ��ü ���� - size
		int size = list.size();		// list�� ����� �� ��ü �� ���
		System.out.println("�� ��ü�� : "+ list.size());
		System.out.println();
		
		// ���ϴ� ��ü ȣ�� - get
		String skill = list.get(2);		// 2�� �ε��� ��ȣ�� ��ü ���
		System.out.println("2�� �ε������� : "+ skill);
		System.out.println();
		
		for (int i = 0; i < list.size(); i++) {
			String str = list.get(i);
			System.out.println(i + " : " + str);
		}
		System.out.println();
		
		// ��ü ����
		list.remove(2);		// 2���� �ִ� Database ����
		list.remove(2);		// 2������ �Ű��� Servlet/JSP ����
		list.remove("iBATIS");
		System.out.println(list);
		
		// ����� �� ��ü ����ŭ ����
		for (int i = 0; i < list.size(); i++) {
			String str = list.get(i);
			System.out.println(i + ":" + str);
		}
		
		
		///////////////////////////////////////////////
		
		//1 1. ArrayList - Arrays.asList()�޼ҵ�
		// ������ ��ü�ε�� ������ �� asList()�޼ҵ� ���
		List<String> list1 = Arrays.asList("ȫ�浿", "�ſ��", "���ڹ�");
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