package org.mallick.coderefactoring.model;

public class Eci extends Notifi {

	public Eci() {}
	
	@Override
	public void printMessage() {
		System.out.println("Message from "+ this.getClass().getSimpleName());
	}

}
