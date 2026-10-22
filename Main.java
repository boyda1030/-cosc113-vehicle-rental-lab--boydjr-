/*
Reflection Questions

1. Why should the fields be private?
The fields should be private to protect the data. Getters and
setters let us control how the data is accessed and changed.

2. What happens if the Car constructor does not call super(...)?
Java requires a valid parent constructor call. Since Vehicle does
not have a no-argument constructor, the program will not compile
if Car does not call super(brand, year) or another valid constructor.

3. What is the difference between this.type and super.type?
this.type accesses the type variable in the current class.
super.type accesses the type variable in the parent class.
*/

public class Main {
    public static void main(String[] args) {
        Car car = new Car("Toyota", 2022, 4);
        ElectricCar electricCar = new ElectricCar("Tesla", 2024, 4, 100);

        // Fields are private, so they cannot be accessed directly here.
        // Use public getters and setters to read or change private fields.

        System.out.println("Regular Car:");
        car.describe();
        car.accelerate(20);
        System.out.println("Speed: " + car.getSpeed());
        car.showTypes();

        System.out.println();

        System.out.println("Electric Car:");
        electricCar.describe();
        electricCar.accelerate(30);
        System.out.println("Speed: " + electricCar.getSpeed());
        System.out.println("Battery after acceleration: "
                + electricCar.getBatteryLevel() + "%");
        electricCar.showTypes();

        System.out.println();

        System.out.println("Testing Invalid Values:");
        car.setSpeed(-10);
        car.setDoors(3);

        System.out.println("Final speed: " + car.getSpeed());
        System.out.println("Final doors: " + car.getDoors());
    }
}
