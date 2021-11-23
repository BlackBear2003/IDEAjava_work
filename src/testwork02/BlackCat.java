package testwork02;

public class BlackCat extends Cat {
    @Override
    public double getPrice() {
        return 350;
    }

    public BlackCat(String name, Gender gender, int age, double price) {
        super(name, gender, age, price);
    }

    @Override
    public String toString() {
        return "A BlackCat named " + getName() + ".\nIt's gender is " + getGender() + ".\nIt's age is " + getAge() +
                ".\nIt's price is " + getPrice() + ".\n";
    }
}
