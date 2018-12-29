package com.company;
//import static net.mindview.util.Print.*;

/**Program in book
 * print string and value
 * @author Брюс Эккель
 *  @author  www.MindView net
 *  @version 4.0
 */
public class OverLoadingOrder {

    static void f(String s, int i){
        System.out.println("String: " + s + ", int: " + i);
    }
    static void f(int i, String s){
        System.out.println("int: " + i + ", String: " + s);
    }
    public static void main(String args[])throws RuntimeException {
        f("Сначала строка", 11);
        f(99,"Сначала число");
    }
}/*Output:
String: сначала строка, int: 11
int: 99, String: сначала число
*///:~
