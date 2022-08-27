package model;

public class NameCity {
	String name, city;

	public NameCity(String name, String city) {

		this.name = name;
		this.city = city;
	}

	public NameCity() {

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "NameCity [name=" + name + ", city=" + city + "]";
	}

}
