package org.cuatrovientos.spring;

public class Guest {
	private String name;
	private String dni;

	public Guest() {
		super();
	}

	public Guest(String name, String dni) {
		super();
		this.name = name;
		this.dni = dni;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	@Override
	public String toString() {
		return "Guest [name=" + name + ", dni=" + dni + "]";
	}

}
