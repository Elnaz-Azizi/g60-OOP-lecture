package se.lexicon.part1;

import java.time.LocalDate;

public class App {
    static void main() {
       /* Car volvo = new Car();
        volvo.brand = "Volvo";
        volvo.model = "XC90";
        volvo.year = 2020;
        volvo.mileage = 10;

        volvo.drive(15);
        System.out.println(volvo.getCarInfo());*/

        //Creating new object by using default constructor since we haven't created any constructor
       /* Car vm = new Car();
        vm.setBrand("Volvo");
        vm.setModel("XC90");
        vm.setYear(2020);
        vm.drive(15);
        System.out.println(vm.getCarInfo());*/



        Car car1 = new Car("Volvo", "XC60" , 2023);
        car1.drive(10);

        Car car2 = new Car("BMW", "M5");

        Car car3 = new Car("Toyota", "Corolla", 2022);
        car3.drive(15);

        System.out.println(car1.getCarInfo());
        System.out.println(car2.getCarInfo());
        System.out.println(car3.getCarInfo());

        Person erik = new Person("P1", "Erik", "erik@lexicon.se", LocalDate.of(1990, 1, 1));
        car1.setOwner(erik);

        System.out.println(car1.getCarInfo());
    }
}
