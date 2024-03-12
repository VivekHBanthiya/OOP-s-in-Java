package LambdaExpresions;

/*
using lambda expression we save the time of writing an object and then method name.
we use lambda function only for functional interface  as we know it can have only one class.
Now if we know  it can have only one class compiler know knows it.
So compiler will write obj and class object we just have to override it.

If we have only single line statement or code we don't have to mention it in {} bracket as we see eg in
 */
@FunctionalInterface
interface A{
    void show();
}
@FunctionalInterface
interface B{
    void printAStatement();
}
@FunctionalInterface
interface C{
    int add(int i, int j); //return some value
}
public class Main {
    public static void main(String[] args) {
        A obj = () ->{
            System.out.println("show method using lambda expression");
        };
        obj.show(); //calling show method using object of A

        B obj1 = () -> System.out.println("printAStatement using lambda expression without using {} bracket");
        obj1.printAStatement();

        C obj2 = (i,j) -> i+j; //now here we are defining what will add do
        int result = obj2.add(4,5); //here we giving add value and storing it in result
        System.out.println(result);
    }
}
