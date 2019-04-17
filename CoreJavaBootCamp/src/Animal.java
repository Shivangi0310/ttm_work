public interface Animal {
    String liveIn();
    String breathThrough();
}

class Mammal implements Animal {

    @Override
    public String liveIn() {
        return "water and ground";
    }

    @Override
    public String breathThrough() {
        return "lungs";
    }
}

class Fish implements Animal {
    @Override
    public String liveIn() {
        return "water";
    }

    @Override
    public String breathThrough() {
        return "gills";
    }
}

