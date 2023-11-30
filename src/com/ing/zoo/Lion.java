package com.ing.zoo;

public class Lion extends Carnivore {
    public String name;
    public String trick;
    public String eatText;

    public Lion(String name)
    {
        super(name, "roar");
    }

    @Override
    public void eatMeat()
    {
        eatText = "nomnomnom thx mate";
        System.out.println(eatText);
    }


    @Override
    public void performTrick() {
        trick = "DOES A SALTO";
        System.out.println(trick);
    }



}
