package vehicle;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Car extends Vehicle {

    private int power;

    private java.util.Calendar productionDate = new GregorianCalendar().getInstance();

    public Car(){

    }

    public Car(String name, String colour, int model, int price, String serialNumber, int direction, int power){
        super();
        super.setName(name);
        super.setColour(colour);
        super.setSerialNumber(serialNumber);

        super.setModel(model);
        super.setPrice(price);
        super.setDirection(direction);

        this.setPower(power);
    }

    @Override
    public void setAllFields(){
        super.setAllFields();
        System.out.print("Power: ");
        this.power = sc.nextInt();
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



    public int getPower(){
        return this.power;

    }



    public Calendar getProductionDate(){
        return productionDate;

    }



    public void setProductionDate(Calendar calendar){
        this.productionDate = calendar;

    }



    public void setPower(int power){
        this.power = power;

    }

    @Override
    public String toString(){
        return String.format(super.toString() + " Gears: %d Production Date: %tF", getPower(), getProductionDate());

    }

    //updated.

}
