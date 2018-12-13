package org.mallick.coderefactoring;

import java.util.Scanner;

import org.mallick.coderefactoring.factory.NotifiFactory;
import org.mallick.coderefactoring.model.Notifi;

public final class NotifyFactoryTest {
	private static final String PACKAGE_NAME = "org.mallick.coderefactoring.model";

	public static void main(String[] args) {
		NotifiFactory notifiFactory = new NotifiFactory();
		
		Scanner sc = new Scanner(System.in);
		
		String condition = "y";
		String condition12 = "N";
		
		while(condition.equals("y")) {
			System.out.println("Please enter a class name:");
			
			String classNmae = PACKAGE_NAME.concat(".").concat(sc.nextLine());
			
			Notifi notifi = notifiFactory.getObjectOfNotifi(classNmae);
			
			if(notifi == null) {
				System.out.println("Class not found");
			}
			else {
				notifi.printMessage();
			}
			
			System.out.println("Do yo want to continue(y/n)?");
			
			condition = sc.nextLine();
			
			if(!"y".equals(condition)) {
				sc.close();
			}
		}
		
		System.out.println("Exit!");
		
		
	}

}
