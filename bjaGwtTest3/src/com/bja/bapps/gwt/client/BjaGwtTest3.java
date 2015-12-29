package com.bja.bapps.gwt.client;

import com.bja.bapps.gwt.client.gui.MainGUI;
import com.bja.bapps.gwt.client.service.ExampleServiceClientImpl;
import com.bja.bapps.gwt.server.ExempleServiceImpl;
import com.bja.bapps.gwt.shared.FieldVerifier;
import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.event.dom.client.KeyCodes;
import com.google.gwt.event.dom.client.KeyUpEvent;
import com.google.gwt.event.dom.client.KeyUpHandler;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.DialogBox;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.VerticalPanel;

/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class BjaGwtTest3 implements EntryPoint {
	
	/**
	 * This is the entry point method.
	 */
	public void onModuleLoad() {
		
//		ExampleServiceClientImpl
		
		String info = GWT.getModuleBaseURL();
		
		//ExampleServiceClientImpl clientImpl = new ExampleServiceClientImpl(GWT.getModuleBaseURL()+"exampleservice");
//		ExampleServiceClientImpl clientImpl = new ExampleServiceClientImpl();
		MainGUI mainGUI =  new MainGUI();
//		clientImpl.
		
		System.out.println(" info "+info);
		
//		RootPanel.get().add(clientImpl.getMainGUI());
		RootPanel.get().add(mainGUI);
	}
	
}

