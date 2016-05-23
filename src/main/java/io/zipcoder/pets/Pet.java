package io.zipcoder.pets;

public class Pet implements Speakable{
    private String name;

    public Pet(){

    }
    public Pet(String name) {
        setName(name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void speak() {
        System.out.println(getName() + " is a nice pet but I don't speak its language");
    }

}
