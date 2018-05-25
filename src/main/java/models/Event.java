package models;

public class Event {
    private int attendees;



    private String food;
    private String entertainment;
    private int perCapitaRate = 0;

    public Event(int attendees, String food, String entertainment){
        this.attendees = attendees;
        this.food = food;
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

    public String getEntertainment() {
        return entertainment;
    }

    public void setEntertainment(String entertainment) {
        this.entertainment = entertainment;
    }

    public int getPerCapitaRate() {
        return perCapitaRate;
    }

    public void setPerCapitaRate(int perCapitaRate) {
        this.perCapitaRate = perCapitaRate;
    }



}
