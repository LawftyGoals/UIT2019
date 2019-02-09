package vehicle;

import java.util.Scanner;

abstract class Vehicle {

    Scanner sc = new Scanner(System.in);

    private String colour, name, serialNumber;

    private int model, price, direction;

    private double speed = 0;

    public Vehicle(){

    }

    public Vehicle(String colour, String name, String serialNumber, int model,int price, int direction;){

        this.colour = colour;
        this.name = name;
        this.serialNumber = serialNumber;

        this.model = model;
        this.price = price;
        this.direction = direction;


    }

    public void setAllFields(){
        System.out.print("Name: ");
        this.name = sc.nextLine();

        System.out.print("Colour: ");
        this.colour = sc.nextLine();

        System.out.print("Serial Number: ");
        this.serialNumber = sc.nextLine();

        System.out.print("Model: ");
        this.model = sc.nextInt();

        System.out.print("Price: ");
        this.price = sc.nextInt();

        System.out.print("Direction: ");
        this.direction = sc.nextInt();
    }


}
