package com.technoelevate.java.abstraction;

public class FactoryClass {
	Browser browser=null;
	
	public Browser getBrowser(String name) {
		if(name.equalsIgnoreCase("Chrome")) {
			browser = new Chrome();
		}else if(name.equalsIgnoreCase("Mozilla")) {
			browser = new Mozilla();
		}else if(name.equalsIgnoreCase("Opera")) {
			browser = new Opera();
		}else if(name.equalsIgnoreCase("Safari")) {
			browser = new Safari();
		}
		return browser;
	
	}
}
