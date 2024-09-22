package ZooQ1;

public class Animals {
    private int AnimalId;
    public String AnimalType;
    public String AnimalName;
    {
        AnimalId = 1;
        AnimalType = "Mammals";
        AnimalName = "Tiger";
        System.out.println("The animal's Id: <"+ AnimalId +"> From the IIB");
        System.out.println("The animal's type: <"+ AnimalType +"> From the IIB");
        System.out.println("The animal's name: <"+ AnimalName +"> From the IIB");
    }

    public Animals(int animalId, String animalType, String animalName){
        this.AnimalId = animalId;
        this.AnimalType = animalType;
        this.AnimalName = animalName;

        System.out.println("Animal Id: <"+ animalId +"> From the constructor");
        System.out.println("Animal Type: <"+ animalType +"> From the constructor");
        System.out.println("Animal Name: <"+ animalName +"> From the constructor");
    }

    public int getAnimalId(){
        return AnimalId;
    }

    public String getAnimalType(){
        return AnimalType;
    }

    public String getAnimalName(){
        return AnimalName;
    }

}
