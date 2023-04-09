package com.pmz.designpatterns.singleton;

public class SingletonDemo {

    public static void main(String[] args) {

        ClassA classA1 = ClassA.getClassAObj();
        ClassA classA2 = ClassA.getClassAObj();
        ClassA classA3 = ClassA.getClassAObj();

        System.out.println("classA1 = " + classA1);
        System.out.println("classA2 = " + classA2);
        System.out.println("classA1 = " + classA1);
 
    }

}
