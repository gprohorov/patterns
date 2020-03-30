package pro.edu;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello? world!");

        Student john = new Student("John Lennon", 22);
        Student paul = StudentFactory.create("Paul McCartney", 21);

        System.out.println(john);
        System.out.println(paul);

        IFigure f1 =  AbstractFactory.create(2,3,0);

        IFigure rombus = AbstractFactory2.create(2, 3, Figure.ROMBUS);

        IFigure triangle  = AbstractFactory2.create(2, 3, 4);

        Rectangle rectangle = new Rectangle(3,4);
        System.out.println(rectangle);
        Rectangle r2 = rectangle.clone();
        System.out.println(r2);


    }
}
