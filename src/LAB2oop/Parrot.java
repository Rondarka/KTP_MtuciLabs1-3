package LAB2oop;

public class Parrot extends Animal {
    private String color;

    public Parrot() {
        super();
        this.color = "Зеленый";
    }

    public Parrot(String name, int age, double weight, String color) {
        super(name, age, weight);
        this.color = color;
    }

    @Override
    public void makeSound() {
        System.out.println(getName() + " кричит: Карр!");
    }

    @Override
    public String getType() {
        return "Попугай";
    }

    public void fly() {
        System.out.println(getName() + " летает");
    }

    public String getColor() { return color; }
    public void setColor(String color) { this.color = color; }
}

