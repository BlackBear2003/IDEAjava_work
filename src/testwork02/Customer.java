package testwork02;

import java.time.LocalDate;

public class Customer {
    private String name;
    private int RuaTime;

    public LocalDate getLd() {
        return LocalDate.now();
    }

    public void setLd(LocalDate ld) {
        this.ld = ld;
    }

    private LocalDate ld;

    public Customer(String name, int ruaTime) {
        this.name = name;
        RuaTime = ruaTime;
    }

    @Override
    public String toString() {
        return "A customer named " + getName() + ".\n" + getName() + " wants to rua the cat for " + getRuaTime() + " times.\n"
                + getName() + " arrives at " + getLd() + ".\n";
    }

    public int getRuaTime() {
        return RuaTime;
    }

    public void setRuaTime(int ruaTime) {
        RuaTime = ruaTime;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
