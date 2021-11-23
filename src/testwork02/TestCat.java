package testwork02;

public class TestCat {

    public static void main(String[] args) {

        MyCatCafe myCatCafe = new MyCatCafe();
        myCatCafe.setMoney(900);
        Customer wzl = new Customer("wzl", 3);

        try {
            myCatCafe.buyNewOrangeCat("001", Gender.Male, 3, true);
            myCatCafe.buyNewBlackCat("002", Gender.Female, 3);
            myCatCafe.buyNewBlackCat("003",Gender.HalfMale,3);

            myCatCafe.serveCustomer(wzl);
            myCatCafe.closeCafe();
        } catch (CatNotFoundException e) {
            System.out.println("Failed to serve the customer ");
            e.printStackTrace();
        } catch (InsufficientBalanceException e) {
            System.out.println("Failed to purchase!");
            e.printStackTrace();
        }

    }
}
