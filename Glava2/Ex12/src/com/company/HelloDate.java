package com.company;
/**First program in book.
 *print the strong and the current date.
 * @author Брюс Эккель
 * @author  www.MindView net
 * @version 4.0
 */
import java.util.Date;


public class HelloDate {
    /**Here start point the program
     * @param args comand line values
     * @throws RuntimeException if something goes wrong this exceprion will be throw
     */
    public static void main(String[] args) throws RuntimeException {

        System.out.println("Hello, Today: ");
        System.out.println(new Date());
    }/* Output: (55% match)
    Hello today:
    Sun Dec 23 13:43:46 MSK 2018
    *///:~


}
