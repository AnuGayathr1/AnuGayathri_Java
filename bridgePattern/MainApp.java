package bridgePattern;

public class MainApp {
    public static void main(String[] args) {

        Restaurant americanRestaurant = new AmericanRestaurant(new VeggiePizza());
        americanRestaurant.deliver();

        System.out.println();

        Restaurant italianRestaurant = new ItalianRestaurant(new VeggiePizza());
        italianRestaurant.deliver();

    }

}