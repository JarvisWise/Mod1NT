package com.company;

public abstract class MAN implements CAPABLE_FOR_FIGHTING_ACTIONS {
    private int age;
    private String name;

    MAN(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "MAN{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
