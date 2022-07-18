package com.company;

public class Eagle extends Birds{

    public Eagle(String name, int age, String commands,Color color, String wings, String nails) {
        super(name, age, commands, color, wings, nails);
    }

    @Override
    public String getCommands() {
        return super.getCommands()
                + "\nVoice";
    }
}
