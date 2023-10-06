package test;

import org.pvp.cse.poc.pizza.constants.CRUST;
import org.pvp.cse.poc.pizza.constants.PIZZA;
import org.pvp.cse.poc.pizza.constants.SIZE;
import org.pvp.cse.poc.pizza.constants.TYPE;
import org.pvp.cse.poc.pizza.model.Pizza;

import java.util.Scanner;

public class CrustEnumTest {
    public static void main(String[] args) {
        Pizza pizza=new Pizza(PIZZA.DELUXE_VEGGIE, TYPE.VEG, SIZE.MEDIUM);
        Scanner sc=new Scanner(System.in);
        System.out.println("Hello");
        CRUST crust=CRUST.nameOf(sc.nextLine());
        System.out.println(crust.getClass());
        int flag=sc.nextInt();
        System.out.println(flag);
    }
}
