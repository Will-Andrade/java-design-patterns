package org.andradev.charactersRoster;

import org.andradev.behaviors.KnifeBehavior;

// Queen -> Character
// Queen => WeaponBehavior
public class Queen extends Character {
	
	public Queen() {
		weapon = new KnifeBehavior();
	}
	
	@Override
	public void fight() {
		System.out.println("Fighting as the Queen!");
	}
}
