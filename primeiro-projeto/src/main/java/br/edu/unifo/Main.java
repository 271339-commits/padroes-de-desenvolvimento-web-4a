package br.edu.unifo;

import org.apache.commons.lang3.RandomStringUtils;
import org.apache.commons.lang3.RandomUtils;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
       
        String senha = RandomStringUtils.secure().nextAlphabetic(8);
        System.out.println(senha);

    }
}