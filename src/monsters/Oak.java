package monsters;

import bases.Monster;
import utils.Dice;

public class Oak extends Monster {

	public Oak(String name, String weapon) {
		super(name, weapon);

		int hp = Dice.get(170, 230);
		this.setHp(hp);

		int offensive = Dice.get(9, 15);
		this.setOffensive(offensive);
	}

}
