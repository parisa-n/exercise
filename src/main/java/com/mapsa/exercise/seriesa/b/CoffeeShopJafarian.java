package com.mapsa.exercise.seriesa.b;

import java.util.*;

public class CoffeeShopJafarian {
    private String name;
    private MenuItemJafarian[] menus;
    private String[] orders;

    public CoffeeShopJafarian(String name, MenuItemJafarian[] menu, String[] orders) {
        this.name = name;
        this.menus = menu;
        this.orders = orders;
    }

    public Object addOrder(String string) {
        for (MenuItemJafarian menu : menus) {
            if (Objects.equals(menu.getItem(), string)) {
                String[] newOrders = orders;
                orders = new String[orders.length + 1];
                orders = newOrders;
                orders[orders.length - 1] = string;
                break;
            }

        }
        return new String("This item is currently unavailable");
    }

    public double dueAmount() {
        double sum = 0;

        for (String order : orders) {
            for (MenuItemJafarian item : menus) {
                if (Objects.equals(order, item.getItem())) {
                    sum += item.getPrice();
                }
            }
        }

        return sum;
    }

    public Object listOrders() {
        if (orders.length != 0)
            return orders;

        return null;
    }

    public Object fulfillOrder() {
        if (orders.length == 0)
            return new String("All Orders have been fulfilled");

        String items = "{";

        for (int i = 0; i < orders.length - 1; i++) {
            items = items + orders[i] + ", ";
        }
        items = items + orders[orders.length - 1] + "}";

        return items;

    }

    public Object cheapestItem() {
        Arrays.sort(menus, Comparator.comparing(MenuItemJafarian::getPrice));
        return menus[0];
    }

}

