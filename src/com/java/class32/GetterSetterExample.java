package com.java.class32;

class Phone {
    private String color;
    private String model;
    private String brand;
    private int memory;

    public String getBrand() {
        return brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getMemory(){ // Getter
        return memory;
    }

    public void setMemory(int memory){ // Setter
        System.out.println("Setting the memory to "+memory +" by user");
        this.memory = memory;
    }
}

public class GetterSetterExample {
    public static void main(String[] args) {
        Phone p = new Phone();
        p.setMemory(6000);
        System.out.println(p.getMemory());
    }
}
