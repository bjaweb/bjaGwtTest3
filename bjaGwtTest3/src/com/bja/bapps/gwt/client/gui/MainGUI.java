package com.bja.bapps.gwt.client.gui;

import com.bja.bapps.gwt.client.service.ExampleServiceClientImpl;
import com.bja.bapps.gwt.client.service.OperatorService;
import com.bja.bapps.gwt.client.service.OperatorServiceAsync;
import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.VerticalPanel;

public class MainGUI extends Composite {
	
	private VerticalPanel vPanel = new VerticalPanel();
	
	private TextBox txt1 ;
	
	private TextBox operande1;
	private TextBox operande2;
	private Label resultatOperation;
	
	private Label resultLbl;
	private ExampleServiceClientImpl serviceClientImpl;
	
	public MainGUI(/*ExampleServiceClientImpl serviceClientImpl*/){
		
		initWidget(vPanel);
		txt1 = new TextBox();
		
		vPanel.add(txt1);
		
		Button btn1 = new Button("say Hello");
		btn1.addClickHandler(new Btn1ClickHandler());
		vPanel.add(btn1);
		
		resultLbl = new Label("resultat ici");
		vPanel.add(resultLbl);
		
		
		operande1 = new TextBox();
		operande2 = new TextBox();
		resultatOperation = new Label("resultat operation");
		
		vPanel.add(operande1);
		
		vPanel.add(operande2);
		
		HorizontalPanel hPanel = new HorizontalPanel();
		Button additionButton = new Button("addition");
		additionButton.addClickHandler(new AddClickHandler());
		additionButton.setStyleName("btn");
		
		Button multiplieButton = new Button("multiplier");
		multiplieButton.addClickHandler(new MultipleClickHandler());
		multiplieButton.setStyleName("btn");
		
		hPanel.add(additionButton);hPanel.add(multiplieButton);
		vPanel.add(hPanel);
		
		vPanel.add(resultatOperation);
		
//		this.serviceClientImpl = serviceClientImpl;
		serviceClientImpl = new ExampleServiceClientImpl(this);
		
	}

	public void updateLabel(String greeting){
		this.resultLbl.setText(greeting);
	}
	
	private class Btn1ClickHandler implements ClickHandler{

		@Override
		public void onClick(ClickEvent event) {
			// TODO Auto-generated method stub
			serviceClientImpl.sayHello(txt1.getText());
		}
		
		
	}
	
	
	
	private class AddClickHandler implements ClickHandler{

		@Override
		public void onClick(ClickEvent event) {
			
			final OperatorServiceAsync getService = GWT.create(OperatorService.class);
			   getService.additionner(operande1.getText(), operande2.getText(), new OperatorDefauftCallback()); 						
		}
		
		
	}

	
	private class MultipleClickHandler implements ClickHandler{

		@Override
		public void onClick(ClickEvent event) {
			final OperatorServiceAsync getService = GWT.create(OperatorService.class);
			   getService.multiplier(operande1.getText(), operande2.getText(), new OperatorDefauftCallback()); 
						
		}
		
		
	}
	
	private class OperatorDefauftCallback implements AsyncCallback<String>{

		@Override
		public void onFailure(Throwable caught) {
			System.out.println("error occured "+caught);
			
		}

		@Override
		public void onSuccess(String result) {
			resultatOperation.setText(result);
			
		}
		
		
	}

}
