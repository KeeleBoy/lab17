
public class Country {

	// fields

	private String name;
	private String population;

	// to string

	@Override
	public String toString() {
		return "Country [name=" + name + ", population=" + population + "]";
	}

	// normal constructor

	public Country(String name, String population) {
		super();
		this.name = name;
		this.population = population;
	}

	// empty constructor

	public Country() {

	}

	// getters and setters

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPopulation() {
		return population;
	}

	public void setPopulation(String population) {
		this.population = population;
	}

}
