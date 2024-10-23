package org.andradev.behaviors;

public class AxeBehavior implements WeaponBehavior {
	
	@Override
	public void useWeapon() {
		System.out.println("Swings and cleaves with axe!");
	}
}
