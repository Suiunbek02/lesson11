package com.company;

public class Main {


    public static void main(String[] args) {


        Birds birds = new Birds("Canary" , 1 , "sing" , Color.YELLOW , "long" , "short");
        System.out.println(birds.getInfo());
        System.out.println("__________________________________________________________ ");

        Eagle eagle1 = new Eagle("Phoenix" , 2 , "toFly" , Color.GOLDEN , "long" , "long");
           System.out.println(eagle1.getInfo());
           System.out.println("__________________________________________________________");

        Eagle eagle2 = new Eagle("Lyrakhvos" , 1 , "voice" , Color.BLACK , "short" , "short");
           System.out.println(eagle2.getInfo());
           System.out.println("__________________________________________________________");
        Wings wings = new Wings("Wings Long", "Nails Long");









    }


}
