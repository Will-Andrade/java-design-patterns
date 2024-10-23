package org.andradev.behaviors;

public class KnifeBehavior implements WeaponBehavior {
	
	@Override
	public void useWeapon() {
		System.out.println("Knife cutting and stabbing");
	}
}
