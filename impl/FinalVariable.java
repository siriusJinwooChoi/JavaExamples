package impl;

public class FinalVariable {
	final int instanceVariable=1;
	//변수에 final선언시, 초기화를 해주어야한다.
	//그리고 이렇게 초기화된 변수는 다른곳에서 다른값으로 바꿔줄 수 없다.
	
	public void method(final int parameter) {
		final int localVariable;
	}
}
