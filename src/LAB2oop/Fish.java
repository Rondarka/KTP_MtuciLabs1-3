package LAB2oop;

public class Fish extends Animal {
    private String species;

    public Fish() {
        super();
        this.species = "Золотая рыбка";
    }

    public Fish(String name, int age, double weight, String species) {
        super(name, age, weight);
        this.species = species;
    }

    @Override
    public void makeSound() {
        System.out.println(getName() + " булькает: Буль-буль");
    }

    @Override
    public String getType() {
        return "Рыбка";
    }

    public void swim() {
        System.out.println(getName() + " плавает");
    }

    public String getSpecies() { return species; }
    public void setSpecies(String species) { this.species = species; }
}
