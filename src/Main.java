public class Main {
    public static void main(String[] args) {
        Car car = new Car("car1", 4);
        Car car2 = new Car("car2", 4);


        Truck truck = new Truck("truck1", 6);
        Truck truck2 = new Truck("truck2", 8);


        Bicycle bicycle = new Bicycle("bicycle",2);
        Bicycle bicycle2 = new Bicycle("bicycle2", 2);


        WheelReplacement[] transports = {car2, car, truck2, truck, bicycle2, bicycle};

        ServiceStation station = new ServiceStation();
        for (WheelReplacement transport : transports) {
            System.out.println(transport.getModelName());
            station.check(transport);
            System.out.println();

        }


    }
}