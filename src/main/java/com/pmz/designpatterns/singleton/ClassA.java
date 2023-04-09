package com.pmz.designpatterns.singleton;

public final class ClassA {

    static ClassA classA = null;
    private ClassA() {

    }

    public static ClassA getClassAObj(){
        if (classA == null) {
            classA = new ClassA();
        }

        return classA;
    }

}
