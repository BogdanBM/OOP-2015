package com.gellert.zoowsome.models.animals;

import com.gellert.zoowsome.services.factories.Constants;

public class Tiger extends Mammal {
	public Tiger(String name, int nrOfLegs, float normalBodyTemp, float percBodyHair, double maintenanceCost, double dangerPerc) {
		super(maintenanceCost, dangerPerc);
		this.setName(name);
		this.setNrOfLegs(nrOfLegs);
		this.setNormalBodyTemp(normalBodyTemp);
		this.setPercBodyHair(percBodyHair);
	}
	public Tiger() {
		this.setName("Little John");
		this.setNrOfLegs(4);
		this.setNormalBodyTemp(38.0f);
		this.setPercBodyHair(100.0f);
	}
}
