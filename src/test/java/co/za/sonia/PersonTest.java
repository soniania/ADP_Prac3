package co.za.sonia;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PersonTest {

    private Person person;
    private Child child;

    @Before
    public void setUp() throws Exception {
         person = new Person();
         child = new Child();
         person.setName("Sonia");
         person.setSurname("Sontshatsha");
         child.setAge(6);


    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void getName() {

    }

    @Test
    public void getSurname() {
    }
}