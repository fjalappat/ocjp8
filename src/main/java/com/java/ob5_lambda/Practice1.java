package com.java.ob5_lambda;

import com.java.utils.ObjectFactory;
import com.java.utils.Person;

import java.util.Collections;
import java.util.Comparator;
import java.util.function.Predicate;

import static com.java.utils.ObjectFactory.printConditionally;

public class Practice1 {

    public static void main(String[] args) {
        System.out.println("Printing males from family:");
        printMalesFromList();
        System.out.println("Printing females from family:");
        printFemalesFromList();
        System.out.println("Printing in ascending order of name:");
        printInAscendingOrderOfName();
    }

    private static void printMalesFromList() {
        printConditionally((p) -> p.getSex() == 'm'? true : false);
    }

    private static void printFemalesFromList() {
        printConditionally((p) -> p.getSex() == 'f'? true : false);
    }

    private static void printInAscendingOrderOfName(){
        Collections.sort(ObjectFactory.getPersonList(), Comparator.comparing(Person::getName));
        printConditionally(p -> true);
    }


}

interface Condition {
    boolean test(Person p);
}