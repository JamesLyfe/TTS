
public class MainClass {
	public static void main(String[] args) {
			System.out.println("Hello from MainClass");
			
			MainFrame myFrame = new MainFrame();
			myFrame.init();
			
	}
	private String name;
	private int age;
	public MainClass(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
}
