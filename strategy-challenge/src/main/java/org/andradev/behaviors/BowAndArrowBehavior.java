package org.andradev.behaviors;

// BowAndArrowBehavior ..> WeaponBehavior
public class BowAndArrowBehavior implements WeaponBehavior {
	
	@Override
	public void useWeapon() {
		System.out.println("Arrow shooting!");
	}
}
