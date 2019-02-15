import java.io.IOException;
import java.io.PrintWriter;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Car extends Vehicle {

    private int power;

    private java.util.Calendar productionDate = new GregorianCalendar().getInstance();

    public Car(){

    }

    public Car(String name, String colour, int price, int model, String serialNumber, int direction, int power){
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

    @Override
    public void accelerate(double speedFactor){

        if (super.getSpeed() == 0){
            if (speedFactor*0.5 > Driveable.MAX_SPEED_CAR){
                super.setSpeed(Driveable.MAX_SPEED_CAR);
            } else {
                super.setSpeed(speedFactor*0.5);
            }

        } else {
            if (super.getSpeed()*speedFactor > Driveable.MAX_SPEED_CAR) {
                super.setSpeed(Driveable.MAX_SPEED_CAR);
            } else {
                super.setSpeed(super.getSpeed() * speedFactor);
            }
        }

        System.out.printf("Vehicle is traveling at %.2f km/h.%n", super.getSpeed());

    };

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

    @Override
    public void writeData(PrintWriter out) throws IOException {

        out.printf("%s,", getClass().getName());
        super.writeData(out);
        out.printf("%s,", getPower());

    }

    @Override
    public void readData(Scanner in) throws IOException{

        Calendar cal = Calendar.getInstance();
        super.readData(in);
        setPower(in.nextInt());
        /*
        try {

            Date prodDateTry = new SimpleDateFormat("yyyy-MM-dd").parse(in.next());
            cal.setTime(prodDateTry);
            setBuyingDate(cal);

        } catch (ParseException e) {
            e.printStackTrace();
        }*/

    }


}
