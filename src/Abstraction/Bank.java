package Abstraction;

public abstract class Bank {

    abstract void read();
    abstract void write();

    void Anything(){
        System.out.println("It is a normal method with body");
    }
}

class Admin extends Bank{

    //Now here we are creating new class called admin which will extends bank and will have all the abstract methods with body for back and can have non-abstract methods also. if we not give all abstract method it will give an error.
    void read(){
        System.out.println("Admin extends bank read method");
    }
    void write(){
        System.out.println("Admin extends bank write method");
    }

    @Override
    void Anything() {
        System.out.println("Admin extends bank Anything method");
    }
}
class User extends Bank{

    //Now here we can see we wanted to give user only access of read() method but because we use here abstraction we forced to give all the abstract methods of bank to user also. Thats why using abstract keyword we can't achieve 100% abstraction
    void read(){System.out.println("User extends bank read method");}
    void write(){System.out.println("User extends bank write method");}

    void Anything(){
        System.out.println("User extends bank Anything method");
    }
}
