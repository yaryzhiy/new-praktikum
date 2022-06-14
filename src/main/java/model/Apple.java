package model;

import model.constants.Colour;
import model.constants.Discount;

public class Apple extends Food implements Discountable{

    public String colour;

    public Apple(int amount, double price, String colour) {
        this.amount = amount;
        this.price = price;
        this.colour = colour;
        this.isVegetarian = true;
    }

    @Override
    public double getDiscount() {
        if (colour.equals(Colour.colourRed)) {
            return Discount.discountSixty;
        } else {
            return Discount.discountZero;
        }
    }

}
