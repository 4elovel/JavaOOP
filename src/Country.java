import java.util.ArrayList;

public class Country {

    private String countryName;
    private String continentName;
    private int population;
    private String phoneCode;
    private String capitalCity;
    private ArrayList<String> citiesNames;

    public void addCityName(String cityName) {
        citiesNames.add(cityName);
    }

    public void deleteCityName(String cityName) {
        citiesNames.remove(cityName);
    }

    public void printData() {
        System.out.println("Назва країни: " + countryName);
        System.out.println("Назва континенту: " + continentName);
        System.out.println("Кількість жителів в країні: " + population);
        System.out.println("Телефонний код країни: " + phoneCode);
        System.out.println("Назва столиці: " + capitalCity);
        System.out.println("Назви міст країни: " + String.join(", ", citiesNames));
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public String getContinentName() {
        return continentName;
    }

    public void setContinentName(String continentName) {
        this.continentName = continentName;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public String getPhoneCode() {
        return phoneCode;
    }

    public void setPhoneCode(String phoneCode) {
        this.phoneCode = phoneCode;
    }

    public String getCapitalCity() {
        return capitalCity;
    }

    public void setCapitalCity(String capitalCity) {
        this.capitalCity = capitalCity;
    }

    public ArrayList<String> getCitiesNames() {
        return citiesNames;
    }

    public void setCitiesNames(ArrayList<String> citiesNames) {
        this.citiesNames = citiesNames;
    }
}
