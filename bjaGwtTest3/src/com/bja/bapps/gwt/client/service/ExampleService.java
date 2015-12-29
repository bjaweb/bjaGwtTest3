package com.bja.bapps.gwt.client.service;

import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;


// shortcut name for the servlet
@RemoteServiceRelativePath("exampleservice")
public interface ExampleService extends RemoteService{

	String sayHello(String name);	
	
	int addTwoNumber(int num1, int num2);
}
