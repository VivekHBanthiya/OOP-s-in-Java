package Abstraction;

public interface Bankiml {

    void read();
    void write();

}
class SBI implements Bankiml{

    @Override
    public void read() {
        System.out.println("SBI implements Bankiml read ");
    }
    public void write(){
        System.out.println("SBI implements Bankiml write ");
    }

}

class Users implements Bankiml{
    public void read(){
        System.out.println("SBI implements Bankiml read ");
    }

    @Override
    public void write() {

    }
}
