package bases;

import utils.Dice;

// モンスターを表現する抽象クラス
public abstract class Monster extends Living {

	// コンストラクタ
	public Monster(String name, String weapon) {
		// Livingクラスで定義したコンストラクタを利用する
		super(name, weapon);
	}

	// attackメソッドのオーバーライド
	@Override
	public void attack(Living target) {
		// 1から10までのサイコロを振り、自分の攻撃力とかけ合わせた値を相手に与えるダメージとする
		int a = Dice.get(1, 10);
		int damage = this.getOffensive() * a;
		int newHp = target.getHp() - damage;
		target.setHp(newHp);

		// コンソールにステータスを表示
		System.out.println();
		System.out.println(this.name + "が「" + this.weapon + "」で攻撃!「" + target.getName() + "」に" + damage + "のダメージを与えた。");
	}

}