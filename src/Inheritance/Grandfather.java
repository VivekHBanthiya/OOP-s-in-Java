package Inheritance;

public class Grandfather {
    String name = "Amar";
    String surname = "Banthiya";
}
class Father extends Grandfather{
    String name = "Harish";
}
class Myself extends Father{
    String name = "Vivek";
}