package io.zipcoder.pets;

import java.util.Scanner;

public class User {
    private int numberOfPetsUserOwns;
    Pet[] usersPetTypeAndUsersPetNames;
    Scanner input = new Scanner(System.in);

    public void runPetCounterAndStorePetTypeAndPetNameThenPrintOutUserPetList() {
        setNumberOfPetsUserOwnsFromScanner();
        setStringArrayOfUsersPetNamesAndPetType();
        getUsersPetTypeAndPetName();
        printOutPetTypesAndPetNamesAndWhatTheySayWhenTheySpeak();
    }

    public void printOutPetTypesAndPetNamesAndWhatTheySayWhenTheySpeak() {
        yourPetTypesAndPetNamessAre();
        for (int i = 0; i < usersPetTypeAndUsersPetNames.length; i++) {
            usersPetTypeAndUsersPetNames[i].speak();
        }
    }

    public void getUsersPetTypeAndPetName() {
        for (int i = 0; i < numberOfPetsUserOwns; i++) {

            String petType, petName;
            askUserForPetType();
            petType = setUserPetTypeFromScanner();
            askUserForPetName();
            petName = setUserPetNameFromScanner();
            usersPetTypeAndUsersPetNames[i] = createPetObjects(petType, petName);
        }
    }

    public String setUserPetTypeFromScanner() {
        return input.next();
    }

    public String setUserPetNameFromScanner() {
        return input.next();
    }

    public int returnNumberOfPetsUserOwnsFromScanner() {
        askUserForNumberOfPets();
        return input.nextInt();
    }

    public void setNumberOfPetsUserOwnsFromScanner() {
            numberOfPetsUserOwns = returnNumberOfPetsUserOwnsFromScanner();
    }

    public void setStringArrayOfUsersPetNamesAndPetType() {
        usersPetTypeAndUsersPetNames = new Pet[numberOfPetsUserOwns];
    }


    public void askUserForNumberOfPets() {
        System.out.println("Enter the number of pets you own: ");
    }

    public void askUserForPetType() {
        System.out.println("Enter your Pets' Type (Dog, Cat, etc.)");
    }

    public void askUserForPetName() {
        System.out.println("Enter your Pets name: ");
    }

    public void yourPetTypesAndPetNamessAre(){
        System.out.println("\n\nMeet your Pets: ");
    }

    public void errorMessage(){
        System.out.println("Error - Please Enter a Number of Pets..Not String");
    }

    public Pet createPetObjects(String pet, String name){
        switch(pet.toLowerCase()){
            case "dog":  return new Dog(name);
            case "cat": return new Cat(name);
            case "fish": return new Fish(name);
            default:
                return new Pet(name);
        }
    }



}
