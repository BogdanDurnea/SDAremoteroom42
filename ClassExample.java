package ro.sda.java42;

import static java.lang.Math.PI;

public class ClassExample {
    public static void main(String[] args) {
        Movie movie = new Movie();
        movie.description="Movie for all ages";
        movie.productionYear=2020;

        Car car= new Car();
        car.setBrand("Opel");
        car.setColor("yellow");
        car.setMaxSpeed(250);

        Car car2=new Car("BMW","white",350);
        car2.setColor("Red");
        System.out.println(PI);

    }
}

