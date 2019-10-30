
public class Gorilla extends ZooKeeperOne {
	public void throwSomething() {
		energyLevel -= 5;
		System.out.println("Gorilla just threw something and his energy is now " + energyLevel);
	}
	public void eatBannanas() {
		energyLevel += 10;
		System.out.println("Gorilla Ate a Bannana and his energy is now " + energyLevel);
	}
	public void climb() {
		energyLevel -=10;
		System.out.println("gorilla climbed a wall and his energy is now" + energyLevel);
	}
	
}
