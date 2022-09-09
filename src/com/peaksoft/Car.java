package com.peaksoft;

public class Car {
    private String name;
    private int price;
    private Model model;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Model getModel() {
        return model;
    }

    public void setModel(Model model) {
        this.model = model;
    }

    public static Car makeCar(String name, int price, Model model){
        Car car = new Car();
        car.name = name;
        car.price = price;
        car.model = model;
        return car;
    }
    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", model=" + model +
                '}';
    }
}
