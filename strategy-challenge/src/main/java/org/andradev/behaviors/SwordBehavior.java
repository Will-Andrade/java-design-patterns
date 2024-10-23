package org.andradev.behaviors;

public class SwordBehavior implements WeaponBehavior {
	
	@Override
	public void useWeapon() {
		System.out.println("Sword swing and stab!");
	}
}
