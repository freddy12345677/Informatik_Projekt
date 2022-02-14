package pack1;

public class Weapons {
	String name;
	int damage;
	int firerate;

	public Weapons(String name, int damage, int firerate) {
		this.name = name;
		this.damage = damage;
		this.firerate = firerate;

	}

	public int getDamage() {
		return damage;
	}
	public int getFirerate() {
		return firerate;
	}

}
