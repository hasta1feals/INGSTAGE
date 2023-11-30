package com.ing.zoo;

import java.util.Random;

public class Tiger extends Carnivore {
    public String name;

    public String eatText;
    public String trick;

    public Tiger(String name)
    {
        super(name, "roar");
    }

    public void eatMeat()
    {
        eatText = "nomnomnom oink wubalubadubdub";
        System.out.println(eatText);
    }

    public void performTrick()
    {
        Random random = new Random();
        int rnd = random.nextInt(2);
        if(rnd == 0)
        {
            trick = "jumps in tree";
        }
        else
        {
            trick = "scratches ears";
        }
        System.out.println(trick);
    }
}
