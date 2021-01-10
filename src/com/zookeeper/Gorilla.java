package com.zookeeper;

public class Gorilla extends Mammal{
	protected void throwSomething() {
		System.out.println("Something has been thrown");
		this.energyLevel -= 5;
		System.out.println("New Engery Level: ");
		System.out.println(this.energyLevel);
	}
	protected void climb() {
		System.out.println("The Gorilla has climbed something");
		this.energyLevel -= 10;
		System.out.println("New Engery Level: ");
		System.out.println(this.energyLevel);
	}
	protected void eatBananas() {
		System.out.println("That banana was delicous");
		this.energyLevel += 10;
		System.out.println("New Engery Level: ");
		System.out.println(this.energyLevel);
	}
}