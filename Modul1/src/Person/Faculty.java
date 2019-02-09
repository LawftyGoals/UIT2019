package Person;

public class Faculty extends Employee{

    public static final int Lecturer = 1;
    public static final int Professor = 2;
    public static final int Assistant = 3;
    public static final int EmeritusProfessor = 4;

    private int rank;

    private String officeNr;

    Faculty(){
        officeNr = "Undefined";
        rank = 0;
    }

    Faculty(String name, String address, String phoneNr, String email, double hourlyWage, String officeNr, int rank){
        super(name, address, phoneNr, email, hourlyWage);
        setOfficeNr(officeNr);
        setRank(rank);
    }

    public void setOfficeNr(String officeNr){
        this.officeNr = officeNr;
    }

    public String getOfficeNr(){
        return this.officeNr;
    }

    public void setRank(int rank){
        this.rank=rank;
    }

    public int getRank(){
        return this.rank;
    }

    private String getRankAsString(int rank){
        switch(rank){
            case 1:
                return String.format("Lecturer");
            case 2:
                return String.format("Professor");
            case 3:
                return String.format("Assistant");
            case 4:
                return String.format("Emeritus Professor");
            default:
                return String.format("Unspecified");
        }
    }

    @Override
    public String toString(){
        return String.format("Faculty%nOffice: %s%nRank: %s%n" + super.toString(), getOfficeNr(), getRank());
    }

}
