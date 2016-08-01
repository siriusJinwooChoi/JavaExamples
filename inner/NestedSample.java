package inner;

public class NestedSample {
	public static void main(String[] args) {
		NestedSample sample = new NestedSample();
		//sample.makeStaticNestedObject();
		//sample.makeInnerObject();
		sample.setButtonListener();
	}
	
	public void makeStaticNestedObject() {
		OuterOfStatic.StaticNested staticNested = new OuterOfStatic.StaticNested();
		staticNested.setValue(3);
		System.out.println(staticNested.getValue());
	}
	
	//////////////////////////////////////////////////
	public void makeInnerObject() {
		OuterOfInner outer = new OuterOfInner();
		OuterOfInner.Inner inner = outer.new Inner();
		inner.setValue(3);
		System.out.println(inner.getValue());
	}
	
	//////////////////////////////////////////////////
	
	public void setButtonListener() {
		MagicButton button = new MagicButton();
		
		/* method 1! */
		//MagicButtonListener listener = new MagicButtonListener();
		//button.setListener(listener);
		//button.onClickProcess();
		
		/* method 2! */
		/*
		button.setListener(new EventListener() {
		public void onClick() {
			System.out.println("Magic Button Clicked!!!");
		}
		});
		button.onClickProcess();
		*/
		
		/* method 3! */
		EventListener listener = new EventListener() {
			public void onClick() {
				System.out.println("Magic Button Clicked!!!");
			}
		};
		button.setListener(listener);
		button.onClickProcess();
	}
	
	//////////////////////////////////////////////////
	
	class MagicButtonListener implements EventListener {
		public void onClick() {
			System.out.println("Magic Button Clicked!!!");
		}
	}
}
