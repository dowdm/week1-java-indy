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

    public void setPerCapitaRate(String food, String beverages, String entertainment){
        if(food.equals("steak")){
            perCapitaRate += 10;
        } else {
            perCapitaRate += 0;
        }
    }



}
