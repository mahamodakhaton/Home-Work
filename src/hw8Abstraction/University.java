package hw8Abstraction;

import hw9Abstraction.college;

public interface University extends college,Hospital {

	public void classSize();

	public void playground();

	public void teacher();
}

// interface inside cannot create constructor
// only you can declare by static final
