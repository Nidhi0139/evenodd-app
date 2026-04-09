package com.example;

public class App {

    public String checkEvenOdd(int num) {

        if (num % 2 == 0)
            return "Even";
        else
            return "Odd";
    }

    public static void main(String[] args) {

        App obj = new App();

        System.out.println(obj.checkEvenOdd(4));
    }
}