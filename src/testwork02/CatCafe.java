package testwork02;

public interface CatCafe {
    void buyNewOrangeCat(String name, Gender gender, int age, boolean IsFat);

    void buyNewBlackCat(String name, Gender gender, int age);

    void serveCustomer(Customer customer);

    void closeCafe();
}
