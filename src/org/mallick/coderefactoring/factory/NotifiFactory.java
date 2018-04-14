package org.mallick.coderefactoring.factory;

import org.mallick.coderefactoring.model.Notifi;

public class NotifiFactory {
	public Notifi getObjectOfNotifi(String className) {
		try {
			
			return (Notifi)Class.forName(className).newInstance();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
	}

}
