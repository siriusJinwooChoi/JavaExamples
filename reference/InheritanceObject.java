package reference;

public class InheritanceObject {
	public static void main(String[] args) {
		InheritanceObject obj = new InheritanceObject();
		//obj.toStringMethod(obj);
		obj.toStringMethod2(obj);		
	}
	
	public String toString() {
		return "InheritanceObject class";
	}
	
	public void toStringMethod(InheritanceObject obj) {
		System.out.println(obj);
		System.out.println(obj.toString());
		System.out.println("Plus" + obj);
	}
	
	public void toStringMethod2(InheritanceObject obj) {
		System.out.println(this);
		System.out.println(toString());
		System.out.println("Plus" + this);
	}
	
	public void equalMethod() {
		MemberDTO obj1 = new MemberDTO("Sangmin");
		MemberDTO obj2 = new MemberDTO("Sangmin");
		if(obj1 == obj2) {
			System.out.println("obj1 and obj2 is same");
		}
		else {
			System.out.println("obj1 and obj2 is different");
		}
	}
}