package pack002;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import java.util.*;









/*
//버튼 활용3 , 쓰레드 추가
class ConnectThread  extends Thread{
	ThreadEx threadEx;
	ConnectThread(ThreadEx threadEx){
		this.threadEx = threadEx;
	}
	
	public void run() {				// 이 줄에서 button 사용하려면 위에서 필드 생성하고 생성자 생성해야 사용 가능
		System.out.println(2);
		Platform.runLater(			// Platform이라는 static함수 호출, import시켜줘야함
				()->{				// 람다 함수 생성
//					button.setText("호랑이");								
					threadEx.btn1.setText("호랑이");
				});			
	}
	
	
}

public class ThreadEx extends Application{		
	Button btn1 = new Button("테스트1");		
	Button btn2 = new Button("테스트2");	
	
	@Override
	public void start(Stage arg0) throws Exception {
		VBox root = new VBox();			
//		HBox root = new HBox();			
		
		root.setPrefSize(400, 300);		
		root.setSpacing(15);			
		//--------------------------------------------------
		
		
		// 버튼1 액션, 버튼1 안에서 Thread생성해서 작동 시켜봄
		btn1.setOnAction(new EventHandler<ActionEvent>() {	
			@Override
			public void handle(ActionEvent arg0) {
				///// 쓰레드 생성 그리고 발동까지, 쓰레드 start(); 함수 쓰면 알아서 오버라이드로 run함수 생성됨/////
				// 익명클래스로 쓰레드를 만들어 사용한 방법
				new Thread() {
					@Override
					public void run() {
						System.out.println(1);
						Platform.runLater(			// Platform이라는 static함수 호출, import시켜줘야함
								()->{				// 람다 함수 생성
									btn2.setText("호랑이");								
								});			
					}
				}.start();;
				///// 쓰레드 여기까지 /////
			}
		});	
		
		// 버튼 2액션, 위 ConnectThread클래스로 작동 시켜봄
		btn2.setOnAction(new EventHandler<ActionEvent>() {	
			@Override
			public void handle(ActionEvent arg0) {
				new ConnectThread(ThreadEx.this).start();	// Thread 객체 생성할 때 축약형으로 써도 됨
			}
		});	
		
		
		root.getChildren().addAll(btn1, btn2);			
		//--------------------------------------------------
		Scene scene = new Scene(root);
		arg0.setTitle("호랑이");			
		arg0.setScene(scene);
		arg0.show();
			
	}
	
	
	
	public static void main(String[] args) {
		launch();		
		System.out.println("Exit");
		
	}
}
*/






/*
// 버튼 활용2
public class ThreadEx extends Application{		
	@Override
		public void start(Stage arg0) throws Exception {
		VBox root = new VBox();			
//		HBox root = new HBox();			
		
		root.setPrefSize(400, 300);		
		root.setSpacing(15);			
		//--------------------------------------------------
		Button btn1 = new Button("테스트1");		
		Button btn2 = new Button("테스트2");		
		
		
		// 버튼1 액션
		btn1.setOnAction(new EventHandler<ActionEvent>() {	
			@Override
			public void handle(ActionEvent arg0) {
				btn2.setText("호랑이");		// UI에서 테스트1버튼을 누르면 테스트2버튼이 호랑이로 대체됨
			}
		});	
		
		// 버튼 2액션
		btn2.setOnAction(new EventHandler<ActionEvent>() {	
			@Override
			public void handle(ActionEvent arg0) {
//				btn1.setVisible(false);		// UI에서 테스트2버튼을 누르면 테스트1버튼이 사라짐
				btn1.setDisable(true);		// UI에서 테스트2버튼을 누르면 테스트1버튼이 비활성화 됨
			}
		});	
		
		
		root.getChildren().addAll(btn1, btn2);			
		//--------------------------------------------------
		Scene scene = new Scene(root);
		arg0.setTitle("호랑이");			
		arg0.setScene(scene);
		arg0.show();
			
	}
	public static void main(String[] args) {
		launch();		
		System.out.println("Exit");
		
	}
}
*/









/*
// 버튼 활용1
public class ThreadEx extends Application{		
	@Override
		public void start(Stage arg0) throws Exception {
		VBox root = new VBox();			
//		HBox root = new HBox();			
		
		root.setPrefSize(400, 300);		
		root.setSpacing(15);			
		//--------------------------------------------------
		Button btn1 = new Button("테스트1");		
//		Button btn2 = new Button("테스트2");		
		
		btn1.setOnAction(new EventHandler<ActionEvent>() {	// 버튼을 눌렀을 때 해야 할 행동, new Event.. Ctrl + space로 인터페이스를 이용하여 오버로딩
			@Override
			public void handle(ActionEvent arg0) {
				System.out.println("호랑이");
				
			}
		});	
		
		
		// 글자가 출력되는 창을 객체로 만듬
		TextArea textArea = new TextArea();
		
		
		
		// TextField는 글자 입력하는 창을 만듬
		TextField textField	= new TextField();	// TextFiled는 import해서 사용, 객체생성 해서 사용
		textField.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent arg0) {
				System.out.println("코끼리");
				String s = textField.getText();		// 지금까지 쓴 글자를 리턴시켜줌
				textArea.appendText(s+ "\n");		// 지금까지 쓴 글자를 UI의 출력창에 추가해줌, 글자 넣고 줄바꿈해야해서 "\n"넣어줌
				// !!!!!!!!!쓰레드 안에서 컨트롤 변경하지 마셈!!!!!!!!!  -> 만약 쓰레드 안에서 바꾸려 하면 run later을 사용하셈
				textField.setText("");				// UI에서 글자를 적고나면 글자가 사라져야함, 그래서 비어있는 상태 유지해야함
			}
		});	
		
		
		
		root.getChildren().addAll(btn1, textArea , textField);			// 객체 선언한건 무조건 getChildren에 넣어서 사용해야함
		//--------------------------------------------------
		Scene scene = new Scene(root);
		arg0.setTitle("호랑이");			
		arg0.setScene(scene);
		arg0.show();
			
	}
	public static void main(String[] args) {
		launch();		
		System.out.println("Exit");
		
	}
}
*/















/*
// 버튼 누르면 액션
public class ThreadEx extends Application{		
	@Override
		public void start(Stage arg0) throws Exception {
		VBox root = new VBox();			
//		HBox root = new HBox();			
		
		root.setPrefSize(400, 300);		
		root.setSpacing(15);			
		//--------------------------------------------------
		Button btn1 = new Button("테스트1");		
		Button btn2 = new Button("테스트2");		
		
		btn1.setOnAction(new EventHandler<ActionEvent>() {	// 버튼을 눌렀을 때 해야 할 행동, new Event.. Ctrl + space로 인터페이스를 이용하여 오버로딩
			@Override
			public void handle(ActionEvent arg0) {
				System.out.println("호랑이");
				
			}
		});			
		
		btn2.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent arg0) {
				System.out.println("사자");
			}
		});
		
		
		
		
		root.getChildren().addAll(btn1, btn2);	
		//--------------------------------------------------
		Scene scene = new Scene(root);
		arg0.setTitle("호랑이");			
		arg0.setScene(scene);
		arg0.show();
			
	}
	public static void main(String[] args) {
		launch();		
		System.out.println("Exit");
		
	}
}
*/

















/*
// JavaFx 활용 예시 2
public class ThreadEx extends Application{		//Application에러에서 import불러올때 무조건 JavaFx붙은거 import 하셈
	@Override
		public void start(Stage arg0) throws Exception {
		VBox root = new VBox();			// VBox : Vertical(세로 출력)
//		HBox root = new HBox();			// HBox : Horizon(가로 출력)
		
		root.setPrefSize(400, 300);		// UI창 크기 조절
		root.setSpacing(15);			// 버튼 간 거리조절
		//--------------------------------------------------
		
//		// 버튼 사용 방법 1
//		Button btn1 = new Button("테스트1");		// Button클래스 가져와서 쓰면 됨, ()안에는 버튼 이름을 넣음
//		root.getChildren().add(btn1);			// button을 사용하려면 root밑에 자식으로 넣어줘야 사용 가능함
//												// getChildren함수 사용해서 자식으로 넣어줌
//		Button btn2 = new Button("테스트2");		
//		root.getChildren().add(btn2);			// 밑에  root.getChildren().addAll(btn1, btn2);로 넣어줌
		

		Button btn1 = new Button("테스트1");	
		Button btn2 = new Button("테스트2");
		
	
		root.getChildren().addAll(btn1, btn2);		// addAll()을 사용하면 한번에 버튼을 넣을 수 있음, 객체 선언한건 무조건 getChildren에 넣어서 사용해야함		
		//--------------------------------------------------
		Scene scene = new Scene(root);
		arg0.setTitle("호랑이");			// Title 이름 설정
		arg0.setScene(scene);
		arg0.show();
			
	}
	public static void main(String[] args) {
		launch();				// 무조건 있어야 함, 창을 여는 코드
		System.out.println("Exit");
		
	}
}
*/









// JavaFx 활용 예시 1
/*
public class ThreadEx extends Application{		//Application에러에서 import불러올때 무조건 JavaFx붙은거 import 하셈
	@Override
		public void start(Stage arg0) throws Exception {
		System.out.println(2);
		arg0.show();
		System.out.println(3);
			
	}
	public static void main(String[] args) {
		System.out.println(1);
		launch();		// 3까지 출력하고 왼쪽의 Launch() 자리에서 blocking이 잡혀있음, 출력하면 UI창이 뜨게 됨
		System.out.println(4);
		
	}
}
*/








///////////////////////////////////////////////////////////////////












//쓰레드 프로그램
//쓰레드는 어디에 사용되나, 통신 쓰레드

//상단에 Window -> Show View -> other.. -> Debug -> Debug
//위에는 Debug 창을 열어놓고 직접 종료시킬 수 있게 만드는 루트



/*
// 멀티 쓰레드 예제2
// 자주 쓰는 쓰레드 예제
// *************중요**************
public class ThreadEx {

	public static void main(String[] args) {
		Thread t = new Thread() {		// run이라는 함수만 만들어놓으면 start함수를 콜 할 수 있음
			public void run() {			// run 함수 만듬
				System.out.println(1);
			}
		};
		t.start();		// 위 run함수를 작동시키는 거임, 함수를 콜 하는게 아님
		
		//////////////////////////////////////////////////////
		
		// 익명객체를 사용하여 코드 생성
		// 위 코드랑 아래 코드랑 같은거임
		new Thread() {		
			public void run() {			
				System.out.println(1);
			}
		}.start();	
		
		
	}
}
/*










/*
//멀티 스레드 예제1
class Tiger extends Thread{		
	public void run() {
		System.out.println("Tiger start");
		Thread t = new Lion();
		t.start();
		Scanner sc = new Scanner(System.in);	
		///////
		sc.nextInt();	
		System.out.println("Tiger end");
	}
}

class Lion extends Thread{		
	public void run() {
		System.out.println("Lion start");
		
		Scanner sc = new Scanner(System.in);
		//////
		sc.nextInt();	
		System.out.println("Lion end");
	}
}


public class ThreadEx {

	public static void main(String[] args) {
		System.out.println("main start");	
		Thread t = new Tiger();
		t.start();		//Thread 클래스에는 start함수가 있어서 사용 가능
		Scanner sc = new Scanner(System.in);	// 키보드로부터 입력받을 수 있는 객체 선언
		//////
		sc.nextInt();	//블로킹 함수 : 특정값을 입력 받기 전에는 실행x
		System.out.println("main end");

	}

}
*/







/*
//스레드 예제 1
//기본 문법1과 완전 동일한 코드임
//프로세스가 2개인 상황
class Tiger extends Thread{		// <- Thread는 표준 클래스임
	public void run() {		// 2
		System.out.println(2);
		// 반복문
		for (int i = 0; i < 10; i++) {
			System.out.println("호랑이"+i);
			try {Thread.sleep(0);} catch (Exception e) {}	// 잠시 멈추게 하는 코드, 0을 넣으면 아주 짧은 시간동안 쉬라는 뜼
		}
		System.out.println("종료");
	}	// for문이 다 끝나고 나오면 스레드가 소멸됨
}


public class ThreadEx {

	public static void main(String[] args) {
		Thread t = new Tiger();
		// 위에 start()함수가 없지만 Thread클래스에 start()함수가 있어서 start함수를 호출 가능
		t.start();		// 1
		System.out.println(1);
		// 반목문
		for (int i = 0; i < 10; i++) {
			System.out.println("코끼리"+i);
			try {Thread.sleep(0);} catch (Exception e) {}	// 잠시 멈추게 하는 코드, 0을 넣으면 아주 짧은 시간동안 쉬라는 뜼
		}
		System.out.println("main Exit");
	}
}
*/







/*
//스레드와 연관된 기본 문법1
class A{
	void Start() {
		System.out.println("start call");
		run();
	}
	void run() {
		System.out.println("A run call");
	}
}

class B extends A{
	void run() {
		System.out.println("스레드 시작");
		System.out.println("B run call");
		System.out.println("스레드 종료");
	}
}

public class ThreadEx {

	public static void main(String[] args) {
		A a = new B();		// 업캐스팅은 무조건 자식먼저 호출
		a.Start();
		
		
	}
}
*/
























