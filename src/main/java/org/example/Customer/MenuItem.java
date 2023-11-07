package org.example.Customer;

import java.util.Objects;

public class MenuItem {
    private final String name;
    private final int price;

    public MenuItem(String name, int price) {
        this.name = name;
        this .price = price;
    }

    public boolean  matches(String name) {
         return this.name.equals(name);
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public boolean equals(Object o) { 
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MenuItem menuItem = (MenuItem) o;
        return price == menuItem.price && name.equals(menuItem.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price);
    }

}
