package com.bja.bapps.gwt.client.service;

import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;

@RemoteServiceRelativePath("operator")
public interface OperatorService extends RemoteService{

	String additionner(String input1, String input2);
	String multiplier(String input1, String input2);
}
