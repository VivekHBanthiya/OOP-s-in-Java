package Inheritance;

public class Main {
    public static void main(String[] args){
        Myself myself = new Myself();
        System.out.println(myself.name + " " + myself.surname);

        //simple calculator class which has add and sub method
        SimpCal simpCal = new SimpCal();
        System.out.println(simpCal.add(5, 4));
        System.out.println(simpCal.sub(5, 4));
        System.out.println();

        //adv calculator which has has mul and div method but as it extends simple cal it will have add and sub methods as well

        AdvCal advCal = new AdvCal();
        System.out.println(advCal.mul(2,2));
        System.out.println(advCal.div(2,2));
        System.out.println(advCal.add(2,2));
        System.out.println(advCal.sub(2,2));
        System.out.println();
        //SciCal is extending Advcal i.e it will have all methods including advcal and simpcal. We can this is multilevel inheritance

        SciCal sciCal = new SciCal();
        System.out.println(sciCal.log(5));
        System.out.println(sciCal.power(2, 7));
        System.out.println(sciCal.mul(2,2));
        System.out.println(sciCal.div(2,2));
        System.out.println(sciCal.add(2,2));
        System.out.println(sciCal.sub(2,2));
        System.out.println();


    }
}
