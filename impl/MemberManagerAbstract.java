package impl;

import inheritance.MemberDTO;

public abstract class MemberManagerAbstract {
	public abstract boolean addMember(MemberDTO member);
	public abstract boolean removeMmeber(String name, String phone);
	public abstract boolean updateMember(MemberDTO member);
	
	/*public void printLog(String data) {
		System.out.println("Data="+data);
	} */
	
	//클래스나 메소드에 final을 사용하면 더이상 상속을 못받게 하고, 더이상 Override할수 없게 하는것이다. 
	public final void printLog(String data) {
		System.out.println("Data="+data);
	}
}
