package io.zipcoder.pets;


public class Dog extends Pet{

    public Dog(String name){
        setName(name);
    }
    public void speak() {
        System.out.println("My name is " + getName() + " and " +
                "I am a Dog....Woof Woof");
    }

}
