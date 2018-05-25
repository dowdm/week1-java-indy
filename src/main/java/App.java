import models.Event;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class App {
    public static void main(String[] args) {
        boolean programRunning = true;
        while(programRunning){
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Welcome to Matt's Event Planning, Where Funerals and Raves are Cheaper");
            Event newEvent = new Event();
                try{
                    System.out.println("Please make a selection: book an event or exit ");
                    String userEntry = bufferedReader.readLine();
                    if(userEntry.toLowerCase().equals("book an event")) {
                        System.out.println("How many people will be attending the event?");
                        String inputAttendees = bufferedReader.readLine();
                        newEvent.setAttendees(Integer.parseInt(inputAttendees));
                        System.out.println("Please choose a food option: steak, vegan, or snacks");
                        String inputFood = bufferedReader.readLine();
                        if (newEvent.setPerCapitaRateForFood(inputFood.toLowerCase())) {
                            newEvent.setFood(inputFood.toLowerCase());
                            newEvent.setPerCapitaRateForFood(inputFood.toLowerCase());
                        } else {
                            System.out.println("I didn't understand that, please try again.");
                        }
                        System.out.println("Please choose a beverage option: open bar, beer and wine, or soft drinks.");
                        String inputBeverages = bufferedReader.readLine();
                        if (newEvent.setPerCapitaRateForBeverages(inputBeverages.toLowerCase())) {
                            newEvent.setBeverages(inputBeverages.toLowerCase());
                            newEvent.setPerCapitaRateForBeverages(inputBeverages.toLowerCase());
                        } else {
                            System.out.println("I didn't understand that, please try again.");
                        }
                    } else if(userEntry.toLowerCase().equals("exit")){
                        programRunning =false;
                    } else{
                        System.out.println("Sorry, I don't understand your selection. Please try again");
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

