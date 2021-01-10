package com.zookeeper;

public class Bat extends Mammal{
	int energyLevel = 300;
	protected void fly() {
		System.out.println("Whooooosh whoooosh");
		this.energyLevel -= 50;
		System.out.println("New Engery Level: ");
		System.out.println(this.energyLevel);
	}
	protected void attackTown() {
		System.out.println("Ahhhhh the town is on fire");
		this.energyLevel -= 100;
		System.out.println("New Engery Level: ");
		System.out.println(this.energyLevel);
	}
	protected void eatHumans() {
		System.out.println("That human was delicous");
		this.energyLevel += 25;
		System.out.println("New Engery Level: ");
		System.out.println(this.energyLevel);
	}
}