package com.java.ob0_basics;

public class InheritanceConcepts {
    public static void main(String[] args) {
        A a = new A();
        a.printName();//A
//        System.out.println(a.salary); // compile time error
        A a1 = new B();
        a1.printName();//class B:B

        B b = new B();
        b.printName();//class B:B

        A a2 = new B();
        // a2.specialMethod(); // compile time error

       // B b1 = new A(); // compile time error
    }
}

class A {
    String name = "A";
    private int salary = 203330;
  void printName() {
      System.out.println(name);
  }
}
class B extends A {
    String name = "B";
    void printName() {
        super.printName();
        System.out.println("class B:"+name);
    }

    void specialMethod() {
        System.out.println("I am special");
    }
}
