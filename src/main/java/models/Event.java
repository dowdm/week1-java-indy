package models;

public class Event {
    private int attendees;
    private String food;
    private String beverages;
    private String entertainment;
    private int perCapitaRate = 0;

    public Event(){
        this.attendees = attendees;
        this.food = food;
        this.beverages = beverages;
        this.entertainment= entertainment;
        this.perCapitaRate = perCapitaRate;
    }
    public int getAttendees() {
        return attendees;
    }

    public void setAttendees(int attendees) {
        this.attendees = attendees;
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public String getBeverages() {
        return beverages;
    }

    public void setBeverages(String beverages) {
        this.beverages = beverages;
    }


    public String getEntertainment() {
        return entertainment;
    }

    public void setEntertainment(String entertainment) {
        this.entertainment = entertainment;
    }

    public int getPerCapitaRate() {
        return perCapitaRate;
    }

    public boolean setPerCapitaRateForFood(String food){
        if(food.equals("steak")){
            perCapitaRate += 10;
            return true;
        } else if (food.equals("vegan")){
            perCapitaRate += 8;
            return true;
        } else if (food.equals("snacks")){
            perCapitaRate += 4;
            return true;
        } else {
            perCapitaRate += 0;
            return false;
        }
    }
    public boolean setPerCapitaRateForBeverages(String beverages){
        if(beverages.equals("open bar")){
            perCapitaRate += 10;
            return true;
        } else if (beverages.equals("beer and wine")){
            perCapitaRate += 8;
            return true;
        } else if (beverages.equals("soft drinks")){
            perCapitaRate += 4;
            return true;
        } else {
            perCapitaRate += 0;
            return false;
        }
    }



}
