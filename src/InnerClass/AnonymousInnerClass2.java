package InnerClass;


public interface AnonymousInnerClass2 {
    void show();
}
class Main{
    public static void main(String[] args) {
        AnonymousInnerClass2 anonymousInnerClass2 = new AnonymousInnerClass2()
            {
                @Override
                public void show () {
                System.out.println("Anonymous Inner class using Interface");
            }

        };
        anonymousInnerClass2.show(); //accessing show method using object of Interface which is not possible to create an object of interface but we did here with the help of anonymous class
    }
}
