package com.ing.zoo;

public class Hippo extends Herbivore {
    public String name;

    public String eatText;

    public Hippo(String name)
    {
        super(name, "splash");
    }
    @Override
    public void eatLeaves()
    {
        eatText = "munch munch lovely";
        System.out.println(eatText);
    }


    @Override
    public void performTrick() {

    }
}
