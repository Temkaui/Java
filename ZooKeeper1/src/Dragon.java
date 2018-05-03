
public class Dragon extends Mammal{
	public Dragon() {
		this.energyLevel = 300;
	}
	public void fly() {
		System.out.println("Dragon is flying");
		this.energyLevel -= 50;
	}
	public void eatHumans() {
		System.out.println("Dragon eats your hand");
		this.energyLevel += 25;
	}
	public void attackTown() {
		System.out.println("Dragon is attacking, ahhhhhh....");
		this.energyLevel -= 100;
	}

}
