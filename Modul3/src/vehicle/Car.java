package vehicle;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.lang.*;

public class Car extends Vehicle {

    private int power;

    private java.util.Calendar productionDate = new GregorianCalendar(0000,00,00);

    SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");


    public Car(){

    }

    public Car(String colour, String name, int model, int price, String serialNumber, int direction, int power){
        super();
        super.setColour(colour);
        super.setName(name);
        super.setSerialNumber(serialNumber);

        super.setModel(model);
        super.setPrice(price);
        super.setDirection(direction);

        this.power = power;
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

            super.setDirection(degrees);

        } else if (degrees>360){

            super.setDirection(degrees % 360);

        }

    }



    public int getPower(){

        return this.power;

    }



    public Calendar getProductionDate(){

        return format.format(productionDate.getTime());

    }



    public void setProductionDate(Calendar calendar){

        this.productionDate = calendar;

    }



    public void setPower(int power){

        this.power = power;

    }



    @Override

    public String toString(){

        return String.format(super.toString() + " Gears: %d", getPower());

    }

}
