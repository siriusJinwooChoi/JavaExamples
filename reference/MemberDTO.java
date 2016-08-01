package reference;

public class MemberDTO {
	public String name;
	public String phone;
	public String email;
	
	//아무 정보도 모를 때
	public MemberDTO() {
		
	}
	
	//이름만 알 때
	public MemberDTO(String name) {
		this.name = name;
	}
	
	//이름과 폰번을 알 때
	public MemberDTO(String name, String phone) {
		this.name = name;
		this.phone = phone;
	}
	
	//모든 정보를 알 때
	public MemberDTO(String name, String phone, String email) {
		this.name = name;
		this.phone = phone;
		this.email = email;
	}
////////////////////////////////////////////////////////////
	
	public static void main(String[] args) {
		MemberDTO dto = new MemberDTO("Sangmin//", "010XXXXYYYY//", "indra4812@gmail.com");
		//System.out.println(dto);
		dto.equalMethod();
	}
	
////////////////////////////////////////////////////////////	
	//Overriding	
	public String toString() {
		return "Name = " + name + "Phone = " + phone + "Email = " + email;
	}
	
	public void equalMethod() {
		MemberDTO obj1 = new MemberDTO("Sangmin");
		MemberDTO obj2 = new MemberDTO("Sangmin");
		
		/*
		if(obj1 == obj2) {
			System.out.println("obj1 and obj2 is same");
		}
		else {
			System.out.println("obj1 and obj2 is different");
		}
		*/
		if(obj1.equals(obj2)) {
			System.out.println("obj1 and obj2 is same");
		}
		else {
			System.out.println("obj1 and obj2 is different");
		}
	}
	
	//equals에 대한 Overriding
	public boolean equals(Object obj) {
		if(this == obj) return true;	//주소가 같으므로 당연히 true
		if(obj == null) return false;	//obj가 null 이므로 당연히 false
		if(getClass() != obj.getClass()) return false;	//클래스의 종류가 다르므로 false
		
		MemberDTO other = (MemberDTO) obj;		//같은 클래스이므로 형 변환 실행
		
		if(name == null) {
			if(other.name != null) return false;
		} else if(!name.equals(other.name)) return false;
		
		if(email == null) {
			if(other.email != null) return false;
		} else if(!email.equals(other.email)) return false;
		
		if(phone == null) {
			if(other.phone != null) return false;
		} else if(!phone.equals(other.phone)) return false;
		
		return true;
	}
	
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((phone == null) ? 0 : phone.hashCode());
		return result;
	}
}