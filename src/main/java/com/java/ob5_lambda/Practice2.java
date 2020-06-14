package com.java.ob5_lambda;

import com.java.utils.ObjectFactory;
import com.java.utils.Person;

import java.util.Optional;
import java.util.stream.Collectors;

public class Practice2 {

    public static void main(String[] args) {
        ObjectFactory.getPersonList()
                .stream().filter((p) -> p.getSex() == 'm')
                .forEach(p -> System.out.println(p.getName()));

        Optional<Person> pr = ObjectFactory.getPersonList()
                .stream().filter((p) -> p.getSex() == 'm')
                .findFirst();
        System.out.println("First One:"+pr);

        System.out.println("Count:"+ObjectFactory.getPersonList()
                .stream().filter((p) -> p.getSex() == 'm')
                .count());

    }
}
