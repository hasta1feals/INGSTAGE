package com.ing.zoo;

import java.util.Random;

public class Zebra extends Herbivore {
    public String name;
    public String helloText;
    public String eatText;
    public String trick;

    public Zebra(String name)
    {
        super(name, "zebra zebra");
    }


    @Override
    public void eatLeaves()
    {
        eatText = "munch munch zank yee bra";
        System.out.println(eatText);
    }

    @Override
    public void performTrick() {
        Random random = new Random();
        int rnd = random.nextInt(2);
        if(rnd == 0)
        {
            trick = "rolls in the mud";
        }
        else
        {
            trick = "runs in circles";
        }
        System.out.println(trick);
    }
}
