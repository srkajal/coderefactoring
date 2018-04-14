package org.mallick.coderefactoring.model;

public class Sid extends Notifi{

	public Sid() {}
	
	@Override
	public void printMessage() {
		System.out.println("Message from "+ this.getClass().getSimpleName());
	}

}
