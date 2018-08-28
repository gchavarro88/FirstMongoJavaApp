package com.mongodb.entity;

public class Car {

    private double id;
    private String name;
    private String category;
    private double doorsAmount;

    public Car(double id, String name, String category, double doorsAmount) {
        this.id = id;
        this.name = name;
        this.category = category;
        this.doorsAmount = doorsAmount;
    }

    public double getId() {
        return id;
    }

    public void setId(double id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public double getDoorsAmount() {
        return doorsAmount;
    }

    public void setDoorsAmount(double doorsAmount) {
        this.doorsAmount = doorsAmount;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", category='" + category + '\'' +
                ", doorsAmount=" + doorsAmount +
                '}';
    }
}
