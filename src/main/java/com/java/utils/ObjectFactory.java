package com.java.utils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class ObjectFactory {
    private static List<Person> personList = Arrays.asList(
            new Person(35, "233-43-7744", "Taylor King", 'm'),
            new Person(28, "838-39-9939", "Michelle King", 'f'),
            new Person(9, "993-54-9500", "Dolly King", 'f'),
            new Person(7, "903-34-6644", "Mark King", 'm'),
            new Person(5, "233-15-9393", "Nancy King", 'f')
    );
    public static List<Person> getPersonList() {
        return personList;
    }
    public static void printConditionally(Predicate<Person> cond){
        for(Person p: ObjectFactory.getPersonList()) {
            if(cond.test(p)) {
                System.out.println(p);
            }
        }
    }
}
