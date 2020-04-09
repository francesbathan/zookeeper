
public class Gorilla extends Mammal {
	public void throwSomething() {
		System.out.println("Gorilla attac!");
		energyLevel = energyLevel - 5;
		System.out.println("Gorilla energy levels: " + energyLevel);
	}
	
	public void eatBananas() {
		System.out.println("Monch...");
		energyLevel = energyLevel + 10;
		System.out.println("Gorilla energy levels: " + energyLevel);
	}
	
	public void climb() {
		System.out.println("Gorilla is climbing a tree.");
		energyLevel = energyLevel - 10;
		System.out.println("Gorilla energy levels: " + energyLevel);
	}
}
