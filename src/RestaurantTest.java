public class Restaurantest {

    public static void main(String[] args) {
        RestaurantAbstractFactory Factory = new RestaurantFactoryProducer().getRestaurantAbstractFactory(1);
        Drink soda = Factory.getDrink("beer");
        System.out.println(beer);
    }
}
