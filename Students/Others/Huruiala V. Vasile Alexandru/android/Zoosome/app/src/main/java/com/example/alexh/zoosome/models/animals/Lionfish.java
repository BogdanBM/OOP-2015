package com.example.alexh.zoosome.models.animals;
/*
import static com.example.alexh.zoosome.repositories.EntityRepository.createNode;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;
*/
import com.example.alexh.zoosome.services.factories.Constants;

import java.util.ArrayList;

public class Lionfish extends Aquatic {
	private static final String DEFAULT_NAME = "Red lionfish";
	private static final int DEFAULT_NUMBER_OF_LEGS = 0;
	private static final double DEFAULT_MAINTENANCE_COST = 0.15D;
	private static final double DEFAULT_DANGER_PERCENTAGE = 0.15D;
	private static final int DEFAULT_AVERAGE_SWIMMING_DEPTH = 32;
	private static final WaterType DEFAULT_WATER_TYPE = WaterType.getWater(0);

	public Lionfish() {
		super(DEFAULT_NAME, DEFAULT_NUMBER_OF_LEGS, DEFAULT_MAINTENANCE_COST, DEFAULT_DANGER_PERCENTAGE,
				DEFAULT_AVERAGE_SWIMMING_DEPTH, DEFAULT_WATER_TYPE);
	}

	public Lionfish(final String animalName, final int numberOfLegs, final double maintenanceCost,
			final double dangerPerc, final int swimDepth, final WaterType wType) {
		super(animalName, numberOfLegs, maintenanceCost, dangerPerc, swimDepth, wType);
	}

	public Lionfish(ArrayList<String> parameters) {
		super(parameters);
	}
/*
	public void encodeToXML(XMLEventWriter eventWriter) throws XMLStreamException {
		super.encodeToXML(eventWriter);
		createNode(eventWriter, Constants.XML_TAGS.DISCRIMINANT, String.valueOf(Constants.Animals.Aquatics.LIONFISH));
	}*/
}
