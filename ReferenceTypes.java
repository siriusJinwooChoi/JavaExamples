
public class ReferenceTypes {
	public ReferenceTypes() {
		
	}
	
	public ReferenceTypes(String data) {
		
	}
	
	public void makeMemberObject() {
		MemberDTO dto1 = new MemberDTO();
		MemberDTO dto2 = new MemberDTO("Sangmin");
		MemberDTO dto3 = new MemberDTO("Sangmin", "010XXXXYYYY");
		MemberDTO dto4 = new MemberDTO("Sangmin", "010XXXXYYYY", "indra4812@gmail.com");
	}
//*****************************************************************	
	public void print(int data) {
		
	}
	
	public void print(String data) {
		
	}
	
	public void print(int data, String stringdata) {
		
	}
	
	public void print(String stringdata, int data) {
	
	}
//*****************************************************************	
	public int intReturn() {
		int returnInt = 0;
		return returnInt;
	}
	
	public int[] intArrayReturn() {
		int returnArray[] = new int[10];
		return returnArray;
	}
	
	public String stringReturn() {
		String returnString="Return value";
		return returnString;
	}
	
	public static void staticMethod() {
		System.out.println("This is a static method.");
		//System.out.println(MemberDTO.name);
	}
	
	public void checkMemberDTOName() {
		MemberDTO dto1 = new MemberDTO("Sangmin");
		System.out.println(dto1.name);
		MemberDTO dto2 = new MemberDTO("Sungchoon");
		System.out.println(dto1.name);
	}
//*****************************************************************	
	public void makeStaticBlockObject() {
		System.out.println("data="+StaticBlock.getData());
		System.out.println("Creating block1");
		StaticBlock block1 = new StaticBlock();
		System.out.println("Creating block1");
		System.out.println("Creating block2");
		StaticBlock block2 = new StaticBlock();
		System.out.println("Creating block2");
		System.out.println("data="+StaticBlock.getData());
	}
//*****************************************************************	
	public void callPassByValue() {
		int a=10;
		String b = "b";
		MemberDTO member = new MemberDTO("Sangmin");
		passByValue(a, b, member);
		System.out.println("callPassByValue method result !!!");
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		System.out.println("member.name = " + member.name);
	}
	
	public void passByValue(int a, String b, MemberDTO member) {
		a=20;
		b="z";
		//member = new MemberDTO("SungChoon");
		member.name = "Sungchoon";
		System.out.println("passByValue method result !!! ");
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		System.out.println("member.name = " + member.name);
	}
//*****************************************************************

	public static void main(String[] args) {
		ReferenceTypes reference = new ReferenceTypes();
		//reference.checkMemberDTOName();
		//reference.makeStaticBlockObject();
		reference.callPassByValue();
	}
}