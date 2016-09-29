package com.ourchars;

import com.app.Weapons.Weapon;
import com.interfaces.Wizard;
import com.parents.Human;

public class HumanWizard extends Human implements Wizard {

	public HumanWizard() {
		super();
	}

	public HumanWizard(int health, int magic, String name, Weapon weapon) {
		super(health, magic, name, weapon);
	}

	@Override
	public void changeHealth() {
		super.setHealth(health + 0);
	}

	@Override
	public void changeMagic() {
		super.setMagic(magic + 200);
	}

	@Override
	public void setWeapon(Weapon weapon) {
		super.setWeapon(Weapon.WAND);
	}

	public HumanWizard makeHumanWizard() {

		HumanWizard ourHumanWizard = new HumanWizard();
		ourHumanWizard.changeHealth();
		ourHumanWizard.changeMagic();
		// ourHumanWizard.setHealth(0); Probably not needed
		// ourHumanWizard.setMagic(0); Probably not needed
		ourHumanWizard.setName(null);
		ourHumanWizard.setWeapon(null);
		return ourHumanWizard;
	}
}
