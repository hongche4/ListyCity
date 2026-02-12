package com.example.listycity;
/**
 * A simple City object.
 * It stores a city name and a province.
 */
public class City implements Comparable {
    private String city;
    private String province;
    /**
     * Make a city with a name and a province.
     *
     * @param city     city name (like "Edmonton")
     * @param province province name (like "Alberta")
     */
    public City(String city, String province) {
        this.city = city;
        this.province = province;
    }
    /**
     * Get city name.
     *
     * @return city name
     */
    public String getCity() {
        return city;
    }
    /**
     * Get province name.
     *
     * @return province name
     */
    public String getProvince() {
        return province;
    }
    /**
     * Compare two cities by city name (alphabetical order).
     *
     * @param o another object (should be a City)
     * @return negative/0/positive based on order
     */
    @Override
    public int compareTo(Object o) {
        City other = (City) o;
        return this.city.compareTo(other.getCity());
    }
    /**
     * Two cities are equal if both city name and province match.
     *
     * @param obj object to compare
     * @return true if same city+province, otherwise false
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        City other = (City) obj;
        return city.equals(other.city) && province.equals(other.province);
    }
}