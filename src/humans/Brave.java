package humans;

import bases.Human;
import utils.Dice;

public class Brave extends Human {

	public Brave(String name, String weapon) {
		super(name, weapon);

		int hp = Dice.get(170, 230);
		this.setHp(hp);

		int offensive = Dice.get(7, 13);
		this.setOffensive(offensive);

	}
}
