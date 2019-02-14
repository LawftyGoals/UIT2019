package vehicle;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Bicycle extends Vehicle {

    private int gears=0;

    private java.util.Calendar productionDate = new GregorianCalendar().getInstance();


    public Bicycle() {

    }


    public Bicycle(String name, String colour, int price, int model, String serialNumber, int direction, int gears) {
        super();
        super.setName(name);
        super.setColour(colour);
        super.setSerialNumber(serialNumber);

        super.setModel(model);
        super.setPrice(price);
        super.setDirection(direction);

        this.setGears(gears);

    }


    @Override

    public void setAllFields(){

        super.setAllFields();



    }


    @Override
    public void turnRight(int degrees){
        if(degrees >=0 && degrees <=360){
            super.setDirection(degrees);

        } else if (degrees>360){
            super.setDirection(degrees % 360);
        }


    }


    @Override
    public void turnLeft(int degrees){
        if(degrees >=0 && degrees <=360){
            super.setDirection(360-degrees);

        } else if (degrees>360){
            super.setDirection(360-(degrees % 360));

        }
    }


    public int getGears(){
        return this.gears;

    }


    public Calendar getProductionDate(){
        return productionDate;

    }


    public void setProductionDate(Calendar calendar){
        this.productionDate = calendar;
    }


    public void setGears(int gears){
        this.gears = gears;

    }

    @Override
    public String toString(){
        return String.format(super.toString() + " Gears: %d Production Date: %tF", getGears(), getProductionDate());

    }

    @Override
    public void accelerate(double speedFactor){

        if (super.getSpeed() == 0){
            if (speedFactor*0.3 > Driveable.MAX_SPEED_BIKE){
                super.setSpeed(Driveable.MAX_SPEED_BIKE);
            } else {
                super.setSpeed(speedFactor*0.3);
            }

        } else {
            if (super.getSpeed()*speedFactor > Driveable.MAX_SPEED_BIKE) {
                super.setSpeed(Driveable.MAX_SPEED_BIKE);
            } else {
                super.setSpeed(super.getSpeed() * speedFactor);
            }
        }

        System.out.printf("Vehicle is traveling at %.2f km/h.%n", super.getSpeed());

    }

    @Override
    public void breaks(double speedFactor) {


        if (speedFactor == 0){
            super.setSpeed(0);
            System.out.printf("Vehicle has stopped. (%.2f km/h).%n", super.getSpeed());
        } else {
            super.setSpeed(super.getSpeed()/speedFactor);
            System.out.printf("Vehicle is traveling at %.2f km/h.%n", super.getSpeed());
        }

    }


}