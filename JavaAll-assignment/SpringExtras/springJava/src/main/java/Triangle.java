public class Triangle {
    int side;
    int altitude;

    public Triangle() {
    }

    public Triangle(int side, int altitude) {
        this.side = side;
        this.altitude = altitude;
    }

    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        this.side = side;
    }

    public int getAltitude() {
        return altitude;
    }

    public void setAltitude(int altitude) {
        this.altitude = altitude;
    }
    @Override
    public String toString() {
        return "Triangle{" +
                "side=" + side +
                ", altitude=" + altitude +
                '}';
    }

}
