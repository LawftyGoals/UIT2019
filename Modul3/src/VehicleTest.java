/***  TestVehicles oppretter Bicycle og Car objekter, legger disse i et ArrayList*  Lar bruker manipulere data i arrayet på forskjellige måter*/
import java.util.*;
import java.io.*;


public class VehicleTest {public static void main(String[] args) {

    VehicleTest vtest = new VehicleTest();

    try {

        vtest.menuLoop();

    } catch(IOException e) {

        System.out.println("IO Exception!");
        System.exit(1);

    } catch(CloneNotSupportedException e) {

        System.out.println("CloneNotSupportedException");
        System.exit(2);

    } catch(ClassNotFoundException e){
        System.out.println("ClassNotFoundException");
        System.exit(3);

    } catch(IllegalAccessException e){
        System.out.println("IllegalAccessException");
        System.exit(4);

    } catch(InstantiationException e){
        System.out.println("InstantiationException");
        System.exit(5);

    }
}

    private void menuLoop() throws IOException, CloneNotSupportedException, ClassNotFoundException, IllegalAccessException, InstantiationException {

        Scanner scan = new Scanner(System.in);

        ArrayList<Vehicle> arr = new ArrayList<Vehicle>();

        Vehicle vehicle;

        File saveFile = new File("/home/oliver/IdeaProjects/UITProg1/Modul3/src/saveFile.txt");

        Scanner in = new Scanner(saveFile).useLocale(Locale.US);

        in.useDelimiter(",");

        while(in.hasNext()){
            String vehClass = in.next();
            Class veh1 = Class.forName(vehClass);

            Vehicle veh = (Vehicle) veh1.newInstance();


            if (veh1.getName().equals("Car")){
                veh.readData(in);
                arr.add(veh);

                System.out.println("Reading vehicle from file: " + veh);

            } else if (veh1.getName().equals("Bicycle")){

                veh.readData(in);
                arr.add(veh);

                System.out.println("Reading vehicle from file: " + veh);

            }

        }

        in.close();

        PrintWriter clear = new PrintWriter(saveFile);
        clear.close();


        arr.add(new Car("Volvo","Black",85000,2010,"1010-11",163,0));
        arr.add(new Bicycle("Diamant","yellow",4000,1993,"BC100",10,0));
        arr.add(new Car("Ferrari Testarossa","red",1200000,1996,"A112",350,0));
        arr.add(new Bicycle("DBS","pink",5000,1994,"42",10,0));

        while(true) {
            System.out.println("1...................................New car");
            System.out.println("2...............................New bicycle");
            System.out.println("3......................Find vehicle by name");
            System.out.println("4..............Show data about all vehicles");
            System.out.println("5.......Change direction of a given vehicle");
            System.out.println("6.........................Test Clone Method");
            System.out.println("7.......................Test Drive Vehicles");
            System.out.println("8..............................Exit program");
            System.out.println(".............................Your choice?");

            int choice = scan.nextInt();

            System.out.println("");


            switch (choice) {

                case 1:
                    vehicle = new Car();
                    vehicle.setAllFields();
                    arr.add(vehicle);
                    System.out.println("");
                    //legg til en ny bil
                    break;

                case 2://legg til en ny sykkel
                    vehicle = new Bicycle();
                    vehicle.setAllFields();
                    arr.add(vehicle);
                    System.out.println("");
                    break;

                case 3:
                    Scanner sc = new Scanner(System.in);
                    System.out.print("Vehicle name: ");
                    String name = sc.nextLine();
                    boolean carFound = false;
                    for (int i = 0; i < arr.size(); i++){
                        if (arr.get(i).getName().toLowerCase().contains(name.toLowerCase())){
                            System.out.println(arr.get(i).toString());
                            carFound = true;

                            //hvis vi går utifra at det er kun et bil med unikt navn kan du inkludere break; her.
                        }
                    }

                    if(carFound==false){
                        System.out.println("Car not found, are you sure the name is right?");
                    }
                    System.out.println("");
                        //vis info om gitt kjøretøy
                        break;

                case 4://vis info om alle kjøretøy
                    for (int i = 0; i < arr.size(); i++){
                        System.out.println(arr.get(i).toString());

                    }
                    System.out.println("");
                    break;

                case 5:// Finn kjøretøy med gitt navn, sett ny retning

                    Scanner sci = new Scanner(System.in);

                    System.out.print("Vehicle name: ");

                    String nameDir = sci.nextLine();

                    boolean carFoundDir = false;

                    for (int i = 0; i < arr.size(); i++){
                        if (arr.get(i).getName().toLowerCase().contains(nameDir.toLowerCase())){

                            System.out.print("Direction (l/r): ");
                            String turnDir = new Scanner(System.in).nextLine();

                            System.out.print("Degrees: ");
                            int degTurn = new Scanner(System.in).nextInt();

                            if (turnDir.equals("l")){
                                arr.get(i).turnLeft(degTurn);

                            } else if (turnDir.equals("r")){
                                arr.get(i).turnRight(degTurn);

                            } else {
                                System.out.println("Invalid direction.");

                            }

                            carFoundDir = true;
                            break;
                        }
                    }
                    if(carFoundDir==false){
                        System.out.println("Car not found, are you sure the name is right?");
                    }

                    break;

                case 6:
                    Car newCar = new Car("Toyota","Black",20000,2005,"11-116",35,116);

                    try {

                        Car newCarClone = (Car)newCar.clone();

                        newCarClone.setProductionDate(new GregorianCalendar(1000, 10, 10));



                        if (newCar.getProductionDate() != newCarClone.getProductionDate()) {
                            System.out.println("Date objects are separate, deep copy.");
                            System.out.printf("%tF%n", newCar.getProductionDate());
                            System.out.printf("%tF%n%n", newCarClone.getProductionDate());
                        } else {
                            System.out.println("Data objects not seperate, shallow copy.");
                            System.out.printf("%tF%n", newCar.getProductionDate());
                            System.out.printf("%tF%n%n", newCarClone.getProductionDate());
                        }


                    } catch(CloneNotSupportedException e) {
                        System.out.println("Error cloning, clone not supported.");
                    }
                    break;

                case 7:
                    Car sTCar = new Car("Toyota","Black",20000,2005,"11-116",35,116);
                    Bicycle sTBicycle = new Bicycle("GitHub", "Brown", 500, 1962, "J1FFY", 5, 2);


                    System.out.println("Car: ");
                    sTCar.accelerate(50);
                    sTCar.accelerate(5);
                    sTCar.breaks(40);
                    sTCar.breaks(0);
                    System.out.println("");


                    System.out.println("Bicycle: ");
                    sTBicycle.accelerate(50);
                    sTBicycle.accelerate(5);
                    sTBicycle.breaks(40);
                    sTBicycle.breaks(0);
                    System.out.println("");

                case 8:
                    scan.close();

                    try(PrintWriter writer = new PrintWriter(saveFile)){

                        for(int k = 0; k < arr.size(); k++){
                            System.out.println("Writing vehicle to file:" + arr.get(k));

                            arr.get(k).writeData(writer);

                        }


                    } catch(IOException e){
                        System.out.println("IOException");

                    }



                    System.exit(0);


                default:
                    System.out.println("Wrong input!");

            }

        }

    }

}

