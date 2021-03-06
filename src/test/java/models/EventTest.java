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
    public void setPerCapitaRateForFood_increasesRateBy0ForInvalidInput_0() throws Exception {
        Event testEvent = new Event();
        testEvent.setPerCapitaRateForFood("yfghkf");
        assertEquals(0, testEvent.getPerCapitaRate());
    }
    @Test
    public void setPerCapitaRateForFood_checksForInvalidInput_false() throws Exception {
        Event testEvent = new Event();
        testEvent.setPerCapitaRateForFood("bnkigh");
        assertEquals(false, testEvent.setPerCapitaRateForFood("bnkigh"));
    }

    @Test
    public void setPerCapitaRateForFood_checksForValidInput_true() throws Exception {
        Event testEvent = new Event();
        testEvent.setPerCapitaRateForFood("steak");
        assertEquals(true, testEvent.setPerCapitaRateForFood("steak"));
    }
    @Test
    public void setPerCapitaRateForBeverages_increasesRateBy10ForOpenBar_10() throws Exception {
        Event testEvent = new Event();
        testEvent.setPerCapitaRateForBeverages("open bar");
        assertEquals(10, testEvent.getPerCapitaRate());
    }

    @Test
    public void setPerCapitaRateForBeverages_increasesRateBy8ForBeerAndWine_8() throws Exception {
        Event testEvent = new Event();
        testEvent.setPerCapitaRateForBeverages("beer and wine");
        assertEquals(8, testEvent.getPerCapitaRate());
    }
    @Test
    public void setPerCapitaRateForBeverages_increasesRateBy8ForSoftDrinks_4() throws Exception {
        Event testEvent = new Event();
        testEvent.setPerCapitaRateForBeverages("soft drinks");
        assertEquals(4, testEvent.getPerCapitaRate());
    }

    @Test
    public void setPerCapitaRateForBeverages_increasesRateBy0ForInvalidInput_0() throws Exception {
        Event testEvent = new Event();
        testEvent.setPerCapitaRateForBeverages("adkfaskldbfc");
        assertEquals(0, testEvent.getPerCapitaRate());
    }



    @Test
    public void setPerCapitaRateForBeverages_checksForInvalidityOfBevInput_false() throws Exception {
        Event testEvent = new Event();
        testEvent.setPerCapitaRateForBeverages("dhfsn");
        assertEquals(false,testEvent.setPerCapitaRateForBeverages("dhfsn"));
    }

    @Test
    public void setPerCapitaRateForBeverages_checksForBValidityOfBevInput_true() throws Exception {
        Event testEvent = new Event();
        testEvent.setPerCapitaRateForBeverages("open bar");
        assertEquals(true,testEvent.setPerCapitaRateForBeverages("open bar"));
    }

    @Test
    public void setEntertainmentFee_increasesFeeBy600ForBand_600() throws Exception{
        Event testEvent = new Event();
        testEvent.setEntertainmentFee("live band");
        assertEquals(600,testEvent.getEntertainmentFee());
    }

    @Test
    public void setEntertainmentFee_increasesFeeBy300ForDj_300() throws Exception{
        Event testEvent = new Event();
        testEvent.setEntertainmentFee("dj");
        assertEquals(300,testEvent.getEntertainmentFee());
    }

    @Test
    public void setEntertainmentFee_increasesFeeBy200ForComedian_200() throws Exception{
        Event testEvent = new Event();
        testEvent.setEntertainmentFee("comedian/mc");
        assertEquals(200,testEvent.getEntertainmentFee());
    }

    @Test
    public void setEntertainmentFee_increasesFeeBy0ForInvalidChoice_0() throws Exception{
        Event testEvent = new Event();
        testEvent.setEntertainmentFee("ckjsdfgkc");
        assertEquals(0,testEvent.getEntertainmentFee());
    }

    @Test
    public void setEntertainmentFee_checkInvalidityOfEntertainmentEntry_false() throws Exception{
        Event testEvent = new Event();
        testEvent.setEntertainmentFee("jyfkhf");
        assertEquals(false, testEvent.setEntertainmentFee("jyfkhf"));
    }

    @Test
    public void setEntertainmentFee_checkInvalidityOfEntertainmentEntry_true() throws Exception{
        Event testEvent = new Event();
        testEvent.setEntertainmentFee("dj");
        assertEquals(true, testEvent.setEntertainmentFee("dj"));
    }

    @Test
    public void setTotalCost_checksTotalCostCalculationAccuracy_2300() throws Exception{
        Event testEvent = new Event();
        testEvent.setAttendees(100);
        testEvent.setPerCapitaRateForFood("steak");
        testEvent.setPerCapitaRateForBeverages("open bar");
        testEvent.setEntertainmentFee("dj");
        assertEquals(2300, testEvent.setTotalCost());
    }

    @Test
    public void setTotalCost_checksFuneralCouponDeduction_2100() throws Exception{
        Event testEvent = new Event();
        testEvent.setAttendees(100);
        testEvent.setPerCapitaRateForFood("steak");
        testEvent.setPerCapitaRateForBeverages("open bar");
        testEvent.setEntertainmentFee("dj");
        testEvent.setTotalCost();
        testEvent.discountCost("funeral");
        assertEquals(2100, testEvent.getTotalCost());
    }

    @Test
    public void setTotalCost_checksForRaveCouponDeduction_2200() throws Exception{
        Event testEvent = new Event();
        testEvent.setAttendees(100);
        testEvent.setPerCapitaRateForFood("steak");
        testEvent.setPerCapitaRateForBeverages("open bar");
        testEvent.setEntertainmentFee("dj");
        testEvent.setTotalCost();
        testEvent.discountCost("rave");
        assertEquals(2200, testEvent.getTotalCost());
    }

    @Test
    public void setTotalCost_checksForInvalidCouponDeduction_2300() throws Exception{
        Event testEvent = new Event();
        testEvent.setAttendees(100);
        testEvent.setPerCapitaRateForFood("steak");
        testEvent.setPerCapitaRateForBeverages("open bar");
        testEvent.setEntertainmentFee("dj");
        testEvent.setTotalCost();
        testEvent.discountCost("jksdhgfksjd");
        assertEquals(2300, testEvent.getTotalCost());
    }

    @Test
    public void setTotalCost_checksForInvalidCouponEntry_false() throws Exception{
        Event testEvent = new Event();
        testEvent.discountCost("jksdhgfksjd");
        assertEquals(false, testEvent.discountCost("jksdhgfksjd"));
    }

    @Test
    public void setTotalCost_checksForValidCouponEntry_true() throws Exception{
        Event testEvent = new Event();
        testEvent.discountCost("rave");
        assertEquals(true, testEvent.discountCost("rave"));
    }





}