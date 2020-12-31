package _06_duck;

public class Duck {

	int numberOfFriends;
	String favoriteFood;
	void quack() {
		System.out.println("Daffy the duck quacks loudly at your food.");
	}
	void waddle() {
		System.out.println("You give him some, and he waddles away.");
	}
	
	Duck(String favoriteFood, int numberOfFriends) {
	       this.favoriteFood = favoriteFood;
	       this.numberOfFriends = numberOfFriends;
	}
	
}
