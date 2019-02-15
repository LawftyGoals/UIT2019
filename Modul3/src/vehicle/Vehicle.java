package vehicle;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.Scanner;

abstract class Vehicle implements Comparable<Vehicle>, Cloneable, Driveable, Fileable{


    Calendar buyingDate = new GregorianCalendar();

    Scanner sc = new Scanner(System.in);

    private String colour, name, serialNumber;

    private int model, price, direction;

    private double speed = 0;

    public Vehicle(){

    }

    public Vehicle(String colour, String name, String serialNumber, int model,int price, int direction){

        this.colour = colour;
        this.name = name;
        this.serialNumber = serialNumber;
        buyingDate = new GregorianCalendar().getInstance();

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

    public Calendar getBuyingDate(){
        return this.buyingDate;
    }

    public void setBuyingDate(Calendar c){
        this.buyingDate = c;
    }

    public String toString(){
        return String.format("Name: %s, Colour: %s, Price: %d, Model: %d, Serial#: %s, Direction: %d, Speed: %.2f, Buying date: %tF", getName(),getColour(), getPrice(), getModel(), getSerialNumber(), getDirection(), getSpeed(), getBuyingDate());
    }

    @Override
    public Object clone() throws CloneNotSupportedException {

        return super.clone();

    }

    public int compareTo(Vehicle o) {

        if (getPrice() > o.getPrice())

            return 1;

        else if (getPrice() < o.getPrice())

            return -1;

        else return 0;

    }

    @Override
    public void stop(){
        setSpeed(0);
        System.out.printf("Speed has been set to 0");
    }


    @Override
    public void writeData(PrintWriter out) throws IOException{
        out.printf("%s,%s,%s,%s,%s,%s,%s,%s", getName(), getColour(), getPrice(), getModel(), getSerialNumber(), getDirection(), getSpeed(), getBuyingDate());

    }

    @Override
    public void readData(Scanner in) throws IOException{

        File file = new File("saveFile.txt");
        boolean cont = true;

        do {

            try(Scanner saveReader = new Scanner(file).useLocale(Locale.US);){

                while(saveReader.hasNext()){
                    sc.nextDouble();
                    counter++;
                    cont = true;
                }

                average = sum/counter;

                System.out.println("Sum: " + sum);
                System.out.println("Average: " + average);



            }
        } while (cont);


        in.useDelimiter(",");
        String vehClass = in.next();                    // leser klassenavnet fra filen
        Class veh1 = Class.forName(vehClass);           // oppretter Class objekt for angitt klassenavn (String)
        Vehicle veh = (Vehicle)veh1.newInstance();      // oppretter ny instans av Vehicle

    }



}
