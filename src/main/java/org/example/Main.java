package org.example;


public class Main {
    public static void main(String[] args) {
        //Данные из develop

        System.out.println("added develop branch");


        for (char c : "qweqweq".toCharArray()) {
            System.out.println(c);
        }
        //я исправил ошибку
        System.out.println(Data.DATA.getLogin()+" "+Data.DATA.getPassword());
    }
}