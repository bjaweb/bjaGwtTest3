package com.bja.bapps.gwt.client;

import com.bja.bapps.gwt.client.service.OperatorService;
import com.bja.bapps.gwt.client.service.OperatorServiceAsync;
import com.google.gwt.core.client.GWT;
import com.google.gwt.junit.client.GWTTestCase;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.rpc.ServiceDefTarget;

public class CalculatorTest extends GWTTestCase{

	// où se trouve le fichier xml de conf gwt test
	public String getModuleName() {
		return "com.bja.bapps.gwt.BjaGwtTest3JUnit";
	}

	
	 /**
	   * This test will send a request to the server using the greetServer method in
	   * GreetingService and verify the response.
	   */
	  public void testGreetingService() {
	    // Create the service that we will test.
	    OperatorServiceAsync operatorService = GWT.create(OperatorService.class);
	    ServiceDefTarget target = (ServiceDefTarget) operatorService;
	    target.setServiceEntryPoint(GWT.getModuleBaseURL() + "bjagwttest3/operator");

	    // Since RPC calls are asynchronous, we will need to wait for a response
	    // after this test method returns. This line tells the test runner to wait
	    // up to 10 seconds before timing out.
//	    delayTestFinish(10000);

	    // Send a request to the server.
	    operatorService.multiplier("2","5", new AsyncCallback<String>() {
	      public void onFailure(Throwable caught) {
	        // The request resulted in an unexpected error.
	        fail("Request failure: " + caught.getMessage());
	      }

	      public void onSuccess(String result) {
	        // Verify that the response is correct.
	    	System.out.println("resultat obtenu "+result);  
//	        assertTrue(result.startsWith("Hello, GWT User!"));
	    	assertTrue(result != null);
	        // Now that we have received a response, we need to tell the test runner
	        // that the test is complete. You must call finishTest() after an
	        // asynchronous test finishes successfully, or the test will time out.
	        finishTest();
	      }
	    });
	  }
	
	
}
