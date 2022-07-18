package com.company;

import java.util.Arrays;

public class Animal {

    private String name;
    private int age;
    private String commands;
    private Color color;
    private String wings;
    private String nails;

    public Color getColor() {
        return color;
    }


    public String getCommands() {
        return commands;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Animal(String name, int age, String commands, Color color,String wings, String nails) {
        this.name = name;
        this.age = age;
        this.commands = commands;
        this.color = color;
        this.wings = wings;
        this.nails = nails;

    }


    public final void voice () {
        System.out.println("");

    }

    public void voice (String voice) {
        System.out.println(voice);

    }

    public void toFly (String toFly) {
        System.out.println(toFly);
    }


 public String getInfo () {
     return "Name: " + name +
                "\nAge: " + age +
                "\nColor: " + color +
             "\nWings: " + wings +
             "\nNails: " + nails +
                "\nCommands: " + Arrays.toString(new String[]{commands});


 }



}
