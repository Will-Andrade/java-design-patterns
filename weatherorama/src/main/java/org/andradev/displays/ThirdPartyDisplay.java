package org.andradev.displays;

import org.andradev.DisplayElement;
import org.andradev.Observer;

// If I ever want to implement my own display...
public class ThirdPartyDisplay implements Observer, DisplayElement {
	
	@Override
	public void display() {}
	
	@Override
	public void update() {}
}
