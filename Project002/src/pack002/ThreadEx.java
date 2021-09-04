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
//��ư Ȱ��3 , ������ �߰�
class ConnectThread  extends Thread{
	ThreadEx threadEx;
	ConnectThread(ThreadEx threadEx){
		this.threadEx = threadEx;
	}
	
	public void run() {				// �� �ٿ��� button ����Ϸ��� ������ �ʵ� �����ϰ� ������ �����ؾ� ��� ����
		System.out.println(2);
		Platform.runLater(			// Platform�̶�� static�Լ� ȣ��, import���������
				()->{				// ���� �Լ� ����
//					button.setText("ȣ����");								
					threadEx.btn1.setText("ȣ����");
				});			
	}
	
	
}

public class ThreadEx extends Application{		
	Button btn1 = new Button("�׽�Ʈ1");		
	Button btn2 = new Button("�׽�Ʈ2");	
	
	@Override
	public void start(Stage arg0) throws Exception {
		VBox root = new VBox();			
//		HBox root = new HBox();			
		
		root.setPrefSize(400, 300);		
		root.setSpacing(15);			
		//--------------------------------------------------
		
		
		// ��ư1 �׼�, ��ư1 �ȿ��� Thread�����ؼ� �۵� ���Ѻ�
		btn1.setOnAction(new EventHandler<ActionEvent>() {	
			@Override
			public void handle(ActionEvent arg0) {
				///// ������ ���� �׸��� �ߵ�����, ������ start(); �Լ� ���� �˾Ƽ� �������̵�� run�Լ� ������/////
				// �͸�Ŭ������ �����带 ����� ����� ���
				new Thread() {
					@Override
					public void run() {
						System.out.println(1);
						Platform.runLater(			// Platform�̶�� static�Լ� ȣ��, import���������
								()->{				// ���� �Լ� ����
									btn2.setText("ȣ����");								
								});			
					}
				}.start();;
				///// ������ ������� /////
			}
		});	
		
		// ��ư 2�׼�, �� ConnectThreadŬ������ �۵� ���Ѻ�
		btn2.setOnAction(new EventHandler<ActionEvent>() {	
			@Override
			public void handle(ActionEvent arg0) {
				new ConnectThread(ThreadEx.this).start();	// Thread ��ü ������ �� ��������� �ᵵ ��
			}
		});	
		
		
		root.getChildren().addAll(btn1, btn2);			
		//--------------------------------------------------
		Scene scene = new Scene(root);
		arg0.setTitle("ȣ����");			
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
// ��ư Ȱ��2
public class ThreadEx extends Application{		
	@Override
		public void start(Stage arg0) throws Exception {
		VBox root = new VBox();			
//		HBox root = new HBox();			
		
		root.setPrefSize(400, 300);		
		root.setSpacing(15);			
		//--------------------------------------------------
		Button btn1 = new Button("�׽�Ʈ1");		
		Button btn2 = new Button("�׽�Ʈ2");		
		
		
		// ��ư1 �׼�
		btn1.setOnAction(new EventHandler<ActionEvent>() {	
			@Override
			public void handle(ActionEvent arg0) {
				btn2.setText("ȣ����");		// UI���� �׽�Ʈ1��ư�� ������ �׽�Ʈ2��ư�� ȣ���̷� ��ü��
			}
		});	
		
		// ��ư 2�׼�
		btn2.setOnAction(new EventHandler<ActionEvent>() {	
			@Override
			public void handle(ActionEvent arg0) {
//				btn1.setVisible(false);		// UI���� �׽�Ʈ2��ư�� ������ �׽�Ʈ1��ư�� �����
				btn1.setDisable(true);		// UI���� �׽�Ʈ2��ư�� ������ �׽�Ʈ1��ư�� ��Ȱ��ȭ ��
			}
		});	
		
		
		root.getChildren().addAll(btn1, btn2);			
		//--------------------------------------------------
		Scene scene = new Scene(root);
		arg0.setTitle("ȣ����");			
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
// ��ư Ȱ��1
public class ThreadEx extends Application{		
	@Override
		public void start(Stage arg0) throws Exception {
		VBox root = new VBox();			
//		HBox root = new HBox();			
		
		root.setPrefSize(400, 300);		
		root.setSpacing(15);			
		//--------------------------------------------------
		Button btn1 = new Button("�׽�Ʈ1");		
//		Button btn2 = new Button("�׽�Ʈ2");		
		
		btn1.setOnAction(new EventHandler<ActionEvent>() {	// ��ư�� ������ �� �ؾ� �� �ൿ, new Event.. Ctrl + space�� �������̽��� �̿��Ͽ� �����ε�
			@Override
			public void handle(ActionEvent arg0) {
				System.out.println("ȣ����");
				
			}
		});	
		
		
		// ���ڰ� ��µǴ� â�� ��ü�� ����
		TextArea textArea = new TextArea();
		
		
		
		// TextField�� ���� �Է��ϴ� â�� ����
		TextField textField	= new TextField();	// TextFiled�� import�ؼ� ���, ��ü���� �ؼ� ���
		textField.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent arg0) {
				System.out.println("�ڳ���");
				String s = textField.getText();		// ���ݱ��� �� ���ڸ� ���Ͻ�����
				textArea.appendText(s+ "\n");		// ���ݱ��� �� ���ڸ� UI�� ���â�� �߰�����, ���� �ְ� �ٹٲ��ؾ��ؼ� "\n"�־���
				// !!!!!!!!!������ �ȿ��� ��Ʈ�� �������� ����!!!!!!!!!  -> ���� ������ �ȿ��� �ٲٷ� �ϸ� run later�� ����ϼ�
				textField.setText("");				// UI���� ���ڸ� ������ ���ڰ� ���������, �׷��� ����ִ� ���� �����ؾ���
			}
		});	
		
		
		
		root.getChildren().addAll(btn1, textArea , textField);			// ��ü �����Ѱ� ������ getChildren�� �־ ����ؾ���
		//--------------------------------------------------
		Scene scene = new Scene(root);
		arg0.setTitle("ȣ����");			
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
// ��ư ������ �׼�
public class ThreadEx extends Application{		
	@Override
		public void start(Stage arg0) throws Exception {
		VBox root = new VBox();			
//		HBox root = new HBox();			
		
		root.setPrefSize(400, 300);		
		root.setSpacing(15);			
		//--------------------------------------------------
		Button btn1 = new Button("�׽�Ʈ1");		
		Button btn2 = new Button("�׽�Ʈ2");		
		
		btn1.setOnAction(new EventHandler<ActionEvent>() {	// ��ư�� ������ �� �ؾ� �� �ൿ, new Event.. Ctrl + space�� �������̽��� �̿��Ͽ� �����ε�
			@Override
			public void handle(ActionEvent arg0) {
				System.out.println("ȣ����");
				
			}
		});			
		
		btn2.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent arg0) {
				System.out.println("����");
			}
		});
		
		
		
		
		root.getChildren().addAll(btn1, btn2);	
		//--------------------------------------------------
		Scene scene = new Scene(root);
		arg0.setTitle("ȣ����");			
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
// JavaFx Ȱ�� ���� 2
public class ThreadEx extends Application{		//Application�������� import�ҷ��ö� ������ JavaFx������ import �ϼ�
	@Override
		public void start(Stage arg0) throws Exception {
		VBox root = new VBox();			// VBox : Vertical(���� ���)
//		HBox root = new HBox();			// HBox : Horizon(���� ���)
		
		root.setPrefSize(400, 300);		// UIâ ũ�� ����
		root.setSpacing(15);			// ��ư �� �Ÿ�����
		//--------------------------------------------------
		
//		// ��ư ��� ��� 1
//		Button btn1 = new Button("�׽�Ʈ1");		// ButtonŬ���� �����ͼ� ���� ��, ()�ȿ��� ��ư �̸��� ����
//		root.getChildren().add(btn1);			// button�� ����Ϸ��� root�ؿ� �ڽ����� �־���� ��� ������
//												// getChildren�Լ� ����ؼ� �ڽ����� �־���
//		Button btn2 = new Button("�׽�Ʈ2");		
//		root.getChildren().add(btn2);			// �ؿ�  root.getChildren().addAll(btn1, btn2);�� �־���
		

		Button btn1 = new Button("�׽�Ʈ1");	
		Button btn2 = new Button("�׽�Ʈ2");
		
	
		root.getChildren().addAll(btn1, btn2);		// addAll()�� ����ϸ� �ѹ��� ��ư�� ���� �� ����, ��ü �����Ѱ� ������ getChildren�� �־ ����ؾ���		
		//--------------------------------------------------
		Scene scene = new Scene(root);
		arg0.setTitle("ȣ����");			// Title �̸� ����
		arg0.setScene(scene);
		arg0.show();
			
	}
	public static void main(String[] args) {
		launch();				// ������ �־�� ��, â�� ���� �ڵ�
		System.out.println("Exit");
		
	}
}
*/









// JavaFx Ȱ�� ���� 1
/*
public class ThreadEx extends Application{		//Application�������� import�ҷ��ö� ������ JavaFx������ import �ϼ�
	@Override
		public void start(Stage arg0) throws Exception {
		System.out.println(2);
		arg0.show();
		System.out.println(3);
			
	}
	public static void main(String[] args) {
		System.out.println(1);
		launch();		// 3���� ����ϰ� ������ Launch() �ڸ����� blocking�� ��������, ����ϸ� UIâ�� �߰� ��
		System.out.println(4);
		
	}
}
*/








///////////////////////////////////////////////////////////////////












//������ ���α׷�
//������� ��� ���ǳ�, ��� ������

//��ܿ� Window -> Show View -> other.. -> Debug -> Debug
//������ Debug â�� ������� ���� �����ų �� �ְ� ����� ��Ʈ



/*
// ��Ƽ ������ ����2
// ���� ���� ������ ����
// *************�߿�**************
public class ThreadEx {

	public static void main(String[] args) {
		Thread t = new Thread() {		// run�̶�� �Լ��� ���������� start�Լ��� �� �� �� ����
			public void run() {			// run �Լ� ����
				System.out.println(1);
			}
		};
		t.start();		// �� run�Լ��� �۵���Ű�� ����, �Լ��� �� �ϴ°� �ƴ�
		
		//////////////////////////////////////////////////////
		
		// �͸�ü�� ����Ͽ� �ڵ� ����
		// �� �ڵ�� �Ʒ� �ڵ�� ��������
		new Thread() {		
			public void run() {			
				System.out.println(1);
			}
		}.start();	
		
		
	}
}
/*










/*
//��Ƽ ������ ����1
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
		t.start();		//Thread Ŭ�������� start�Լ��� �־ ��� ����
		Scanner sc = new Scanner(System.in);	// Ű����κ��� �Է¹��� �� �ִ� ��ü ����
		//////
		sc.nextInt();	//���ŷ �Լ� : Ư������ �Է� �ޱ� ������ ����x
		System.out.println("main end");

	}

}
*/







/*
//������ ���� 1
//�⺻ ����1�� ���� ������ �ڵ���
//���μ����� 2���� ��Ȳ
class Tiger extends Thread{		// <- Thread�� ǥ�� Ŭ������
	public void run() {		// 2
		System.out.println(2);
		// �ݺ���
		for (int i = 0; i < 10; i++) {
			System.out.println("ȣ����"+i);
			try {Thread.sleep(0);} catch (Exception e) {}	// ��� ���߰� �ϴ� �ڵ�, 0�� ������ ���� ª�� �ð����� ����� ��
		}
		System.out.println("����");
	}	// for���� �� ������ ������ �����尡 �Ҹ��
}


public class ThreadEx {

	public static void main(String[] args) {
		Thread t = new Tiger();
		// ���� start()�Լ��� ������ ThreadŬ������ start()�Լ��� �־ start�Լ��� ȣ�� ����
		t.start();		// 1
		System.out.println(1);
		// �ݸ�
		for (int i = 0; i < 10; i++) {
			System.out.println("�ڳ���"+i);
			try {Thread.sleep(0);} catch (Exception e) {}	// ��� ���߰� �ϴ� �ڵ�, 0�� ������ ���� ª�� �ð����� ����� ��
		}
		System.out.println("main Exit");
	}
}
*/







/*
//������� ������ �⺻ ����1
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
		System.out.println("������ ����");
		System.out.println("B run call");
		System.out.println("������ ����");
	}
}

public class ThreadEx {

	public static void main(String[] args) {
		A a = new B();		// ��ĳ������ ������ �ڽĸ��� ȣ��
		a.Start();
		
		
	}
}
*/
























