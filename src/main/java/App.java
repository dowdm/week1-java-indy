import models.Event;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class App {
    public static void main(String[] args) {
        boolean programRunning = true;
        while(programRunning){
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Welcome to Matt's Event Planning, Where Funerals and Raves are Cheaper!");
                try{
                    Event newEvent = new Event();
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
                            System.out.println("Please choose a beverage option: open bar, beer and wine, or soft drinks.");
                            String inputBeverages = bufferedReader.readLine();
                            if (newEvent.setPerCapitaRateForBeverages(inputBeverages.toLowerCase())) {
                                newEvent.setBeverages(inputBeverages.toLowerCase());
                                System.out.println("Please choose an entertainment option: live band, dj, or comedian/mc.");
                                String inputEntertainment = bufferedReader.readLine();
                                if (newEvent.setEntertainmentFee(inputEntertainment.toLowerCase())){
                                    newEvent.setEntertainment(inputEntertainment.toLowerCase());
                                    newEvent.setTotalCost();
                                    System.out.println("Now lets review.");
                                    System.out.println("Attendees: " + newEvent.getAttendees());
                                    System.out.println("Food: " + newEvent.getFood());
                                    System.out.println("Beverages: " + newEvent.getBeverages());
                                    System.out.println("Entertainment: " + newEvent.getEntertainment());
                                    System.out.println("Total: $" + newEvent.getTotalCost());
                                    System.out.println("Do you have a discount code: yes or no?");
                                    String inputDiscountPrompt = bufferedReader.readLine();
                                    if (inputDiscountPrompt.toLowerCase().equals("yes")){
                                        System.out.println("Please enter the code:");
                                        String inputDiscountCode = bufferedReader.readLine();
                                        if (inputDiscountCode.toLowerCase().equals("funeral") || inputDiscountCode.toLowerCase().equals("rave")){
                                            newEvent.discountCost(inputDiscountCode.toLowerCase());
                                            System.out.println("Now lets review.");
                                            System.out.println("Attendees: " + newEvent.getAttendees());
                                            System.out.println("Food: " + newEvent.getFood());
                                            System.out.println("Beverages: " + newEvent.getBeverages());
                                            System.out.println("Entertainment: " + newEvent.getEntertainment());
                                            System.out.println("Your Discounted Total: $" + newEvent.getTotalCost());
                                            System.out.println("----------------------------------------------------");
                                        }
                                    }else if (inputDiscountPrompt.toLowerCase().equals("no")) {
                                        System.out.println("Thanks for your booking");
                                        programRunning = false;
                                    }
                                     else {
                                        System.out.println("Invalid entry");
                                    }
                                } else {
                                    System.out.println("I didn't understand that, please try again.");
                                }
                            } else {
                                System.out.println("I didn't understand that, please try again.");
                            }
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

