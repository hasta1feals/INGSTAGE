package com.ing.zoo;

public class Monkey extends Herbivore {

    public String eatText;
    public String trick;

    public Monkey(String name)
    {
        super(name, "ook ook");
    }




    @Override
    public void eatLeaves()
    {
        eatText = "nomnomnom thx mate";
        System.out.println(eatText);
    }

    @Override
    public void performTrick() {
        trick = "do a handstand";
        System.out.println(trick);

    }


}

