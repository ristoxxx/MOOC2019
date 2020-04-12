// @Evermore
public class Country implements Comparable<Country> {

    private final String name;
    private final int population;

    public Country(String name, int population) {
        this.name = name;
        this.population = population;
    }

    public String getName() {
        return name;
    }

    public int getPopulation() {
        return population;
    }
    
    @Override
    public int compareTo(Country another) {
    	if (this.getPopulation() < another.getPopulation()) {
            return -1;
        } else if (this.getPopulation() > another.getPopulation()) {
            return 1;
        } else {
            return 0;
        }
    }
    
    @Override
    public String toString() {
        return this.name + ", population: " + this.population;
    }
}
