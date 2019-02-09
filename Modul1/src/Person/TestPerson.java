package Person;

import java.util.Scanner;

public class TestPerson {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args){

    Employee em = new Employee("Face", "Balls", "Hit", "Jack",150);

    Student stu = new Student("Stewart", "Stu's", "333", "stu@uni.uni", 1, Student.biology);

    Faculty fac = new Faculty("Bob", "Place", "444", "bobmail",150,"BOB001", Faculty.Professor);

    Staff sta = new Staff("Jeff", "Jeff's Place", "555", "Jeff@Jeffdyjeff.jeff", 90000000, "jeffinator");

    System.out.printf(sta.toString() + "%n%n" + fac.toString() + "%n%n" + stu.toString());

    }
}
