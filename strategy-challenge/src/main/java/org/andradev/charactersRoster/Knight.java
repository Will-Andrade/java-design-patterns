package org.andradev.charactersRoster;

import org.andradev.behaviors.SwordBehavior;

public class Knight extends Character {
	
	public Knight() {
		weapon = new SwordBehavior();
	}
	
	@Override
	public void fight() {
		System.out.println("Fighting as the Knight!");
	}
}
