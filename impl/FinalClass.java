package impl;
import inheritance.MemberDTO;

public final class FinalClass {
	final MemberDTO dto = new MemberDTO();
	public static void main(String[] args) {
		FinalClass cls = new FinalClass();
		cls.checkDTO();
	}
	public void checkDTO() {
		System.out.println(dto);
		//dto = new MemberDTO(); -> error
		dto.name="Sangmin";
		System.out.println(dto);
	}
}
