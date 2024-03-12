package InnerClass;

public class AnonymousInnerClass {
    public static void main(String[] args) {

      Demo demo = new Demo()
          //this is anonymous inner class as it is inside other class and it doesn't have any class name but see we have created new method for anonymous class both method must override
      {
          void print(){ //here we can see we are overriding demo without creating any new calss with the help of anonymous Inner class
              System.out.println("Anonymous inner class");
          }
      };
      demo.print(); //out will be new anonymous body.
    }
}
//this is the class that has method print
class Demo{
    void print(){
        System.out.println("in demo");
    }
}
