package com.ing.zoo;

public class Flamingo extends Herbivore{

    public String eatText;
    public String trick;

    public Flamingo(String name)
    {
        super(name, "PRRRRRR PRRRRRR");
    }

    @Override
    public void eatLeaves()
    {
        eatText = "nomnomnom ";
        System.out.println(eatText);
    }


    @Override
    public void performTrick() {
        trick = "stand on one leg";
        System.out.println(trick);
    }
}