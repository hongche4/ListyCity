package com.example.listycity;
import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;
public class CityListTest {
    private City mockCity() {
        return new City("Edmonton", "Alberta");
    }
    private CityList mockCityList() {
        CityList cityList = new CityList();
        cityList.add(mockCity());
        return cityList;
    }
    @Test
    void testAdd() {
        CityList cityList = mockCityList();
        cityList.add(new City("Calgary", "Alberta"));
        assertEquals(2, cityList.countCities());
    }
    @Test
    void testAddException() {
        CityList cityList = mockCityList();
        assertThrows(IllegalArgumentException.class, () -> {
            cityList.add(mockCity());
        });
    }
    @Test
    void testGetCities() {
        CityList cityList = mockCityList();
        cityList.add(new City("Calgary", "Alberta"));

        List<City> cities = cityList.getCities();

        assertEquals(0, cities.get(0).compareTo(new City("Calgary", "Alberta")));
        assertEquals(0, cities.get(1).compareTo(new City("Edmonton", "Alberta")));
    }
    @Test
    void testHasCityTrue() {
        CityList cityList = mockCityList();
        assertTrue(cityList.hasCity(new City("Edmonton", "Alberta")));
    }
    @Test
    void testHasCityFalse() {
        CityList cityList = mockCityList();
        assertFalse(cityList.hasCity(new City("Vancouver", "BC")));
    }
    @Test
    void testDeleteSuccess() {
        CityList cityList = mockCityList();
        cityList.delete(new City("Edmonton", "Alberta"));
        assertEquals(0, cityList.countCities());
    }
    @Test
    void testDeleteException() {
        CityList cityList = mockCityList();
        assertThrows(IllegalArgumentException.class, () -> {
            cityList.delete(new City("Vancouver", "BC"));
        });
    }
    @Test
    void testCountCities() {
        CityList cityList = new CityList();
        assertEquals(0, cityList.countCities());

        cityList.add(new City("Edmonton", "Alberta"));
        assertEquals(1, cityList.countCities());
    }
}