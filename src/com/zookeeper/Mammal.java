package com.zookeeper;

abstract class Mammal {
	int energyLevel = 100;
	protected int displayEnergy() {
		System.out.println(this.energyLevel);
		return this.energyLevel;
	}
}