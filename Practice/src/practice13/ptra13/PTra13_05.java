/*
 * PTra13_05.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */
package practice13.ptra13;

public class PTra13_05 {

	/*
	 * ★ common.Itemクラスを作成してください
	 *
	 * フィールド
	 * 		name	:	String
	 * 		additionalDamage	:	int
	 * メソッド
	 * 		各フィールドのアクセサ
	 * コンストラクタ
	 * 		name, additionalDamageに初期値を設定するコンストラクタ
	 * 		上記2つを設定するための引数を持つ
	 */
	public static class Item {            //アイテムクラスの作成	//
		private String name;               //フィールドの設定//
		private int additionalDamage;

		public String getname() {   				//アクセサの作成//
			return this.name;
		}
		public int getadditionalDamage() {
			return this.additionalDamage;
		}
		public Item(String name,int additionalDamage) {
			this.name = name;
			this.additionalDamage = additionalDamage;
		}
	}
}
