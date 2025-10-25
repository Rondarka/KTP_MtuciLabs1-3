package LAB2oop;

public abstract class Animal {
    private static int count = 0;

    private String name;
    private int age;
    private double weight;

    public Animal() {
        this("Без имени", 0, 0.0);
    }

    public Animal(String name, int age, double weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        count++;
    }

    public abstract void makeSound();
    public abstract String getType();

    public void eat() {
        System.out.println(name + " ест");
    }

    public void sleep() {
        System.out.println(name + " спит");
    }

    public String getName() { return name; }
    public int getAge() { return age; }
    public double getWeight() { return weight; }

    public void setName(String name) { this.name = name; }
    public void setAge(int age) { this.age = age; }
    public void setWeight(double weight) { this.weight = weight; }

    public static int getCount() { return count; }
}
