package org.andradev.behaviors;

// AxeBehavior ..> WeaponBehavior
public class AxeBehavior implements WeaponBehavior {
	
	@Override
	public void useWeapon() {
		System.out.println("Swings and cleaves with axe!");
	}
}
