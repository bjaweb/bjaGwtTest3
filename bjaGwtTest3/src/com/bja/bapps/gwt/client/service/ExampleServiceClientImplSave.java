//package com.bja.bapps.gwt.client.service;
//
//import com.bja.bapps.gwt.client.gui.MainGUI;
//import com.google.gwt.core.client.GWT;
//import com.google.gwt.user.client.rpc.AsyncCallback;
//import com.google.gwt.user.client.rpc.ServiceDefTarget;
//
//
//public class ExampleServiceClientImplSave implements ExampleServiceInt  {
//
//	private ExampleServiceAsync service;
//	
//	private MainGUI mainGUI;
//	
//	public ExampleServiceClientImplSave(String url) {
//		this.service = GWT.create(ExampleService.class);
//		
//		
//		//ServiceDefTarget endPoint = (ServiceDefTarget) this.service;
//		
//		//endPoint.setServiceEntryPoint(url);
//		
//		this.mainGUI = new MainGUI(this);
//	}
//
//	/* (non-Javadoc)
//	 * @see com.bja.bapps.gwt.client.service.ExampleServiceInt#sayHello(java.lang.String)
//	 */
//	@Override
//	public void sayHello(String name){
//		
//		service.sayHello(name, new DefauftCallback());
//	}
//
//	
//	public MainGUI getMainGUI(){
//		return this.mainGUI;
//	}
//	
//	/* (non-Javadoc)
//	 * @see com.bja.bapps.gwt.client.service.ExampleServiceInt#addTwoNumber(int, int)
//	 */
//	@Override
//	public void addTwoNumber(int num1, int num2){
//		service.addTwoNumber(num1, num2, new DefauftCallback());
//	}
//	
//	private class DefauftCallback implements AsyncCallback{
//
//		@Override
//		public void onFailure(Throwable caught) {
//			System.out.println("error occured "+caught);
//			
//		}
//
//		@Override
//		public void onSuccess(Object result) {
//			System.out.println("response receive");
//			if(result instanceof String) mainGUI.updateLabel((String) result);
//			
//		}
//		
//		
//	}
//	
//	
//
//}
