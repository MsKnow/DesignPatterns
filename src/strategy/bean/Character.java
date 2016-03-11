package strategy.bean;

import strategy.weapon.WeaponBehavior;

public abstract class Character {
	
	public abstract void sayHello();
	
	public void fight(){
		weapon.useWeapon();
	}
	
	private WeaponBehavior weapon;
	public void setWeapon(WeaponBehavior weapon){
		this.weapon = weapon;
	}
}
