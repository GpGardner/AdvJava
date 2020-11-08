/**
 * 
 * Example of an little enemy class, implements the interface
 * 
 */

public class LittleEnemy implements IEnemy {

	private String name;
	private int damage;
	private String shout;

	public LittleEnemy(String name, int damage, String shout) {
		this.name = name;
		this.damage = damage;
		this.shout = shout;
	}

	@Override
	public void attack() {
		System.out.println(name + "attacks for " + damage + " damage!");
	}

	@Override
	public void speak() {
		System.out.println(shout);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getDamage() {
		return damage;
	}

	public void setDamage(int damage) {
		this.damage = damage;
	}

	public String getShout() {
		return shout;
	}

	public void setShout(String shout) {
		this.shout = shout;
	}

	@Override
	public String toString() {
		return "LittleEnemy [damage=" + damage + ", name=" + name + ", shout=" + shout + "]";
	}

	
}