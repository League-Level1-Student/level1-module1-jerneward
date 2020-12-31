package _06_duck;

public class Dog {

	int numberOfOwners;
	String favoriteToy;
	void bark() {
		System.out.println("Duke has a barking problem. He barks loudly every night.");
	}
	void fetch() {
		System.out.println("Duke is very good at fetch. He can catch things in the air!");
	}
	Dog(String favoriteToy, int numberOfOwners) {
	       this.favoriteToy = favoriteToy;
	       this.numberOfOwners = numberOfOwners;
	}
}
