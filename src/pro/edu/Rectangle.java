package pro.edu;

public class Rectangle implements IFigure{

    private double a;
    private double b;


    public Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
    }

    private Rectangle(Rectangle rectangle){

        if (rectangle != null){
                this.a = rectangle.getA();
                this.b = rectangle.getB();
        }
    }

/*
    @Override
    public String toString() {
        return "Rectangle{" +
                "a=" + a +
                ", b=" + b +
                '}';
    }
*/

    public Rectangle clone(){
        return new Rectangle(this);
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



    @Override
    public double getPerimeter() {
        return 0;
    }

    @Override
    public double getArea() {
        return 0;
    }
}
