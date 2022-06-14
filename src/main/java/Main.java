import model.Apple;
import model.Food;
import model.Meat;
import model.constants.Colour;
import service.ShoppingCart;

public class Main {

    public static void main(String[] args) {

        Meat meat = new Meat(5, 100);
        Apple appleRed = new Apple(10, 50, Colour.colourRed);
        Apple appleGreen = new Apple(8, 60, Colour.colourGreen);

        Food[] foods = new Food[] {meat, appleRed, appleGreen};
        ShoppingCart shoppingCart = new ShoppingCart(foods);

        System.out.println(shoppingCart.getPrice());
        System.out.println(shoppingCart.getDiscountPrice()); //тут непонятно условие - то ли сумму скидки, то ли сумму со скидкой
        System.out.println(shoppingCart.getVegetarianPrice());
    }
}
