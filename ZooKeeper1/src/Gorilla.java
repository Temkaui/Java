
public class Gorilla extends Mammal {
	public void throwSomething() {
		System.out.println("Gorilla is throwing banana");
		this.energyLevel -= 5;
	}
	public void eatBananas() {
		System.out.println("Gorilla is eating banana");
		this.energyLevel += 10;
	}
	public void climb() {
		System.out.println("Gorilla is climbing tree");
		this.energyLevel -= 10;
	}
}
