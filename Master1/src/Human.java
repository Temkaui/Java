
public class Human {
	protected int strength;
	protected int intelligence;
	protected int stealth;
	protected int health;
	
	public Human() {
		this.intelligence = 3;
		this.strength = 3;
		this.stealth = 3;
		this.health = 100;
	}
	
	protected void attack( Human target) {
		target.health -= this.strength;
	}
	
	public void displayHealth() {
		System.out.println(this.health);
	}
	
	
}
