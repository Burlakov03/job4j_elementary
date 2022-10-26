package ru.job4j;

public class ArgMethod {
    public static void hello(String name, byte age) {
        System.out.println("Hello " + name + ", age = " + age);
    }

    public static void main(String[] args) {
        String name = "Job4j";
        byte age = 6;
        ArgMethod.hello(name, age);
        ArgMethod.hello(name, age);
        ArgMethod.hello(name, age);
        ArgMethod.hello(name, age);

    }
}
