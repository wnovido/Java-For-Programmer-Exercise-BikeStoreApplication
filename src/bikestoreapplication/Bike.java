/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package bikestoreapplication;

/**
 *
 * @author wilso_000
 */
public class Bike {
    private String color;
    private int size;
    private double price;
    private String type;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Bike(String color, int size, double price, String type) {
        this.color = color;
        this.size = size;
        this.price = price;
        this.type = type;
    }
}
