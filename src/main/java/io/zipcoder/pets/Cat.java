package io.zipcoder.pets;


public class Cat extends  Pet {

    public Cat(String name){
        setName(name);
    }
    public void speak() {
        System.out.println("My name is " + getName() + " and I am" +
                "a Cat....Meow");
    }

}
