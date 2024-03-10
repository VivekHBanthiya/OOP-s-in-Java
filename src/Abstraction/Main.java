package Abstraction;

public class Main {
    public static void main(String[] args){
        Admin admin = new Admin(); //abstract class
        admin.read();
        admin.write();


        SBI sbi = new SBI(); //Interface class
        sbi.read();
        sbi.write();

    }
}
