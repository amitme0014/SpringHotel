package org.cuatrovientos.spring;

public class Room {
	private int number;
	private String type;
	private String description;
	private Guest guest;

	public Room() {
		super();
	}

	public Room(int number, String type, String description, Guest guest) {
		super();
		this.number = number;
		this.type = type;
		this.description = description;
		this.guest = guest;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Guest getGuest() {
		return guest;
	}

	public void setGuest(Guest guest) {
		this.guest = guest;
	}

	@Override
	public String toString() {
		return "Room [number=" + number + ", type=" + type + ", description=" + description + ", guest=" + guest + "]";
	}

	public void freeRoom() {
		guest = null;
	}
}
