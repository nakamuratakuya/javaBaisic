/*
 * PTra13_06.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */
package practice13.ptra13;
import practice13.common.Hero;
import practice13.common.Item;
public class PTra13_06 {

	public static class SuperHero extends Hero{


		private Item  equipment;				//アイテムクラスのエクイプメントを作成//
			public Item getEquipment() {
				return equipment;
			}
				public void setEquipment(Item equipment) {  //アクセサ//
					this.equipment = equipment;
				}
					public int attack() {
						return super.attack();
					}

	}


		public static void main(String[] args) {
			SuperHero superhero = new SuperHero();

			System.out.println(superhero.attack());

		}
	/*
	 * ★ common.Heroクラスを継承した、common.SuperHeroクラスを作成してください
	 * 	●HP, POWER, ENDURANCEはそれぞれ、（25, 10, 7）
	 *
	 * フィールド
	 * 		equipment	:	common.Item
	 * メソッド
	 * 		attackメソッドをオーバーライドし、
	 * 		powerに加えて、additionalDamage分を加算した値としてください
	 *
	 * 		equipmentのアクセサ
	 */

}
