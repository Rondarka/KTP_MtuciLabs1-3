package LAB2oop;

public class PersianCat extends Cat {
    private boolean longHair;

    public PersianCat() {
        super();
        this.longHair = true;
    }

    public PersianCat(String name, int age, double weight, boolean longHair) {
        super(name, age, weight, "Персидская");
        this.longHair = longHair;
    }

    @Override
    public void makeSound() {
        System.out.println(getName() + " мурлычет: Мурр-р");
    }

    public boolean isLongHair() { return longHair; }
    public void setLongHair(boolean longHair) { this.longHair = longHair; }
}

