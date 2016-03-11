package strategy.main;

import strategy.weapon.KnifeBehavior;
import strategy.weapon.SwordBehavior;
import strategy.bean.Character;
import strategy.bean.King;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Character king = new King();
		king.setWeapon(new KnifeBehavior());
		king.sayHello();
		king.fight();
		king.setWeapon(new SwordBehavior());
		king.fight();
	}

}
