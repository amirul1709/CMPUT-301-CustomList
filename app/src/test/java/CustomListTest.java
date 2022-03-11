import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import com.example.simpleparadox.listycity.City;
import com.example.simpleparadox.listycity.CustomList;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

public class CustomListTest {

    private CustomList list;

    @Before
    public void createList(){
        list = new CustomList(null, new ArrayList<City>());
    }

    @Test
    public void addCityTest(){
        int listSize = list.getCount();
        list.addCity(new City("Halifax", "NS"));
        assertEquals(list.getCount(), listSize + 1);
    }

    @Test
    public void hasCityTest(){
        City city = new City("Vancouver", "BC");
        list.addCity(city);
        assertTrue(list.hasCity(city));
        assertFalse(list.hasCity(new City("Halifax","NS")));
    }

    /*@Test
    public void deleteCityTest(){
        final City city = new City("Vancouver", "BC");
        list.addCity(city);
        list.deleteCity(city);
        //assertThrows(IllegalArgumentException.class, () -> {list.deleteCity(city);});
    }*/

    @Test
    public void countCitiesTest(){
        assertEquals(0, list.countCities());
        list.addCity(new City("Edmonton", "AB"));
        assertEquals(1, list.countCities());
    }
}
