package com.spear.VaadinPi.gpio;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import com.pi4j.io.gpio.GpioController;
import com.pi4j.io.gpio.GpioFactory;
import com.pi4j.io.gpio.GpioPinDigitalOutput;
import com.pi4j.io.gpio.PinState;
import com.pi4j.io.gpio.RaspiPin;


public enum GPIO {
	INSTANCE;
	
	private GpioController gpioController = GpioFactory.getInstance();
	private GpioPinDigitalOutput pin = 
			gpioController.provisionDigitalOutputPin(RaspiPin.GPIO_00, "MyLED", PinState.LOW);	
	private List<PinStateListener> listeners = new CopyOnWriteArrayList<GPIO.PinStateListener>();
	
	public String toggle (){
		pin.toggle();
		for (PinStateListener listener : listeners) {
			listener.handleStateChange(pin.getState().getName());
		}
		return pin.getState().getName();
	}	
	
	public String getState () {
		return this.pin.getState().getName();
	}
	
	public void register (PinStateListener listener) {
		listeners.add(listener);	
	}
	
	public void unregister (PinStateListener listener) {
		listeners.remove(listener);
	}
	
	public interface PinStateListener {
		public void handleStateChange(String state);
	}
	
}
