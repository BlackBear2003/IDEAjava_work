package testwork02;

public abstract class Cat {
    protected String name;
    protected Gender gender;
    protected int age;
    protected double price;

    public Cat(String name, Gender gender, int age, double price) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.price = price;
    }

    @Override
    public abstract String toString();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender.toString();
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
