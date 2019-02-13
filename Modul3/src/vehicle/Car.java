package vehicle;

public class Car extends Vehicle {

    private int power;

    public Car(){

    }

    public Car(String colour, String name, String serialNumber, int model,int price, int direction, int power){
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
        System.out.print("Name: ");
        super.setName(sc.nextLine());

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

}
