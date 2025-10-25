package LAB2oop;

public class Cat extends Animal {
    private String breed;

    public Cat() {
        super();
        this.breed = "Обычная";
    }

    public Cat(String name, int age, double weight, String breed) {
        super(name, age, weight);
        this.breed = breed;
    }

    @Override
    public void makeSound() {
        System.out.println(getName() + " мяукает: Мяу!");
    }

    @Override
    public String getType() {
        return "Кошка";
    }

    public void scratch() {
        System.out.println(getName() + " царапается");
    }

    public String getBreed() { return breed; }
    public void setBreed(String breed) { this.breed = breed; }
}

