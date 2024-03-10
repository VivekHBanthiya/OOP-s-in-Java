package Encapsulation;

public class Main {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle("nano","yellow",100000);
        System.out.println(vehicle.getName());
        System.out.println(vehicle.getPrice());
        System.out.print(vehicle.getColor());

    }
}
