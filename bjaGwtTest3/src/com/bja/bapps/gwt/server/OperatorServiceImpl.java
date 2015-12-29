package com.bja.bapps.gwt.server;

import com.bja.bapps.gwt.client.service.OperatorService;
import com.google.gwt.user.server.rpc.RemoteServiceServlet;

public class OperatorServiceImpl extends RemoteServiceServlet implements
		OperatorService {

	@Override
	public String additionner(String input1, String input2) {
		
		float val1 = Float.valueOf(input1).floatValue();
		  float val2 = Float.valueOf(input2).floatValue();
		  float res = val1 + val2;
		  return  String.valueOf(res);
	}

	@Override
	public String multiplier(String input1, String input2) {
		float val1 = Float.valueOf(input1).floatValue();
		  float val2 = Float.valueOf(input2).floatValue();
		  float res = val1 * val2;
		  try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {				
			e.printStackTrace();
			Thread.currentThread().interrupt();
		}
		  return  String.valueOf(res+" ok");
	}

}
