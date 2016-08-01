/* annotation ��Ÿ ���� ���캸�� !! */

package annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.METHOD)
//@Target({ElementType.METHOD, ElementType.TYPE})  2�� �̻��� ������̼� �����

@Retention(RetentionPolicy.RUNTIME)
public @interface UserAnnotation {
	public int number();		
	/*�̷��� �޼ҵ�ó�� ������̼� �ȿ� �����س�����, 
	�� ������̼��� ����� �� �ش��׸� ���� Ÿ������ ���� ������ �־�߸��Ѵ�.*/
	
	public String text() default "This is first annotation";
	/* default��� ���� ����� ��쿡, default �ڿ� �ִ� ���� �� ������̼���
	����� �� ������ ���� ���������� ���� ���� ���� �ȴ�. */
}



/* ���� */
//Annotation�� ����� �Ұ��ϴ�!

//target�� �ش� ������̼� ��� ����� �����Ѵ�.
//Retention�� ������̼� ���� ������ �����ϴ� �� ����Ѵ�.
/*
 * Ŭ������ �������̽��� ������ ��ó�� @interface�� �����ϸ�
 * @UuserAannotation���� ��밡���� ������̼��� �ϳ� ���������.
 */