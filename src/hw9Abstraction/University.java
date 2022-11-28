package hw9Abstraction;
public interface University extends Collage,Hospital {

	// Interface cannot have constructor
	public void classSize();

	public abstract void playground();

	public abstract void teacher();
	public default void gymnasium() {
		
	}
	public static void library () {
		
		
	}
	
	
}

// interface inside cannot create constructor
// only you can declare by static final
