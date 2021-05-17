package be.ehb.democore.data;

import org.springframework.stereotype.Component;

import java.util.TreeSet;

@Component
public class Pizza {

    private TreeSet<String> toppings;
    private int diameter;

    public Pizza() {
        toppings = new TreeSet<>();
    }

    public void addTopping(String topping){
        toppings.add(topping);
    }

    public void removeTopping(String topping){
        toppings.remove(topping);
    }

    public void setDiameter(int diameter) {
        this.diameter = diameter;
    }

    public TreeSet<String> getToppings() {
        return toppings;
    }

    public int getDiameter() {
        return diameter;
    }
}
