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



}