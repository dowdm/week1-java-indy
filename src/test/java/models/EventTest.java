package models;

import org.junit.Test;

import static org.junit.Assert.*;

public class EventTest {
    @Test
    public void newEvent_instantiatesCorrectly() throws Exception {
        Event testEvent = new Event(10, "dinner", "dj");
        assertEquals(true, testEvent instanceof Event);
    }
    @Test
    public void setFood_setsEventFoodToSteak_steak() throws Exception {
        Event testEvent = new Event(10, "dinner", "dj");
        testEvent.setFood("steak");
        assertEquals("steak", testEvent.getFood());
    }
}