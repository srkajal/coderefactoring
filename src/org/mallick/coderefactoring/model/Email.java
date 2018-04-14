package org.mallick.coderefactoring.model;

public class Email extends Notifi {

	public Email() {}

	@Override
	public void printMessage() {
		System.out.println("Message from "+ this.getClass().getSimpleName());
	}
	
	
}
