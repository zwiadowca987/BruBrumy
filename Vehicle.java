package com.company;

import java.util.Scanner;

public class Vehicle {
    private int maxSpeed;
    private int actualSpeed;
    private int aaop; //actual_amount_of_passengers
    private int maop; //max_amount_of_passengers
    private String ownerName;
    private int bufor;
    Scanner Input = new Scanner(System.in);

    public Vehicle() {
        maxSpeed = 0;
        actualSpeed = 0;
        aaop = 0;
        maop = 0;
        ownerName = "";
    }
    
    {
        maxSpeed = 100;
        maop = 5;
        ownerName = "Ja";
    }

    private int numbersInput(String a) {
        System.out.printf(a);
        return Input.nextInt();
    }

    private String wordInput(String a) {
        System.out.printf(a);
        return Input.nextLine();
    }

    public void getInputFromUser() {
        maxSpeed = numbersInput("How speed can your car drive: ");
        maop = numbersInput("How many people can sit in this car at once: ");
        ownerName = wordInput("What name have the owner: ");
    }

    public void biggerSpeed() {
        bufor = actualSpeed;
        actualSpeed += numbersInput("How much do you want to increase speed of your car: ");
        if(actualSpeed > maxSpeed) {
            System.out.println("Your car can not be faster than it can be ;)");
            actualSpeed = bufor;
        }
    }

    public void lowerSpeed() {
        bufor = actualSpeed;
        actualSpeed -= numbersInput("How much do you want to decrease speed of your car: ");
        if(actualSpeed < 0) {
            System.out.println("Your car can not be slower than 0 mph or km/s ;)");
            actualSpeed = bufor;
        }
    }

    public void getIn() {
        bufor = aaop;
        aaop += numbersInput("How many people will enter the car: ");
        if(aaop > maop) {
            System.out.println("There are to many of people in car");
            aaop = bufor;
        }
    }

    public void getOut() {
        bufor = aaop;
        aaop -= numbersInput("How many people will exit the car: ");
        if(aaop < 0) {
            System.out.println("How it will work? Theres nobody in car and in the same moment somebody is exiting. Fascinating");
            aaop = bufor;
        }
    }

    public void changeOwner() {
        ownerName = wordInput("Tell me the name of the new owner: ");
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder(ownerName);
        result.append(" has a car with top speed ");
        result.append(maxSpeed);
        result.append(", actual speed ");
        result.append(actualSpeed);
        result.append(", ");
        result.append(maop);
        result.append(" people can sit there at once and ");
        result.append(aaop);
        result.append(" people now.");

        return result.toString();
    }
}
