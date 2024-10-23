package org.andradev.charactersRoster;

import org.andradev.behaviors.AxeBehavior;

// Troll -> Character
// Troll => WeaponBehavior
public class Troll extends Character {
	
	public Troll() {
		weapon = new AxeBehavior();
	}
	
	@Override
	public void fight() {
		System.out.println("Fighting as the Troll!");
	}
}
