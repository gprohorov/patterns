package pro.edu;

public class AbstractFactory2 {

    public static IFigure create(double a, double b, Figure figure){

      switch (figure) {
          case ROMBUS: return new Rombus(a, b);
          case TRIANGLE: return new RectangularTriangle(a, b);
          case REACTANGLE: return new Rectangle(a, b);
          default: return null;
      }
    }

    public static IFigure create(double a, double b, double c) {
        return new Triangle(a, b, c);
    }
}
