package org.andradev.behaviors;

public class BowAndArrowBehavior implements WeaponBehavior {
	
	@Override
	public void useWeapon() {
		System.out.println("Arrow shooting!");
	}
}
