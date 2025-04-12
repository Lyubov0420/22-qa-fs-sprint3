package ru.yandex.praktikum.model;

public abstract class Food implements Discountable{

    protected int amount;
    protected double price;
    protected boolean isVegetarian;

    protected Food(boolean isVegetarian, double price, int amount) {
        this.isVegetarian = isVegetarian;
        this.price = price;
        this.amount = amount;
    }
    @Override
    public double getDiscount() {
        return 0;
    }
    public boolean isVegetarian(){
        return isVegetarian;
    }

    public int getAmount() {
        return amount;
    }

    public double getPrice() {
        return price;
    }


    }






