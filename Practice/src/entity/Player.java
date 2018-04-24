package entity;

public class Player {

	private String position;
	private String name;
	private String country;
	private String team;

	public void setposition(String position) {
		this.position = position;
	}

	public void setname(String name) {
		this.name = name;
	}

	public void setcountry(String country) {
		this.country = country;
	}

	public void setteam(String team) {
		this.team = team;
	}

	public String getposition() {
		return this.position;
	}

	public String getname() {
		return this.name;
	}

	public String getcountry() {
		return this.country;
	}

	public String getteam() {
		return this.team;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		String s = ",";
		sb.append(this.position);
		sb.append(s);
		sb.append(this.name);
		sb.append(s);
		sb.append(this.country);
		sb.append(s);
		sb.append(this.team);
		return sb.toString();
	}

}
