package org.helloworldmvc.model;

import org.helloworldmvc.Contract.IModel;

public class DAOHelloWorld {
	
	private static String FileName = "HelloWorld.txt";
	private static DAOHelloWorld instance = null;
	private String helloWorldMessage = null;

	public DAOHelloWorld() {
		// TODO Auto-generated constructor stub
	}

	public static DAOHelloWorld getInstance() {
		return instance;
	}

	private static void setInstance(DAOHelloWorld instance) {
		DAOHelloWorld.instance = instance;
	}
	
	private void readFile() {
		
	}

	public String getHelloWorldMessage() {
		return helloWorldMessage;
	}

	public void setHelloWorldMessage(String helloWorldMessage) {
		this.helloWorldMessage = helloWorldMessage;
	}
	
	
	
}
