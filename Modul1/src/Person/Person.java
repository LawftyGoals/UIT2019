package Person;

public class Person {

    private String name, address, phoneNr, email;

    Person(){
        name = "unspesified";
        address = "unspesified";
        phoneNr = "unspesified";
        email = "unspesified";
    }

    Person(String name, String address, String phoneNr, String email){
        setName(name);
        setAddress(address);
        setPhoneNr(phoneNr);
        setEmail(email);
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getAddress(){
        return this.address;
    }

    public void setAddress(String address){
        this.address = address;
    }

    public String getPhoneNr(){
        return this.phoneNr;
    }

    public void setPhoneNr(String phoneNr){
        this.phoneNr = phoneNr;
    }

    public String getEmail(){
        return this.email;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public String toString(){
        return String.format("Name: %s%nAddress:  %s%nPhone number: %s%nE-mail:  %s%n", getName(), getAddress(), getPhoneNr(), getEmail());
    }


}



