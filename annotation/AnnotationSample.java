package annotation;

public class AnnotationSample {
	
	@SuppressWarnings("deprecation")
	public void useDeprecated() {
		AnnotationChild child = new AnnotationChild();
		child.noMoreUse();
	}
}