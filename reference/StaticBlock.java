package reference;

public class StaticBlock {
	static int data=1;
	public StaticBlock() {
		System.out.println("StaticBlock Constructor.");
	}
	
	//static 은  딱 1번만 수행되고 끝이난다.
	static {
		System.out.println("******First static block. ******");
		data = 3;
	}
	
	static {
		System.out.println("******Second static block. ******");
		data = 5;
	}
	
	public static int getData() {
		return data;
	}
}
