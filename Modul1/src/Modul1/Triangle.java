package Modul1;

public class Triangle extends GeometricObject {

    private double side1, side2, side3;

    public Triangle(){

        super();

        side1 = 1.0;
        side2 = 1.0;
        side3 = 1.0;

    }

    public Triangle(double lik){
        this(lik, lik, lik);

    }

    public Triangle(double side1, double side2, double side3){

        super();

        setSide1(side1);
        setSide2(side2);
        setSide3(side3);

    }

    public Triangle(double side1, double side2, double side3, String color, boolean filled){

        super(color, filled);

        setSide1(side1);
        setSide2(side2);
        setSide3(side3);

    }

    public double getSide1(){
        return this.side1;
    }

    public void setSide1(double side1){
        this.side1 = side1;
    }

    public double getSide2(){
        return this.side2;
    }

    public void setSide2(double side2){
        this.side2 = side2;
    }

    public double getSide3(){
        return this.side3;
    }

    public void setSide3(double side3){
        this.side3 = side3;
    }


    public double getArea(){

        double s = (this.side1 + this.side2 + this.side3)/2;

        double triangleArea = Math.sqrt(s*(s-this.side1)*(s-this.side2)*(s-this.side3));

        return triangleArea;
    }

    public double getPerimeter(){

        double trianglePerimeter = this.side1+this.side2+this.side3;

        return trianglePerimeter;
    }


    @Override
    public String toString() {

        return String.format("Sides: %.2f, %.2f, %.2f%n", getSide1(), getSide2(), getSide3()) + super.toString();

    }

    @Override
    public boolean equals(Object other){
        if (other instanceof Triangle){
            return (side1 == ((Triangle)other).side1 && side2 == ((Triangle)other).side2 && side3 == ((Triangle)other).side3);
        }
        else{
            return this == other;
        }


    }

}
