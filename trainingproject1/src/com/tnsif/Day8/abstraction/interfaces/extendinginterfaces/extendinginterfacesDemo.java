package com.tnsif.Day8.abstraction.interfaces.extendinginterfaces;

public class extendinginterfacesDemo implements ChildInterface {
	// Override ChildInterface method
	public void print() { 
		System.out.println("print method");
	}

	// Override InterfaceOne method
	public void show() {
		System.out.println("show Method");
	}
}