package com.ing.zoo;

import java.util.Random;

public class Pig extends Herbivore {
    public String name;
    public String eatText;
    public String trick;

    public Pig( String name)
    {
        super(name, "oink oink");
    }
    @Override
    public void eatLeaves()
    {
        eatText = "munch munch oink";
        System.out.println(eatText);
    }

    @Override
    public void performTrick()
    {
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
