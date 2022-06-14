package model;

public abstract class Food implements Discountable{

    public int amount;
    public double price;
    public boolean isVegetarian;

    @Override
    public abstract double getDiscount(
    );
}
