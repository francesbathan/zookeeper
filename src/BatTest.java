
public class BatTest {

	public static void main(String[] args) {
		Bat manananggal = new Bat();
		manananggal.attackTown();
		manananggal.attackTown();
		manananggal.attackTown();
		manananggal.eatHumans();
		manananggal.eatHumans();
		manananggal.fly();
		manananggal.fly();
		System.out.println("Energy level: " + manananggal.displayEnergy() + " UNLIMITED POWER!");
	}

}
