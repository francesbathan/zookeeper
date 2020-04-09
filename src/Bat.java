
public class Bat extends Mammal {
	
	int energyLevel = 300;
	
	public void fly() {
		System.out.println("woosh");
		energyLevel = energyLevel - 50;
	}
	
	public void eatHumans() {
		System.out.println("Yummy yummy in my tummy");
		energyLevel = energyLevel + 25;
	}
	
	public void attackTown() {
		System.out.println("We're on fire aaaaa");
		energyLevel = energyLevel - 100;
	}
}
