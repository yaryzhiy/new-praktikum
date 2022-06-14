package service;

import model.Food;

public class ShoppingCart {

    public Food[] foods;

    public ShoppingCart(Food[] foods) {
        this.foods = foods;
    }

    public double getPrice() {
        double price = 0;
        for (int i = 0; i < foods.length; i++) {
            price = price + foods[i].price * foods[i].amount;
        }

        return price;
    }

    public double getDiscountPrice() {
        double price = 0;
        for (int i = 0; i < foods.length; i++) {
            price = price + (100 - foods[i].getDiscount())/100*foods[i].price * foods[i].amount;
        }

        return price;
    }

    public double getVegetarianPrice() {
        double price = 0;
        for (int i = 0; i < foods.length; i++) {
            if (foods[i].isVegetarian) {
                price = price + foods[i].price * foods[i].amount;
            }
        }

        return price;
    }
}
