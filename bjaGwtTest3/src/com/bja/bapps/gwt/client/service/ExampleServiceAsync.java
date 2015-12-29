package com.bja.bapps.gwt.client.service;

import com.google.gwt.user.client.rpc.AsyncCallback;

public interface ExampleServiceAsync {
	void sayHello(String name, AsyncCallback callback);	
	
	void addTwoNumber(int num1, int num2, AsyncCallback callback);
}
