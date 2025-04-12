package ru.yandex.praktikum.service;

import ru.yandex.praktikum.model.Food;

public class ShoppingCart {

    private Food[] items;

    public ShoppingCart(Food[] items) {this.items = items;
    }

    public double getTotalAmountWithoutDiscount() {
        double totalPrice = 0.0;

        for (int i = 0; i < items.length; i++) {
            totalPrice += items[i].getPrice() * items[i].getAmount();
        }
        return totalPrice;
        }
        public double getTotalPriceWithDiscount() {
            double totalPrice = 0.0;
            for (int i = 0; i < items.length; i++) {
                double discount = (100 - items[i].getDiscount()) / 100;
                totalPrice += items[i].getAmount() * items[i].getPrice() * discount;
            }
            return totalPrice;
        }
        public double getVegetarianTotalWithoutDiscount() {
            double totalPrice = 0.0;
            for (int i = 0; i < items.length; i++) {
                if (items[i].isVegetarian()) {
                    totalPrice += items[i].getAmount() * items[i].getPrice();
                }
            }
            return totalPrice;
        }
    }
