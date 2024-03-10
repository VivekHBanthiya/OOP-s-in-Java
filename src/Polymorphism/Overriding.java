package Polymorphism;

public class Overriding {
    void show(){
        System.out.println("Show of overriding");
    }
    void Config(){
        System.out.println("Config of Overriding");
    }
    }
    class B extends Overriding{
    @Override //manually written just for better understanding
    void show(){
        System.out.println("Show of B");
    }
    }

