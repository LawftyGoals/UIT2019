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

    public abstract void turnLeft(int degrees);
    public abstract void turnRight(int degrees);

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public int getModel() {
        return model;
    }

    public void setModel(int model) {
        this.model = model;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getDirection() {
        return direction;
    }

    public void setDirection(int direction) {
        this.direction = direction;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public String toString(){
        return String.format("Name: %s, Colour: %s, Price: %s, Model: %d, Serial#: %d, Directionn: %d, Speed: %f", getName(),getColour(), getPrice(), getModel(), getSerialNumber(), getDirection(), getSpeed();
    }

}
