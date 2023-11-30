package com.ing.zoo;

public abstract class Carnivore extends Animal {

    public Carnivore(String name, String helloText) {
        super(name, helloText);
    }

    public abstract void eatMeat();

    public abstract void  performTrick();


}
