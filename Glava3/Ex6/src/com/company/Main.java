package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Dog spot = new Dog();
        Dog scruffy = new Dog();
        Dog link = new Dog();
        spot.name = "Bob";
        spot.says = "Hello I'm Bob";

        scruffy.name = "Jo";
        scruffy.says = "Hello I'm Jo";

        System.out.println("spot name: " + spot.name);
        System.out.println("spor says: " + spot.says);

        System.out.println("scruffy name: " + scruffy.name );
        System.out.println("scruffy says: " + scruffy.says );

        spot = link;
        System.out.println(spot == link);
        System.out.println(spot.equals(link));





    }
}
