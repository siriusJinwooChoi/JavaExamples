package impl;

import inheritance.MemberDTO;

public abstract class MemberManagerAbstract {
	public abstract boolean addMember(MemberDTO member);
	public abstract boolean removeMmeber(String name, String phone);
	public abstract boolean updateMember(MemberDTO member);
	
	/*public void printLog(String data) {
		System.out.println("Data="+data);
	} */
	
	//Ŭ������ �޼ҵ忡 final�� ����ϸ� ���̻� ����� ���ް� �ϰ�, ���̻� Override�Ҽ� ���� �ϴ°��̴�. 
	public final void printLog(String data) {
		System.out.println("Data="+data);
	}
}
