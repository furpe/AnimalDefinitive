package model;

import enums.FurColor;
import enums.Habitat;

public class Cat extends Animal {
    // Atributos privados específicos da subclasse Cat
    private int lives;
    private FurColor furColor;
    private final boolean isIndoor;
    private String favoriteFood;
    private int purringFrequency;
    private boolean isNeutered;

    // Construtor completo
    public Cat(String name, int age, FurColor furColor, boolean isIndoor, String favoriteFood, int purringFrequency, boolean isNeutered) {
        // Chamada ao construtor da superclasse Animal
        // Determina Habitat e isWild com base no parâmetro isIndoor
        super(name, age, isIndoor ? Habitat.DOMESTIC : Habitat.WILD, !isIndoor);
        
        this.lives = 7; // Gatos iniciam estritamente com 7 vidas
        this.furColor = furColor;
        this.isIndoor = isIndoor;
        this.favoriteFood = favoriteFood;
        this.purringFrequency = purringFrequency;
        this.isNeutered = isNeutered;
    }

    // Sobrescrita (Override) de métodos da superclasse
    @Override
    public void makeSound() {
        System.out.println(getName() + " says: Meow! (Purring at " + purringFrequency + " Hz)");
    }

    @Override
    public void sleep() {
        System.out.println(getName() + " is sleeping for 14 hours in the warmest place available.");
    }

    @Override
    public void displayInfo() {
        super.displayInfo(); // Exibe os atributos herdados de Animal
        System.out.println("Lives: " + lives);
        System.out.println("Fur Color: " + furColor.getDisplayName() + " (Code: " + furColor.getCode() + ")");
        System.out.println("Indoor Cat: " + (isIndoor ? "Yes" : "No"));
        System.out.println("Favorite Food: " + favoriteFood);
        System.out.println("Purring Frequency: " + purringFrequency + " Hz");
        System.out.println("Neutered: " + (isNeutered ? "Yes" : "No"));
    }

    // Sobrecarga (Overload) do método move
    public void move(int distance, int speed) {
        System.out.println(getName() + " leaped " + distance + " meters ahead at a speed of " + speed + " km/h!");
    }

    public void move(int distance, String target) {
        System.out.println(getName() + " silently sneaks " + distance + " meters closer to the " + target + ".");
    }

    // Métodos específicos da classe Cat
    public void purr() {
        System.out.println(getName() + " is purring softly (~" + purringFrequency + " Hz)... Contentment achieved.");
    }

    public void loseLife() {
        if (this.lives > 1) {
            this.lives--;
            System.out.println(getName() + " lost a life! Remaining lives: " + this.lives);
        } else if (this.lives == 1) {
            this.lives--;
            System.out.println(getName() + " lost its last life! Rest in peace, " + getName() + ".");
        } else {
            System.out.println(getName() + " has no lives left to lose.");
        }
    }

    // Métodos Getters
    public int getLives() {
        return lives;
    }

    public FurColor getFurColor() {
        return furColor;
    }

    public boolean isIndoor() {
        return isIndoor;
    }

    public String getFavoriteFood() {
        return favoriteFood;
    }

    public int getPurringFrequency() {
        return purringFrequency;
    }

    public boolean isNeutered() {
        return isNeutered;
    }
}