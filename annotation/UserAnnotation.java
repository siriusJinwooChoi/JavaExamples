/* annotation 기타 종류 살펴보기 !! */

package annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.METHOD)
//@Target({ElementType.METHOD, ElementType.TYPE})  2개 이상의 어노테이션 선언시

@Retention(RetentionPolicy.RUNTIME)
public @interface UserAnnotation {
	public int number();		
	/*이렇게 메소드처럼 어노테이션 안에 선언해놓으면, 
	이 어노테이션을 사용할 때 해당항목에 대한 타입으로 값을 지정해 주어야만한다.*/
	
	public String text() default "This is first annotation";
	/* default라는 예약어를 사용할 경우에, default 뒤에 있는 값이 이 어노테이션을
	사용할 때 별도로 값을 지정해주지 않을 때의 값이 된다. */
}



/* 설명 */
//Annotation은 상속이 불가하다!

//target은 해당 어노테이션 사용 대상을 지정한다.
//Retention은 어노테이션 유지 정보를 지정하는 데 사용한다.
/*
 * 클래스나 인터페이스를 선언할 때처럼 @interface로 선언하면
 * @UuserAannotation으로 사용가능한 어노테이션이 하나 만들어진다.
 */