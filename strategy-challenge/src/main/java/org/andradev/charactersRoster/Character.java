package org.andradev.charactersRoster;

import org.andradev.behaviors.WeaponBehavior;

public abstract class Character {
	
	WeaponBehavior weapon;
	
	public abstract void fight();
	
	public void setWeapon(WeaponBehavior weapon) {
		this.weapon = weapon;
	}
	
	public void attack() {
		weapon.useWeapon();
	}
}
