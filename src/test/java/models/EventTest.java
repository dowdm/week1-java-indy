package models;

import org.junit.Test;

import static org.junit.Assert.*;

public class EventTest {
    @Test
    public void newEvent_instantiatesCorrectly() throws Exception {
        Event testEvent = new Event();
        assertEquals(true, testEvent instanceof Event);
    }
    @Test
    public void setFood_setsEventFoodToSteak_steak() throws Exception {
        Event testEvent = new Event();
        testEvent.setFood("steak");
        assertEquals("steak", testEvent.getFood());
    }

    @Test
    public void setAttendees_setsEventAttendees_200() throws Exception {
        Event testEvent = new Event();
        testEvent.setAttendees(200);
        assertEquals(200, testEvent.getAttendees());
    }

    @Test
    public void setEntertainment_setsEventEntertainment_dj() throws Exception {
        Event testEvent = new Event();
        testEvent.setEntertainment("dj");
        assertEquals("dj", testEvent.getEntertainment());
    }

    @Test
    public void setBeverages_setsEventBeverages_openbar() throws Exception {
        Event testEvent = new Event();
        testEvent.setBeverages("open bar");
        assertEquals("open bar", testEvent.getBeverages());
    }
    @Test
    public void setPerCapitaRateForFood_increasesRateBy10ForSteak_10() throws Exception {
        Event testEvent = new Event();
        testEvent.setPerCapitaRateForFood("steak");
        assertEquals(10, testEvent.getPerCapitaRate());
    }
    @Test
    public void setPerCapitaRateForFood_increasesRateBy8ForVegan_8() throws Exception {
        Event testEvent = new Event();
        testEvent.setPerCapitaRateForFood("vegan");
        assertEquals(8, testEvent.getPerCapitaRate());
    }
    @Test
    public void setPerCapitaRateForFood_increasesRateBy4ForSnacks_4() throws Exception {
        Event testEvent = new Event();
        testEvent.setPerCapitaRateForFood("snacks");
        assertEquals(4, testEvent.getPerCapitaRate());
    }
    @Test
    public void setPerCapitaRateForBeverages_increasesRateBy10ForOpenBar_10() throws Exception {
        Event testEvent = new Event();
        testEvent.setPerCapitaRateForBeverages("open bar");
        assertEquals(10, testEvent.getPerCapitaRate());
    }


}