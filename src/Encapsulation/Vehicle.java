package Encapsulation;

public class Vehicle {
    private String name;
    private String color;
    private int price;
    public int getPrice(){
        return price;
    }
    public String getName(){
        return name;
    }
    public void setPrice(int price){
        this.price = price;
    }
    public void setName(String name){
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public Vehicle(){

    }
    public Vehicle(String name, String color, int price){
        this.name = name;
        this.color = color;
        this.price = price;
    }

}
