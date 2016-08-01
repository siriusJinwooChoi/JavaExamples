package impl;

//import reference.MemberDTO;
import inheritance.MemberDTO;

public interface MemberManagerInterface {
	public boolean addMember(MemberDTO member);
	public boolean removeMmeber(String name, String phone);
	public boolean updateMember(MemberDTO member);
}
