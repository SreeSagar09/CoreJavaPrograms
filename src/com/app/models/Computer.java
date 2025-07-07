package com.app.models;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

public class Computer implements Comparable<Computer> {
	private String computerName;
	private String modelName;
	private String processor;
	private String ram;
	private String romOrHardDisk;
	private Double price;
	private Optional<String> romOrHardDiskType;
	private Optional<String> graphicCard;
	
	public String getComputerName() {
		return computerName;
	}
	
	public void setComputerName(String computerName) {
		this.computerName = computerName;
	}
	
	public String getModelName() {
		return modelName;
	}
	
	public void setModelName(String modelName) {
		this.modelName = modelName;
	}
	
	public String getProcessor() {
		return processor;
	}

	public void setProcessor(String processor) {
		this.processor = processor;
	}

	public String getRam() {
		return ram;
	}
	
	public void setRam(String ram) {
		this.ram = ram;
	}
	
	public String getRomOrHardDisk() {
		return romOrHardDisk;
	}
	
	public void setRomOrHardDisk(String romOrHardDisk) {
		this.romOrHardDisk = romOrHardDisk;
	}
	
	public Double getPrice() {
		return price;
	}
	
	public void setPrice(Double price) {
		this.price = price;
	}
	
	public Optional<String> getRomOrHardDiskType() {
		return romOrHardDiskType;
	}
	
	public void setRomOrHardDiskType(Optional<String> romOrHardDiskType) {
		this.romOrHardDiskType = romOrHardDiskType;
	}
	
	public Optional<String> getGraphicCard() {
		return graphicCard;
	}
	
	public void setGraphicCard(Optional<String> graphicCard) {
		this.graphicCard = graphicCard;
	}

	public Computer() {
		super();
	}

	public Computer(String computerName, String modelName, String processor, String ram, String romOrHardDisk, Double price,
			Optional<String> romOrHardDiskType, Optional<String> graphicCard) {
		super();
		this.computerName = computerName;
		this.modelName = modelName;
		this.processor = processor;
		this.ram = ram;
		this.romOrHardDisk = romOrHardDisk;
		this.price = price;
		this.romOrHardDiskType = romOrHardDiskType;
		this.graphicCard = graphicCard;
	}

	@Override
	public int hashCode() {
		return Objects.hash(computerName, modelName);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Computer other = (Computer) obj;
		return Objects.equals(computerName, other.computerName) && Objects.equals(modelName, other.modelName);
	}

	@Override
	public String toString() {
		return "Computer [computerName=" + computerName + ", modelName=" + modelName + ", processor=" + processor
				+ ", ram=" + ram + ", romOrHardDisk=" + romOrHardDisk + ", price=" + price + ", romOrHardDiskType="
				+ romOrHardDiskType + ", graphicCard=" + graphicCard + "]";
	}

	@Override
	public int compareTo(Computer c) {
		return this.computerName.compareToIgnoreCase(c.computerName);
	}
	
	public static List<Computer> getComputerList(){
		List<Computer> computerList = new ArrayList<>();
		
		computerList.add(new Computer("Lenovo", "G500", "Intel - I3", "4Gb", "500Gb", 35000d, Optional.of("HDD"), Optional.of("2Gb-AMD")));
		computerList.add(new Computer("Lenovo", "ThinkPad", "Intel - I5", "8Gb", "500Gb", 45000d, Optional.of("SSD"), Optional.ofNullable(null)));
		computerList.add(new Computer("Dell", "Inspiron", "Intel - I7", "8Gb", "500Gb", 40000d, Optional.of("HDD"), Optional.of("2Gb-AMD")));
		computerList.add(new Computer("Dell", "Latitude", "Nvidia", "8Gb", "1Tb", 65000d, Optional.of("HDD"), Optional.of("2Gb-AMD")));
		
		return computerList;
	}
}
