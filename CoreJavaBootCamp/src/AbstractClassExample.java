abstract class AbstractFlat {

    int ratePerBedRoom;

    protected int getRatePerBedRoom() {
        return ratePerBedRoom;
    }

    protected AbstractFlat(int ratePerBedRoom) {
        this.ratePerBedRoom = ratePerBedRoom;
    }

    abstract int price();
}
class TwoBHK extends AbstractFlat {

    private final int noOfRoom = 2;


    public TwoBHK(int ratePerBedRoom) {
        super(ratePerBedRoom);
    }

    @Override
    int price() {
        return this.getRatePerBedRoom() * noOfRoom;
    }
}

class TwoBHKWithFurnishing extends AbstractFlat {

    private final int noOfRoom = 2;

    private final int furnishingCostPerRoom = 200;


    public TwoBHKWithFurnishing(int ratePerBedRoom) {
        super(ratePerBedRoom);
    }

    @Override
    int price() {
        return (this.getRatePerBedRoom() + furnishingCostPerRoom) * noOfRoom;
    }
}

public class AbstractClassExample {
    public static void main(String[] args) {
        AbstractFlat flat1 = new TwoBHKWithFurnishing(250000);
        System.out.println(flat1.price());

        AbstractFlat flat2 = new TwoBHK(250000);
        System.out.println(flat2.price());

    }
}
