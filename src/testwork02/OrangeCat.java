package testwork02;

public class OrangeCat extends Cat {

    @Override
    public double getPrice() {
        return 200;
    }

    private boolean isFat;

    public OrangeCat(String name, Gender gender, int age, double price, boolean isFat) {
        super(name, gender, age, price);
        this.isFat = isFat;
    }

    @Override
    public String toString() {
        if (isFat)
            return "A Fat OrangeCat named " + getName() + ".\nIt's gender is " + getGender() + ".\nIt's age is " + getAge() +
                    ".\nIt's price is " + getPrice() + ".\n";
        else
            return "A Thin OrangeCat named " + getName() + ".\nIt's gender is " + getGender() + ".\nIt's age is " + getAge() +
                    ".\nIt's price is " + getPrice() + ".\n";

    }

    public boolean isFat() {
        return isFat;
    }

    public void setFat(boolean fat) {
        isFat = fat;
    }
}
