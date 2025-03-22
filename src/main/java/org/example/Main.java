package org.example;

public class Main {
    public static void main(String[] args) {
        ListImpl <Integer> set = new ListImpl <Integer>();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(5);
        set.remove(2);
        System.out.println(set);
    }
}