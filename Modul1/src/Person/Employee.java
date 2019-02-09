package Person;

import java.time.LocalDate;

public class Employee extends Person {
    LocalDate date = LocalDate.of(1900,1,1);
    private java.util.GregorianCalendar dateCreated;

    private double hourlyWage;

    Employee(){
        super();
        dateCreated = new java.util.GregorianCalendar();
        hourlyWage = 0;
    }

    Employee(String name, String address, String phoneNr, String email, double hourlyWage){
        super(name, address, phoneNr, email);
        dateCreated = new java.util.GregorianCalendar();
        setHourlyWage(hourlyWage);
    }

    public double getHourlyWage(){
        return this.hourlyWage;
    }

    public void setHourlyWage(double hourlyWage){
        this.hourlyWage = hourlyWage;

    }

    public java.util.GregorianCalendar getDateCreated() {
        return dateCreated;

    }

    @Override
    public String toString() {
        return String.format("Employed on: %tF %1$tT %nHourly Wage: %.2f %n" + super.toString(), getDateCreated(), getHourlyWage());

    }

}