package com.zookeeper;

public class MammalTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Gorilla king = new Gorilla();
		king.throwSomething();
		king.climb();
		king.eatBananas();
		king.displayEnergy();
		
		Bat dracula = new Bat();
		dracula.attackTown();
		dracula.eatHumans();
		dracula.fly();
		dracula.eatHumans();
		dracula.attackTown();
		dracula.fly();
		dracula.attackTown();
		dracula.displayEnergy();
	}

}