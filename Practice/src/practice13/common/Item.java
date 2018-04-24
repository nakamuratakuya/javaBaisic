package practice13.common;

public class Item {
	private String name;               //フィールドの設定//
	private int additionalDamage;

	public String getname() {   				//アクセサの作成//
		return this.name;
	}
	public int getadditionalDamage() {
		return this.additionalDamage;
	}
	public void setname(String name) {
		this.name = name;
	}
	public void setadditionalDamage(int dditionalDamage) {
		this.additionalDamage = dditionalDamage;
	}

	public Item(String name,int additionalDamage) {
		this.name = name;
		this.additionalDamage = additionalDamage;
	}
}
