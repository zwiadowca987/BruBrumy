package com.company;

import java.util.Scanner;

public class Main {

    private static Scanner Input = new Scanner(System.in);

    private static int numer = 0;

    public static int menu() {
        System.out.println("Do you want to do something with this car?");
        System.out.println("1. Yes, incrase actual speed");
        System.out.println("2. Yes, decrease actual speed");
        System.out.println("3. Yes, incrase actual amount of people in car");
        System.out.println("4. Yes, decrase actual amount of people in car");
        System.out.println("5. Yes, change owner");
        System.out.println("6. No, go to the next car");

        return Input.nextInt();
    }

    public static void main(String[] args) {
        Vehicle car1 = new Vehicle();
        car1.getInputFromUser();

        System.out.println(car1.toString());

        while(numer < 6) {
            switch(menu()) {
                case 1:
                    car1.biggerSpeed();
                    break;

                case 2:
                    car1.lowerSpeed();
                    break;

                case 3:
                    car1.getIn();
                    break;

                case 4:
                    car1.getOut();
                    break;

                case 5:
                    car1.changeOwner();
                    break;
            }
        }

        System.out.println(car1.toString());

        Vehicle car2 = new Vehicle();
        car2.getInputFromUser();

        System.out.println(car2.toString());

        while(numer < 6) {
            switch(menu()) {
                case 1:
                    car1.biggerSpeed();
                    break;

                case 2:
                    car1.lowerSpeed();
                    break;

                case 3:
                    car1.getIn();
                    break;

                case 4:
                    car1.getOut();
                    break;

                case 5:
                    car1.changeOwner();
                    break;
            }
        }

        System.out.println(car2.toString());
    }
}
