package com.example.listycity;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/**
 * A list that stores City objects.
 * It supports add, delete, check, and count.
 */
public class CityList {
    private List<City> cities = new ArrayList<>();
    /**
     * Add a city into the list.
     *
     * @param city the city to add
     * @throws IllegalArgumentException if the city is already in the list
     */
    public void add(City city) {
        if (cities.contains(city)) {
            throw new IllegalArgumentException();
        }
        cities.add(city);
    }
    /**
     * Get cities in alphabetical order (by city name).
     *
     * @return sorted list of cities
     */
    public List<City> getCities() {
        List<City> list = new ArrayList<>(cities);
        Collections.sort(list);
        return list;
    }
    /**
     * Check if a city is inside the list.
     *
     * @param city the city to look for
     * @return true if found, false otherwise
     */
    public boolean hasCity(City city) {
        return cities.contains(city);
    }
    /**
     * Remove a city from the list.
     *
     * @param city the city to remove
     * @throws IllegalArgumentException if the city is not in the list
     */
    public void delete(City city) {
        if (!cities.contains(city)) {
            throw new IllegalArgumentException();
        }
        cities.remove(city);
    }
    /**
     * Count how many cities are in the list.
     *
     * @return number of cities
     */
    public int countCities() {
        return cities.size();
    }
}