package practice13.common;

public class SuperHero extends Hero {
	private Item equipment; //アイテムクラスのエクイプメントを作成//

	public Item getEquipment() {
		return equipment;
	}

	public void setEquipment(Item equipment) { //アクセサ//
		this.equipment = equipment;
	}

	public int attack() {
		return super.attack() + equipment.getadditionalDamage();
	}

}
