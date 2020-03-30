package pro.edu;

public class AbstractFactory {

    public static IFigure create(double a, double b, double c){

        if (c == 0) return new Rectangle(a, b);

        return new Triangle(a, b, c );
    }

}
