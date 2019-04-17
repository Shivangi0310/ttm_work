import java.util.List;

public class Bike {
    int price;
    String color;
    List<Wheels> wheelsList;
    public Bike() {

    }

    public Bike(int price, String color, List<Wheels> wheelsList) {
        this.price = price;
        this.color = color;
        this.wheelsList = wheelsList;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int sides) {
        this.price = sides;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public List<Wheels> getWheelsList() {
        return wheelsList;
    }

    public void setWheelsList(List<Wheels> wheelsList) {
        this.wheelsList = wheelsList;
    }

    @Override
    public String toString() {
        return "Bike{" +
                "price=" + price +
                ", color='" + color + '\'' +
                ", wheelsList=" + wheelsList +
                '}';
    }
}

