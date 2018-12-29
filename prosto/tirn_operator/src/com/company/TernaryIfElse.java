package com.company;

public class TernaryIfElse {
    static int ternary(int i){
        return i<10 ? i*100:i*10;
    }
    static int standartIfElse(int i){
        if(i<10)
            return i*100;
        else return i*10;
    }
}
