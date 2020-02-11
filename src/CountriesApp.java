import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class CountriesApp {

	// if(Files.exists("src/countries.txt"))
	private static FileHelper<Country> FileHelper = new FileHelper<>("src/countries.txt", new countryLineConverter());
	// }
	// can't get this if to work
	// if i could it would save to long term memory

	public static void main(String[] args) {

		Scanner scnr = new Scanner(System.in);

		List<Country> countries = FileHelper.readAll();

		FileHelper.rewrite(Arrays.asList(new Country("China", "1,400,000,000")));
		FileHelper.append(new Country("USA", "327,000,000"));
		FileHelper.append(new Country("Estonia", "Not that many"));

		boolean true1 = true;
		while (true1) {
			countries = FileHelper.readAll();
			System.out.println("Available commands:");
			System.out.println("1  - list countries");
			System.out.println("2  - add a country");
			System.out.println("3 -  quit");
			System.out.println("Enter a command: ");
			int choice = scnr.nextInt();

			switch (choice) {
			case 1:
				printCountries(countries);
				break;
			case 2:
				FileHelper.append(addCountry());
				break;
			case 3:
				true1 = false;
				break;
			}

		}
		System.out.println("Goodbye.");
		scnr.close();
	}

	public static void printCountries(List<Country> list) {
		for (Country p : list) {
			System.out.printf("%s %s", p.getName(), p.getPopulation());
			System.out.println();
		}
	}

	public static Country addCountry() {
		Scanner scnr = new Scanner(System.in);
		String name = Validator.getString(scnr, "Please enter a name: ");
		String population = Validator.getString(scnr, "Please enter the population: ");
		Country country2 = new Country(name, population);
		return country2;

	}
}