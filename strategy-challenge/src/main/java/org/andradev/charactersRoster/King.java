package org.andradev.charactersRoster;

import org.andradev.behaviors.BowAndArrowBehavior;

public class King extends Character {
	
	public King() {
		weapon = new BowAndArrowBehavior();
	}
	
	@Override
	public void fight() {
		System.out.println("Fighting as the King!");
	}
}
