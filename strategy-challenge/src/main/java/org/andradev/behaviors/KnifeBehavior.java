package org.andradev.behaviors;

// KnifeBehavior ..> WeaponBehavior
public class KnifeBehavior implements WeaponBehavior {
	
	@Override
	public void useWeapon() {
		System.out.println("Knife cutting and stabbing");
	}
}
