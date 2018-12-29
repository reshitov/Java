package com.company;

import java.nio.charset.CharacterCodingException;

public class Main {

    public static void main(String[] args) {
	// write your code here
        for(char c = 0; c<128;c++)
            if(Character.isLowerCase(c))
                System.out.println("знаение: " +(int)c + "символ: " + c);
    }
}
