package testwork02;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Random;

public class MyCatCafe implements CatCafe {
    private double money;
    static ArrayList<Cat> CatList = new ArrayList<>();
    static ArrayList<Customer> CustomerList = new ArrayList<>();
    LocalDate ld = LocalDate.now();


    @Override
    public void buyNewOrangeCat(String name, Gender gender, int age, boolean IsFat)
            throws InsufficientBalanceException {
        if (money >= 200) {
            System.out.println("Successful purchase of an orangecat!");
            Cat NewCat = new OrangeCat(name, gender, age, 200, IsFat);
            System.out.println(NewCat);
            money -= 200;
            CatList.add(NewCat);
        } else {
            throw new InsufficientBalanceException("Not Enough Money!");
        }

    }

    @Override
    public void buyNewBlackCat(String name, Gender gender, int age)
            throws InsufficientBalanceException {
        if (money >= 350) {
            System.out.println("Successful purchase of a blackcat!");
            Cat NewCat = new BlackCat(name, gender, age, 350);
            System.out.println(NewCat);
            money -= 350;
            CatList.add(NewCat);
        } else {
            throw new InsufficientBalanceException("Not Enough Money!");
        }
    }

    @Override
    public void serveCustomer(Customer customer) throws CatNotFoundException {
        System.out.println("Welcome " + customer.getName() + "!\n");
        CustomerList.add(customer);
        System.out.println(customer.getName() + " arrives at " + customer.getLd() + ".\n");
        System.out.println(customer.getName() + " begins to rua cat for " + customer.getRuaTime() + " times!");
        Random rd = new Random();
        if (CatList.isEmpty()) {
            throw new CatNotFoundException("Not Cat in the Cafe!");
        } else {
            for (int i = 0; i < customer.getRuaTime(); i++) {
                System.out.println("Rua time " + (i + 1) + " : \n" + CatList.get(rd.nextInt(CatList.size())));
                System.out.println("Cafe's money + 15!\n");
                setMoney(getMoney() + 15);
            }
            System.out.println("Serving Over! Welcome to come next time!\n");
        }
    }


    @Override
    public void closeCafe() {
        int TotalRuaTime = 0;
        System.out.println("It's 8 o'clock!\nThe Cafe has closed!");
        System.out.print("      " + ld + "\nCustomers : ");
        for (Customer customer :
                CustomerList) {
            if (customer.getLd().equals(getLd())) {
                System.out.println(customer.getName() + " RuaTime = " + customer.getRuaTime());
                TotalRuaTime += customer.getRuaTime();
            }
        }
        System.out.println("MyCatCafe has earned " + TotalRuaTime * 15 + " of money today!\n");

    }

    public LocalDate getLd() {
        return ld;
    }

    public void setLd(LocalDate ld) {
        this.ld = ld;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }
}
