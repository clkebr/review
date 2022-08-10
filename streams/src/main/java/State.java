import java.util.*;


public class State {
    private String stateName;
    private List<String> cities = new ArrayList<>();

    public State(String state) {
        this.stateName = state;
    }

    public void addCity(String city) {
        cities.add(city);
    }

    public List<String> getCities() {
        return this.cities;
    }
}
