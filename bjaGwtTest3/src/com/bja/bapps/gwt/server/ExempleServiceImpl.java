package com.bja.bapps.gwt.server;

import com.bja.bapps.gwt.client.service.ExampleService;
import com.google.gwt.user.server.rpc.RemoteServiceServlet;

public class ExempleServiceImpl extends RemoteServiceServlet implements ExampleService{

	@Override
	public String sayHello(String name) {
		
		return "Hello "+name;
	}

	@Override
	public int addTwoNumber(int num1, int num2) {
		
		return num1+num2;
	}
	
	

}
