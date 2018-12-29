package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        for (int i = 1; i < 10000; i++) {
            int a = 0;
            for(int j = 1;j<i;j++){
                if((i%j) == 0) a++;
            }
            if(a<2) System.out.println(i);
        }
    }
}
