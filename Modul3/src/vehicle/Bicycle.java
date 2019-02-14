package vehicle;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Bicycle extends Vehicle {

    private int gears=0;

    private java.util.Calendar productionDate = new GregorianCalendar(0000,00,00);

    SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");


    public Bicycle() {

    }


    public Bicycle(String colour, String name,  int model,int price, String serialNumber, int direction, int gears) {
        super();
        super.setColour(colour);
        super.setName(name);
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
            super.setDirection(degrees);

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
        return String.format(super.toString() + " Gears: %d Production Date: %td-%tm-%tY%n", getGears(), getProductionDate());

    }


}