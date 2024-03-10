class Main1 {
    void print1(){
        System.out.println("ABC");
    }
}
class Main2 extends Main1{
    void print2(){
        System.out.println("DEF");
    }
}
public class Main {
    public static void main(String[] args) {
        Main1 main1 = new Main1();
        main1.print1();

        Main2 main2 = (Main2) main1;
        main2.print2();
    }
}

