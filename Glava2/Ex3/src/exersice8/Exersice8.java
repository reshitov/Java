package exersice8;

public class Exersice8 {
    static int a =0;
    public void ex8(){
        Exersice8 object1 = new Exersice8();
        Exersice8 object2 = new Exersice8();
        System.out.println(object1.a+object2.a);

        object1.a+=5;

        System.out.println(object1.a+object2.a);
    }
}
