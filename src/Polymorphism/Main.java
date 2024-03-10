package Polymorphism;

public class Main {
    public static void main(String[] args) {
        Overloading overloading = new Overloading();
        System.out.println(overloading.add(2,2));
        System.out.println(overloading.add(2,2,2));
        System.out.println(overloading.add(2.2, 2.2, 2));
        System.out.println(overloading.add(2.2, 2.2));

        B b = new B();
        b.show();
        b.Config();// config is coomon in both B and overriding but show is getting change as B which extends overriding change definition of show

        Overriding overriding = new Overriding();
        overriding.show();
        overriding.Config();
    }
}
