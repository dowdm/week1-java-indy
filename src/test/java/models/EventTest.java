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
    public void setPerCapitaRate_increasesRateBy10ForSteak_10() throws Exception {
        Event testEvent = new Event();
        testEvent.setPerCapitaRate("steak","test", "test");
        assertEquals(10, testEvent.getPerCapitaRate());
    }



}