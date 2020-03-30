package pro.edu;

public class Triangle implements IFigure{
    //   c - bigger side =>  a + b > c
    private double a;
    private double b;
    private double c;

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    @Override
    public String toString() {
        return this.toStringBuilder();
    }

    private String toStringBuilder(){

        String string = "";

        if(a==b && b==c) string = " Равносторнний теугольник {" +
        "a=" + a +
                ", b=" + b +
                ", c=" + c +
                '}';

        return  string;
    }


    @Override
    public double getPerimeter() {
        return 0;
    }

    @Override
    public double getArea() {
        return 0;
    }




}
