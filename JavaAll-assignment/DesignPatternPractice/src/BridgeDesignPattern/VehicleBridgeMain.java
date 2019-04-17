package BridgeDesignPattern;

interface Workshop {
    String getWorkshopType();
}

class Assemble implements Workshop {
    Assemble()
    {

    }

    public String getWorkshopType() {
        return "Assembled";
    }

    @Override
    public String toString() {
        return "Assembled";
    }
}

class Manufacture implements Workshop {
    Manufacture()
    {

    }
    public String getWorkshopType() {
        return "Manufactured";
    }

    @Override
    public String toString() {
        return "Manufactured";
    }
}

abstract class Vehicle {
    String type;
    Workshop workshop;

    public Vehicle(String type, Workshop workshop) {
        this.type = type;
        this.workshop = workshop;
    }
}

class Bike extends Vehicle {
    String specification;

    public Bike(Workshop workshop, String specification) {
        super("2 wheeler", workshop);
        this.specification = specification;
    }

    @Override
    public String toString() {
        return "Bike{" +
                "type='" + type + '\'' +
                ", workshop=" + workshop +
                ", specification='" + specification + '\'' +
                '}';
    }
}

class Bus extends Vehicle {
    int numberOfSeats;

    public Bus(Workshop workshop, int numberOfSeats) {
        super("4 wheeler", workshop);
        this.numberOfSeats = numberOfSeats;
    }

    @Override
    public String toString() {
        return "Bike{" +
                "type='" + type + '\'' +
                ", workshop=" + workshop +
                ", number of seats='" + numberOfSeats + '\'' +
                '}';
    }
}


public class VehicleBridgeMain {
    public static void main(String[] args) {
        Bike avenger = new Bike(new Assemble(), "Cruiser");
        System.out.println("Bike is "+ avenger.type+ " of "+ avenger.workshop.getWorkshopType()+" type "+" and specification is "+ avenger.specification);
        System.out.println(avenger);
    }
}
