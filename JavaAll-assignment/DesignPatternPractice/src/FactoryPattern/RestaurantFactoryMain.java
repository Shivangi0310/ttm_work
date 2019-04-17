package FactoryPattern;

interface Drinks {
    void prepareDrink();
}

class Tea implements Drinks {
    public void prepareDrink() {
        System.out.println("Preparing tea.");
    }
}

class Coffee implements Drinks {
    public void prepareDrink() {
        System.out.println("Preparing coffee");
    }
}

class Restaurant {
    Drinks drinks;

    public Drinks getDrinks() {
        return drinks;
    }

    public void setDrinks(Drinks drinks) {
        this.drinks = drinks;
    }
}

class RestaurantFactory {
    static Restaurant getRestaurantInstance(String drinkName) {
        Restaurant restaurant = new Restaurant();
        switch (drinkName) {
            case "restaurantWithTea":
                restaurant.setDrinks(new Tea());
                break;
            case "restaurantWithCoffee":
                restaurant.setDrinks(new Coffee());
                break;
        }
        return restaurant;
    }
}

public class RestaurantFactoryMain {
    public static void main(String[] args) {
        Restaurant restaurantWithTea = RestaurantFactory.getRestaurantInstance("restaurantWithTea");
        restaurantWithTea.getDrinks().prepareDrink();
        Restaurant restaurantWithCoffee = RestaurantFactory.getRestaurantInstance("restaurantWithCoffee");
        restaurantWithCoffee.getDrinks().prepareDrink();

    }
}
