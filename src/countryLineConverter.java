
public class countryLineConverter implements LineConverter<Country> {

	@Override
	public String toLine(Country object) {
		return String.format("%S\t%S", object.getName(), object.getPopulation());
	}

	@Override
	public Country fromLine(String line) {
		String[] parts = line.split("\t");
		String name = parts[0];
		String population = parts[1];

		return new Country(name, population);
	}

}
