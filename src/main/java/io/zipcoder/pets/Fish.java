package io.zipcoder.pets;


public class Fish extends Pet{

    public Fish (String name){
        setName(name);
    }
    public void speak() {
    System.out.println("My name is " + getName() +
            " and I am a Fish...Bubbles? bubbles?");
    }

}
