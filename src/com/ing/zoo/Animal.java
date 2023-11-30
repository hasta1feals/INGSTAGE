package com.ing.zoo;

public abstract class Animal {


    protected String helloText;
    protected String name;

    protected String zookeeperName;

    public Animal(String name, String helloText) {
        this.helloText = helloText;
        this.name = name;
    }


    public String getName(){
        return name;
    }
    public void sayHello(String zookeeperName){
        System.out.println(helloText + " (Hello "+ zookeeperName +" im a " + getClass().getSimpleName() + " named: " + name+ ".)");
    }

    public abstract void performTrick();


}
