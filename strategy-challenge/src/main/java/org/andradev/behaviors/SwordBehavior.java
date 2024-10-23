package org.andradev.behaviors;

// SwordBehavior ..> WeaponBehavior
public class SwordBehavior implements WeaponBehavior {
	
	@Override
	public void useWeapon() {
		System.out.println("Sword swing and stab!");
	}
}
