package InnerClass;

public class Innerclass {
    public static void main(String[] args) {
        A obj = new A();
        obj.print();

        //with non static class we required to create new objec
        A.B obj1 = obj.new B();
        obj1.print1();

        // inner of inner class
        A.B.C obj2 = obj1.new C();
        obj2.print2();

        //with non-static class we required to create new object
        A.D obj3 = new A.D();
        obj3.print3();

    }
}
class A{
    void print(){
        System.out.println("in A");
    }
    class B{
        void print1(){
            System.out.println("in B - inner class B");
        }
        class C{
            void print2(){
                System.out.println("inner of inner class C");
            }
        }
    }
    static class D{
        void print3(){
            System.out.println("in D - static class D");
        }
    }
        }
