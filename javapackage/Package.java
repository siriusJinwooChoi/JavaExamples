package javapackage;

//import static javapackage.Sub.subClassStaticMethod;
//import static javapackage.Sub.CLASS_NAME;
import static javapackage.Sub.*;

public class Package {
	public static void main(String[] args) {
		//Sub sub = new Sub();
		//sub.subClassMethod();
		//subClassStaticMethod();
		
		Sub sub=new Sub();
		sub.publicMethod();
		sub.protectedMethod();
		sub.packagePrivateMethod();
		//sub.privateMethod(); -> private method는 다른 클래스에서 참조할 수 없다.
	}
}



/*		
 		(접근제어자)

	public : 누구나 접근 가능하다.
	protected : 같은 패키지 내에 있거나 상속받은 경우에만 접근 가능하다.
	package-private : 아무런 접근 제어자를 적어주지 않을 때이며,
					package-private라고도 불린다. 같은 패키지 내에 있을때만 접근 가능하다.
	private : 해당 클래스 내에서만 접근 가능하다.

*/


/* (제어자들)

	접근제어자 : public, protected, private
	구현 필요 제어자 : abstract
	하나의 인스턴스만 허용하는 제어자 : static
	값 수정 제한 제어자 : final
	strict 소수 값 제어자 : strictfp
	어노테이션 : annotation
	동시 접근 제어자 : synchronized
	다른 언어로 구현된 것을 명시하는 제어자 : native
	실행시의 동작 방법을 알리는 제어자 : transient, volatile

*/






// 자바를 구성하는 클래스, 인터페이스, abstract클래스, enum클래스, 어노테이션 선언 클래스



/* 	(인터페이스)
	1. 어떤 메소드가 존재해야 하는지에 대한 선언만 되어있다.
	2. 절대로 구현되어 있는 메소드가 있어서는 안된다.
	3. 인터페이스를 구현하는 클래스에서는 implements를 사용하여 선언한다.
*/



/*	(abstract클래스)
	1. 구현되어 있는 메소드가 있어도 상관 없다.
	2. abstract로 선언된 메소드가 1개 이상일 경우에는 반드시 abstract 클래스로 선언해야 한다.
	3. abstract로 선언된 메소드는 절대로 구현되어있어서는 안된다.
	4. abstract클래스를 확장하는 클래스에서는 extends를 사용하여 선언한다.
*/



/* (클래스)
	: 인터페이스나 abstract클래스와 다르게 모든 메소드가 구현되어있어야 한다.
*/