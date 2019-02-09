package Person;

public class Staff extends Employee{

    private String title;

    Staff(){
        title = "Undefined";
    }

    Staff(String name, String address, String phoneNr, String email, double hourlyWage, String title){
        super(name, address, phoneNr, email, hourlyWage);
        getTitle();
    }

    public void setTitle(String title){
        this.title = title;
    }

    public String getTitle(){
        return this.title;
    }


    /*
    private String getRankAsString(int title){
        switch(title){
            case 1:
                return String.format("Cleaner");
            case 2:
                return String.format("Gardener");
            case 3:
                return String.format("Plumber");
            case 4:
                return String.format("Handyman");
            default:
                return String.format("Unspecified");
        }
    }*/

    @Override
    public String toString(){
        return String.format("Staff:%nTitle: %s%n" + super.toString(), getTitle());
    }

}
