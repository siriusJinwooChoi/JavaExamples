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
		//sub.privateMethod(); -> private method�� �ٸ� Ŭ�������� ������ �� ����.
	}
}



/*		
 		(����������)

	public : ������ ���� �����ϴ�.
	protected : ���� ��Ű�� ���� �ְų� ��ӹ��� ��쿡�� ���� �����ϴ�.
	package-private : �ƹ��� ���� �����ڸ� �������� ���� ���̸�,
					package-private��� �Ҹ���. ���� ��Ű�� ���� �������� ���� �����ϴ�.
	private : �ش� Ŭ���� �������� ���� �����ϴ�.

*/


/* (�����ڵ�)

	���������� : public, protected, private
	���� �ʿ� ������ : abstract
	�ϳ��� �ν��Ͻ��� ����ϴ� ������ : static
	�� ���� ���� ������ : final
	strict �Ҽ� �� ������ : strictfp
	������̼� : annotation
	���� ���� ������ : synchronized
	�ٸ� ���� ������ ���� ����ϴ� ������ : native
	������� ���� ����� �˸��� ������ : transient, volatile

*/






// �ڹٸ� �����ϴ� Ŭ����, �������̽�, abstractŬ����, enumŬ����, ������̼� ���� Ŭ����



/* 	(�������̽�)
	1. � �޼ҵ尡 �����ؾ� �ϴ����� ���� ���� �Ǿ��ִ�.
	2. ����� �����Ǿ� �ִ� �޼ҵ尡 �־�� �ȵȴ�.
	3. �������̽��� �����ϴ� Ŭ���������� implements�� ����Ͽ� �����Ѵ�.
*/



/*	(abstractŬ����)
	1. �����Ǿ� �ִ� �޼ҵ尡 �־ ��� ����.
	2. abstract�� ����� �޼ҵ尡 1�� �̻��� ��쿡�� �ݵ�� abstract Ŭ������ �����ؾ� �Ѵ�.
	3. abstract�� ����� �޼ҵ�� ����� �����Ǿ��־�� �ȵȴ�.
	4. abstractŬ������ Ȯ���ϴ� Ŭ���������� extends�� ����Ͽ� �����Ѵ�.
*/



/* (Ŭ����)
	: �������̽��� abstractŬ������ �ٸ��� ��� �޼ҵ尡 �����Ǿ��־�� �Ѵ�.
*/