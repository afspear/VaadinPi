package com.spear.VaadinPi.ui;

import java.io.IOException;
import java.text.ParseException;

import javax.servlet.annotation.WebServlet;

import com.vaadin.annotations.Push;
import com.vaadin.annotations.Theme;
import com.vaadin.annotations.VaadinServletConfiguration;
import com.vaadin.annotations.Widgetset;
import com.vaadin.server.VaadinRequest;
import com.vaadin.server.VaadinServlet;
import com.vaadin.ui.Button;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.Label;
import com.vaadin.ui.Panel;
import com.vaadin.ui.UI;
import com.vaadin.ui.VerticalLayout;
import com.spear.VaadinPi.gpio.GPIO;
import com.spear.VaadinPi.gpio.GPIO.PinStateListener;
import com.spear.VaadinPi.gpio.GPIOInfo;


/**
 *
 */
@Push
@Theme("mytheme")
@Widgetset("com.spear.VaadinPi.MyAppWidgetset")
public class MyUI extends UI implements PinStateListener {
	
	private final Label lightState = new Label();
	final GPIO gpio = GPIO.INSTANCE;

	@Override
	protected void init(VaadinRequest vaadinRequest) {
		
		
		final Button button = new Button("Toggle");
		
		lightState.setValue(gpio.getState());

		final VerticalLayout layout = new VerticalLayout();
		layout.setMargin(true);
		setContent(layout);

		button.addClickListener(new Button.ClickListener() {
			@Override
			public void buttonClick(ClickEvent event) {
				gpio.toggle();				
			}
		});
		layout.addComponent(this.lightState);
		layout.addComponent(button);
		try {
			layout.addComponent(new Panel(new GPIOInfo()));
		} catch (Exception e) {
			layout.addComponent(new Label("GPIO System info failed with " + e.toString()));	
			e.printStackTrace();
		}
		gpio.register(this);
	}
	
	@Override
	public void detach() {
		// TODO Auto-generated method stub
		super.detach();
		gpio.unregister(this);
	}

	@WebServlet(urlPatterns = "/*", name = "MyUIServlet", asyncSupported = true)
	@VaadinServletConfiguration(ui = MyUI.class, productionMode = false)
	public static class MyUIServlet extends VaadinServlet {
		

	}

	@Override
	public void handleStateChange(final String state) {
		this.access(new Runnable() {		
			@Override
			public void run() {
				MyUI.this.lightState.setValue(state);
				
			}
		});
		
	}
}
